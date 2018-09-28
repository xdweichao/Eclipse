/**
 * 
 */

var PayRoll= require('fs');
var content = PayRoll.readFileSync("C:/data/PayRoll.txt",'utf8');
var contentJSON = JSON.parse(content);

var regularPayCheck = function(hours, wage){
	if(hours> 40){
		hours=40;
	}
	return hours * wage;
};

//filtered loop for over 40 hours
contentJSON.filter(f => f.hoursWorked > 40).forEach( row=>{
	row.regPay= regularPayCheck( row.hoursWorked,row.hourlyWage);
	console.log(row);
});
