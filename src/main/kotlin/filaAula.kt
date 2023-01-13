//import java.util.*
//import kotlin.collections.ArrayList
//
//class QueueManager<T>{
//    private val queue: ArrayList<T> = ArrayList<T>()
//
//    fun pop(): T? {
//        if (queue.isEmpty())
//            return null
//
//        return queue.removeAt(0)
//    }
//
//    fun peak(): T? {
//        if(queue.isEmpty())
//            return null
//
//        return queue[0]
//    }
//
//    fun push(value: T){
//        queue.add(value)
//        println(queue)
//    }
//
//}
//
//fun main() {
//    val fila: Queue<String> = LinkedList()
//
//    fila.poll()
//    fila.offer("Pessoa 1")
//    fila.offer("Pessoa 2")
//    fila.offer("Pessoa 3")
//    fila.offer("Pessoa 4")
//
//    val person = fila.pop()
//
//    println(person)
//    println(person)
//}