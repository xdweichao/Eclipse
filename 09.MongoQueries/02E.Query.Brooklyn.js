/**
 * 01.Query.Brooklyn.js
 *  
 *  Row counts of the number of restaurants in Brooklyn
 *  mongo 01E.Query.Brooklyn.js
 */

x=db.getSisterDB("food");
var results2= x.restaurants.find({borough:"Brooklyn"},{_id:0, name:1,borough:1,address:1}).limit(10);

results2.forEach(printjson);