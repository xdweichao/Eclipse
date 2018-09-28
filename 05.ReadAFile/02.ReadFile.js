/**
 * Mapping Examples
 */

var fs = require('fs');

//renaming title with returns
var codeLoopup= function(code){
	//replace if statements
	//if datatype __<type>__() is not native, use var my___ = new __()
	var myMap = new Map();
	myMap.set('s',"Supervisors");
	myMap.set('m',"Manager");
	myMap.set('cw',"Clerical Worker");
	myMap.set('la',"Lan Administrator");
	myMap.set('a',"Administrator");
	
	
	//similar to, brings the variable i to life by giving datatype number
	var i = 0;
	return myMap.get(code);
};


//call back function

var callback = function(err, contents) {
	//transforming string to json
	var json= JSON.parse(contents)
    //console.log(contents);
	
	//filter not needed because we are returning all true but to make a point
	json.filter(o => true)
	
	//mapping / projection
	.map(m =>{
		//return "abc";
		return{empid: m.employeeid, 
				money: m.salary, 
				titleDescription: codeLoopup(m.title)};
	})
	// project only supervisors with money greater then 89000(Remember salary is renamed to money!) 
	.filter(e => e.titleDescription == "Supervisors" 
		&& e.money > 89000)
	
	//display each row
	.forEach(console.log);
	
	
	
}
//when im finish processing, it will CALL you back by adding the callback function
fs.readFile('/data/Sales.json', 'utf8', callback);
 
console.log('after calling readFile');