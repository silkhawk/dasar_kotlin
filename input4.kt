fun main() {
    print("Masukkan angka: ")
    val input = readLine()

    if (input != null) {
        val angka: Int? = input.toIntOrNull()

        if (angka != null) {
            if (angka > 80) {
                println("Nilai huruf: A")
            } else {
                println("Nilai huruf: B")
            }
        } else {
            println("Masukan bukan angka yang valid.")
        }
    } else {
        println("Tidak ada masukan.")
    }
}
