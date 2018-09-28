
//answer: 85

var db = db.getSisterDB("food"); //use food
var count = db.restaurants.distinct("cuisine");

//printjson(count.length); 
printjson({length:count.length, count}); 