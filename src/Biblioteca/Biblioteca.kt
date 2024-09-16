package biblioteca

data class Autor(val nombre: String, val nacionalidad: String)

data class Editorial(val nombre: String, val pais: String)

open class Libro(var titulo: String, var autor: Autor, var editorial: Editorial, var anioPublicacion: Int) {
    init {
        println("Libro creado: $titulo por ${autor.nombre}, Editorial: ${editorial.nombre}, Año: $anioPublicacion")
    }

    fun imprimirDetalles() {
        println("Título: $titulo")
        println("Autor: ${autor.nombre}, Nacionalidad: ${autor.nacionalidad}")
        println("Editorial: ${editorial.nombre}, País: ${editorial.pais}")
        println("Año de publicación: $anioPublicacion")
    }
}

class LibroDigital(titulo: String, autor: Autor, editorial: Editorial, anioPublicacion: Int, val formato: String) : Libro(titulo, autor, editorial, anioPublicacion) {
    init {
        println("Formato digital: $formato")
    }

    fun descargar() {
        println("Descargando $titulo en formato $formato...")
    }
}
