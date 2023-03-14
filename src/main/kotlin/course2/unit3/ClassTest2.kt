package course2.unit3

/**
 * 访问权限修饰符
 * private == Java private
 * protected == Java protected
 * public == Java public
 * internal：模块内可访问，通常用于分模块的工程中做类隔离使用
 */

/**
 *  @JvmStatic 可以看下面这篇blog
 *  https://droidyue.com/blog/2019/12/22/kotlin-annotation-jvmfiled-and-jvmstatic-and-object
 */

/**
 * 伴生对象
 * 一般用来实现静态方法或变量(例如Java中StringUtils.isEmpty())
 * 或者用于实现单例
 */
class MyStringUtil {

    companion object {
        @JvmStatic
        fun isEmpty(str: String?): Boolean {
            return str?.isEmpty() ?: true;
        }
    }
}

/**
 * 伴生对象创建单例的写法
 */
class Single {
    companion object {
        @JvmStatic
        fun getInstance(): Single {
            return Holder.instance;
        }
    }

    private object Holder {
        val instance = Single()
    }
}


fun main(args: Array<String>) {
    println(MyStringUtil.isEmpty(null))

    var instance: Single = Single.getInstance()
}
