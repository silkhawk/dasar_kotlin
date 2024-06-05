import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukan Sebuah Angka =")
    val number = scanner.nextInt()
    val hasil = number+1
    println("Anda memasukan angka = " + number+1)
    println("$number di tambah 1 = " + hasil)
    scanner.close()
}
