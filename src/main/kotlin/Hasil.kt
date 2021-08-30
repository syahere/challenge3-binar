class Hasil(pemain1:String, pemain2:String, pilihan1:String, pilihan2:String){
    lateinit var hasil:String
    var Pilihan1= pilihan1
    var Pilihan2= pilihan2
    var Pemain1= pemain1
    var Pemain2= pemain2

    fun cekHasil(){
        if (Pilihan1 == "batu" && Pilihan2 == "kertas" || Pilihan1 == "kertas" && Pilihan2 == "gunting" || Pilihan1 == "gunting" && Pilihan2 == "batu" ) {
                hasil= Pemain2
            }
        if (Pilihan1 == "batu" && Pilihan2 == "gunting" || Pilihan1 == "kertas" && Pilihan2 == "batu"|| Pilihan1 == "gunting" && Pilihan2 == "kertas") {
            hasil= Pemain1
        }
        if (Pilihan1 == "gunting" && Pilihan2 == "gunting" || Pilihan1 == "batu" && Pilihan2 == "batu" || Pilihan1 == "kertas" && Pilihan2 == "kertas") {
            hasil= "Seri"
        }
        println("")
        println("Hasil:")
        if(hasil=="Seri"){
            println("SERI!!!")
        }else {
            println("$hasil MENANG!!!")
        }
        println("")
        println("")
    }

}
