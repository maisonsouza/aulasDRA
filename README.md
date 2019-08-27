# Desenvolvimento Rápido de Aplicações
## Professora: Joyce Miranda

### Padrões de Arquitetura de Software.
```
Desenvolver rápido não está relacionado a desenvolver um software no menor espaço de tempo, mas em desenvolver um software de qualidade em um tempo factível.
```
Definição formal
```
Organização fundamental de um sistema, expressa nos seus componentes, nos relacioanmentos entre eles e com o ambiente, e nos príncipios que governam seu projeto e sua evoluçao.
```
Padrão arquitetural.
```
Solução estruturada de design, pronta para ser reutilizadas para solucionar problemas recorrentes de arquitetura.
Layers, Server&Cliente, Pipes&Filters, Repository, BlackBoard, Broker/SOA, MVC, MicroKernel.
```

Os padrões não são mutuamente exclusivos.

* Pipes& Filters
```
A saída de um programa pode ser linkada com a entrada de outro programa.
```

* MVC - Model View Controller
```
Separação entre a lógica de negócio e lógica de apresentação.
```
Características:
Camadas -> Model, View, Controller

Model -> Regras de negócio
```
Composta por classes que representam o domínio da aplicação.
```
```
View -> Interface com o usuário.
Representa a camada de interface com o usuário.
```
```
Controller -> Intermedia a comunicação entre Model e View.
```

Processa ações do usuário.
Padrão MVC - Padrão Arquitetural de Software.

Vantagens
```
Legibilidade, Facilidade de manutenção, Independência maior entre as camadas.
```
Regras do MVC:
```
A comunicação entre as camadas deve ser sempre intermediada pela camada Controller.
Controladores não devem se comunicar entre si.
```







