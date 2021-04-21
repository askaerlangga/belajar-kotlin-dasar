fun main() {
    fun hai(nama:String, ubah:(String) -> String) : String {
        val ubahString = ubah(nama)
        return "Hai $ubahString"
    }

    val kapital = fun(nama:String) : String {
        if (nama == ""){
            return "Tidak ada Nama"
        }else{
            return  nama.toUpperCase()
        }
    }


    println(hai("Aska", kapital))
}