var http = require("http");
var file = require("fs");
var greetings = require('../Que1/greet')

function process_req(req ,res){
       //greetings.greet();
            res.writeHead(200 , {'content-type':'text/html'})
            res.write("<h1>"+ greetings.greet() + " Saurabh</h1>");
            res.end();
        }

var s = http.createServer(process_req);
s.listen(3001 ,'127.0.0.1');
console.log("server is running at http://127.0.0.1/")