import java.util.Stack

fun isValidString(s: String): Boolean {
    val stack = Stack<Char>()

    s.forEach { char ->
        if (char == '(')
            stack.push('(')
        else if (char == ')') {
            stack.removeFirstOrNull() ?: return false
        }
    }

    return stack.isEmpty()
}

fun main() {
    var resultado = isValidString("(()")
    println("Esperado: false | Resultado: $resultado")
    resultado = isValidString("())")
    println("Esperado: false | Resultado: $resultado")
    resultado = isValidString("()")
    println("Esperado: true | Resultado: $resultado")
    resultado = isValidString("(1 + 2) * 10")
    println("Esperado: true | Resultado: $resultado")
    resultado = isValidString("(1 + 2)) * 10")
    println("Esperado: false | Resultado: $resultado")
    resultado = isValidString("((1 + 2) * 10")
    println("Esperado: false | Resultado: $resultado")
    resultado = isValidString("(1( + 2) * 10")
    println("Esperado: false | Resultado: $resultado")
}
