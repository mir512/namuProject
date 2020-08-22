<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div id="section">
	<!-- Table -->
	<h3>Board</h3>

	<h4>자유게시판</h4>
	<div class="table-wrapper">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}" var="board">
				<tr>
					<td><c:out value="${board.b_code}" /></td>
					<td><c:out value="${board.b_title}" /></td>
					<td><c:out value="${board.username}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.b_regdate}" /></td>
					<td><c:out value="${board.b_hit}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<div align="center">
		<ul class="pagination">
			<c:if test="${pageMaker.prev}">
				<li><a href="${pageMaker.startPage-1}" class="button">Previous</a></li>
			</c:if>
			<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
				<li><a href="${num}" class="page">${num}</a></li>
			</c:forEach>
			<c:if test="${pageMaker.next}">
				<li><a href="${pageMaker.endPage+1}" class="button">Next</a></li>
			</c:if>
		</ul>
	</div>
	<div align="right">
		<a href="/notice/new" class="button primary">Write</a>
	</div>
</div>