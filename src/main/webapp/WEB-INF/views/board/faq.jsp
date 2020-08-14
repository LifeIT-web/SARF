<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="kr">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
	<title>FAQ 게시판</title>
	<link rel="stylesheet" href="resources/css/faq.css" />
</head>

<body>
	<div>
		<div class="infor">
	          <h3 class="txt">FAQ</h3>
	<div>
	    <div class="faq_txt">
	<strong>"FAQ를 통해서 원하시는 답변을 쉽고 빠르게 찾아보세요"</strong><br />
	서울 여행 관련 질문 중 가장 빈도수가 높은 질문들을 모아, 친절한 답변과 함께 제공해드리고 있습니다.
		</div>
	</div>
		<div>
		<!-- content -->
   	 	<!-- faq list-->
    	 	<div class="faq_list">
	                   <div>                      
	                        <button class="faq_list" type="button">이곳은 무슨 사이트인가요?</button>
	                   </div>
	            <div class="tab_box">
	                    <p> visitseoul.net은 서울 여행에 관심있는 모든 관광객을 위해 서울의 관광정보를 통합적으로 제공하는 서울시의 공식 관광 사이트입니다. </p>
	                    <p>관광명소/음식점/숙박/공연 등 서울의 다양한 관광정보와 함께 예약/예매, 여행상담, 커뮤니티 등 편리한 기능을 제공합니다.</p></div>
	        </div>
	<!-- //content -->
		</div>
		<div>
		<!-- content -->
   	 	<!-- faq list-->
    	 	<div class="faq_list">
	                   <div>                      
	                        <span>이곳은 무슨 사이트인가요?</span>
	                   </div>
	            <div class="tab_box">
	                    <p> visitseoul.net은 서울 여행에 관심있는 모든 관광객을 위해 서울의 관광정보를 통합적으로 제공하는 서울시의 공식 관광 사이트입니다. </p>
	                    <p>관광명소/음식점/숙박/공연 등 서울의 다양한 관광정보와 함께 예약/예매, 여행상담, 커뮤니티 등 편리한 기능을 제공합니다.</p></div>
	        </div>
	<!-- //content -->
		</div><!-- end:content -->
			<!-- 페이징 -->
			<div class="page">
    <!-- 처음 -->
    	<img src="https://bimg.nexon.com/images/career_imgs/NEW/page_first.jpg" width="30" height="30" alt="첫 페이지" />
    <!-- 이전 n개 -->
    	<img src="https://bimg.nexon.com/images/career_imgs/NEW/page_prev.jpg" width="30" height="30" alt="이전 페이지" />
    <span class="num">
        <!-- 페이지 번호 -->
                        <a class="on" ><strong>1</strong></a>
                        <a href="javascript:{goPage('1');}">2</a>
                        <a href="javascript:{goPage('2');}">3</a>
    </span>
    <!-- 다음 n개 -->
    	<a class="next" href="javascript:{goPage('1');}" ><img src="https://bimg.nexon.com/images/career_imgs/NEW/page_next_on.jpg" width="30" height="30" alt="다음 페이지" /></a>
 
    <!-- 마지막 -->
    	<a class="last" href="javascript:{goPage('2');}" ><img src="https://bimg.nexon.com/images/career_imgs/NEW/page_last_on.png" width="30" height="30" alt="마지막 페이지" /></a>
                        
  					</div>
				<!-- page -->
		</div><!-- content -->
	</div>
</body>
</html>