fun main() {
    loopI@ for(i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i*j}")
            if (i > 5){
                break@loopI
            }
        }
    }
}