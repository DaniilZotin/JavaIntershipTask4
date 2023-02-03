<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<style><%@include file="/styles/style.css"%></style>
<p>All accounts in this system: </p>
<table>
<tr>
    <th>Login</th>
    <th>Name</th>
    <th>Password</th>
</tr>
<c:forEach var="accounts" items="${list}">
    <tr>
        <td>${accounts.getLogin()}</td>
        <td>${accounts.getName()}</td>
        <td>${accounts.getPassword()}</td>
    </tr>
</c:forEach>
</table>
</html>
