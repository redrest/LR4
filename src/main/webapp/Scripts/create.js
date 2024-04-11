"use strict";
function create(){

    let User = {};
    User.name = document.getElementById("Name").value;
    User.lastName = document.getElementById("LN").value;
    User.middleName = document.getElementById("MN").value;
    User.age = document.getElementById("Age").value;
    User.language = document.getElementById("Lng").value;

    $.ajax({
        type: 'POST',
        url: "http://localhost:8080/LR4_war_exploded/CreateServlet",
        contentType: "application/json",
        data: JSON.stringify(User),
        success: function() {
            console.log('Данные успешно отправлены!');
        },
        error: function() {
            console.log('Произошла ошибка при отправке данных.');
        }
    });

    let inputs = document.getElementsByTagName("input");
    for (let i = 0; i < inputs.length; i++) {
        inputs[i].value = "";
    }
}
