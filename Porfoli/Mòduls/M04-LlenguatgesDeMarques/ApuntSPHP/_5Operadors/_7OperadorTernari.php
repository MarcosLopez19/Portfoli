<?php

/* Operador ternari: si és compleix la condició ( ( $estat == "trist" ) ? )
  l'opció vàlida serà la primera ("Estic $estat."), sinó la segona
  ("Em sento bé!!!.") */

//Declaració variable
$estat = "animat";

//Realitzem l'operació. El resultat s'assigna a la variable $quinDiaTinc.
$quinDiaTinc = ( $estat == "trist" ) ? "Estic $estat." : "Em sento bé!!!.";

//Mostrem resultat
echo $quinDiaTinc; //El resultat és "Em sento bé!!!.", perquè $estat és "animat" i no "trist" com la condició.