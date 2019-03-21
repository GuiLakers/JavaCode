# managingRestaurant

Crie um programa para gerenciar um restaurante.
O programa deve permitir cadastrar as mesas que estão ocupadas por clientes.

Cada mesa deve ter as seguintes informações: numero, nome do cliente, e uma lista dos itens pedidos.
============
Mesa
============
- numero : int
- cliente : String
- pedido : ArrayList<Pedido>
============
//métodos
============
O pedido deve ter o nome do produto e o valor.
============
Pedido
============
- nome: String
- valor: double
============
//métodos
============
Crie uma interface gráfica para controlar o funcionamento do programa. Armazene as mesas ocupadas em uma lista.
Cada cliente que chega, adicione uma nova mesa na lista. Cada cliente que sai, remova a mesa da lista. O valor da conta da mesa removida deve ser acumulada numa variável "faturamento", para saber quando foi apurado no dia.
==============
Restaurante         (JFrame/Interface gráfica)
==============
- mesas : ArrayList<Mesa>
- faturamento : double
==============
//métodos
==============
Crie os métodos e construtores necessários para o funcionamento do programa.