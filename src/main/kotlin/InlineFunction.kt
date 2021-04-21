inline fun halo(nama:() -> String) : String {
    return "Halo ${nama()}"
}
fun main() {
    println(halo{"nama"})
}