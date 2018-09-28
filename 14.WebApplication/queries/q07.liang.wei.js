
//answer: 213

var db = db.getSisterDB("food"); //use food
var count = db.restaurants.distinct("address.zipcode");

//printjson(count.length); 
printjson({length:count.length, count});