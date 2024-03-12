package Membuat.kelas

import Membuat.kelas.aquarium

fun buildAquarium() {
    var myAquarium = aquarium()
    myAquarium.pSize()
    myAquarium.height = 60
    myAquarium.pSize()

}
fun main() {
    buildAquarium()
}
