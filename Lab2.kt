/**
 * Autor: Angela Garcia
 * Laboratorio 2
 * fecha de entrega: 27/07/2023
 */


fun main(){  
    print("--- Ejercicio 1: calcular promedio: ---\n")
    calcularPromedio()
    print("--- Ejercicio 2: numeros impares: ---\n")
    funcionFilter()
    print("--- Ejercicio 3: palindromo: ---\n")
    val palabra="rallar" //xd
    print("la palabra: ${palabra} es un palindromo: ${isPalindrome(palabra)}\n")
    print("--- Ejercicio 4: saludos con map: ---\n")
    funcionMap()
    print("--- Ejercicio 5: enteros y lambda: ---\n")
    val resultado= performOperation(1,3)
    print("la suma: ${resultado} \n")
    print("--- Ejercicio 6: clases: ---\n")
    funcionClases()
    
}


fun calcularPromedio(){
    /* tomar una lista de numeros y devolver su promedio
     * usando la funcion reduccion
     * */
    val listaNumeros = listOf(78,40,55,60,90,85)
    val tamanioLista= listaNumeros.size
    val suma = listaNumeros.reduce{acc, numero -> acc+numero}
   	val promedio = (suma/tamanioLista)
    print("promedio: ${promedio}\n")
}

fun funcionFilter(){
    /* crear una lista de enteros
     * usar filter para extraer numeros impares y
     * ponerlos en una nueva lista
     * */
    val listaNumeros = listOf(78,40,55,60,90,85,63)
    val oddNumeros = listaNumeros.filter{it %2==1}
    print("lista de impares: ${oddNumeros}\n")
}

fun isPalindrome(palabra: String): Boolean{
    //verificar si es palindromo
    val PalabraFiltro= palabra.filter{it.isLetterOrDigit()}.lowercase()
    return PalabraFiltro==PalabraFiltro.reversed() //verificar si es lo mismo al reves
}

fun funcionMap(){
    /*hacer una lista de cadenas que tenga nombres
     * con map agregar un saludo antes de los nombres
     * */
    val nombres= listOf("Francis","Fernando","Gerardo", "Diego","Cesar")
    val saluditos=nombres.map{"Hola $it ! "}
    print("${saluditos}\n")
    
}

fun performOperation(numero1: Int, numero2: Int): Int {
    val suma = { a: Int, b: Int -> a + b }
    return suma(numero1, numero2)
}

//clases
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

/* funcion de mapeo que tome el objeto person y devuelva
 * un objeto student correspondiente, estando la info en una lista
 * el el texto tiene que tener: "El estudinte nombre tiene edad"
 * 
 * */
 
 fun funcionClases(){

     val personas= listOf(
     	Person("Francis",19,"mujer"),
     	Person("Fernando",19,"hombre")
     )
     
 
     val estudiantes = personas.mapIndexed { index, persona ->
        Student(persona.name, persona.age, persona.gender, "${index + 1}")
        print("El estudiante ${persona.name} tiene edad: ${persona.age}\n")
    }
    
}

     
     
