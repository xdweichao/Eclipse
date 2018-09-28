/**
 * Mapping Examples
 */

var express = require('express');

// install express using "npm install express --save" command via show in terminal


//execute express command by giving reference to app
var app = express();

//"Enter" or "Click" on a webpage usually represent "get" verb

//if the first para "author" happens to be in the URL, it will execute the 2nd parameter
//req = request, res= respond
//first para is always the input, sec para is always the output
app.get('/author', (req,res) =>{
	console.log({date: new Date()});
	res.send("Holla at your boy");
});



//setting the webserver port number to 9215
app.listen (9215);