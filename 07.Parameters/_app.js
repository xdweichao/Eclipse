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



app.get("/sales/:county",(req,res)=>{
	var fs = require('fs');
	var county = req.params.county;
	var contents = fs.readFileSync('/data/sales.json');
	var jsonContent = JSON.parse(contents);
	var countydata= jsonContent.filter(e=> e.region == county ||"all" == county);
	
	if (county == "all"){
		var jsonContent= jsonContent.filter(e=> true);
		res.send(jsonContent);
	}else res.send(countydata);
})



app.listen(9416, function(){
	console.log({date: new Date(), port:9416});
});
