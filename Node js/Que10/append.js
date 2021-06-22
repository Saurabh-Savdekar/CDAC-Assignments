var file = require("fs")

file.readFile("emp.txt" , function(err ,data){
    if(err){
        throw err;
    }
    file.appendFile("resignemp.txt", data.toString() ,function(err1 ,data2){
        if(err){
            throw err;
        }
    })
});