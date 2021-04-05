infix fun String.menjadi(a:String) : String { // Harus memiliki 1 Parameter
    if (a == "UPPER"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

infix fun Int.kali(x:Int) : Int = this * x

fun main() {
    println("Aska Erlangga" menjadi "UPPER") // Memanggil Function infix notation
    println(10 kali 100 )
}