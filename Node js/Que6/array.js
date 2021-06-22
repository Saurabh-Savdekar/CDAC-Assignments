var file = require("fs")

var arr = ["STARK","STEVE","BRUISE","NATASHA","CLINT"];
   file.appendFile("names.txt", arr.join("|"), function(err){
       if(err){
          throw err;
        }
  })

