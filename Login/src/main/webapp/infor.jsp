<%@page import="java.util.Iterator" %>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.model.Student" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.dao.StudentDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link
            rel="stylesheet"
            href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
    />
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Infor</h1>
<%--<table border="1px solid black">--%>
<%--    <tr>--%>
<%--        <th>ID</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Gender</th>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${list}" var="x">--%>
<%--        <tr>--%>
<%--            <td>${x.id}</td>--%>
<%--            <td>${x.name}</td>--%>
<%--            <td>${x.sex}</td>--%>
<%--            <td>--%>
<%--                <a href="#">update</a>--%>
<%--                <a href="#">delete</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>

<%--</table>--%>


<table class="table table-striped table-dark">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Password</th>
        <th scope="col">Email</th>
        <th scope="col">Phone</th>
        <th scope="col">Address</th>
        <th scope="col">Gender</th>
        <th scope="col">Created_at</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="x">
        <tr>
            <td>${x.id}</td>
            <td>${x.studentName}</td>
            <td>${x.password}</td>
            <td>${x.emailAddress}</td>
            <td>${x.phoneNumber}</td>
            <td>${x.address}</td>
            <td>${x.gender}</td>
            <td>${x.created_at}</td>

        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>