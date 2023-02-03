<html>
<style><%@include file="/styles/style.css"%></style>
<body>
    <div class="block">
        <p>Hello, please input your informarion</p>
        <form action="filterAccounts" method="filter">
            <label>Your login:<label class="space"></label> </label>
            <input type="text" name="login">
            <br> <br>
            <label>Your password: </label>
            <input type="password" name="password">
            <p class="textError"><input type="submit" value="Continue" class="button" /><label class="spaceTextError"></label>${error}</p>
        </form>
    </div>

</body>
</html>


