fun main() {
    // val range = 1..100
    // val range = 100 downTo 1 // Range terbalik
    val range = 1..100 step 5 // Set langkah

    println(range)
    println(range.count()) // Jumlah range
    println(range.contains(50)) // Mengetahui apakah nilai tersebut ada pada range
    println(range.contains(200))
    println(range.first) // Nilai pertama pada range
    println(range.last) // Nilai akhir pada range
    println(range.step) // Angka langkah pada range
}