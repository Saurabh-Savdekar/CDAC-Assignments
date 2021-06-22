exports.pallindrom = function(str){
    var str2 = str.split("").reverse().join("")
    if(str == str2){
        console.log(`${str} is Pallindrom`)
    }
    else{
        console.log(`${str} is not Pallindrom`)
    }
}

exports.UpperCase = function(str){
    console.log(str.toUpperCase());
}

exports.search = function(){
   var count = 0;
    var arr = ["www.google.com","www.msn.com","www.amazon.com","www.coderanch.com","in.answers.yahoo.com","en.m.wikipedia.com","codehs.gitbooks.io"]
   var sites = arr.filter(e1=> e1.startsWith('www'))
    count = arr.filter(e1=> e1.startsWith('www')).length;
   console.log(sites)
   console.log(`total no of counts are ${count}`)
}