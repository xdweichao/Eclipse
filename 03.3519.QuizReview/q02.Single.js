/**
 * Display all rows that represent the tax rate for a single person
 */

// readFileSync is a method of the fs class, importing fs with require
var fs = require('fs');
 
var contents = fs.readFileSync("/data/marginalTaxes.json", 'utf8');

//console.log(contents);

//When importing a file, it's usually a string, so .java has to convert to JSON or other file formats with a parse
//Converts (string) content to JSON Array
var jsonContent = JSON.parse(contents);

var size = jsonContent.length;
console.log({"length":size});

//display each row via a Loop
for (var i = 0; i < size; i++) {
	//determine and filter in only the "S" data 
	if (jsonContent[i].status.includes("S")){
	console.log(jsonContent[i]);
	}
}