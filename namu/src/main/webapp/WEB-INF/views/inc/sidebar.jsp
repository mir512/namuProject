<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="sidebar">
	<div class="inner">

		<!-- Search -->
		<section id="search" class="alt">
			<form method="post" action="#">
				<input type="text" name="query" id="query" placeholder="Search" />
			</form>
		</section>

		<!-- Menu -->
		<nav id="menu">
			<header class="major">
				<h2>Menu</h2>
			</header>
			<ul>
				<li><a href="/home">Homepage</a></li>
				<li><a href="/notice/list">Notice</a></li>
				<li><span class="opener">Lecture</span>
					<ul>
						<li><a href="#">재테크</a></li>
						<li><a href="#">창업</a></li>
						<li><a href="#">가족관계</a></li>
						<li><a href="#">자기개발</a></li>
						<li><a href="#">IT</a></li>
						<li><a href="#">기타</a></li>
					</ul></li>
				<li><span class="opener">Community</span>
					<ul>
						<li><a href="#">강연후기</a></li>
						<li><a href="/board/list">자유게시판</a></li>
					</ul></li>
				<li><span class="opener">Mypage</span>
					<ul>
						<li><a href="#">예약내역</a></li>
						<li><a href="#">정보수정</a></li>
					</ul></li>
			</ul>
		</nav>

		<!-- Section -->
		<section>
			<header class="major">
				<h2>Ante interdum</h2>
			</header>
			<div class="mini-posts">
				<article>
					<a href="#" class="image"><img
						src="/resources/images/pic07.jpg" alt="" /></a>
					<p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper
						dolore aliquam.</p>
				</article>
				<article>
					<a href="#" class="image"><img
						src="/resources/images/pic08.jpg" alt="" /></a>
					<p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper
						dolore aliquam.</p>
				</article>
				<article>
					<a href="#" class="image"><img
						src="/resources/images/pic09.jpg" alt="" /></a>
					<p>Aenean ornare velit lacus, ac varius enim lorem ullamcorper
						dolore aliquam.</p>
				</article>
			</div>
			<ul class="actions">
				<li><a href="#" class="button">More</a></li>
			</ul>
		</section>

		<!-- Section -->
		<section>
			<header class="major">
				<h2>Get in touch</h2>
			</header>
			<p>Sed varius enim lorem ullamcorper dolore aliquam aenean ornare
				velit lacus, ac varius enim lorem ullamcorper dolore. Proin sed
				aliquam facilisis ante interdum. Sed nulla amet lorem feugiat tempus
				aliquam.</p>
			<ul class="contact">
				<li class="icon solid fa-envelope"><a href="#">information@namu.com</a></li>
				<li class="icon solid fa-phone">(02) 1234-5678</li>
				<li class="icon solid fa-home">서울특별시 강남구 역삼동 테헤란로 132
				</li>
			</ul>
		</section>

		<!-- Footer -->
		<footer id="footer">
			<p class="copyright">
				&copy; Untitled. All rights reserved. Demo Images: <a
					href="https://unsplash.com">Unsplash</a>. Design: <a
					href="https://html5up.net">HTML5 UP</a>.
			</p>
		</footer>

	</div>
</div>
