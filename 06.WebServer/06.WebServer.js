/**
 * 
 */

//npm install express --save
//npm install nodemon --save
//npm install nodemon -g
var express = require('express');
var app = express();

app.get('/', function(req, res) {
  res.send('Hello World!');
});

app.get('/developer', function(req, res) {
	  res.send({author: "Liang, Wei"});
	});



app.listen(8000, function() {
  console.log('Example app listening on port 8000!');
});