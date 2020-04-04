fun main() {

    // TODO 1
    val vehicle = mapOf(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )


    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle["maxSpeed"]
    val maxTank = vehicle["maxTank"]

    // TODO 3
    println("Vehicle")
    cetak(vehicle)

}

fun cetak(vehicle : Map<String, String>) {
    println("Type: " + vehicle["type"])
    println("Maximal Speed: " + vehicle["maxSpeed"])
    println("Maximal Tank: " + vehicle["maxTank"])
}