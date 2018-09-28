/**
 * Install NOde.js
 * start eclipse 
 * 	created javascript file
 * use node command to execute javascript file
 */

var skills = [
	{name: "html5", year: 5},
	{name: "java", year: 10},
	{name: "sql", year: 3},
	{name: "php", year: 7},
	{name: "c++", year: 3},
	{name: "mongodb", year: 4},
	{name: "c#", year: 10},
];
sum=0;
skills.forEach( (e,i) => {
	e.index=i;
	//if (i %2 != 0)
	//if (i %2 != 0)
	//sum = sum + skills[i].year;
	sum = sum + e.year ;

});


console.log("total years: " + sum + " years");












