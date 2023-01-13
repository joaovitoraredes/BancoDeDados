data class Sticker(
    val number: Int,
    val name: String,
    val team: String
){
    override fun toString(): String {
        return """
            $number - $name | $team
        """.trimIndent()
    }
}

data class WorldCupStickerDeck(
    private val stickers: MutableList<Sticker>
) {

    fun addSticker(sticker: Sticker){
        stickers.add(sticker)
    }

    fun removeSticker(sticker: Sticker){
//      stickers.remove(sticker)
        for(index in stickers.indices){
            if (stickers[index] == sticker){
                stickers.removeAt(index)
                break
            }
        }
    }

    fun searchStickerDeck(name: String): Sticker? { //Pode ser nulo, porque pode ser que nao tenhamos a figurinha
//      return stickers.find {
//          it.name == name
//      }
        for (sticker in stickers){
            if (sticker.name == name){
                println("Figurinha encontrada")
                return sticker
            }
        }
        println("Figurinha não encontrada!!")
        return null
    }

    fun showAllStickers(){
        println("Album completo:")
        for(sticker in stickers){
            println(sticker)
        }
    }

    fun sortStickers(){
        stickers.sortBy { it.number }
    }

}

fun main() {

//  Criando o nosso deck que irá guardar as nossas figurinhas
    val deck = WorldCupStickerDeck(mutableListOf())

//  Criando cinco figurinhas
    val stickerMessi = Sticker(
        number = 52,
        name = "Messi",
        team = "Argentina" )

    val stickerCR7 = Sticker(
        number = 37,
        name = "Cristiano Ronaldo",
        team = "Portugal" )

    val stickerNeymar = Sticker(
        number = 13,
        name = "Neymar Junior",
        team = "Brasil" )

    val stickerNeuer = Sticker(
        number = 1,
        name = "Manuel Neuer",
        team = "Brasil" )

    val stickerSergioRamos = Sticker(
        number = 94,
        name = "Sergio Ramos",
        team = "Espanha" )

//  Adicionando figurinhas
    deck.addSticker(stickerMessi)
    deck.addSticker(stickerCR7)
    deck.addSticker(stickerNeymar)
    deck.addSticker(stickerNeuer)
    deck.addSticker(stickerSergioRamos)

//  Removenndo figurinhas
    deck.removeSticker(stickerCR7)

//  Procurando figurinhas, e printando se achar elas!!
    println(deck.searchStickerDeck(name = "Neymar Junior"))
    println(deck.searchStickerDeck(name = "Pelé")) // Pelé retorna nulo porque não adicionamos uma figurinha com esse nome
    println(deck.searchStickerDeck(name = "Cristiano Ronaldo")) // Cristiano Ronaldo retorna nulo porque removemos a figurinha com esse nome

//  Printando album completo:
    deck.showAllStickers()

//  Ordenando as figurinhas em ordem crescente pelo número
    deck.sortStickers()

//  Printando album completo (Após ordenação):
    deck.showAllStickers()
}