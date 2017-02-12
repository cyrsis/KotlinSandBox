package map

/**
 * Created by victor888 on 2/12/2017.
 */
fun main(args: Array<String>) {
  var emptyMap: Any = emptyMap<>()
}
//Map接口有三个比较重要的实现类，分别是HashMap、TreeMap和HashTable。
//
//TreeMap是有序的，HashMap和HashTable是无序的。
//Hashtable的方法是同步的，HashMap的方法不是同步的。这是两者最主要的区别。
//
//这就意味着Hashtable是线程安全的，HashMap不是线程安全的。HashMap效率较高，Hashtable效率较低。
//如果对同步性或与遗留代码的兼容性没有任何要求，建议使用HashMap。
//查看Hashtable的源代码就可以发现，除构造函数外，Hashtable的所有 public 方法声明中都有 synchronized关键字，而HashMap的源码中则没有。
//
//Hashtable不允许null值，HashMap允许null值（key和value都允许）
//父类不同：Hashtable的父类是Dictionary，HashMap的父类是AbstractMap
//Hashtable中hash数组默认大小是11，增加的方式是 old*2+1。HashMap中hash数组的默认大小是16，而且一定是2的指数。

//| HashMap | Hashtable | TreeMap
//-------------------------------------------------------
//iteration order  | no      | no        | yes
//null key-value   | yes-yes | no-no   | no-yes
//synchronized     | no      | yes       | no
//time performance | O(1)    | O(1)      | O(log n)
//implementation   | buckets | buckets   | red-black tree
