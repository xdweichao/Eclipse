/**
 * 
 * 1. Initilaize the project
 * >npm init
 * why? ^: 
 * 
 * > npm i npm
 * to get latest update
 * 
 * Install express
 * >npm install express --save
 * 
 */

"use strict";
var express = require('express');
var app = express();


app.get("/sales", (req, res)=>{
	//file system for reading
	var fs = require('fs');
	var contents = fs.readFileSync('/data/sales.json');
	var jsonContent = JSON.parse(contents);
	res.send(jsonContent);
})
app.get('/sales/queens',(req,res)=>{
	var fs = require('fs');
	var contents = fs.readFileSync('/data/sales.json');
	var jsonContent = JSON.parse(contents);
	var queensdata= jsonContent.filter(e=> e.region == 'queens');
	res.send(queensdata);
})
app.get('/sales/brooklyn',(req,res)=>{
	var fs = require('fs');
	var contents = fs.readFileSync('/data/sales.json');
	var jsonContent = JSON.parse(contents);
	var brooklyndata= jsonContent.filter(e=> e.region == 'brooklyn');
	res.send(brooklyndata);
})

app.listen(9416, function(){
	console.log({date: new Date(), port:9416});
});
