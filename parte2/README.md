2 Polimorfismo

2.1 Introducción
Como parte de un proyecto de investigación, en la UNGS se está diseñando una
nueva red social y nos han pedido un diseño de clases para representar las relaciones
entre distintas personas.
En esta primera versión solo guardaremos el nombre de las personas de la red y sus
relaciones, aunque quizá en el futuro se haga necesario almacenar más información.
Lo que sí quedó establecido es que se debe poder representar dos tipos distintos de
red social:
• en una red simétrica se considera que las relaciones son recíprocas, esto es: si A
aparece en la lista de relaciones de B, B también debe aparecer en la lista de A.
• en una red asimétrica no se exige que las relaciones sean recíprocas: A puede
tener a B en su lista de relaciones sin que B necesariamente tenga a A en la
suya.
2.2 Objetivos
Las siguientes objetivos deben primar en la versión inicialmente entregada a los
investigadores:
• Minimizar la cantidad repetida de código.
• Diseñar de manera que los futuros algoritmos puedan funcionar sobre
cualquiera de los dos tipos de red.
• Usar las estructuras de datos adecuadas para una implementación eficiente
tanto en espacio como en tiempo.
2.3 Operaciones sobre una red social
Las operaciones más importantes sobre la clase-TAD RedSocial son dos:
1. agregar una relación entre dos personas, A y B.4
2. obtener el conjunto de relaciones de una persona A.5
Como primitivas de consulta auxiliares se debe poder obtener:
3. el número personas en la red.
4. el número total de relaciones en la red.
5. el número de relaciones de una persona en concreto.

# TAD-Redsocial
