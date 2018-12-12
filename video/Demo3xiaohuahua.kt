/*
程序员B写的代码
洗衣服
*/
fun main(args: Array<String>) {
    var washMachine =WashMachine(module= "小天鹅",size=12)
    washMachine.openDoor()
    println("小华华把牛仔裤放进去啦")
    washMachine.closeDoor()
    washMachine.selectMode(mode = 2)



}
