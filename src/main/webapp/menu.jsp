<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style><%@include file="/styles/style.css"%></style>
<body>
    <div class="boxForWelcome">
        <p class="headText">Welcome in my system</p>
        <form action="servletForMenu" method="post">
            <input class="inputSubmit" type="submit" value="Accounts" /><label class="buttonSpace"></label>
            <button onclick="location.href='index.jsp'" type="button" class="buttonLogout">Logout</button>
        </form>

    </div>
</body>
</html>
