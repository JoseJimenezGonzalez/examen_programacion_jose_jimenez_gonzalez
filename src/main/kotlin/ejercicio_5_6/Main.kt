package ejercicio_5_6

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt



open class Circunferencia(var radio: Double){
    var centroCircunferenciaX: Double = 0.0
    var centroCircunferenciaY: Double = 0.0
    var puntoCualquieraX: Double = 0.0
    var puntoCualquieraY: Double = 0.0
    constructor(centroCircunferenciaX: Double, centroCircunferenciaY: Double, puntoCualquieraX: Double, puntoCualquieraY: Double): this(0.0){
        this.centroCircunferenciaX = centroCircunferenciaX
        this.centroCircunferenciaY = centroCircunferenciaY
        this.puntoCualquieraX = puntoCualquieraX
        this.puntoCualquieraY = puntoCualquieraY
        radio = calcularRadio()
    }
    open fun calcularRadio(): Double =  sqrt((centroCircunferenciaX - puntoCualquieraX).pow(2.0) + (centroCircunferenciaY - puntoCualquieraY).pow(2.0))
    open fun calcularLongitud() :Double = 2 * PI * radio
    override fun toString(): String {
        return "Circunferencia con radio: $radio, centro($centroCircunferenciaX, $centroCircunferenciaY) y con punto cualquiera($puntoCualquieraX, $puntoCualquieraY) y longitud ${calcularLongitud()}"
    }

}

class Circulo(radio: Double, var colorCirculo: String): Circunferencia(0.0){
    constructor(centroCircunferenciaX: Double, centroCircunferenciaY: Double, puntoCualquieraX: Double, puntoCualquieraY: Double, colorCirculo: String): this(0.0, "Color defecto: amarillo"){
        this.colorCirculo = colorCirculo
        this.centroCircunferenciaX = centroCircunferenciaX
        this.centroCircunferenciaY = centroCircunferenciaY
        this.puntoCualquieraX = puntoCualquieraY
        this.radio = calcularRadio()
    }
    fun calcularArea(): Double = PI * radio.pow(2.0)
    override fun toString(): String {
        return return "Circulo con radio: $radio, centro($centroCircunferenciaX, $centroCircunferenciaY) y con punto cualquiera($puntoCualquieraX, $puntoCualquieraY), longitud ${calcularLongitud()}, area: ${calcularArea()} y color: $colorCirculo"
    }
}

fun main(){
    val circunferencia1 = Circunferencia(7.6)
    val circunferencia2 = Circunferencia(0.0, 0.0, 0.0, 1.0)
    println("Circunferencia 1")
    println(circunferencia1.toString())
    println("Longitud de arco de la circunferencia: ${circunferencia1.calcularLongitud()}")

    println("Circunferencia 2")
    println(circunferencia2.toString())
    println("Longitud de arco de la circunferencia: ${circunferencia2.calcularLongitud()}")

    var circulo1 = Circulo(8.3, "Rojo")
    var circulo2 = Circulo(0.0, 0.0, 0.0, 1.0, "Azul")
    println("Circulo 1")
    println(circulo1.toString())
    println("Circulo 2")
    println(circulo2.toString())
}