/**
 * Call back functions 
 */

var fs = require('fs');

//renaming title with returns
var codeLoopup= function(code){
	//return "abc";
	if (code=='s')
		return "Student Intern";
	else if(code == 'm')
		return "Manager";
	else if(code == 'cw')
		return "Clerical Worker";
	else if(code == 'la')
		return "Lan Administrator";
	else if(code == 'a')
		return "Administrator";
	
};


//call back function

var callback = function(err, contents) {
	//transforming string to json
	var json= JSON.parse(contents)
    //console.log(contents);
	
	//filter
	json.filter(o => o.title=='m' || o.title =='s')
	
	//mapping / projection
	.map(m =>{
		//return "abc";
		return{empid: m.employeeid, 
				money: m.salary, 
				titleDescription: codeLoopup(m.title)};
	})
	//display each row
	.forEach(console.log);
	
	
	
}
//when im finish processing, it will CALL you back by adding the callback function
fs.readFile('/data/Sales.json', 'utf8', callback);
 
console.log('after calling readFile');