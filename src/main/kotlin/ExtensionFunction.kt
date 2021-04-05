// Menambahkan function tambahan pada tipe data
fun String.hai() : String = "Hai $this"
fun main() {
    val nama = "Aska"
    println(nama.hai())
}