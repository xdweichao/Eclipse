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
	
//console.log(skills.length)
//console.log(skills)

/**for(i=0; i < skills.length; i++){
	if(skills[i].year >5){
	console.log(skills[i]);
	}
*/

skills.forEach( (e,i) => {
	e.index=i;
	console.log(e);
});

// when more then 2 parameters, surround with ()
// e represents rows, i represents which row
// "=>" represent function

console.log("-----")

skills.forEach(function(e,i){
	e.index=i;
	console.log(e);
});

console.log("-----")

var x= function(e,i){
	e.index=i;
	console.log(e);
};
skills.forEach(x);











