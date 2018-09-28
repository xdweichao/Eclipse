/**
 * 
 */


var airfile= require('fs');
var content = airfile.readFileSync('airport.json','utf8');
var contentJSON = JSON.parse(content);

//console.log(typeof content);
//console.log(typeof []);
//console.log(typeof true);
//console.log(typeof 4);
//console.log("--------------------");
//console.log(content);

contentJSON.forEach( e=>{
	console.log({'code': e.code, 
		'region':e.city, 
		'timezone':e.tz});
});
console.log ("-------")

contentJSON.filter(f => f.tz.indexOf("Europe")> -1).forEach( (e,i)=>{
	console.log({'code': e.code, 
		'region':e.city, 
		'timezone':e.tz});
});
