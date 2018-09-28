//create a webpage that displays all zipcode
//answer: 
var express = require('express');
var app = express();
	var mc = require('mongodb').MongoClient;
	var url = "mongodb://localhost:27017/";

app.get('/8', function(req, res) {
	mc.connect(url, function(err, db) {
		var dbo = db.db("food");
		var count = dbo.collection("restaurants").findOne().limit(1).toArray(	function(err, result) {
			if (err)
				throw err;
			// output is here, but user has no access to here, it needs
			// to be outside
			// console.log(result);

			callback(result);

			db.close();
		});
		res.send(count, {count: count});
})
});


app.listen(8080, function() {
  console.log('Example app listening on port 8080!');
});
