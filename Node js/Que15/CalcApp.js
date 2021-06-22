var http = require("http");
var file = require("fs");
var shape = require("../Que4/rectangle.js")
var url = require('url');

function process_req(req ,res){
   
     if (req.method == 'GET' && req.url == '/') {
        file.readFile("./inputform.html", function(err, data) {
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write(data);
        res.end();
       
     });
    }
   else if(req.method == 'GET' && req.url.substring(0,8) == '/process'){
        var q = url.parse(req.url, true);
        var qdata = q.query;
        console.log(qdata);
      //  var length = parseInt(qdata.length);
      //  var Breadth = parseInt(qdata.Breadth);
      //  console.log("length " +length);
     //   console.log("breadth " +Breadth);
        var Area = shape.calcArea(qdata.length,qdata.Breadth);
        var Perimeter = shape.calcPerimeter(qdata.length,qdata.Breadth);
        console.log("area is " +Area);
        console.log("perimeter is " +Perimeter)

           res.writeHead(200,{"Content-Type":"text/html"})
           res.write(Area +"<br>"+ Perimeter);
           res.end();
         }
       }
var s = http.createServer(process_req);
s.listen(3010, '127.0.0.1');
console.log("server is running at http://127.0.0.1/")