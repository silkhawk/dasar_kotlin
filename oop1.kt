class Buah{
    var nama=""
    var warna=""
    var rasa=""
    var berat=0
}
//JOB 1
fun main() {
    val pisang = Buah()

    pisang.nama="batu"
    pisang.warna="Kuning"
    pisang.berat=100

    println("NAMA KELAS BUAH")
    println("NAMA OBJECT PISANG")
    println("buah : "+pisang.nama)
    println("warna : "+pisang.warna)
    println("berat : "+pisang.berat+"gr")
}
