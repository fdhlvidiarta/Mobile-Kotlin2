package com.fadhil.mobile_kotlin

fun main(args: Array<String>) {
    biodata("Fadhil Vidiarta", 19, "Bekasi", "05 Januari 2005")
    hobby("Lari", "olahraga yang katanya paling murah, tapi bisa membuat saya merasa kaya karena menghirup udara segar di pagi hari.")
    sukaHobby(true)
}

fun biodata(name: String, age: Int, placeOfBirth: String, dateOfBirth: String) {
    val separator = "=".repeat(34)
    println(separator)
    println("Nama\t         : $name")
    println("Usia\t         : $age")
    println("Tempat Lahir\t : $placeOfBirth")
    println("Tanggal Lahir\t : $dateOfBirth")
    println(separator)
}

fun hobby(nama: String, desc: String) {
    println("Hobi saya adalah $nama")
    println("Olahraga yang katanya paling murah, tapi bisa membuat saya merasa kaya karena menghirup udara segar di pagi hari.")
    println("Saya menemukan bahwa $nama dapat menghilangkan stres dan juga menjaga kesehatan tubuh.")
}

fun sukaHobby(Suka: Boolean) {
    val message = if (Suka) {
        "Saya suka memiliki hobi yang membuat saya aktif dan sehat"
    } else {
        "Saya belum menemukan hobi yang benar-benar saya sukai"
    }
    println("\"$message\"")
}