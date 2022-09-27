<?php

/* Tots coneixem l'operador d'assignació per assignar un valor a una variable, 
 * és a dir, $variable = valor.*/
$valor1 = 1.2;
$valor2 = 2.3;
$cadena1 = "Cadena";
$cadena2 = " és una cadena";

/*L'operador d'assignació es pot convinar amb certes operacions per simplificar
 *les expressions. En tots els casos les operacions es realitzen entre els valors
 *de les dues expressions i el resultat s'assigna a l'expressió (variable) de 
 *l'esquerra.*/

//Assignació + suma
$valor1 += $valor2; //Mateix que $valor1=$valor1+$valor2
echo "Si \$valor1+=\$valor2, \$valor1 val $valor1 <br/>"; //Mostra 3.5

//Assignació + resta
$valor1 -= $valor2; //Mateix que $valor1=$valor1-$valor2
echo "Si \$valor1-=\$valor2, \$valor1 val $valor1 <br/>"; //Mostra 1.2

//Assignació + producte
$valor1 *= $valor2; //Mateix que $valor1=$valor1*valor2
echo "Si \$valor1*=\$valor2, \$valor1 val $valor1 <br/>"; //Mostra 2.76

//Assignació + divisió
$valor1 /= $valor2; //Mateix que $valor1=$valor1/$valor2
echo "Si \$valor1/=\$valor2, \$valor1 val $valor1 <br/>"; //Mostra 1.2

//Inicialitzem variables
$valor1 = 1;
$valor2 = 2;

//Assignació + mòdul
$valor2 %= $valor1; //Mateix que $valor1=$valor2%$valor1
echo "Si \$valor2%=\$valor1, \$valor2 val $valor2 <br/>"; //Mostra 1.2