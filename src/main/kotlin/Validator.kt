class Validator {

    fun validasi(pilihanPemain1: String, pilihanPemain2:String): Boolean {
        return if ((pilihanPemain1 != "batu" && pilihanPemain1 != "kertas" && pilihanPemain1 != "gunting")|| (pilihanPemain2 != "batu" && pilihanPemain2 != "kertas" && pilihanPemain2 != "gunting")) {
            println("")
            println("Pilihan yang anda masukkan salah, silahkan pilih antara gunting, batu, atau kertas")
            println("==================================================================================")
            println("")
            false
        } else {
            true
        }

    }
}
