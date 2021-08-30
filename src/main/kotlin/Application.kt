fun main(args:Array<String>) {

    var pemain1: String
    var pemain2: String
    var pilihan1: String
    var pilihan2: String
do {
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")

    val pemain = Pemain()
    pemain.prosesSuit()

}while(ulangGame()==true)

}
