import java.io.File

fun main() {
    val  papka = File("Papka")
    papka.mkdirs()
    for (i in 1..2) {
        val papkalar = File("Papka/papka$i")
        papka.mkdirs()
        for (j in 1..2) {
            val papka3 = File("Papka/papka$i/papka$j")
            papka3.mkdirs()
        }
    }

}