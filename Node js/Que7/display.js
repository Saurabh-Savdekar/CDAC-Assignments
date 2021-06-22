var file = require("fs");
const { emitKeypressEvents } = require("readline");
file.readFile("emp.txt" , function(err ,data){
    if(err){
        console.log(err);
    }
   
    var sum = 0;

    for(let value of data.toString().split("\n")){
        sum += parseInt(value.split(":")[3]);
    }
   console.log("sum of Salary is : " +sum)
})