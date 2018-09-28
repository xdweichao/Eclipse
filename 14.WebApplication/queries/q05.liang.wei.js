
//answer: 6

var db = db.getSisterDB("food"); //use food
var count = db.restaurants.distinct("borough");

//printjson(count.length); 
//1 value json params will turn it into key and value Ex:count same as count:count
printjson({length:count.length, count}); 