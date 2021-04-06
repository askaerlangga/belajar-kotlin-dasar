fun main() {
    fun factorialLoop(angka:Int) : Int{
        var hasil = 1
        for (x in angka downTo 1){
            hasil *= x
        }
        return hasil
    }
    fun factorialRecursive(angka:Int) : Int{
        return when(angka){
            1 -> 1
            else -> angka * factorialRecursive(angka - 1) // Rekursif
        }
    }
    println(factorialLoop(5))
    println(factorialRecursive(5))
}