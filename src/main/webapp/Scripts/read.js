"use strict";

function output() {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/LR4_war_exploded/ReadServlet",
        success: function(response) {
            let jsonData = JSON.parse(JSON.stringify(response));
            gggg(response);
        },
        error: function(xhr, status, error) {
            console.log(error);
        }
    });
}


function gggg(jsonData) {

    let tableData = jsonData;

    let tableHeader = "<tr><th>name</th><th>lastname</th><th>middlename</th><th>age</th><th>language</th></tr>";

    let tableRows = "";
    for (let i = 0; i < tableData.length; i++) {
        let row = tableData[i];
        tableRows += "<tr>";
        tableRows += "<td>" + row.name + "</td>";
        tableRows += "<td>" + row.lastName + "</td>";
        tableRows += "<td>" + row.middleName + "</td>";
        tableRows += "<td>" + row.age + "</td>";
        tableRows += "<td>" + row.language + "</td>";
        tableRows += "</tr>";
    }

    document.getElementById("output").innerHTML = "<table>" + tableHeader + tableRows + "</table>";

}
