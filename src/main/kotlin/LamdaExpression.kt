fun kapital(nama:String) : String = nama.toUpperCase()

fun main() {
    // Lambda Expression
    val menjumlahkan: (Int,Int) -> Int = { angka1:Int,angka2:Int ->
        val hasil = angka1 + angka2
        hasil
    }

    val hasil = menjumlahkan(30,1000)
    println(hasil)

    val tampilNama: (String) -> String = {
        it // Jika parameter hanya 1, bisa menggunakan kata kunci "it"
    }
    println(tampilNama("Aska"))

    // Method References
    val hurufKapital:(String) -> String = :: kapital // Mereferensi function yang sudah ada
    println(hurufKapital("Aska"))
}