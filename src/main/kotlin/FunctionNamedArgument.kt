//
fun anggota(anggota1:String,
            anggota2:String,
            anggota3:String){
    println("Halo $anggota1, $anggota2, dan $anggota3")
}
fun main() {
    anggota("Aska","Adi", "Budi") // Tidak boleh acak (Harus berurutan)
    anggota(anggota1 = "Aska", anggota3 = "Budi", anggota2 = "Adi") // Boleh acak, tetapi harus memasukan nama parameternya
}