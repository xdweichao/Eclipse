/**
 * 
 */

// https://www.sitepoint.com/understanding-module-exports-exports-node-js/
// greetings.js
var exports = module.exports = {};

// fake posts to simulate a database
const posts = [ {
	id : 1,
	author : 'John',
	title : 'Templating with EJS',
	body : 'Blog post number 1',
	year : '1981'
}, {
	id : 2,
	author : 'Drake',
	title : 'Express: Starting from the Bottom',
	body : 'Blog post number 2',
	year : '1981'
}, {
	id : 3,
	author : 'Emma',
	title : 'Streams',
	body : 'Blog post number 3',
	year : '1981'
}, {
	id : 4,
	author : 'Cody',
	title : 'Events',
	body : 'Blog post number 4',
	year : '1981'
}, {
	id : 5,
	author : 'Wei',
	title : 'Pineorange, Brainsoup, Slurping Eyeball Goo',
	body : 'Blog post number 5',
	year : '1981'
} ]

exports.findAllPosts = function() {
	return posts;
};

//tester
//var x = exports.findAllPosts();
//console.log(x);