Sobre o Projeto

Neste repositório, você encontrará o código-fonte de uma REST API e seu respectivo Frontend (pasta /docs). Este projeto é construído com Java 21 e Spring Boot 3.

Objetivo: "Permitir que os usuários conversem com os campeões do League of Legends (LOL)".

Para isso, utilizei algumas das mais recentes Inteligências Artificiais (IAs) Generativas, possibilitando que a API "entenda" a personalidade única de cada campeão para criar interações que capturam sua essência, tornando cada conversa uma experiência única.
Pré-Requisitos

    Instalação da JDK 21 (versão LTS do Java na data das lives);
    Instalação do IntelliJ IDEA Community Edition ou a IDE de sua preferência (Eclipse, VSCode etc);
    [Opcional] Conta na AWS (caso queira publicar a sua API REST na Nuvem usando o AWS Elastic Beanstalk;
    [Opcional] Conta na OpenAI e/ou Google para integração com os modelos GPT e/ou Gemini respectivamente.

🏛️ Arquitetura do Projeto
Diagrama Arquitetural

O diagrama arquitetural do projeto (escrito com Mermaid), destacando a separação das responsabilidades entre as camadas. Desde a interface de usuário até os mecanismos de interação com sistemas externos, passando por adaptadores, casos de uso e as entidades centrais do domínio, cada elemento é estrategicamente posicionado para reforçar a modularidade, a escalabilidade e a manutenibilidade do sistema. Esta estrutura facilita a compreensão de como os componentes colaboram para a realização dos objetivos do software, alinhando-se aos princípios da Clean Architecture (inclusive nas cores dos elementos).
Estrutura de Diretórios

Refletindo a organização apresentada no diagrama arquitetural, a estrutura de diretórios do projeto sugere uma Clean Architecture simplificada, visando a uma clara separação das responsabilidades e promovendo a autonomia das camadas em um projeto Spring Boot. Esta abordagem estrutural não só facilita a manutenção e a evolução do código, mas também sustenta a integração e a colaboração eficaz entre as diferentes partes da aplicação.

    adapters/: Inclui os adaptadores que facilitam a comunicação entre a aplicação e o mundo externo (único diretório que "conhece" o Spring).
        in/: Abriga os adaptadores de entrada, tais como controladores REST, que lidam com as requisições dos usuários.
        out/: Contém os adaptadores de saída, responsáveis da interação com bancos de dados e APIs externas, por exemplo.
    application/: Hospeda os casos de uso da aplicação, encapsulando a lógica de negócios essencial.
    domain/: Representa o coração da aplicação, englobando entidades, exceções e interfaces (portas) que articulam as regras de negócio fundamentais.
        exception/: Define as exceções personalizadas pertinentes ao domínio.
        model/: Modela as entidades do domínio, refletindo os conceitos centrais da aplicação.
        ports/: Estabelece as interfaces que delineiam os contratos para os adaptadores e serviços externos.
    Application.java: A classe principal que orquestra a configuração e o execução da aplicação.

Banco de Dados SQL

🌐 Custos na AWS

Os custos relacionadas a implantação da API no AWS Elastic Beanstalk. Para isso, fiz a implantação simultaneamente em 2 regiões ("São Paulo" e "N. Virginia"). Com isso, consegui comparar os custos e identificar que em "N. Virginia", considerando 142h de execução, os custos foram consideravelmente mais baixos:

    💸 $3.39 → São Paulo (SA East): configuração que fizemos nas lives:
        DNS: http://sdw24.sa-east-1.elasticbeanstalk.com/swagger-ui.html
    💸 $2.34 → N. Virginia (US East): adicionamos a configuração server.servlet.context-path=/lol-api/ no application.yml:
        DNS: http://sdw24.us-east-1.elasticbeanstalk.com/lol-api/swagger-ui.html


Contribuições são sempre bem-vindas! Veja como você pode contribuir:

    Faça um fork do projeto.
    Crie uma nova branch com suas modificações: git checkout -b minha-nova-feature.
    Faça commit das suas alterações: git commit -am 'Adicionando uma nova feature'.
    Push para a branch: git push origin minha-nova-feature.
    Envie um pull request.
