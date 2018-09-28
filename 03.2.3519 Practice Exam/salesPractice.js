/**
 * 
 */

var fs = require('fs');
var contents = fs.readFileSync("/data/sales.json",'utf8');
var jsonContent= JSON.parse(contents);

//var x = jsonContent.filter(e => true).slice(0,100);
//console.log(x);

var answer = jsonContent.filter(f => f.salary > 34882 
	//&& f.total > 33686
	&& f.region.includes("m")).slice(0,100);
console.log (answer);