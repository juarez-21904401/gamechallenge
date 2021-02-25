import java.util.*

class Pessoa (var nome:String, var veiculos :ArrayList<Veiculo>, var carta :Carta, var posicao:Posicao,  var dataDeNascimento :Date){

    fun toString(nome :String , dataDeNascimento: Date) {
        print("Pessoa | $nome | $dataDeNascimento | $posicao | ${posicao.x} | ${posicao.y}")
    }

    fun comprarVeiculo(veiculo: Veiculo){

        for( veiculo1 in veiculos ){
            if(veiculo.equals(veiculos)){
                print(" Este veiculo foi comprado com sucesso")
            }
        }
    }

    fun pesquisarVeiculo(identificador :String):Veiculo {

        for( veiculos1 in veiculos){
            if(identificador==veiculos.get().identificador){
             //   return veiculos

            }
        }


    }

    fun venderVeiculo(identificador :String, comprador :Pessoa) {


    }

    fun moverVeiculoPara(identificador :String, x:Int , y :Int) {


    }

    fun temCarta():Boolean{

    }

    fun tirarCarta(){

    }

}