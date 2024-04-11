function update() {
    document.getElementById("updateForm").addEventListener("submit", function(event) {
        event.preventDefault();

        let user = {
            idUser: document.getElementById("idUser").value,
            name: document.getElementById("name").value,
            lastName: document.getElementById("lastName").value,
            middleName: document.getElementById("middleName").value,
            age: document.getElementById("age").value,
            language: document.getElementById("language").value
        };

        $.ajax({
            type: 'POST',
            url: "http://localhost:8080/LR4_war_exploded/UpdateServlet",
            data: { data: JSON.stringify(user) },
            success: function() {
                console.log('Данные успешно отправлены!');
            },
            error: function() {
                console.log('Произошла ошибка при отправке данных.');
            }
        });
    });
}
