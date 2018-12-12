import java.math.BigInteger			//加上这个下面BigInteger就不会报错了

/*演示递归:(阶乘）
 1的阶乘1	2的阶乘2*1		3的阶乘3*2*1		4的阶乘4*3*2*1		5的阶乘5*4*3*2*1
 n的阶乘？->包子馅的包子最终变成了馒头
*/
fun main(args: Array<String>) {
	//var num=5
	var num=BigInteger("100")
	println(fact(num))		//fact()：阶乘函数
}
 /*fun fact(num:Int):Int{
	 if(num==1){		5的阶乘是5*4的阶乘，6的阶乘是6*5的阶乘
		 return 1	        100的阶乘是0，是因为结果是一个非常大的数，已经超过了Int的保存范围，所以引入BigInteger
                                BigInteger是Javamatch里面的API
     }else{
    	 return num*fact(num-1)
    }
}*/
   fun fact(num:BigInteger):BigInteger{
	   if(num==BigInteger.ONE){
		   return BigInteger.ONE
      }else{
    	   return num*fact(num-BigInteger.ONE)
       }
   }
