fun berhitung(angka1:Int,angka2:Int) : Int { // Function yang mengembalikan nilai Integer
    val total = angka1 + angka2
    return total // Mengembalikan nilai total
}

fun bagi(angka1: Int,angka2: Int) : Int{
    if (angka2 == 0){
        return 0
    }else{
        val total = angka1 / angka2
        return total
    }
}

fun main() {
    println(berhitung(100,30))
    val hasil = berhitung(20,70)
    println(hasil)
    println(bagi(30,2))
    println(bagi(30,0))
}