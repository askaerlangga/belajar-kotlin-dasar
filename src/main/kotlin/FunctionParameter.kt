fun namaLengkap(namaDepan:String,namaBelakang:String){
    println("Halo $namaDepan $namaBelakang")
}
fun menjumlahkan(angka1:Int,angka2:Int){
    var total = angka1 + angka2
    println(" Total = $angka1 + $angka2 = $total")
}

fun main() {
    namaLengkap("Aska", "Erlangga")
    menjumlahkan(90,20)
}