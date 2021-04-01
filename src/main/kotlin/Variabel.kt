// Constatnt bersifat global (bisa diakses dimanapun) dan immutable
const val APP = "IntelliJ IDEA"
const val  APP_VERSION = "2019.03 Community"

fun main() {
    //    var = data bisa diubah (Mutable)
    var namaDepan : String = "Aska"
    var namaBelakang = "Erlangga"

    //    val = data tidak bisa diubah (Immutable)
    val tahunLahir = 20

    // println() = cetak dengan baris baru
    println(namaDepan)
    println(namaBelakang)
    println(tahunLahir)

    // Nullable = Jika variabel ingin bisa  null, maka harus diberi tanda (?) tanya
    var nama : String? = null
    println(nama)

    println("$APP : $APP_VERSION")

}