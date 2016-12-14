
var calculator = (function(){
	var counter = 0;
	var add = function(x, y){
		console.log(counter++);
		return x+y;
	}

	var subtract = function(x, y){
		console.log(counter++);
		return x-y;
	}
	var multiply = function(x, y){
		console.log(counter++);
		return x*y;
	}

	var divide = function(x, y){
		console.log(counter++);
		return x/y;
	}

	return {
		add : add,
		subtract : subtract,
		multiply : multiply,
		divide : divide
	}
})();

module.exports = calculator;