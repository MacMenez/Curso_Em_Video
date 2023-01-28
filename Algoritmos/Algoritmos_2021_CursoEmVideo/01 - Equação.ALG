Algoritmo "Equação"
   // Disciplina  :  [Linguagem e Lógica de Programação]
   // Professor   : Gustavo Guanabara
   // Descrição   : 1° Código Feito no Curso
   // Autor(a)    : Davi C. Menez
   // Data atual  : 26/01/2021

Var
   // Seção de Declarações das variáveis
   a, b, c: INTEIRO
   delta: REAL
   x1, x2: REAL

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   ESCREVAL ("Equação do 2° Grau")
   ESCREVAL ("------------------")
   ESCREVA ("Informa o valor de A: ")
   LEIA(a)
   ESCREVA ("Informe o valor de B: ")
   LEIA(b)
   ESCREVA ("Informa o valor de C: ")
   LEIA(c)
   ESCREVAL ("------------------")
   ESCREVAL ("Sua equação é: ", a, "x2 + ", b, "x + ", c, " = 0")

   delta:= (b*b) - 4*a*c
   ESCREVAL ("O valor de Delta: ", delta:4:2)

   ESCREVAL ("------------------")
   SE (delta < 0) ENTAO
      ESCREVAL ("Para Delta negativo, não existe raízes REAIS")
   SENAO
      SE (DELTA = 0) ENTAO
         x1 := (-b + RaizQ(delta))/(2*a)
         ESCREVAL("Para Delta zero, temos duas raízes iguais a ", x1)
      SENAO
         x1 := (-b + RaizQ(delta))/(2*a)
         x2 := (-b - RaizQ(delta))/(2*a)
         ESCREVAL("Para Delta positivo. Raízes diferentes: ")
         ESCREVAL("x' = ", x1:4:2)
         ESCREVAL("x'' = ", x2:4:2)
      FIMSE
   FIMSE
Fimalgoritmo