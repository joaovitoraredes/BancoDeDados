package listas

data class Node<T>(
    var value: T,
    var nextValue: Node<T>?
){}

data class LinkedList2<T> (
    var head: Node<T>? = null,
    var last: Node<T>? = null

){

//    fun add(value: T){
//        val newNode = Node(value = value, null)

//        if (head == null){
//            head = newNode
//            return
//        } else {
//            var current = head
//            while (current?.nextValue != null){
//                current = current.nextValue
//            }
//            current?.nextValue = newNode /
//        }
//    }

/*  Otimização do método de busca */
    fun addOtimizado(value: T){
        val newNode = Node(value = value, null)

        if(head == null){
            head = newNode
            last = newNode
        } else {
            last?.nextValue = newNode
            last = newNode
        }
    }

    fun remove(value: T){
        if (head == null){
            return
        } else {
            var current = head?.nextValue
            var previous = head
            while (current != null && current.value != value){
                previous = current
                current = current.nextValue
            }
            if (current != null){
                previous?.nextValue = current.nextValue
            }
        }
    }

    fun show(){
        var current = head
        if (current == null){
            println("A lista está vazia!!")
            return
        }

        while(current != null){
            println(current.value)
            current = current.nextValue
        }
    }

    fun isEmpty(){
        println(head)
        if (head == null){
            println("A lista está vazia!!")
        }
    }

/*  Criação do método de busca por um valor específico */
    fun search(value: T){
        if (head == null){
            println("A lista não possui elementos")
            return
        }
            var current = head
            while (current?.value != value){
            current = current?.nextValue
            }
            println("Valor localizado!! -> ${current?.value}")
    }
}

fun main() {

    val listaLigada = LinkedList2<String>()

/*  Adicionando otimizado */
   listaLigada.addOtimizado("Felipe")
   listaLigada.addOtimizado("Bruno")

/*  Buscando resultados */
    listaLigada.search("Felipe")
    listaLigada.search("Bruno")

}