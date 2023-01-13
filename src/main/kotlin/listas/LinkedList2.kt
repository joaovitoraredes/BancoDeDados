package listas

data class Node<T>(
    var value: T,
    var nextValue: Node<T>?
){}

data class LinkedList2<T> (
    var head: Node<T>? = null,
    var last: Node<T>? = null

){

//    fun add(valorParaAdicionar: T){
//        val newNode = Node(value = valorParaAdicionar, null)

//        if (head == null){
//            head = newNode // ou seja, se o head(cabeça/início) for nulo, então quer dizer que não tem nenhum ítem ainda, e assim o head será onde ficara guardado o item
//            return
//        } else {
//            var current = head // current significa atual, por isso começamos declarando ele como o head, para começar do início
//            while (current?.nextValue != null){ //Neste caso temos que, ele deve ir a pegar o próximo, e próximo, até que o seguinte seja um nulo, ou seja, até que tenha espaço para alocar um newNode
//                current = current.nextValue
//            }
//            current?.nextValue = newNode // Aqui fora do while, é porque o próximo ítem está vazio, assim dizemos que o proximo value(ou seja o espaco vazio) será onde sera alocado o valor novo
//        }
//    }

    fun addOtimizado(valorParaAdicionar: T){
        val newNode = Node(value = valorParaAdicionar, null)

        if(head == null){
            head = newNode
            last = newNode
        } else {
            last?.nextValue = newNode
            last = newNode
        }
    }

    fun remove(valorParaRemover: T){
        if (head == null){
            return // porque está vazia, não tem oque remover, pode até por um println dizendo que nao tem como remover, porque ta vazio
        } else {
            var current = head?.nextValue
            var previous = head
            while (current != null && current.value != valorParaRemover){
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
            return // Porque se ta vazia, não precisa ir para o while abaixo
        }

        while(current != null){
            println(current.value)
            current = current.nextValue // pra continuar andando, tipo o i = i + 1
        }
    }

    fun isEmpty(){
        println(head)
        if (head == null){
            println("A lista está vazia!!")
        }
    }

/*  Função para buscar */
    fun search(itemProcurado: T){
        if (head == null){
            println("A lista não possui elementos")
            return
        }
            var current = head
            while (current?.value != itemProcurado){
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