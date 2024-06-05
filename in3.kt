import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukan Harga = ")
    val input = scanner.nextInt()

    print("Masukan Jumlah = ")
    val input2 = scanner.nextInt()

    val bayar = input * input2
    println("harga = $input dan jumlah = $input2 maka bayar = " +bayar)
    scanner.close()
}
