<%--
  Created by IntelliJ IDEA.
  User: MinhHai
  Date: 08/03/2022
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Rest</title>
</head>
<body>
    <h2>Spring Rest Hello World</h2>
    <div><a href="test/home">Go to Home</a></div>
    <div>
        <a href="${pageContext.request.contextPath}/api/students">Go to Student List</a>
    </div>
</body>
</html>
