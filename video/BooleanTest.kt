fun main(args: Array<String>) {
	var num1 =4
	var num2 =6
	println(num1>num2)
	var num3=Math.sqrt(5.0)-Math.sqrt(4.0)		//����5-����4
	var num4=	Math.sqrt(4.0)-Math.sqrt(3.0)		//����4-����3
	println(num3<num4)
	println("num3="+num3)
	println("num4="+num4)
	var num5=Math.pow(2.0,100.0)	//pow()�ݺ�����abs()�Ǿ���ֵ���м�����д��double,�˴�����2��100�η�
	var num6=Math.pow(3.0,75.0)		//�˴�����3��75�η�
	println(num5<num6)
	println("num5="+num5)	//�����1.26����10��30�η�
	println("num6="+num6)	//�����6.08����10��35�η�
}