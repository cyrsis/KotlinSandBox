package `class`

/**
 * Created by victor888 on 3/4/2017.
 */
//Why wdo want to delegate the whole class
//Think of model a poly device
//

interface  IPrinter{ //If I have 20 functiosn each, thing will be very worst
  fun PrintSomething()
}

class Printer :IPrinter {
  override fun PrintSomething() {
    print("I am a Pritner")
  }
}

interface  IScanner{
  fun ScanSomething()
}

class Scanner:IScanner {
  override fun ScanSomething() {
    print("I really can scan")
  }
}

//class MultiFucntionDevice: Scanner, Pritner //For the multideive We cannt do this because this is not C++
//But I also can

class MultiFunctionDevice(printer:IPrinter = Printer(), scanner:IScanner = Scanner()):IPrinter by printer, IScanner by scanner  //A one line can replace 10 lines
{

}

//class MultiFunctionDevice:IPrinter, IScanner { //This is ok too, but I already done the implementation already done
//                                                //The Print line in the main
//  var scanner = Scanner()
//  var printer = Printer()
//  override fun PrintSomething() {
//   printer.PrintSomething()
//  }
//
//  override fun ScanSomething() {
//   scanner.ScanSomething()
//    }
//
//}


fun main(args: Array<String>) {
  val multiFunctionDevice = MultiFunctionDevice()
  multiFunctionDevice.PrintSomething()
   multiFunctionDevice.ScanSomething()
}