/**
 *  06.WebServer.js
 */

//npm install express --save
//npm install nodemon --save
//npm install nodemon -g

"use strict";
var express = require('express');
var app = express();
var _pay = require('./business/SalaryLogic.js');

app.get('/', function(req, res) {
  res.send('Hello World!');
});


//create url with name developer
//data type {} is json, key is author, and value is your full name
app.get('/developer', function(req, res) {
	  res.send({author: "Liang, Wei"});
	});

//pass local values through perameters 
//Business logic
//var exports = module.exports = {};



//url is paycheck
// return key with the name salary, return 300, as the value
// Make webserver responsive 
//localhost:3000/paycheck?hourlywage=10&hoursworked=40&tax=30
//input with req.query. && ?<text> = <value>

app.listen(3000, function() {
  console.log('Example app listening on port 3000!');
});

