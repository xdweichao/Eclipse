/**
 * name: q03.SingleAnd2017.boulet.jean.js
 * 
 * Display all the rows that represent single and also from the year 2017
 */

var fs = require('fs');
var contents = fs.readFileSync("/data/marginalTaxes.json", 'utf8');
var jsonContent = JSON.parse(contents);

var answer = jsonContent.filter(f => (f.status.includes("S") && f.year== 2017));
console.log(answer);