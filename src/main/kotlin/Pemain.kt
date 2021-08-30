open class Pemain() {
    lateinit var pemain1: String
    lateinit var pemain2: String
    lateinit var pilihan1: String
    lateinit var pilihan2: String
    open fun prosesSuit() {
        println("Masukkan nama Pemain 1 :")
        pemain1 = readLine().toString().uppercase()
        println("Masukkan nama Pemain 2 :")
        pemain2 = readLine().toString().uppercase()
        println("Masukkan pilihan $pemain1:")
        pilihan1 = readLine().toString().lowercase()
        println("Masukkan pilihan $pemain2:")
        pilihan2 = readLine().toString().lowercase()

        val hasil = Hasil(pemain1,pemain2,pilihan1,pilihan2)
        hasil.cekHasil()

    }




}

