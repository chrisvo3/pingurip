/**
 @created: vochr
 @date: 09 May , 2020
 @time: 23 : 28
 @package script
 @project geolocation
 */

function btnOther() {
    // alert("works");
    document.getElementById("ifOther").classList.remove("hide");
}

$(document).ready(function() {
    // alert("works");
    var colors = ["#FF9AA2", "#FFB7B2", "#FFDAC1", "#E2F0CB", "#B5EAD7", "#C7CEEA"],
        selectedColor = colors[Math.floor(Math.random()*colors.length)];
    let body = $("#body");

    body.css("background-color", selectedColor);
});