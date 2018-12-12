/*程序员A创建的洗衣机

*/
class WashMachine(var module:String,var size:Int) {
    var isDoorOpen=true //类里面定义了一个成员变量，成员变量就是一个布尔类型的值
    var currentmode =0     //定一块存储空间
    fun openDoor(){
        println("洗衣机的门已经打开了")
        isDoorOpen=true
    }
    fun closeDoor(){
        println("洗衣机的门已经关闭了")
        isDoorOpen=false

    }
    fun selectMode(mode:Int){     //设置洗衣机的模式
        currentmode=mode
        when(mode){
            0-> println("初始模式，请您选择模式")
            1-> println("轻柔")
            2-> println("狂揉")
            else-> println("不要乱拧，拧坏了不保修啊")
        }

    }
    fun start(){
        if (isDoorOpen) {
           println("哔哔。。门还没关呢，不能运行")
        }else{
           when(currentmode){
               0->{
                   println("选择模式错误，不能开始洗衣服")}
               1->{
                   println("放水")
                   println("轻柔开始，发动机转速 慢")
                   setMotorSpeed(100)
                   println("洗完啦")
               }
               2->{
                   println("放水")
                   println("狂揉开始，发动机转速 快")
                   setMotorSpeed(1000)
                   println("洗完啦")

               }
               else->{
                   println("模式不能被识别")
               }
           }
        }

    }
    private fun setMotorSpeed(speed:Int){
        println("当前发动机转速为${speed}圈/秒")
    }
}