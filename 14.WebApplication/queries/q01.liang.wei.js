//command mongo q01.liang.wei.js

//1. number of restaurants in qyeens
//answer: 5656

var db = db.getSisterDB("food"); //use food
var count = db.restaurants.count({borough:"Queens"});
print(count);