### Stack
- Java
- Design Pattern


### O que é ?
Implementação do Design Patter Strategy.
O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. A estratégia deixa o algoritmo variar independentemente dos clientes que o utilizam.

<hr>

### Problema
Fazendo uma analogia no mundo dos games, provavelmente você já tenha jogado Mario Kart em algum momento de sua vida. 
Se sim, você deve lembrar-se de alguns bônus que podemos capturar durante a corrida, geralmente basta se jogar em cima de um cubo com uma interrogação.\
Após o personagem ganhar um bônus desse, o mesmo poderia utilizá-lo para atacar seus adversários durante a corrida.\
Mario atacando c\ cascos vermelhos:

![](https://github.com/lucianoortizsilva/design-patterns-strategy/blob/master/static/github/mariokart.jpg)

Para esse cenário vamos imaginar que temos a seguinte estrutura de classes:
![](https://github.com/lucianoortizsilva/design-patterns-strategy/blob/master/static/github/uml1.jpg)\
Porém o tempo passa, e chega o dia em que o jogo sofrerá algumas alterações.\
Imagine agora, você deverá desenvolver uma nova versão, onde será inclusa a funcionalidade de poder se defender de alguns ataques,\
porém nesse primeiro momento somente alguns personagens terão esse privilégio, além disso, você fica sabendo que daqui umas 3,\
ou 4 versões,alguns personagens também poderão receber o poder de voar durante a partida.

<hr>

### Solução
É aí que entra o Strategy, com esse padrão outros tipos de objetos poderão reutilizar nossos comportamentos de atacar, defender,\
e no futuro o de voar, pois a partir de agora eles não ficarão mais escondidos na nossa Classe Personagem,\
possibilitando adicionar novos comportamentos sem modificar nenhuma de nossas classes de comportamento existente.\
![](https://github.com/lucianoortizsilva/design-patterns-strategy/blob/master/static/github/uml2.png)

<hr>

### Como rodar ?
- Execute o **main** da classe 'com.lucianoortizsilva.designpatterns.Main'
