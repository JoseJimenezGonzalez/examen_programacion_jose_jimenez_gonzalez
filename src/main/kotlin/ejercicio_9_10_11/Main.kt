package ejercicio_9_10_11

import java.util.Random

class EquipoFutbol(var nombre: String, var pais: String)

fun main(){
    var listaEquiposFutbol = mutableListOf<EquipoFutbol>(
        EquipoFutbol("Real Madrid", "España"),
        EquipoFutbol("Barcelona", "España"),
        EquipoFutbol("Sevilla", "España"),
        EquipoFutbol("Betis", "España"),
        EquipoFutbol("Equipo aleman 1", "Alemania"),
        EquipoFutbol("Equipo aleman 2", "Alemania"),
        EquipoFutbol("Equipo aleman 3", "Alemania"),
        EquipoFutbol("Equipo aleman 4", "Alemania"),
        EquipoFutbol("Equipo frances 1", "Francia"),
        EquipoFutbol("Equipo frances 2", "Francia"),
        EquipoFutbol("Equipo frances 3", "Francia"),
        EquipoFutbol("Equipo frances 4", "Francia"),
        EquipoFutbol("Equipo noruego 1", "Noruega"),
        EquipoFutbol("Equipo noruego 2", "Noruega"),
        EquipoFutbol("Equipo noruego 3", "Noruega"),
        EquipoFutbol("Equipo noruego 4", "Noruega"),
    )
    var mensajeOctavos = championsLeague(listaEquiposFutbol)
    println(mensajeOctavos)
}

fun championsLeague(lista: MutableList<EquipoFutbol>): String{
    //Hacemos el sorteo
    lista.shuffle()
    //Hacemos el mensaje
    var mensaje = ""
    for (i in 0 until lista.size){
        if(i%2 == 0){
            mensaje += "${lista[i].nombre} juega contra "
        }else{
            mensaje += "${lista[i].nombre}\n"
        }
    }
    return mensaje
}