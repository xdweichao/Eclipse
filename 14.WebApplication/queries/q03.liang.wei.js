//number of restaurants in Brooklyn and in zipcode 11212
//answer: 103

var db = db.getSisterDB("food"); //use food
var count = db.restaurants.find({borough:"Brooklyn", "address.zipcode":"11212"}).count();

print(count);