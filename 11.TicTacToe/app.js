/**
 * 1.	npm init
 * 2.   npm install express --save
 * 3.   npm install ejs --save 
 * 
 * 
 * Links
 * http://ejs.co/
 * https://www.codementor.io/naeemshaikh27/node-with-express-and-ejs-du107lnk6
 * 
 * prompt $g //show me the greater then sign with the space
 * 
 * creating the package.json file
 * npm init
 * 
 */
//const is constant, an unchangable/cant be updated var(variable)
const express = require('express')
const app = express();
var ejs = require('ejs');

//view engine is responsiable for the view
app.set('view engine', 'ejs');
app.use(express.static('public'))

app.get('/', (req, res) => res.send('Hello World!'));

app.get('/tictactoe', function(req, res){ 
 	res.render('TicTacToe');
});


app.listen(3000, () => console.log('Example app listening on port 3000!'));