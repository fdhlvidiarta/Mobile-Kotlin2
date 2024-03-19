package Decoration

data class Decoration (val rocks: String) {
}

fun makeDecoration() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
    val separator = "=".repeat(39)
    println(separator)
}

// Berikut adalah kelas data dengan 3 properti.
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Tetapkan semua properti ke variabel.
    val (rock, wood, diver) = d5
    val separator = "=".repeat(39)
    println(rock)
    println(wood)
    println(diver)
    println(separator)
}
// Buat enum warna.
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
// Contoh enum yang lain.
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}
