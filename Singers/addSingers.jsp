<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 14.11.2022
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Singers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>

    <div class="mainDiv">
        <form action="/add" method="post">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">NAME</label>
                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">SURNAME</label>
                <input type="text" class="form-control" id="exampleInputPassword1" name="surname">
            </div>
            <div class="mb-3">
                <label for="exampleInputAA" class="form-label">BIRTHDATE</label>
                <input type="date" class="form-control" id="exampleInputAA" name="birthdate">
            </div>
            <div class="mb-3">
                <label for="exampleInputAAA" class="form-label">CITY</label>
                <input type="text" class="form-control" id="exampleInputAAA" name="city">
            </div>
            <button type="submit" class="btn btn-primary">Отправить</button>
        </form>
    </div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
