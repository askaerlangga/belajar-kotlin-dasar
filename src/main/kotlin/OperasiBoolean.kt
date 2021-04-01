// && = keduanya harus true jika ingin menghasilkan nilai true
// || = salah satunya harus true jika ingin menghasilkan nilai true
// ! = jika nilai true, maka akan menghasilkan false

fun main() {
    val nilaiUAS = 80
    val nilaiUTS = 80
    val nilaiAbsen = 80

    val lulusUAS = nilaiUAS > 75
    val lulusUTS = nilaiUTS > 75
    val lulusAbsen = nilaiAbsen > 75

    val kelulusan = lulusUAS && lulusUTS && lulusAbsen
    println(kelulusan)
}