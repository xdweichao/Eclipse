/**
 * Display all rows that represent the tax rate for a single person
 */
/*
var mTaxes = require('fs');
var content = mTaxes.readFileSync("C:/data/marginalTaxes.json",'utf8');
var contentJSON = JSON.parse(content);

contentJSON.filter(f=> f.status.includes = "S").forEach(row=>{
	
	console.log(row);

})*/


var test = ['single', 'married','widow'];
var results = test.includes('Single');
console.log(results);