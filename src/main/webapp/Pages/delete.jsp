<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Delete User</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
  <h2>Delete User</h2>
  <div class="row">
    <div class="col-auto">
      <input type="text" id="idUser" class="form-control" placeholder="ID пользователя">
    </div>
    <div class="col-auto">
      <button type="button" class="btn btn-danger" onclick="deleteUser()">Удалить</button>
    </div>
  </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="Scripts/delete.js"></script>
</body>
</html>
