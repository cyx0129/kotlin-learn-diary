//妹子 长相 声音
class  Girl(var chactor:String,var voice:String){
    fun smile(){
        println("妹子笑了一下，么么哒")
    }
    fun cry(){
        println("呜呜呜，人家伤心么")
    }
}

fun main(args: Array<String>) {
    var girl1 =Girl(chactor = "彪悍",voice = "甜美")
    println("girl1这位妹子的声音：${girl1.voice}")
    girl1.cry()
    girl1.smile()

}
//静态：属性         动态：方法

