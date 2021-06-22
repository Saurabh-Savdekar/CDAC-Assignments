var file = require("fs")

var arr = [
{
    "EmpName":"Stark",
    "EmpId": 3000,
    "EmpSalary": 25000
},
{
    "EmpName":"Steve",
    "EmpId": 3001,
    "EmpSalary": 20000
},
{
    "EmpName":"Bruise",
    "EmpId": 3003,
    "EmpSalary": 22000
},
{
    "EmpName":"Natasha",
    "EmpId": 3004,
    "EmpSalary": 15000
}]



file.appendFile("empdetails.txt" , JSON.stringify(arr) , function(err , data){
    if(err){
        throw err;
    }
})
   
//console.log(JSON.parse(JSON.stringify(arr)))
