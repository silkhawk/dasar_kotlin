fun main() {
    print("Masukkan harga ")
    val input1 = readLine()

    print("Masukkan jumlah ")
    val input2 = readLine()


    if (input1 != null && input2 !=null) {
        val harga: Int? = input1.toIntOrNull()
        val jumlah: Int? = input2.toIntOrNull()
        

        println("Harga ="+harga)
        println("Jumlah ="+jumlah)
        println("------------------")
    } else {
        println("Tidak ada masukan.")
    }
}
