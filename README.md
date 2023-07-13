# Audio Library
Aplicação para cadastrar músicas e podcasts preferidos, modelando as classes utilizando os conceitos de orientação a objetos: abstração, herança, encapsulamento e polimorfismo.

### Funcionalidades do projeto:
- Criação de uma classe Audio com os atributos (titulo, totalReproducoes, totalCurtidas e classificacao).
- Utilização de encapsulamento, deixando os atributos privados e criando os getters e setters para acessar e modificar os atributos.
- Criação de dois métodos sem retorno: curte() e reproduz(), que irão incrementar as variáveis totalCurtidas e totalReproducoes, respectivamente.
- Organização do código em pacotes.
- Criação de uma classe Musica estendendo de Audio, com os atributos adicionais album, cantor e genero.
- Criação de uma classe Podcast estendendo de Audio, com os atributos adicionais apresentador e descricao.
- Criação de uma classe Principal e instancie um objeto do tipo Musica e outro do tipo Podcast, preenchendo seus atributos;
- Criação de um loop para chamar os métodos curte() e reproduz() a fim de simular um número grande de reproduções e curtidas.
- Sobrescrita do método getClassificacao na classe Musica, definindo que se a mesma tiver mais de 2000 reproduções a classificação será 10 e para valores inferiores a classificação será 8.
- Sobrescrita do método getClassificacao na classe Podcast, definindo que se o mesmo tiver mais de 500 curtidas a classificação será 10 e para valores inferiores, a classificação será 7.
- Criação de uma classe chamada MusicasPreferidas ou apenas Preferencias, com um método sem retorno (void) chamado inclui, que receberá como parâmetro um Audio.
- No método inclui, utilização do polimorfismo, onde foi utilizado o método getClassificacao (de acordo com a subclasse que for passada aqui como parâmetro) para exibir alguma mensagem. Para classificação igual ou superior a 9, imprimir no terminal uma mensagem e se for inferior, imprimir uma outra mensagem.
- Finalizar instanciando um objeto do tipo MusicasPreferidas ou Preferencias e incluir a música e podcast instanciados anteriormente.
