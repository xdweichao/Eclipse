/**
 * 
 */

"use strict";
var express = require('express');
var app = express();

app.get('/q1/author', function(req, res) {
	  res.send({LastName: "Liang",
	  			FirstName:"Wei",
	  			Email: "WheresThePros@gmail.com"});
	});

app.get("/q2/midterm/:score",(req,res)=>{
	var fs = require('fs');
	var score = req.params.score;
	var results = "NA";
	if (score >= 65){
		results = "passing";
	} else if (score < 65){
		results = "failing";
	}
	console.log(_results);
	res.send(results);
});


app.get("/q3/final/:score",(req,res)=>{
	var fs = require('fs');
	var score = req.params.score;
	var description = "unsatisfactory";
	var results = "NA";
	if (score >= 90){
		description = "excellent";
	} else if (score >= 80 && score <90){
		results = "good";
	} else if (score >= 70 && score <80){
		results = "average";
	}
	console.log(_results);
	res.send(results);
});

app.get("/q4/midterm/allstudents",(req,res)=>{
	var fs = require('fs');
	var contents = fs.readFileSync('/midterm.data/Midterm-Production.json');
	var jsonContent = JSON.parse(contents);
	console.log(contents);
	res.send(contents);
});

app.get("/q5/allstudents/notthecity",(req,res)=>{
	var fs = require('fs');
	var contents = fs.readFileSync('/midterm.data/Midterm-Production.json');
	var jsonContent = JSON.parse(contents);
	var fdata= jsonContent.filter(e=> e.region == "Manhattan");
	console.log(fdata);
	res.send(fdata);
});

app.get("/q6/allstudents/notthecity/:gender",(req,res)=>{
	var fs = require('fs');
	var gender = req.params.gender;
	var contents = fs.readFileSync('/midterm.data/Midterm-Production.json');
	var jsonContent = JSON.parse(contents);
	var fdata= jsonContent.filter(e=> e.region == "Manhattan" 
									&& e.gender == gender );
	console.log(fdata);
	res.send(fdata);
});


app.listen(9814, function(){
	console.log({date: new Date(), port:9814});
});

