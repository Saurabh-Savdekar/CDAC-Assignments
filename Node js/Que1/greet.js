
    var date = new Date();
    var h = date.getHours();
    
    exports.greet = function(){
    if(h < 12){
        return "Good Morning";
     } else if(h >= 12 && h < 17){
        return "Good Afternoon";
     }else if(h >= 17)
        return "Good Evening";
     }
