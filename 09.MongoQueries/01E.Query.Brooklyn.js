/**
 * 01.Query.Brooklyn.js
 *  
 *  Row counts of the number of restaurants in Brooklyn
 *  mongo 01E.Query.Brooklyn.js
 */

//db will now be the food database
x=db.getSisterDB("food");



//use food; not needed bcause of getSister
var results = x.restaurants.count({"borough":"Brooklyn"});

var results2= x.restaurants.find({borough:"Brooklyn",cuisine:"Chinese"});

//limit output to 10
var results2= x.restaurants.find({borough:"Brooklyn"}).limit(10);



printjson(results);

results2.forEach(printjson);