fun main() {
    fun hai(nama:String, ubah:(String) -> String) : String { // Bisa menggunakan function sebagai parameter
        val ubahString = ubah(nama)
        return "Hai $ubahString"
    }

    val ubahKapital = {nama:String -> nama.toUpperCase()} // Lambda pengubah string menjadi huruf kapital
    println(hai("Aska", ubahKapital ))
    println(hai("Aska", {nama:String -> nama.toLowerCase()})) // Lambda pengubah string menjadi huruf kecil

    // Trailing Lambda
    val nama = hai("Adi"){nama:String -> nama.toUpperCase()}
    println(nama)
}