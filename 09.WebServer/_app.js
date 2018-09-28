/**
 * 
 */
//npm install express --save
var express = require('express');
var fs = require('fs');


//function without a name/nothing inside is called anonomusys 

var app = express();
//make data gobal so we can reuse without repeating
var data = fs.readFileSync('/data/sales.json');
// parse text to json so web is color coded
var jdata = JSON.parse(data);


app.get('/', function(req,res){
	res.send({Message: "Welcome to creating your first Website"});
})

//instead of using function, use =>
app.get('/developer', (req,res)=>{
	res.send({name: "Liang, Wei"});	
})

app.get('/sales2017',(req,res)=>{
	res.send(jdata);
})


app.get('/sales2017/female',(req,res)=>{
	var femaleData= jdata.filter(e=> e.gender == 'f');
	res.send(femaleData);
})

app.get('/sales2017/brooklyn',(req,res)=>{
	var brooklynData= jdata.filter(e=> e.region == 'brooklyn');
	res.send(brooklynData);
})

// Crtl C (^ C) + Enter Enter to cancel server. , cls to clear screen

//every time it listens, it will do function


//npm install nodemon --save  (allows user to make changes without restarting)
//npm install nodemon -g 
app.listen(9215, function(){
	console.log({serverportno:9215, date: new Date()});
});