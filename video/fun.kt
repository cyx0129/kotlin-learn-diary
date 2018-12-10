fun main(args: Array<String>) {
	var result =add(3,5)
	println(result)
	
	var i = {x:Int,y:Int->x+y}		//这里用的是大括号，"->"是指返回值,这里的返回值是一个函数。。	//这种写法就叫做函数表达式
	//变量i定义的函数和add的定义是一模一样的			//是第一种函数的声明
	var result2 =i(3,5)
	println(result2)

	
	var j:(Int,Int)->Int= {x,y->x+y}			//函数的第二种声明方法
	var result3 =j(3,5)
	println(result3)
}	
fun add(x:Int,y:Int):Int = x+y			//也可以	Int{return x+y}
	
