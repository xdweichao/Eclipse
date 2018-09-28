/**
 * 
 */

var mTaxes = require('fs');
var content = mTaxes.readFileSync("C:/data/marginalTaxes.json",'utf8');
var contentJSON = JSON.parse(content);

contentJSON.filter(f=> f.percentage > .35).forEach(row=>{
	
	//console.log(row);
	/*console.log({"id": row._id, 
			"%": row.percentage,
			"min": row.range1,
			"max": row.range2});*/
})