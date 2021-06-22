exports.isEqui = function(side1,side2,side3){
    if (side1 == side2 && side2 == side3){
    console.log("Equilateral Triangle");
    }
    else{
        console.log("Triangle is not Equilateral")
    }
}

exports.calcPerimeter = function(side1,side2,side3){
    var Perimeter = 0;
    Perimeter = side1 + side2 + side3
    console.log(`The Perimeter of Traingle is ${Perimeter}`);
}