//number of restaurants in Brooklyn
//answer: 6086
var express = require('express');
var app = express();
var db = db.getSisterDB("food"); //use food
var count = db.restaurants.count({borough:"Brooklyn"});
print(count);