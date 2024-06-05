class Kue (var nama: String, var warna: String, var rasa: String,var berat: Int) {
}
//JOB2
fun main() {
    val kue1 = Kue("Pukis","Hijau","Manis",100)
    println("NAMA KELAS KUE")
    println("NAMA OBJECT PISANG")
    println("buah : " + kue1.nama)
    println("warna : " + kue1.warna)
    println("berat : " + kue1.berat + "gr")
}
