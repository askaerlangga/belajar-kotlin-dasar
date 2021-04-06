fun main() {
    tailrec fun tailRecursive(angka:Int) { // Tail Recursive
        println("Rekursif ke $angka")
        if (angka > 0){
            tailRecursive(angka - 1)
        }
    }

    fun factorialRecursive(angka:Int,total:Int = 1) : Int{
        return when(angka){
            1 -> total
            else -> factorialRecursive(angka - 1,total * angka)
        }
    }
    println(factorialRecursive(10))
//    tailRecursive(10000)
}