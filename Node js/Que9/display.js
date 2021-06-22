var file = require("fs")

file.readFile("Customer.json",function(err, data){
    console.log(JSON.parse(data.toString()))
})