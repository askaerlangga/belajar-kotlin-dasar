fun main() {
    val nilai = "C"
    when(nilai){
        "A" -> {
            println("Anda Lulus, dan mendapatkan nilai A") // Bisa menggunakan blok program
        }
        "B" -> println("Anda Lulus, dan mendapatkan nilai B")
        else -> println("Anda tidak Lulus")
    }

    val nilaiUAS = "E"
    when(nilaiUAS){
        "A","B","C","D" -> println("Anda Lulus!") // Grup
        else -> println("Anda tidak Lulus!")
    }

    val nilaiLulus : Array<String> = arrayOf("A","B","C")
    when(nilai){
         in nilaiLulus -> println("Anda Lulus!") // in = Pengecekan nilai di dalam variabel
        !in nilaiLulus -> println("Anda tidak Lulus!")
    }

    val cekTipeData = "Aska"
    when(cekTipeData){
        is String -> println("Tipe data : String")
        !is String -> println("Tipe data : Bukan String")
    }

    val nilaiUjian = 80
    when{
        nilaiUjian > 80 -> println("Anda Lulus, Nilai A")
        nilaiUjian > 70 -> println("Anda Lulus, Nilai B")
        else -> println("Anda tidak Lulus!")
    }
}