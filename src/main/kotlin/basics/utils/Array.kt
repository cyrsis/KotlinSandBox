package basics.utils

/**
 * Created by victor888 on 4/11/2017.
 */
fun main(args: Array<String>) {

    //The array conversation is very simple and easy to read
    //use arrayOf make so much sense
//    String[] names = new String[]{"Kyo", "Ryu", "Iory"};
//    String[] emptyStrings = new String[10];
    val name :Array<String> = arrayOf("Victor","Tony","Mary")

    name.forEach { print(it+" " ) }
}
