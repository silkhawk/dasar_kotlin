import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukan Sebuah Angka =")
    if (scanner.hasNextInt()){
        val number = scanner.nextInt()
        println("Masukan anda adalah  $number")
    }else{
        val kata = scanner.next()
        println("Masukan anda adalah $kata")

    }
    scanner.close()
}
