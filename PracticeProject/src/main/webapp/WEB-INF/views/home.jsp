<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<style type="text/css">

</style>

<script type="text/javascript">

</script>
</head>
<body>
<form action="home">
	<c:foreach var="PL" items="${problemsList }" varStatus="status">
		<tr>
			<td><c:out value="${status.count }"/>.</td>
			<td><c:out value="${PL.pbTitle }"/></td>
			<td><c:out value="${PL.pbScore }"/></td>
			<td><c:out value="${PL.pbCorrectYn }"/></td>
		</tr>
	</c:foreach>
</form>
<h1>hello</h1>

</body>
</html>