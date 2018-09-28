/**
 * Create Logic to Determine an
 * employee weekly salary
 * 
 * 1. Create a function that will determine weeklySalary
 * 
 * 
 */


var input = {"hoursWorked": 42, "hourlyWage":10 };

var regularPayCheck = function(hours, wage){
	if(hours> 40){
		hours=40;
	}
	return hours * wage;
};

// => is shortcut for running the word "function"
var overTimePayCheck= (h,w)=>{
	var overtimePay=0;
	if (h >40){
		overtimePay = (h-40) * w * 1.5;
	}
	return overtimePay;
	};

// Creating a function with 1 parameter w (weekly pay)
/* Weekly wage over 500 pay 30% tax otherwise 15% */



var taxes = w => {
	if (w>500){
		return w* .30;
	}else 
		return w* .15;
}	


console.log(input);

var weeklyCheck= regularPayCheck(input.hoursWorked,input.hourlyWage);
var otPay= overTimePayCheck(input.hoursWorked,input.hourlyWage);
var taxPay = taxes(weeklyCheck + otPay);
var total = weeklyCheck + otPay;
var afterTax = total - taxPay;

console.log("Regular Paycheck is $" + weeklyCheck );
console.log("Overtime Paycheck is $" + otPay );
console.log("Total Paycheck without Tax is $" + total );
console.log("Tax paid is $" + taxPay);
console.log("Paycheck after tax is $" + afterTax);

