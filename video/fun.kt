fun main(args: Array<String>) {
	var result =add(3,5)
	println(result)
	
	var i = {x:Int,y:Int->x+y}		//�����õ��Ǵ����ţ�"->"��ָ����ֵ,����ķ���ֵ��һ����������	//����д���ͽ����������ʽ
	//����i����ĺ�����add�Ķ�����һģһ����			//�ǵ�һ�ֺ���������
	var result2 =i(3,5)
	println(result2)

	
	var j:(Int,Int)->Int= {x,y->x+y}			//�����ĵڶ�����������
	var result3 =j(3,5)
	println(result3)
}	
fun add(x:Int,y:Int):Int = x+y			//Ҳ����	Int{return x+y}
	
