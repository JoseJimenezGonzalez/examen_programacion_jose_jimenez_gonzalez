package ejercicio_1_2_3_4

data class Videojuego(val nombre: String, val plataforma: String, val anioSalida: Int)

fun filtraJuegos(listaJuegos: List<Videojuego>, anio: Int):List<Videojuego>{
    return listaJuegos.filter {videojuego -> videojuego.anioSalida == anio }
}
fun plataformas(listaJuegos: List<Videojuego>): MutableList<String>{
    val listaMutable = mutableListOf<String>()
    listaJuegos.forEach { videojuego ->
        if(videojuego.plataforma !in listaMutable){
            listaMutable.add(videojuego.plataforma)
        }
    }
    return listaMutable
}
fun mapaJuegos(listaJuegos: List<Videojuego>, anioSalida: Int): Map<String, List<Videojuego>>{
    var listaPorAnio = filtraJuegos(listaJuegos, anioSalida)
    var mutableListPLataformas = plataformas(listaPorAnio)
    var mutableMap= mutableMapOf<String, List<Videojuego>>()
    mutableListPLataformas.forEach { plataforma ->
        //Recorro las plataformas disponibles de ese año
        //Mutable list vacio
        var listMut = mutableListOf<Videojuego>()
        listaPorAnio.forEach{ videojuego ->
            if(plataforma == videojuego.plataforma){
                listMut.add(videojuego)
            }
        }
        mutableMap.put(plataforma, listMut)
    }
    return mutableMap
}

fun main(){
    val listaJuegos = listOf(
        Videojuego("Silent Hill 2", "PS2", 2006),
        Videojuego("Pokemon Rubi", "Game Boy", 2006),
        Videojuego("Project Zero", "PS2", 2003),
        Videojuego("Rule of Rose", "PS2", 2010),
        Videojuego("Pokemon Zafiro", "Game Boy", 2006)
    )
    println("Filtrado por año")
    val listaFiltradaPorAnio = filtraJuegos(listaJuegos, 2006)
    println(listaFiltradaPorAnio)
    println("Lista de plataformas")
    val listaPlataforma = plataformas(listaJuegos)
    println(listaPlataforma)
    println("Mapa de juegos")
    val mapaJuego = mapaJuegos(listaJuegos, 2006)
    println(mapaJuego)
}