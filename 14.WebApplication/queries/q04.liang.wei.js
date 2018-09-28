//number of restaurants with a cuisine of Chinese and in Brooklyn
//answer: 763

var db = db.getSisterDB("food"); //use food
var count = db.restaurants.find({cuisine:"Chinese", borough:"Brooklyn"}).count();

print(count); 