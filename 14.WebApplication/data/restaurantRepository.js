/**
 * restaurantRepository.js
 */
//https://docs.mongodb.com/v3.2/tutorial/query-documents/
// https://www.w3schools.com/nodejs/nodejs_mongodb_query.asp
function getRestaurants(where,size, callback) {

	var mc = require('mongodb').MongoClient;
	var url = "mongodb://localhost:27017/";

	mc.connect(url, function(err, db) {
		// err is the same as isNull, err only works for JavaScript
		if (err)
			throw err;
		var dbo = db.db("food");
//		var query = {
//			cuisine : "Chinese",
//			borough : "Brooklyn"
//		};
		var p = {
			grades : false,
		};

		dbo.collection("restaurants").find(/*query changed to*/ where).project(p).limit(size).toArray(
				function(err, result) {
					if (err)
						throw err;
					// output is here, but user has no access to here, it needs
					// to be outside
					// console.log(result);

					callback(result);

					db.close();
				});
	});

};

//getRestaurants({cuisine:"American"}, function x(data) {
//	console.log(data)
//});
//
//console.log("---------------------------------------")
//
//getRestaurants({cuisine:"Chinese"}, e => {
//	console.log(e);
//});
//
//getRestaurants({cuisine:"Hamburgers"}, e => {
//	console.log(e);
//});

//exporting functions 
var exports = module.exports= {};
exports.getStore = getRestaurants;


// console.log("this is a test");
// this comes out first because it's asynchronous (does 1 thing, if it takes too
// long, it will get back to it later)
// getRestaurant will take a while, so it will move on to the next command



