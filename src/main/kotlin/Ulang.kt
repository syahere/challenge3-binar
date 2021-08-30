 fun ulangGame():Boolean {
     lateinit var lanjut: String
     var hasil: Boolean = true

     do {
         println("Apakah Anda ingin melanjutkan permainan? YA/TIDAK")
         lanjut = readLine().toString().uppercase()
         when (lanjut){
             "YA"-> hasil=true
             "TIDAK"->hasil=false
             else->{println("Anda salah input, coba input lagi")}
         }
     }while (lanjut!="YA" && lanjut!="TIDAK")
     return hasil
 }