var file = require("fs")

file.readFile("file.txt" , function(err ,data){
    if(err){
        throw err;
    }
    console.log(data.toString().split("\n"));
})