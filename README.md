# facisa-p3
Este repositorio é utilizado para as aulas de PROGRAMAÇÃO 3

Problema do diamante

No paradigma de Orientação a Objetos, existe uma forma de herança chamada de herança múltipla, esse tipo de herança acontece em algumas linguagens como C++, na qual se é permitido que uma classe possa ser filha de várias classes ao mesmo tempo.
Quando se utiliza herança múltipla é necessário ter muita atenção ao definir quais são os métodos da classe pai e filha, pois se existirem dois métodos com o mesmo nome em classes pai diferentes, e com funcionalidades diferentes, e se este método for utilizado na classe filha e não for explicitamente descrito de qual classe pai ele pertence, existirá um dúvida de qual método será chamado, podendo causar um comportamento completamente inesperado, essa dúvida na execução do código é chamada de problema do diamante.
A linguagem de programação Java não permite que este problema ocorra, para exemplificar tal problema foi criado neste repositório um projeto  chamado “Problema do diamante”, contendo uma classe D e três interfaces (representado classes):  A, B e C, sendo que as interfaces B e C estende de A herdando o método “incrementar”, que são sobrescritos nestas interfaces, a classe implementa as duas interfaces B e C, onde o método “incrementar” deve ser definido de que interface o método será usado, caso esse mecanismo não existisse poderia ocorrer o problema aqui descrito.  

Singleton

    Singleton é um tipo de padrão onde se define uma instância que será que será compartilhada entre os objetos de uma classe para garantir que não acha um uso excessivo ou desnecessário de recursos. Ou seja, uma instância é compartilhada entre todos os objetos de uma classe, para se evitar que se criar um novo objeto com uma nova instância que fará a mesma função, em um caso makro da aplicação a criação de várias instâncias pode causar um consumo de recursos exorbitante e sem necessidade, por isso se utiliza este tipo de padrão.
