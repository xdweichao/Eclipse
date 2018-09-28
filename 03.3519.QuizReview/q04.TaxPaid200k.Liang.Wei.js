/**
 * 
 * Display if salary is greater than 200,000
 * see range 1 and range 2 to calculate
 */

var fs = require('fs');
var contents = fs.readFileSync("/data/marginalTaxes.json", 'utf8');
var jsonContent = JSON.parse(contents);

var answer = jsonContent.filter(f => (f.range1 > 200000 || f.range2 > 200000));
console.log(answer);
