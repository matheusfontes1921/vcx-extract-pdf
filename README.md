# Extração de dados de PDF utilizando Java
Criação de código de extração de dados de um PDF utilizando a linguagem Java para processo seletivo na empresa VC-X Solutions.

## Descrição
Foi fornecido um teste para que os interessados tivessem a oportunidade de desenvolver um sistema simples que fosse capaz de extrair dados específicos de certo documento em 
formato PDF. Utilizando o Maven para configuração do sistema, o protótipo apresentado fornece as opções que um determinado usuário pode escolher, sempre permitindo que o mesmo
consiga eleger qual dado deseja ver no exato momento. Ademais, para manipulação e abertura de arquivos PDF, a biblioteca Apache PDFBox foi consumida durante todo o projeto.

## Pré-requisitos
-> O teste deve ser desenvolvido na linguagem Java 
-> É permitido o uso de bibliotecas adicionais

## Instalação
Primeiramente, é necessário ter um compilador que suporte a linguagem Java em sua máquina (IntelliJ, NetBeans, Eclipse, etc.).

É necessário fazer o download do arquivo PDF que está sendo utilizado para teste (pode ser baixado através deste link: https://drive.google.com/drive/folders/17cA3drL14Q0N-qlG6VhssBIi5UyLeNYE?usp=sharing)

## Uso
Para utlizar o sistema, é preciso seguir um roteiro bem específico. Deste modo, segue o detalhamento: 
1. Importe este projeto e abra-o em sua IDE de preferência.

1.1. Crie uma pasta vazia em sua máquina.

1.2. Copie o código desse repositório no GitHub.

1.3 Na pasta vazia criada, abra o Git Bash.

1.4 No Git Bash, execute o comando _git clone linkdoreposiório_.

1.5 Abra a pasta criada em sua IDE.
2. Salve o PDF modelo em algum lugar da máquina e copiar o seu caminho.
3. Inicie o programa.
4. Insira o caminho copiado assim que o programa solicitar.
5. Escolha uma das opções disponibilizadas pelo programa.
6. Quando quiser parar a aplicação, selecione a opção 6.

## Justificativas
Durante a execução do projeto, foi-se utilizado o Maven para que houvesse uma importação mais simples da biblioteca Apache PDFBox, visando uma facilitação do código tanto para o desenvolvedor quanto
para quem fosse fazer a manutenção do sistema. Ademais, o Maven também tem fácil integração com diferentes tipos de IDE, além de automatizar o build do projeto, permitindo que ocorram testes
de forma simples e padronizada.
Outrossim, a escolha pela biblioteca Apache PDFBox se deve ao fato da mesma possuir uma documentação extensa e detalhada, facilitando o trabalho de desenvolvedores. Nesse sentido, a facilidade e os
recursos disponibilizados também contribuem para essa escolha, uma vez que é possível ler, escrever e manipular dados de um PDF utilizando essa biblioteca.
  
## Futuras melhorias
É evidente que o projeto apresentado é apenas um protótipo de algo que pode ser grandioso. Nesse sentido, seguem algumas ideias que podem ser colocadas em prática caso o projeto seja colocado como prioridade:
1. Automatizar o sistema para que o mesmo código seja capaz de extrair dados de diferentes modelos de PDF.
2. Permitir que o código também extraia dados de outros tipos de documento.
  
## Autor
Matheus Fontes Almeida Moreira Silva

## Agradecimentos
Por fim, gostaria de agradecer imensamente a toda equipe da VC-X Solutions, empresa na qual já me sinto bastante identificado. Gostaria de salientar que, sem dúvidas, o teste proposto foi um desafio que 
me motivou bastante e pôde me fazer conhecer tecnologias que, outrora, eu não possuía conhecimento absoluto. Deste modo, espero que o sistema tenha atendido todas as requisições solicitadas e espero poder 
continuar contribuindo para com uma empresa tão bem conceituada como a VC-X.
