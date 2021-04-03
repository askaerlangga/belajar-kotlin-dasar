// Jika nilai parameter tidak dimasukan, maka akan default parameter yang akan ditampilkan
fun halo(namaDepan: String, namaBelakang: String? = null){ // namaBelakang default parameter = null
    if (namaBelakang == null){
        println("Halo $namaDepan")
    }else{
        println("Halo $namaDepan $namaBelakang")
    }
}

fun main() {
    halo("Aska") // Parameter kedua tidak dimasukan, akan menggunakan default parameter
    halo("Aska","Erlangga")
}