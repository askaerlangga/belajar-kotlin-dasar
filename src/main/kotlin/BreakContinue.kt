fun main() {
    var i = 0
    while (true){
        println("Perulangan ke $i")
        i++
        if (i > 1000){
            break // Menghentikan semua perulangan
        }
    }

    var l = 0
    for (l in 1..1000){
        if (l % 2 == 0){
            continue // Skip perulangan
        }
        println("Angka $l")
    }
}