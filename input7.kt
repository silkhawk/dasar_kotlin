fun main() {
    // Membaca input dari pengguna untuk bilangan pertama
    println("-----------------------")
    print("Masukkan harga barang: ")
    val harga = readLine()
    val harga1 = harga?.toIntOrNull() ?: 0

    // Membaca input dari pengguna untuk bilangan kedua
    print("Masukkan jumlah barang: ")
    val jumlah = readLine()
    val jumlah1 = jumlah?.toIntOrNull() ?: 0

    // Menjumlahkan dua bilangan
    val hasil = tambah(harga1, jumlah1)

    // Menampilkan hasil penjumlahan
    println("Bayar : $hasil")
}

// Fungsi untuk menjumlahkan dua bilangan
fun tambah(a: Int, b: Int): Int {
    return a * b
}
