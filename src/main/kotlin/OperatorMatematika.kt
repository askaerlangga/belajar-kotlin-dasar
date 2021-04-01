fun main() {
    var hasil : Int = 10 / 3
    println(hasil)

    // Jika ingin menghasilkan pecahan, maka harus ditambahkan (.0) dibelakang
    var hasil2 = 10.0 / 3.0
    println(hasil2)

    // Augmented Assigment
    var totalBarang = 0
    val barang1 = 100
    val barang2 = 200
    val barang3 = 300

    totalBarang += barang1
    totalBarang += barang2
    totalBarang += barang3

    println(totalBarang)

    // Unary Operator
    totalBarang++ // totalBarang += 1
    println(totalBarang)

    var sehat = true
    println(!sehat)
}