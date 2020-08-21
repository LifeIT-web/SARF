<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<title>상세 보기</title>
<link href="/resources/css/view.css" rel="stylesheet" type="text/css" />
<style>


</style>



</head>
<body>
	<div class="view_list">
		<div class="top_btn" style="padding-bottom: 13px">
			<div class="right_area">
				<!-- 이전글 -->
				<a class="basebutton skin size" role="button">이전글</a>
				<!-- 다음글-->
				<a class="basebutton skin size">다음글</a>
				<!-- 목록  경로 재설정 -->
				<a href="list.html" class="basebutton skin size">목록</a>
			</div>
		</div>
		<div class="view_content">
			<!-- 게시판이름 -->
			<div class="title">
				<b>XXX 게시판</b>
			</div>
			<!-- 제목 -->
			<div>
				<b>제목</b>
			</div>
			<!-- 닉네임, 작성시간 -->
			<div>닉네임</div>
			<!-- 작성 시간 -->
			<div>작성 시간</div>
			<hr size="1" color="c0c0c0">
			<!-- 내용 -->
			<div contenteditable="true"></div>
			<hr size="1" color="c0c0c0">
			<div class="comment_box">
				<!-- 댓글 출력창-->
				<div>
					<c:forEach items="${replyList}" var="replyList">
						<form name="replyList" action="/board/replyList">
							<div class="reply_input"
								style="border: 1px solid -internal-light-dark">
								<div class="input_id" style="display: inline-block;">
									<input type="hidden" name="BOARD_NUM" value="${replyList.rno}">
									<p>
										작성자 : ${replyList.name}
									</p>
									<p>
										작성 날짜 : <fmt:formatDate value="${replyList.regdate}" pattern="yyyy-MM-dd" />
									</p>
								</div>
								<div class="comment_writer">
									<textarea class="cmt_write_box">${replyList.content}</textarea>
								</div>
								<div>
									<button type="submit" name="replyWrite"
										class="basebutton skin size submit-pos">작성</button>
								</div>
							</div>
						</form>
					</c:forEach>
				</div>
				<!-- 댓글 입력창-->
               <c:if test="${member.getId != null}">
				<form name="replyWrite" action="/board/replyWrite">
					<div class="reply_input"
						style="border: 1px solid -internal-light-dark">
						<div class="input_id" style="display: inline-block;">
							<input type="hidden" name="BOARD_NUM" value="">
							<input type="text" maxlength="20" placeholder="닉네임" name="REPLY_NAME" style="display: block;">
						</div>
					<div class="comment_writer">
						<textarea class="cmt_write_box" placeholder="댓글을 남겨보세요"></textarea>
					</div>
					<div>
						<button type="submit" name="replyWrite" class="basebutton skin size submit-pos">작성</button>
					</div>
					</div>
				</form>
				</c:if>
			</div>
		</div>
	</div>
		<div class="top_btn" style="padding-bottom: 13px">
			<div class="left_area">
				<!-- 이전글 -->
				<a class="basebutton skin size" role="button">이전글</a>
				<!-- 다음글-->
				<a class="basebutton skin size">다음글</a>
				<!-- 목록 -->
				<a href="list.html" class="basebutton skin size">목록</a>
			</div>
			<div class="right_area">
				<!-- 수정 -->
				<a href="modify.html" class="basebutton skin size">수정</a>
				<!-- 삭제 -->
				<a href="delete.bo" class="basebutton skin size">삭제</a>
			</div>
		</div>
</body>
</html>