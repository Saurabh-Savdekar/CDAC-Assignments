var file = require("fs")

var book = [
    {
        "BookName":"The Feynman Lectures on Physics",
        "BookId": 1,
        "Author": "Richard Feynman",
        "Price": 1000
        
    },
    {
        "BookName":"A Brief History of Time",
        "BookId": 2,
        "Ph_no": "Stephen Hawking",
        "Price": 2500
    },
    {
        "BookName":"The Elegant Universe",
        "BookId": 3,
        "Ph_no": "Brian Greene",
        "Price":800
    }]

file.appendFile("book.txt", JSON.stringify(book), function(err, data){
   
     if(err)
        throw err
    })
