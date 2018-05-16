package com.kotlin.study.类和对象.类.嵌套类

import com.kotlin.study.基本类型.a

/**
 * 声明在类成员位置的类称为嵌套类，不能带inner标记，否则就是内部类
 * 嵌套类：
 * 外部类不能访问嵌套类的成员，要访问嵌套类的成员必须创建嵌套类的对象才能访问。
 * 如何创建嵌套类的对象？
 * 外部类.嵌套类()
 * 可以看到嵌套类实例化语法，并不需要创建外部类实例，所以嵌套类并不持有外部类的实例，所以在嵌套类不能访问外部类的属性。
 * 嵌套类内部可以直接访问外部类中定义的伴生对象的属性；
 *
 * 内部类：
 * 实例化语法：
 * 外部类().内部类()
 * 可以看到实例化方式是，先创建了外部类对象，然后用外部类对象创建了内部类对象。内部类对象时持有外部类的实例的，所以在内部类中
 * 可以访问外部类的成员。
 *
 *
 */

class 外部类{
    private var bar: Int = 1
    class 嵌套类{
        var a: Int = 2
        var 嵌套类属性: String = 伴生对象属性

        fun 打印嵌套类的属性(){
            println("嵌套类属性是$嵌套类属性")
        }
    }

    companion object {
        var 伴生对象属性: String = "伴生对象属性"
    }

    inner class 内部类{
        var 内部类属性: Int = 5

        fun 内部类函数(){
            println("外部类属性值是$bar")
        }
    }

    fun test(){
        println("嵌套类属性的值是${外部类.嵌套类().a}，外部类属性的值是$bar")
    }
}

fun main(args: Array<String>) {
//    外部类().test()
    外部类.嵌套类().打印嵌套类的属性()
//    外部类().内部类().内部类函数()
}