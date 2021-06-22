var http = require("http");
var file = require("fs");

function process_req(req,res){
    file.readFile('Welcome.html' , function(err , data){
        res.writeHead(200,{'content-type':'text/html'});
        res.write(data);
        res.end();
    })
}



var s = http.createServer(process_req);
s.listen(3000, '127.0.0.1');
console.log("server is running at http://127.0.0.1/");