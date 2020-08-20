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
		<div class="view_content">
			<!-- 게시판이름 -->
			<div>
				<b>자유 게시판</b>
			</div>
			<!-- 제목 -->			
			
				<div>제목:
			<label> ${read.subject} </label>
				</div>
			<!-- 닉네임, 작성시간 -->
			
			<div>닉네임:
			<label> ${read.name} </label>
			</div>
	
			<!-- 작성 시간 -->
			<div>작성 날짜:
			<fmt:formatDate value="${read.regdate}" pattern="yyyy-MM-dd" />	
			</div>
			<br>
		
			
			<hr size="1" color="c0c0c0">
			<!-- 내용 -->
		
	
	
	<label>${read.content}
	</label>
	<br>
	<br>
	<br>
	<br>
		
	 	
	 	
	 	<br>	
			<hr size="1" color="c0c0c0">

			<div class="comment_box">

				<!-- 댓글 입력창-->
				<p
					style="float: left; margin-top: 3px; margin-right: 12px; font-size: 17px;">댓글</p>
				<form>
					<!-- 댓글 출력창-->
					<div class="comment_writer">
						<div class="comment_inbox">
							<em class="comment_inbox_name">닉네임값</em>
							<textarea class="cmt_write_box" placeholder="댓글을 남겨보세요"></textarea>
							<div class="input_box">
								<a class="input_button" href="#" role="button"
									onclick="alert('댓글을 적어주세요');return false;">등록</a>
							</div>
						</div>
					</div>
				</form>
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
	</div>

</body>
</html>