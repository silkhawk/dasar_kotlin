class Barang() {
    var nama: String = ""
    var harga: Int = 0
    var jumlah: Int = 0
    var diskon: Double = 0.0

    fun totHar(harga: Int, jumlah: Int): Int {
        return harga * jumlah
    }

    fun pot(harga: Int, jumlah: Int, diskon: Double): Double {
        return harga * jumlah * diskon
    }
}

fun main() {
    val tugas1 = Barang()
    tugas1.nama = "Pena"
    tugas1.harga = 1000
    tugas1.jumlah = 10
    tugas1.diskon = 0.25

    println("Nama Barang   :" + tugas1.nama)
    println("harga  Barang :" + tugas1.harga)
    println("jumlah Barang :" + tugas1.jumlah)
    println("total Harga   :" + tugas1.totHar(tugas1.harga, tugas1.jumlah))
    println("diskon        :" + tugas1.diskon * 100 + "%")
    println("Potongan      :" + tugas1.pot(tugas1.harga, tugas1.jumlah, tugas1.diskon))

    var totBayar: Double
    totBayar =
            tugas1.totHar(tugas1.harga, tugas1.jumlah) -
                    tugas1.pot(tugas1.harga, tugas1.jumlah, tugas1.diskon)

    println("Total Bayar   :" + totBayar)
}
