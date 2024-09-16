package biblioteca

fun gestionarBiblioteca() {
    val autor1 = Autor("Gabriel García Márquez", "Colombiano")
    val editorial1 = Editorial("Editorial Sudamericana", "Argentina")

    val libro1 = Libro("Cien años de soledad", autor1, editorial1, 1967)
    libro1.imprimirDetalles()

    val libroDigital = LibroDigital("El amor en los tiempos del cólera", autor1, editorial1, 1985, "PDF")
    libroDigital.imprimirDetalles()
    libroDigital.descargar()
}

fun main() {
    gestionarBiblioteca()
}
