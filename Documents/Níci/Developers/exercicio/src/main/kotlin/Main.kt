fun main(){
    var Schmidt = Vendedor()
    Schmidt.nome= "Rafael Schmidt"
    Schmidt.dataNascimento= "05/05/1985"
    Schmidt.cpf="037.294.060-94"
    Schmidt.metas= 10000
    Schmidt.vendasAtuais= 5000


    var Anderson = Cliente()
    Anderson.nome= "Anderson Silva Santos"
    Anderson.email= "anderson.malvadao@bol.com.br"
    Anderson.limiteCompra= 2500
    Anderson.telefone = "51 980374856"

    var Piso= Produto()
    Piso.codigo= 10786
    Piso.tamanho= "20x120"
    Piso.valor= 89
    Piso.embalagemSaida= "caixa"

    var Belgotex= Fornecedor()
    Belgotex.nome= "Belgotex do Brasil Ind de Carpetes LTDA"
    Belgotex.ie= 58224921
    Belgotex.nomeFantasia= "Belgotex"

    var Rodonaves= Transportadora()
    Rodonaves.nome= "Rodonaves Transportes e Encomendas LTDA"
    Rodonaves.cnpj= "44.914.992/0001-38"
    Rodonaves.endereco= "Rua Gal Augusto Soares Santos, 550, Parque Industrial, SP Cep 14095240"

    var Pedido= Venda()
    Pedido.pedido= 2863752
    Pedido.valorPedido= 1500
    Pedido.formaDePagamento= "Cartão Crédito TEF"
    Pedido.margemDeVenda = 11
    Pedido.dataMovimento = "10.09.2021"




}