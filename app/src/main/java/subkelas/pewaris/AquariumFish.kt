package subkelas.pewaris

/*abstract class AquariumFish {  "Langkah ke 7" bedanya buat kelas tunggal dan tidak.
    abstract val color: String
}
class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}
class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}*/
interface FishAction  {
    fun eat()
}

class Plecostomus:  FishAction, FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}


class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}
interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    val separator = "=".repeat(39)
    println(separator)
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}