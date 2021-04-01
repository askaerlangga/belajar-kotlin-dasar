fun main() {
    val array = arrayOf("Aska","Erlangga","Edi","Rahmat")
    var angka = 1
    for (nama in array){ // Perulangan pada array
        println("$angka. $nama")
        angka++
    }

    for (range in 1..100){ // Perulangan pada Range
        println(range)
    }

    val ukuranArray = array.size -1
    println(ukuranArray)
    for (i in 0..ukuranArray){
        println("index $i = ${array.get(i)}")
    }
}