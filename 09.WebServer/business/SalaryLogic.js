/**
 * 
 */


var payCheck = function(wage, hours, tax){
	 
	var paycheck = wage * hours;
	var taxPaid = paycheck * tax/100;
	var netpay = paycheck-taxPaid;
	var overtimepay = 0;
	var othours = 0;
	var otWage = 0;
	
	if (hours > 40){
		othours = hours -40;
		otWage = wage * 1.5;
		//overtimepay = (hours - 40) * wage * 1.5;
		overtimepay = othours * otWage;
		var paycheck = wage *40 + overtimepay;
		
};
	
	return{salary: paycheck, taxpaid: taxPaid, netpay: netpay,  
		overtimepay: overtimepay, othours: othours, otWage: otWage }; 
};

var exports = module.exports = {};
//set var to name of function
//export.<text>, text = name you want java to get
exports.getMoney = payCheck;