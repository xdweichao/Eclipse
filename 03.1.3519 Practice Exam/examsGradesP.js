/**
 * 
 */

var fs = require('fs');

var contents = fs.readFileSync("/data/examsGrades.json",'utf8');

var jsonContent= JSON.parse(contents);

//find length
//console.log(jsonContent.length);

//display each row with index
jsonContent.forEach((answer, index) =>{ 
console.log({"index": index, answer});
});

//node <file>.js to > <new file name>
//show all male
//var answer = jsonContent.filter(f => f.gender=="female");
//console.log (answer);

//filter and show only avg of 95 or higher
//var answer = jsonContent.filter(f => f.average >= 95);
//console.log(answer);

//filter and show exams that include 100
//var answer = jsonContent.filter (f => f.exams.includes(100));
//console.log(answer);

//filter and show exams that include 100 and display certain fields
/*jsonContent.filter(f =>f.exams.includes(100)).forEach((answer, index) =>{ 
console.log({"index": index,
	"id": answer._id,
	"exams": answer.exams,
	"average": answer.average});
});*/

//display all  failing students
//var answer = jsonContent.filter(f => f.midtermStatus=="failing");
//console.log(answer);



