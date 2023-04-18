<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome to CodeJava Home</title>
</head>
<body>
    <div class="container text-center">
        <h1>Welcome to Referee Analysis</h1>
        <h3><a th:href="/@{/users}">List of Users</a></h3>
        <h3><a th:href="/@{/register}">Register</a></h3>
        <h3><a th:href="/@{/login}">Login</a></h3>
    </div>
     
</body>
</html>