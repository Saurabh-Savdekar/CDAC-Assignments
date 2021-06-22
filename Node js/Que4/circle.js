exports.calcArea = function(radius){
    var area = 0;
    area = 3.14 * radius * radius;
    console.log(`The Area of Circle with radius ${radius} is ${area}`)
}

exports.calcCircumference = function(radius){
    var Circumference = 0;
    Circumference = 2 * 3.14 * radius;
    console.log(`The Circumference of circle with radius ${radius} is ${Circumference}`);
}

exports.calcDiameter = function(radius){
    var Diameter = 0;
    Diameter = 2 * radius;
    console.log(`The diameter of circle with radius ${radius} is ${Diameter}`);
}