fun functionLuar(){
    // Bisa diakses dimanapun
}
fun main() {
    // Function yang ada di dalam function, hanya bisa diakses di dalam function
    fun hai(nama:String) = println("Hai $nama")
    hai("Aska")
}