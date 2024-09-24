package com.flores.yorsh.laboratoriocalificado01

class Ejercicio01Kotlin {

    // Esta es una funcion del algoritmo de verificación de anagramas
    fun esAnagrama(palabra1: String, palabra2: String): Boolean {
        // Verifica si las longitudes de las palabras son iguales, si no lo son, no pueden ser anagramas
        if (palabra1.length != palabra2.length) {
            return false
        }

        // Esto comvierte ambas palabras a listas de caracteresy las ordena alfaveticamente
        val palabra1Ordenada = palabra1.toCharArray().sorted()
        val palabra2Ordenada = palabra2.toCharArray().sorted()

        // Compara las dos listas ordenadas; si son iguales las palabras si son anagramas
        return palabra1Ordenada == palabra2Ordenada
    }
}

// Esta es la funcion que arranca mi programa
fun main() {
    // Crea una instancia de la clase Ejercicio01Kotlin
    val ejercicio = Ejercicio01Kotlin()

    // Aqui hice varias prubas de las letras con el algoritmo
    val resultado1 = ejercicio.esAnagrama("listen", "silent")
    println("¿'listen' y 'silent' son anagramas? $resultado1") // true

    val resultado2 = ejercicio.esAnagrama("hello", "world")
    println("¿'hello' y 'world' son anagramas? $resultado2") // false

    val resultado3 = ejercicio.esAnagrama("anagram", "nagaram")
    println("¿'anagram' y 'nagaram' son anagramas? $resultado3") // true

    val resultado4 = ejercicio.esAnagrama("rat", "car")
    println("¿'rat' y 'car' son anagramas? $resultado4") // false

    val resultado5 = ejercicio.esAnagrama("admirer", "married")
    println("¿'admirer' y 'married' son anagramas? $resultado5") // true

    val resultado6 = ejercicio.esAnagrama("binary", "brainy")
    println("¿'binary' y 'brainy' son anagramas? $resultado6") // true

    val resultado7 = ejercicio.esAnagrama("school", "schoo")
    println("¿'school' y 'schoo' son anagramas? $resultado7") // false (diferentes longitudes)
}
