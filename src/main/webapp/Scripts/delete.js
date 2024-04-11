"use strict";
function deleteUser() {
    let idUser = document.getElementById("idUser").value;
    let userData = { idUser: idUser };
    $.ajax({
        type: 'POST',
        url: "http://localhost:8080/LR4_war_exploded/DeleteServlet",
        data: { data: JSON.stringify(userData) },
        success: function(response) {
            console.log('Пользователь удален!');
        },
        error: function(xhr, status, error) {
            console.error('Ошибка');
        }
    });
}
