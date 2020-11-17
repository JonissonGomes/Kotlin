package activites

import org.junit.Assert
import org.junit.Test

class VogalConsontalTest {

    // Este teste tem como principal objetivo testar quantas vogais existem na palavra passada na função contVogal()

    @Test fun contVogal(){
        Assert.assertEquals(3, contVogal("Jonisson"))
    }

    // Neste teste, iremos testar se foi encontrada o numero exato de consoantes na frase passada como parâmetro na função contConsoantes()
    @Test fun contConsoantes(){
        Assert.assertEquals(21, contConsoantes("Geralmente uma frase possui mais consoantes"))
    }

    // Este é o teste geral, onde teremos a certeza que as funções estão funcionando de maneira correta, testando assim as duas funções juntas.

    @Test fun countAll(){
        var frase = "Estou gostando muito de aprender kotlin!"
        Assert.assertEquals(15, contVogal(frase))
        Assert.assertEquals(19, contConsoantes(frase))

    }
}