fun main(args: Array<String>) {

    var nota: Double = 0.0
    var media: Double = 0.0
    var cont = 0

    println("Precisamos que você digite as suas 4 notas para calcularmos a média: ")

    while(cont < 4){
        print("Informe a sua nota: ")
        nota = readLine()!!.toDouble()
        media += nota
        cont++
    }
    media = media / 4

    println("A sua média foi: $media")
}