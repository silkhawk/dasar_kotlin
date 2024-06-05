fun main() {
    print("Masukkan angka: ")
    val input = readLine()

    if (input != null) {
        val angka: Int? = input.toIntOrNull()

        if (angka != null) {
            when {
                angka in 80..100 -> {
                    println("Nilai huruf: 100")
                }
                angka in 60..79 -> {
                    println("Nilai huruf: B")
                }
                else -> {
                    println("Nilai huruf: Tidak Diketahui")
                }
            }
        } else {
            println("Masukan bukan angka yang valid.")
        }
    } else {
        println("Tidak ada masukan.")
    }
}
