<?php

//Les operacions d'increment i decrement, permeten augmentar o disminuir en una unitat un valor determinat
//Definim les variables amb les quals treballarem
$valor1 = 1.2;
$valor2 = 2.3;
$caracter = "B";

//Post-increment: primer retorna el valor de la variable a incrementar i després fa l'augment modificant el valor original de la variable
echo "Primer el retorn: " . $valor1++ . "<br/>"; //s'imprimeix el valor original de $valor1
echo "Després l'augment: " . $valor1 . "<br/>"; //s'imprimeix el valor original augmentat en una unitat

//Pre-increment: primer fa l'augment modificant el valor original de la variable i després retornem el valor augmentat
echo "Primer l'augment: " . ++$valor1 . "<br/>"; //s'imprimeix el valor original de $valor1 augmentat en un unitat
echo "Després el retorn: " . $valor1 . "<br/>"; //s'imprimeix el valor original de $valor1 augmentat en un unitat

//Post-decrement: primer retorna el valor de la variable a disminuir i després fa la disminució modificant el valor original de la variable
echo "Primer el retorn: " . $valor1-- . "<br/>"; //s'imprimeix el valor original de $valor1
echo "Després la disminució: " . $valor1 . "<br/>"; //s'imprimeix el valor original disminuït en una unitat

//Pre-decrement: primer fa la disminució modificant el valor original de la variable i després retornem el valor disminuït
echo "Primer la disminució: " . --$valor1 . "<br/>"; //s'imprimeix el valor original de $valor1 disminuït en un unitat
echo "Després el retorn: " . $valor1 . "<br/>"; //s'imprimeix el valor original de $valor1 disminuït en un unitat

/* Increment de caràcters transforma el caràcter original assignat a una variable en el seu succesor 
 * i li assigna el nou valor. No es poden decrementar */
$valor = $caracter;
echo "++\$caracter val " . (++$caracter) . " i \$valor val $valor<br/>"; //Mostra C i $valor conté B