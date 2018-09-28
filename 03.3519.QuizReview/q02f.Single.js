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

//similar to if statement (filter)
//f represents the current row (does not have to be f, but must be consistent
// => represents "what do i want to do here" AKA "Lamda", no spaces between = and >

// status for the specific row
// "S" represent the wanted data
var answer = jsonContent.filter(f => f.status.includes("S"));
console.log(answer);
//filter is a method for an array

// node <file>.js > (redirects answer somewhere else) > <new file name>