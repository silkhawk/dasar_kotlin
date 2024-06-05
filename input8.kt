

fun main() {
    // Membaca input dari pengguna untuk harga
   println("--------------input---------------")
    print("Masukkan harga barang: ")
    val harga = readLine()
    val harga1 = harga?.toIntOrNull() ?: 0

    // Membaca input dari pengguna untuk jumlah
    print("Masukkan jumlah barang: ")
    val jumlah = readLine()
    val jumlah1 = jumlah?.toIntOrNull() ?: 0

    // Membaca input dari pengguna untuk diskon (contoh 0.25)
    print("Masukkan Diskon : ")
    val diskon = readLine()
    val diskon1 = diskon?.toDoubleOrNull() ?: 0.0
    /* ini adalah proses */
    val hasil = tot_bay(harga1, jumlah1)
    val pot = potongan(hasil,diskon1)
    val cast = bayar(hasil,pot)
    println("--------------OUTPUT---------------")
    println("Harga       : Rp."+harga1)
    println("Jumlah      : "+jumlah1+" buah")
    println("Diskon      : "+diskon1+"%")
    println("Tot Bayar   : Rp. $hasil")
    println("Potongan    : Rp. "+pot)
    println("Total bayar : Rp. "+cast)

}    
fun tot_bay(harga:Int,jumlah:Int):Int{
    return harga * jumlah
}
fun potongan(totBayar: Int, diskon: Double
): Double
 {
    return totBayar * diskon
}
fun bayar(tb: Int, po: Double):Double{
    return tb - po
}

