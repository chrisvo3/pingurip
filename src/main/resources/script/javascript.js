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
    alert("works");
    var colors = ["lightsalmon", "lightblue", "lightcoral", "lightgoldenrodyellow", "lightgreen", "lightpink"],
        selectedColor = colors[Math.floor(Math.random()*colors.length)];
    let body = $("#body");

    body.css("background-color", selectedColor);
});