package subkelas.pewaris

import subkelas.pewaris.Aquarium

fun bulidAquarium() {
    val aquarium1 = Aquarium(length = 25, width = 25, height = 40)
    aquarium1.printSize() //memanggil funprintSize yg ada di class Aquarium
}

fun main() {
    bulidAquarium() //memanggil fun bulidAquarium yg berada di class Aquarium.
    makeFish()  //memanggil fun makeFish yg berada di class AquariumFish.
}