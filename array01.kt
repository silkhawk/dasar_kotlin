fun main() {
    val kucing = arrayOf("Sianese","Persia","Bengal","burma","Ocicat") 
    println("DATA KUCING AWAL")
    println()
    for (x in kucing) {//tampilkan data
    print(x+",")
    }
    //jumlah data
    println("  | Jumlah data kucing: " + kucing.size)
    println("Data ke 1 kucing "+kucing[0])  //ke-1
    println("Data ke 1 diganti dengan kucing kampung")
    kucing[0] = "kampung"
    println("DATA KUCING SETELAH DI GANTI")
    println()
    for (x in kucing) {//tampilkan data
    print(x + ",")
    }
    println()
    println(" | APAKAH ADA JENIS KUNING belang ?")
    println()
    if ("belang" in kucing){
        println("Data Ada..")
    }else{
        println("Data Tidak Ada..")
    }
}