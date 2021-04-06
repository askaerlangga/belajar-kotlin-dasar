fun main() {
    fun returnIfWhen(nama:String = "") : String{
//        return if (nama == ""){
//            "Hai"
//        }else{
//            "Hai $nama"
//        }

        return when(nama){
            "" -> "Hai"
            else -> "Hai $nama"
        }
    }

    println(returnIfWhen())
    println(returnIfWhen("Aska"))
}