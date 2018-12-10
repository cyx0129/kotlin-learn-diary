fun main(args: Array<String>) {
	var num1 =4
	var num2 =6
	println(num1>num2)
	var num3=Math.sqrt(5.0)-Math.sqrt(4.0)		//根号5-根号4
	var num4=	Math.sqrt(4.0)-Math.sqrt(3.0)		//根号4-根号3
	println(num3<num4)
	println("num3="+num3)
	println("num4="+num4)
	var num5=Math.pow(2.0,100.0)	//pow()幂函数，abs()是绝对值，切记数字写成double,此代码是2的100次方
	var num6=Math.pow(3.0,75.0)		//此代码是3的75次方
	println(num5<num6)
	println("num5="+num5)	//结果是1.26乘以10的30次方
	println("num6="+num6)	//结果是6.08乘以10的35次方
}