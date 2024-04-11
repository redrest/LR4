<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <form id="updateForm" class="row g-3">
        <div class="col-auto">
            <input type="text" id="idUser" class="form-control" placeholder="ID пользователя">
        </div>
        <div class="col-auto">
            <input type="text" id="name" class="form-control" placeholder="Имя">
        </div>
        <div class="col-auto">
            <input type="text" id="lastName" class="form-control" placeholder="Фамилия">
        </div>
        <div class="col-auto">
            <input type="text" id="middleName" class="form-control" placeholder="Отчество">
        </div>
        <div class="col-auto">
            <input type="number" id="age" class="form-control" placeholder="Возраст">
        </div>
        <div class="col-auto">
            <input type="text" id="language" class="form-control" placeholder="Язык">
        </div>
        <div class="col-auto">
            <button type="submit" class="btn btn-primary">Update</button>
        </div>
    </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="Scripts/update.js"></script>
</body>
</html>
