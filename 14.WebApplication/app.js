// npm install --save

//prompt $g


// require and instantiate express
const app = require('express')();
const posts = require('./data/postsRepository.js')
const rest = require('./data/restaurantRepository.js')


// set the view engine to ejs
app.set('view engine', 'ejs')

// blog home page
app.get('/', (req, res) => {
  // render first params which is `home.ejs` with the list of posts, artist is
	// the forEach
  res.render('home', { artist: posts.findAllPosts() })
})

app.get('/rest', (req, res) => {
	var q = {cuisine:"American"};
	
	var cb = function(data){
		  res.render('home-restaurants', { artist: data})
	};
	rest.getStore(q, cb);

})

app.get('/rest/brooklyn', (req, res) => {
	var q = {borough: "Brooklyn"};
	var size = 22;
	var cb = function(data){
		  res.render('home-restaurants', { artist: data})
	};
	rest.getStore(q,size, cb);

})

app.get('/rest/brooklyn/:zipcode', (req, res) => {
	var q = {borough:"Brooklyn", "address.zipcode":req.params.zipcode};
	var size = 30;
	var cb = function(data){
		  res.render('home-restaurants', { artist: data})
	};
	rest.getStore(q,size, cb);

})

app.get('/rest/queens', (req, res) => {
	var q = {borough: "Queens"};
	var size = 27;
	var cb = function(data){
		  res.render('home-restaurants', { artist: data})
	};
	rest.getStore(q,size, cb);

})

// zipcode: 11375
app.get('/rest/queens/:zipcode', (req, res) => {
	var q = {borough:"Queens", "address.zipcode":req.params.zipcode};
	var size = 30;
	var cb = function(data){
		  res.render('home-restaurants', { artist: data})
	};
	rest.getStore(q,size, cb);

})

app.get('/rest/numbers', (req, res) => {
	var q = {};
	var size = 27;
	var d =[1,2,3,4,5,6,7,8]
	var cb = function(data){
		  res.render('brooklyn', { artist: d})
	};
	rest.getStore(q,size, cb);

})



// blog post
app.get('/post/:id', (req, res) => {
  // find the post in the `posts` array
  const post = posts.findAllPosts().filter((post) => {
    return post.id == req.params.id
  })[0]

  // render the `post.ejs` template with the post content
  res.render('post', {
    author: post.author,
    title: post.title,
    body: post.body
  })
})

app.listen(3000)

console.log('listening on port 3000')
