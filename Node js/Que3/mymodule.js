exports.factorial = function(a){
      var fact = 1;
     for(var i = 1 ; i <= a; i++){
         fact = fact * i;  
     }
     console.log(`The factorial of ${a} is ${fact}`)
     
}

exports.prime = function(a){
    let isPrime = true;
    if(a == 1){
    console.log("1 is not prime nor composite")
    }
    else if(a >1){
        for(var i =2; i < a; i++){
            if(a % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            console.log(`${a} is a prime number`);
        } else {
            console.log(`${a} is a not prime number`);
        }
    
    }
   
}

exports.printtable = function(a){
    var i = 1
       for(i = 1 ; i <= 10 ; i++){
        console.log(`${a} * ${i} = ` +(a*i));
    }
}