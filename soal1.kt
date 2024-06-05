fun main() {
    val mat:Int = 90
    val bind:Int = 75
    val sej:Int = 80
    val tot = mat + bind + sej
    val rata2 = tot/3
    println("====== SOAL UAS ======")
    println("MATEMATIKA      = $mat")
    println("B.INDONESIA     = $bind")
    println("SEJARAH         = $sej")
    println("NILAI TOTAL     = $tot")
    println("NILAI RATA-RATA = $rata2")
    if (rata2 > 75) {
    println("STATUS          = LULUS")
    }else{
    println("STATUS          = GAGAL")
    }
}