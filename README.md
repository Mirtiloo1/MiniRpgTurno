Documentação do Projeto: Mini RPG de Turno (Java)

1. Visão Geral

Este projeto é um jogo de RPG (Role-Playing Game) de turno simples, baseado em texto, implementado em Java. O jogo permite que um jogador crie um personagem escolhendo uma classe, e então enfrente um oponente controlado pelo computador em uma batalha por turnos dentro de uma arena. O combate continua até que um dos personagens fique sem pontos de vida.

2. Estrutura do Projeto

O projeto está organizado nos seguintes pacotes e classes principais:

    Pacote Raiz (src/):

        Arena.java: Classe principal que contém o método main. É responsável por iniciar o jogo, criar o jogador e o oponente, e gerenciar o loop de batalha por turnos.

    Pacote model (src/model/):

        Personagem.java: Classe abstrata base para todos os personagens do jogo. Define atributos comuns (nome, vida, magia, força, mana) e métodos essenciais como receberDano, isVivo e o método abstrato atacar.

        Jogador.java: Representa o jogador humano. Contém métodos para coletar o nome do jogador e a escolha da classe via terminal (criarJogador) e para instanciar o personagem correspondente (criarPersonagem).

        Classes.java: Enumeração que define as classes de personagens disponíveis (MAGO, GUERREIRO, PALADINO, ARQUEIRO), seus atributos base (vida, força, magia, mana) e um método abstrato criarPersonagem para instanciar a classe específica.

    Pacote model.classes (src/model/classes/):

        Guerreiro.java: Classe concreta que herda de Personagem. Implementa o método atacar (dano baseado na força) e usarHabilidade (ataque furioso que consome vida).

        Mago.java: Classe concreta que herda de Personagem. Implementa atacar (bola de fogo baseada em magia, consome mana) e usarHabilidade (cura que consome mana).

        Paladino.java: Classe concreta que herda de Personagem. Os métodos atacar e usarHabilidade ainda não foram implementados.

        Arqueiro.java: Classe concreta que herda de Personagem. Os métodos atacar e usarHabilidade ainda não foram implementados.

    Pacote game.habilidades (src/game/habilidades/):

        HabilidadeEspecial.java: Interface que define o contrato para classes que possuem uma habilidade especial, com o método usarHabilidade.

3. Fluxo do Jogo (Arena.java)

    Criação do Jogador: O jogo começa chamando Jogador.criarJogador(). Este método pede ao usuário para inserir seu nome e escolher uma classe dentre as listadas.

    Criação do Personagem do Jogador: Com as informações do jogador, Jogador.criarPersonagem() é chamado, utilizando o método criarPersonagem da classe enum Classes escolhida para instanciar o objeto Personagem correto (Guerreiro, Mago, etc.).

    Criação do Oponente: Um oponente é criado automaticamente. Se o jogador escolheu Guerreiro, o oponente será Mago, e vice-versa. (Nota: O código atual só lida com essas duas classes para o oponente).

    Loop de Batalha:

        O jogo entra em um loop while que continua enquanto ambos os personagens (personagemDoJogador e oponente) estiverem vivos (isVivo() retorna true).

        A cada iteração do loop, o número do turno é incrementado e exibido.

        A lógica determina quem ataca com base no número do turno (ímpar para o jogador, par para o oponente).

        O personagem atacante chama seu método atacar() passando o personagem alvo como argumento.

        O método atacar da classe específica (Guerreiro ou Mago) calcula o dano e chama o método receberDano() do alvo.

        Após o ataque, o status (HP atual) de ambos os personagens é exibido.

    Fim da Batalha: O loop termina quando um dos personagens não está mais vivo. Uma mensagem indicando o vencedor é exibida.

4. Classes de Personagem

    Personagem: Classe base abstrata.

    Guerreiro: Focado em dano físico (forca). Ataque padrão causa forca * 2 de dano. Habilidade especial causa forca * 4 de dano, mas custa 25 de vida.

    Mago: Focado em dano mágico (magia) e utiliza mana. Ataque padrão (bola de fogo) causa magia * 2 de dano e custa 2 mana. Habilidade especial (cura) recupera 20 de vida e custa 8 mana.

    Paladino: Classe definida com atributos base, mas sem implementação de ataque ou habilidade especial.

    Arqueiro: Classe definida com atributos base, mas sem implementação de ataque ou habilidade especial.

5. Pontos de Melhoria / Próximos Passos

    Implementar a lógica de atacar e usarHabilidade para as classes Paladino e Arqueiro.

    Adicionar mais interatividade: permitir que o jogador escolha entre atacar ou usar habilidade especial em seu turno.

    Implementar a lógica de custo de mana/recursos para habilidades especiais (já iniciado no Mago e Guerreiro).

    Criar oponentes para as classes Paladino e Arqueiro na Arena.

    Adicionar mais atributos (ex: defesa, agilidade) e refinar as fórmulas de dano.

    Implementar um sistema de inventário ou itens.

    Melhorar a interface do usuário no terminal.

    Adicionar mais classes e habilidades.

    Implementar testes unitários.
