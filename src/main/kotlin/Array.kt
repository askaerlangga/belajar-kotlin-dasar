fun main() {

    // Array hanya bisa memiliki satu tipe data
    var nama : Array<String> = arrayOf("Aska","Erlangga")
    var angka : Array<Int> = arrayOf(1,2,3,4)

    // Mengambil data pada array
    // Cara 1
    println(nama.get(0))
    // Cara 2
    println(nama[1])

    // Mengubah data array
    // Cara 1
    nama.set(0, "Adi")
    // Cara 2
    nama[1] = "Kurniawan"


    println("${nama.get(0)} ${nama.get(1)}")

    // Array boleh null
    var nama2 : Array<String?> = arrayOfNulls(5)
    nama2[0] = "Aska"
    nama2[1] = "Aska"
    nama2[2] = "Aska"
    nama2[3] = "Aska"
    nama2[4] = "Aska"
    println(nama2[1])

    // Mengetahui ukuran array
    println(nama2.size)
}