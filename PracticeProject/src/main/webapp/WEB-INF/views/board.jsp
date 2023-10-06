<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<script type="text/javascript">

	function goWriteForm(p_mem_id) {
			location.href="/board/WriteForm";
		}   
	

</script>
</head>
<body>


	<button type="button" onclick="goWriteForm"> 글쓰기 </button>


<form action="board">	
<table border="1">		  
	<tr><th>글번호</th><th>작성자 아이디</th><th>카테고리</th>
		<th>제목</th><th>내용</th><th>날짜</th><th>조회수</th></tr>
	<c:forEach var="AL" items="${articleList }" >
		<tr>
			<td><c:out value="${AL.artId }"/></td>
			<td><c:out value="${AL.artMemId }"/></td>
			<td><c:out value="${AL.artCategory }"/></td>
			<td><c:out value="${AL.artTitle }"/></td>
			<td><c:out value="${AL.artContent }"/></td>
			<td><fmt:formatDate value="${AL.artDate}" pattern="yyyy년M월d일  hh시mm분"/></td>
			<td><c:out value="${AL.artRead }"/></td>
		</tr>
	</c:forEach>
</table>
</form>

</body>
</html>