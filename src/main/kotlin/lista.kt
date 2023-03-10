//data class Listas.Listas.Node<T>(
//    var value: T,
//    var next: Listas.Listas.Node<T>?
//)
//
//data class Listas.Listas.LinkedList2<T>(
//    var head: Listas.Listas.Node<T>? = null
//) {
//    fun add(value: T) {
//        val newNode = Listas.Listas.Node(value = value, null)
//
//        if (head == null) {
//            head = newNode
//            return
//        } else {
//            var current = head
//            while (current?.next != null) {
//                current = current.next
//            }
//            current?.next = newNode
//        }
//    }
//
//    fun remove(value: T): Boolean {
//        if (head?.value == value) {
//            head = head?.next
//            return true
//        }
//        var current = head?.next
//        var previous = head
//
//        while(current != null && current.value != value) {
//            previous = current
//            current = current.next
//        }
//
//        if (current != null) {
//            previous?.next = current.next
//            return true
//        }
//
//        return false
//    }
//
//    fun show() {
//        var current = head
//        if (current == null) {
//            println("Lista vazia")
//            return
//        }
//
//        while(current != null) {
//            println(current.value)
//            current = current.next
//        }
//    }
//
//    fun isEmpty(): Boolean {
//        return head == null
//    }
//}
//
//fun Listas.Listas.main() {
//    val lista = Listas.Listas.LinkedList2<String>
//}