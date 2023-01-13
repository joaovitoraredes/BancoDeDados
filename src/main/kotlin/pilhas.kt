import java.util.Stack

class ExpressionValidator() {

    // apenas validar parentese
    // utilizando pilha
    fun isValid(expression: String): Boolean {
        return false
    }

    fun isValidString(s: String): Boolean{
        val stack = Stack<Char>()

        s.forEach { char ->
            if (char == '(')
                stack.push('(')
            else if (char == ')'){
                stack.removeFirstOrNull() ?: return false
            }
        }

        return stack.size == 0
    }
}

fun main() {
    val expressionValidator = ExpressionValidator()
    val expression2 = ExpressionValidator()


    println(expressionValidator.isValidString("((1 + 2))"))
    println(expression2.isValidString("(()"))
}