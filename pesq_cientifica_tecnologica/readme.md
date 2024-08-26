# Otavio Calderan Bruguel

## Introdução

Meu nome é Otavio Calderan, um desenvolvedor de sistemas, ingressei na Fatec no inicio de 2023, visando começar e
desenvolver minha carreira profissional na área de T.I. Ingressei no meu primeiro estágio em 04/2024 para trabalhar como
Cientista de Dados, lá aprendi muitas tecnologias para uso com IA, desenvolvimento Web/FullStack e manipulação de dados.

## Contatos

- [GIT](https://github.com/Otavio-CB)
- [LinkedIn](https://www.linkedin.com/in/otavio-calderan/)

## Meus Principais Conhecimentos

<!-- Apresente seus principais conhecimentos. Foque nos conhecimentos que possui maior domínio e que deseja desenvolver
durante sua carreira. -->

## Meus Projetos

### Em 2023-2

Mesmo formato

### Em 2023-8

Mesmo formato

### Em 2024-2

<!-- Fale sobre o projeto desenvolvido. Apresente a empresa parceira, o problema e a solução entregue pela equipe (mínimo de
um parágrafo por item). Recomenda-se o uso de figuras (ou até mesmo vídeos) para ilustrar os principais projetos. -->

A Dom Rock possui uma arquitetura de processamento de dados em cadeia chamada pipeline, que inclui vários estágios.
Esses estágios são orquestrados automaticamente com base nas características das fontes de dados e nas soluções de
algoritmos de IA ou modelos matemáticos, conforme as necessidades dos clientes. Durante a implantação da solução, é
necessário configurar as fontes de dados envolvidas para que a plataforma funcione corretamente. Atualmente, essa
configuração é feita manualmente, o que é um passo crítico e demorado para os técnicos. O desafio, portanto, é criar uma
interface amigável para facilitar essa configuração das fontes de dados.

[GIT - Dom Rock](https://github.com/wiz-fatec/dom-rock-pipeline-configurator)

#### Tecnologias Utilizadas

<!-- Apresente brevemente as tecnologias utilizadas. Uma tecnologia por linha. Indique qual a importância de cada tecnologia
para o projeto. -->

![My Skills](https://skillicons.dev/icons?i=java,spring,html,css,vue,mysql,git,github,idea,webstorm,stackoverflow)

<details>
  <summary>Tecnologias Utilizadas e Importância</summary>

1. **Java**  
   Linguagem de programação amplamente usada para desenvolvimento da aplicação, utilizado somente no backend. Foi
   importante para criar uma aplicação robusta e escalável.


2. **Spring**  
   Framework para desenvolvimento de aplicações Java, ofereceu suporte para injeção de dependências, gerenciamento de
   transações e criação de APIs REST. Facilitando a criação de aplicações web e microserviços.


3. **CSS**  
   Linguagem de estilo usada para descrever a apresentação de documentos HTML. Foi importante para estilizar e formatar
   páginas web, melhorando a aparência e a experiência do usuário.


4. **Vue.js**  
   Framework JavaScript para construção de interfaces de usuário interativas. Facilita a criação de aplicações web
   dinâmicas e reativas com uma arquitetura de componentes.


5. **MySQL**  
   Sistema de gerenciamento de banco de dados relacional. Crucial para armazenar e gerenciar dados de forma estruturada
   em aplicações web.


6. **Git**  
   Sistema de controle de versão distribuído. Essencial para rastrear mudanças no código-fonte e colaborar com outros
   desenvolvedores de forma eficiente.


7. **GitHub**  
   Plataforma de hospedagem para projetos que utilizam Git. Importante para o compartilhamento de código, colaboração e
   controle de versão em projetos de software.


8. **IntelliJ IDEA**  
   Ambiente de desenvolvimento integrado (IDE) para programação Java e outros idiomas. Facilita o desenvolvimento com
   suporte avançado para código, debugging e testes.


9. **WebStorm**  
   IDE da JetBrains focada em JavaScript, HTML e CSS. Ideal para o desenvolvimento de aplicações web modernas e
   front-end.


10. **Stack Overflow**  
    Plataforma de perguntas e respostas para desenvolvedores. Importante para obter suporte, resolver problemas e
    aprender com a comunidade de programadores.

</details>
<br>

#### Contribuições Pessoais

<!-- Apresente suas contribuições no projeto. Foque nas funcionalidades em que você mais atuou. Descreva sua atuação em
detalhes, especificando que tecnologias você utilizou. -->

Neste projeto atuei como FullStack, porém com maior participação no Frontend a partir da segunda sprint.


<details>
<summary>Adição da dependência GSON ao projeto</summary>

- Realizada a manipulação do arquivo pom.xml para incluir a dependência GSON.
  A versão 2.10.1 da biblioteca GSON foi adicionada, permitindo a conversão de objetos Java para JSON e vice-versa.
  Esta modificação aprimora o projeto, fornecendo suporte robusto para serialização e deserialização de dados JSON, o
  que é essencial para a manipulação eficiente de dados no Spring Boot.

</details>

<details>
<summary>Adição das versões iniciais para o processamento de CSV e JSON</summary>

- Criados esboços iniciais das classes para processamento de dados CSV e JSON, localizadas no pacote com.domrock.utils.
- **CsvConverter**: Classe inicial para futuras implementações de conversão e processamento de arquivos CSV.
- **JsonConverter**: Classe que utiliza a biblioteca GSON para conversão de dados JSON.
- **JsonDataModel**: Classe dedicada à modelagem dos dados JSON que serão processados.
- **SendJson**: Classe que também utiliza GSON, possivelmente destinada ao envio ou manipulação de dados JSON.
- Essas adições preparam a base para o desenvolvimento das funcionalidades de conversão e processamento de dados,
  alinhadas com a arquitetura do projeto.

</details>

<details>
<summary>Adição do método de atualização de campos na classe LZMetadataConfig</summary>

Implementado o método updateFields na classe LZMetadataConfig, permitindo a atualização dos campos do objeto com base
nos dados fornecidos pelo MetadataConfigDTO.
O método realiza as seguintes atualizações:

- name e fileName são atualizados se os valores correspondentes no MetadataConfigDTO não forem nulos.
- frequency é atualizado com o valor de frequencyNumber ou convertido a partir de frequencyType.
- hasHeader é atualizado para 1 ou 0 dependendo do valor booleano em MetadataConfigDTO.
- Essas alterações aprimoram a classe, oferecendo maior flexibilidade para modificar os dados de configuração em tempo
  de execução.

![img.png](assets/img.png)
</details>

<details>
<summary>Adição do método PUT para atualização de configuração e aprimoramentos na classe MetadataConfigDTO</summary>

1. Implementação do Método PUT no Controlador
   Rota: /list-view
    - Adicionado o método updateConfig com a anotação @PutMapping, permitindo a atualização de configurações.
      O método recebe um objeto MetadataConfigDTO via @RequestBody e tenta localizar a configuração correspondente
      usando o fileId.
      Se a configuração é encontrada, os campos são atualizados usando o método updateFields e a configuração é salva no
      repositório.
      Em caso de sucesso, retorna um ResponseEntity com o objeto atualizado; caso contrário, retorna um
      ResponseEntity.notFound().
      ![img_1.png](assets/img_1.png)

2. Alteração no Método GET
    - Modificado o método details no controlador:
      A lógica de busca foi alterada de getReferenceById para findById, usando Optional para lidar com possíveis valores
      nulos.
      Garante que o retorno seja um ResponseEntity adequado, encapsulando o Optional adequadamente.
      ![img_2.png](assets/img_2.png)
3. Atualização da Classe MetadataConfigDTO
    - Atualizado o construtor do record MetadataConfigDTO para refletir corretamente os campos da entidade
      LZMetadataConfig.
      Agora o construtor recebe um objeto LZMetadataConfig e uma lista de ColumnConfig, preenchendo os respectivos
      campos no DTO.
      ![img_3.png](assets/img_3.png)
4. Aprimoramento do Método updateFields em LZMetadataConfig
    - O método updateFields foi estendido para incluir:
      Atualização da lista columns se a mesma estiver presente no MetadataConfigDTO.
      Limpeza da lista columns existente antes de atualizá-la com os novos valores.
      Isso assegura que as colunas sejam atualizadas corretamente e sem redundâncias.
      ![img_4.png](assets/img_4.png)

</details>

<details>
<summary>Adição das tabelas de empresa, usuário e permissão</summary>

1. Criação das Tabelas de Empresa, Usuário e Permissão

- Tabela permission:

    - Criada a tabela com colunas para id_permission, description, e type.
    - type possui uma restrição CHECK, limitando os valores para 'lz', 'bronze', ou 'silver'.

- Tabela user:

    - Criada a tabela com colunas para name, email, e password.
    - email foi definido como a chave primária da tabela.

- Tabela company:

    - Criada a tabela com colunas para cnpj e fantasy_name.
    - cnpj foi definido como a chave primária da tabela.

2. Modificações na Tabela Existente
    - Alteração em Tabela de Arquivo:
    - Adicionada a coluna file_has_header (do tipo INT), indicando se o arquivo possui cabeçalho.
    - Adicionada a coluna cnpj (do tipo VARCHAR(18)), associando o arquivo à tabela company.
    - Criada a restrição de chave estrangeira fk_cnpj para a coluna cnpj, referenciando a chave primária da tabela
      company.

![img_5.png](assets/img_5.png)
</details>

<details>
<summary>Adição da tela Silver</summary>

1. Criação da Tela Silver

- Estrutura do Componente:

    - Criado um novo componente Vue para a tela "Silver", que utiliza TypeScript para tipagem forte.
    - O componente recebe configList, tagInfo, e bronzeConfig como propriedades, configuradas no defineProps.


- Lógica de Navegação:

    - Implementada a função gotoSilverConfig que navega para a rota /home ao clicar em um dos botões de configuração.


- Validação de Colunas:

    - Desenvolvida a função validOrInvalid para validar colunas dentro do BConfig, embora parte dela esteja comentada
      para futuras implementações.

2. Template e Estilo:

- Template:

    - Estrutura de layout criada usando um div principal com uma classe container que engloba o título "Silver" e uma
      série de botões renderizados dinamicamente a partir de configList.
    - Cada botão exibe o nome da configuração e é interativo, chamando gotoSilverConfig ao ser clicado.


- Estilos:

    - Estilos definidos usando SCSS, com classes como .grid-wrap, .banner, .invalid-tag, e .valid-tag para personalizar
      a aparência dos componentes na tela.
    - A disposição dos elementos segue um grid layout flexível.


3. Integração de Componentes e Modal:

- Componentes Importados:

    - Importados e utilizados os componentes AppHeader, DRModal, e LVSilverContainer para construir a interface da
      tela "Silver".


- Configuração de Estado:

    - Utilizadas referências (ref) para gerenciar a lista de configurações (configList), o estado de exibição do modal (
      showModal), e a configuração selecionada (selectedConfig).


- Chamada de API:

    - Implementada uma função assíncrona getConfig que realiza uma chamada GET
      para http://localhost:8080/lz-config/list-view e atualiza a lista de configurações (configList) ao montar o
      componente.


- Estilo Escopado:

    - Estilo escopado aplicado ao componente principal, garantindo que as regras CSS sejam aplicadas apenas dentro do
      contexto do componente "Silver".

</details>

<details>
<summary>Atualização do Alinhamento do Botão de Cadastro</summary>

1. Ajuste de Estilo para o Botão de Cadastro

- Modificação de Margem:
    - Ajustada a margem da classe .saveButton, que contém o botão de cadastro (DRButton), para -80px, visando alinhar
      melhor o botão no layout.


- Estilização do Grid:
    - Mantida a estrutura de layout grid, com espaçamento definido por column-gap, para distribuir os elementos na tela
      de forma organizada.


- Estilo da Caixa de Seleção (checkBox):
    - A classe .checkBox foi mantida com display: flex e align-items: last baseline para garantir que os itens estejam
      alinhados na base inferior.
    - Direção dos itens dentro da checkBox definida como row e justificada para flex-start.

</details>

<details>
<summary>Adição do Componente DonutChart</summary>

1. Integração do vue-chartjs e Chart.js

- Nova Dependência:
    - Adicionada a dependência vue-chartjs versão 5.3.1 ao projeto, permitindo a criação de gráficos no Vue 3.


2. Criação do Componente DonutChart

- Estrutura do Template:

    - Criado um componente DonutChart que utiliza o gráfico de rosca (Doughnut) do vue-chartjs.
    - O gráfico é renderizado dentro de um contêiner (chart-container), que define a largura máxima e altura do gráfico.


- Lógica do Script:

    - Importados e registrados os elementos do Chart.js necessários para o gráfico de rosca, incluindo Title, Tooltip,
      Legend, ArcElement, e CategoryScale.
    - Definida a interface ChartDataProps para tipagem das propriedades recebidas (labels, values, colors, title).
    - Configurados os dados do gráfico (chartData) utilizando as propriedades recebidas via defineProps.
    - Definidas as opções do gráfico (chartOptions), com foco em responsividade, manutenção da proporção e estilização
      das legendas e título.


3. Estilo do Componente

- CSS Scoped:
    - Estilizado o contêiner do gráfico (chart-container) para centralizar o gráfico na tela, limitando a largura máxima
      a 800px e altura a 400px.


4. Exemplo de Uso

- Importação e Utilização:
    - O componente DonutChart foi importado e utilizado, com dados de exemplo para representar configurações por
      empresa.
    - Exemplo de dados (chartData) inclui etiquetas, valores e cores para as seções do gráfico, com um título
      especificando "Configurações por empresa".

</details>

<details>
<summary>Atualização das Cores no DonutChart</summary>

1. Modificação das Cores do Gráfico de Rosca

- Alteração de Cores:
    - As cores utilizadas no gráfico de rosca (DonutChart) foram atualizadas para uma nova paleta, garantindo maior
      contraste e diferenciação entre as seções do gráfico:
        - #fa2e59 (Vermelho intenso)
        - #ff703f (Laranja)
        - #f7bc05 (Amarelo)
        - #ecf6bb (Verde claro)
        - #76bcad (Verde azulado)

2. Manutenção da Estrutura dos Dados

- Estrutura Inalterada:
    - A estrutura dos dados (chartData) incluindo etiquetas (labels), valores (values), e título (title) permaneceu a
      mesma, mantendo a integridade do gráfico.

</details>

<details>
<summary>Atualização das Cores e Margem Superior do Gráfico; Adição de Rota para Tela de Gráfico</summary>

1. Ajuste de Estilo para o Botão de Cadastro

- Modificação de Margem:
    - Ajustada a margem da classe .saveButton, que contém o botão de cadastro (DRButton), para -80px, visando alinhar
      melhor o botão no layout.


- Estilização do Grid:
    - Mantida a estrutura de layout grid, com espaçamento definido por column-gap, para distribuir os elementos na tela
      de forma organizada.


- Estilo da Caixa de Seleção (checkBox):
    - A classe .checkBox foi mantida com display: flex e align-items: last baseline para garantir que os itens estejam
      alinhados na base inferior.
    - Direção dos itens dentro da checkBox definida como row e justificada para flex-start.

</details>

#### Hard Skills

<!-- Apresente as hard skills que você utilizou/desenvolveu durante o projeto e o nível de proficiência alcançado. Exemplo:
CSS - Sei fazer com autonomia -->

<details>
  <summary>Programação Java - Sei fazer com consulta</summary>

- Desenvolvimento de aplicações backend robustas e escaláveis
- Utilização de recursos da linguagem, como collections, threads, e exceptions
</details>

<details>
  <summary>Desenvolvimento com Spring Framework - Sei fazer com consulta</summary>

- Criação de APIs RESTful
- Injeção de dependências e gerenciamento de beans com Spring IoC Container
- Gerenciamento de transações e configuração de segurança com Spring Security
- Integração com bancos de dados usando Spring Data JPA
</details>

<details>
  <summary>Estilização e Layout com CSS - Sei fazer com certa autonomia mas preciso de consulta</summary>

- Design responsivo usando media queries
- Flexbox e Grid Layout para criação de layouts avançados
- Aplicação de animações e transições CSS
- Customização de temas e estilos para componentes web
</details>

<details>
  <summary>Desenvolvimento Frontend com Vue.js - Sei fazer com consulta</summary>

- Criação de componentes dinâmicos e reutilizáveis
- Gerenciamento de estado com Vuex
- Manipulação de eventos e ciclo de vida dos componentes
- Integração com APIs REST e manipulação de dados assíncronos
</details>

<details>
  <summary>Gerenciamento de Bancos de Dados MySQL - Sei fazer com consulta</summary>

- Criação e manipulação de tabelas, índices e relações
- Escrita e otimização de consultas SQL complexas
- Gerenciamento de transações e controle de concorrência
</details>

<details>
  <summary>Controle de Versão com Git - Sei utilizar com autonomia</summary>

- Gerenciamento de branches e fusão de código
- Resolução de conflitos de código durante o merge
- Uso de rebase para manter um histórico de commits limpo
</details>

<details>
  <summary>Colaboração e Hospedagem de Projetos com GitHub - Sei utilizar com autonomia</summary>

- Criação e gestão de repositórios
- Revisão de código e pull requests
</details>

<details>
  <summary>Desenvolvimento com IntelliJ IDEA - Sei utilizar com autonomia</summary>

- Navegação eficiente no código e refatoração automatizada
- Debugging avançado e uso de breakpoints condicionais
- Testes automatizados e integração com ferramentas de build como Maven ou Gradle
- Configuração de plugins e temas para personalização do ambiente
</details>

<details>
  <summary>Desenvolvimento com WebStorm - Sei utilizar com autonomia</summary>

- Desenvolvimento frontend utilizando JavaScript, HTML e CSS
- Debugging e profilamento de código JavaScript
- Suporte a frameworks modernos como Vue.js e React
- Uso de ferramentas de build e task runners (Webpack, npm scripts)
</details>

<details>
  <summary>Pesquisa e Resolução de Problemas com Stack Overflow - Sei utilizar com autonomia</summary>

- Busca de soluções para problemas específicos de programação
- Participação em discussões e compartilhamento de conhecimento
- Adaptação de soluções existentes para contextos específicos do projeto
</details>


#### Soft Skills

<!-- Apresente as soft skills que você utilizou/desenvolveu durante o projeto e em quais situações elas foram fundamentais.
Exemplo: Comunicação - Precisei exercitar minhas habilidades de comunicação para viabilizar as reuniões semanais levando
em conta as disponibilidades dos membros, que não cursavam as mesmas disciplinas. -->

<details>
<summary>Comunicação</summary>

- Em reuniões diárias e outras cerimônias, aprendi a expor minhas opiniões de forma clara e concisa, além de relatar o
  andamento das minhas tarefas de maneira que todos pudessem acompanhar o progresso. Essa prática me ajudou a construir
  uma comunicação mais assertiva e a colaborar de maneira mais eficaz com a equipe.

</details>

<details>
<summary>Trabalho em equipe</summary>

- Trabalhar em conjunto com colegas de diferentes áreas e perfis me ensinou a valorizar as contribuições de cada membro,
  a dividir responsabilidades e a construir soluções em conjunto, sempre visando o objetivo comum.

</details>

<details>
<summary>Adaptação à mudanças</summary>

- Em um projeto dinâmico, foi essencial adaptar-me rapidamente às mudanças de escopo, novas demandas e prazos apertados.
  Aprendi a ser flexível e a manter a calma mesmo em situações de pressão, o que foi crucial para manter a produtividade
  e a qualidade do trabalho.

</details>

<details>
<summary>Resolução de problemas</summary>

- Fui desafiado a encontrar soluções criativas para obstáculos inesperados, o que me levou a desenvolver uma abordagem
  mais analítica e a pensar fora da caixa para resolver problemas de forma eficaz e eficiente.

</details>

<details>
<summary>Gestão do tempo</summary>

- Com múltiplas tarefas e prazos para gerenciar, aprendi a priorizar atividades, organizar meu tempo de forma
  estratégica e entregar resultados consistentes dentro dos prazos estabelecidos.

</details>

### Em 2024-8

Mesmo formato

### Em 2025-2

Mesmo formato

### Em 2025-8

Mesmo formato
