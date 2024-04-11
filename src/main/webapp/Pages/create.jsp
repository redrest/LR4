<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Добавление пользователя</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
  <form id="createForm" class="row g-3">
    <div class="col-auto">
      <input type="text" id="Name" class="form-control" placeholder="Имя">
    </div>
    <div class="col-auto">
      <input type="text" id="LN" class="form-control" placeholder="Фамилия">
    </div>
    <div class="col-auto">
      <input type="text" id="MN" class="form-control" placeholder="Отчество">
    </div>
    <div class="col-auto">
      <input type="number" id="Age" class="form-control" placeholder="Возраст">
    </div>
    <div class="col-auto">
      <input type="text" id="Lng" class="form-control" placeholder="Язык">
    </div>
    <div class="col-auto">
      <button type="button" name="data" class="btn btn-primary" onclick="create()">Добавить</button>
    </div>
  </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="Scripts/create.js"></script>
</body>
</html>