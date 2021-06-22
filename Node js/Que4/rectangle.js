exports.calcArea = function(length,breadth){
    var area = 0;
    area = length * breadth
    console.log(`The Area of Rectangle is ${area}`)
}

exports.calcPerimeter = function(length,breadth){
    var Perimeter = 0;
    Perimeter = 2 * (length + breadth)
    console.log(`The Perimeter of Rectangle is ${Perimeter}`);
}