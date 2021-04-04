// Bisa memasukan lebih dari satu parameter di parameter akhir
fun hitungNilai(nama:String,vararg nilai:Int) { // Varargs harus berada di parameter terakhir (Paling kiri)
    var totalNilai = 0
    for (x in nilai){
        totalNilai += x
    }
    println("Nilai $nama = $totalNilai")
}
fun main() {
    hitungNilai("Aska",70,80,75) // Memasukan lebih dari 2 parameter
}