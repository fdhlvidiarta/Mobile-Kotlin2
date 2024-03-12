package konstruktor.kelas
import konstruktor.kelas.Aquarium

fun buildAquarium() {
    println("=".repeat(41))
    val aquarium1 = Aquarium()
    aquarium1.pSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.pSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.pSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.pSize()
    println("-".repeat(41))

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.pSize()
    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")
    println("-".repeat(41))

    aquarium6.pSize()
    aquarium6.volume = 70
    aquarium6.printSize()
    println("=".repeat(41))
}

fun main() {
    buildAquarium()
}