<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/17/2021
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Creat Phone</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<c:set var="p" value="${requestScope.phones}"/>

<div class="container">
    <div class="row">
        <h2 class="col-8 offset-2 text-center font-weight-bold my-3">Create Phone</h2>
        <a class="col-2 btn btn-primary align-self-center my-3" href="${pageContext.request.contextPath}/">Back</a>
        <form class="col-12" action="${pageContext.request.contextPath}/creatphone" method="post">
            <div class="form-group">
                <label>Name :</label>
                <input class="form-control" type="text" name="name">
            </div>

            <div class="form-group">
                <label>Brand :</label>
                <select name="brand">
                    <option value="Apple">Apple</option>
                    <option value="Samsung">Samsung</option>
                    <option value="Nokia">Nokia</option>
                    <option value="Others">Others</option>
                </select>

            </div>
            <div class="form-group">
                <label>Price :</label>
                <input class="form-control" type="text" name="price">
            </div>
            <div class="form-group">
                <label>Description :</label>
                <input class="form-control" type="text" name="description">
            </div>
            <button type="submit" class="btn btn-primary">Create</button>
            <a class="col-2 btn btn-primary align-self-center my-3 button" href="${pageContext.request.contextPath}/creatphone">Reset</a>

        </form>
    </div>
</div>
</body>
</html>
