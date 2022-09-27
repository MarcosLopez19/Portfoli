<?php

/* L'operador concatenació en php és el . */

$cadena = "Cadena";
$aixo_es_una = "Això és una ";

//concatenació dos cadenes
echo "Això és una cadena" . " i això és un altre<br/>";

//concatenació d'una variable i una cadena
echo $cadena . " concatenada<br/>";

//concatenació de cadenes i números de qualsevol tipus
echo "Això és " . (1) . "a cadena<br/>"; //Retorna una cadena

//concatenació de dues variables
echo $aixo_es_una . $cadena;

/*L'assignació sobre concatenació ('.='), concatena l'expressió del costat dret 
 *amb l'expressió assignada a la variable del costat esquerre, assignant l'expressió
 *resultant a la variable de l'esquerra.
 */

$aixo_es_una .= $cadena; //Ara el valor de $aixo_es_una és "Això és una Cadena"
echo $aixo_es_una;