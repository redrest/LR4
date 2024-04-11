<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Основная страница</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col">
            <form action="CreateServlet">
                <button type="submit" class="btn btn-primary">Добавить нового пользователя</button>
            </form>
        </div>
        <div class="col">
            <form action="ReadServlet">
                <button type="submit" class="btn btn-secondary">Посмотреть список пользователей</button>
            </form>
        </div>
        <div class="col">
            <form action="UpdateServlet">
                <button type="submit" class="btn btn-warning">Обновить данные</button>
            </form>
        </div>
        <div class="col">
            <form action="DeleteServlet">
                <button type="submit" class="btn btn-danger">Удалить запись</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
