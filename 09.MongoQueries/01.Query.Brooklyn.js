/**
 *  01.Query.Brooklyn.js
 *  
 *  Row counts of the number of restaurants in Brooklyn
 *  
 */


use food;
db.restaurants.find({"borough":"Brooklyn"}).count();
db.restaurants.count({borough:"Brooklyn"});