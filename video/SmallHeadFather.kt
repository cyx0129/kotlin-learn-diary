//class SmallHeadFather :IWashBowl{
//   override fun washing() {
//     println("我是小头爸爸，我在开心得洗碗，一次赚10块钱") //
//     }
//}
class SmallHeadFather:IWashBowl by BigHeadSon{    //by关键字是接口代理
    override fun washing() {
        println("我是小头爸爸，我赚了10块钱")
        BigHeadSon.washing()  //又创建了一个大头儿子，因为这段代码用了两个构造方法
        //只要调用一个构造，计算机里面就创建了一个大头儿子，而 BigHeadSon().washing() 又创建
        //了一个大头儿子，要想有且仅有一个，那么把大头儿子class的声明变成object
        //所以定义两个构造编译器就会报错,因此把BigHeadSon()中的小括号删除就可以了
        println("我看着儿子把碗洗完了")

        //这里因为用了by关键字，即使方法体里面不写代码，最后测试结果也是大头儿子洗碗的方法
    }

}