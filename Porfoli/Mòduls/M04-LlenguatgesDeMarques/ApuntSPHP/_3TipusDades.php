<?php
/*Els tipus de dades més significatius en PHP són: enter, float,
*booleà, string, array, objecte, recurs i null*/

/*La funció is_tipusDada( dada ) comprova si la dada és del tipusDada
*indicat en la funció is. Si ho és retorna 1, sinò 0.*/

//número enter
$resultat = is_integer( 5 ); //És 1
echo "3 és un enter? $resultat";

//número float o double. La separació de la part decimal és mitjançant un punt
$resultat = is_float( 1.13 ); //És 1
echo "<br>1.13 és un float? $resultat";

//valor boleà. Pot ser false ( fals ) o true ( verdader )
$resultat = is_bool( false ); //És 1
echo "<br>false és un booleà? $resultat";

//Cadena de caràcters.
$resultat = is_string( "cadena de caràcters" ); //És 1
echo "<br>\"cadena de caràcters\" és una cadena de caràcters? $resultat";

$resultat = is_string( 'cadena de caràcters' ); //És 1
echo "<br>'cadena de caràcters' és una cadena de caràcters? $resultat";

//Null. Valor null
$resultat = is_null( null ); //És 1
echo "<br>null és null? $resultat";

/*La funció gettype( valor ) ens retorna de quin tipus és el
*valor passat com a paràmetre*/

//número enter
$resultat = gettype( 5 ); //Ens retornarà integer
echo "<br>3 és un $resultat";

//número float o double
$resultat = gettype( 1.13 ); //Ens retornarà double
echo "<br>1.13 és un $resultat";

//valor boleà. Pot ser false ( fals ) o true ( verdader )
$resultat = gettype( false ); //Ens retornarà bolean
echo "<br>false és un $resultat"; 

//Cadena de caràcters.
$resultat = gettype( 'cadena de caràcters' ); //Ens retornarà string
echo "<br>'cadena de caràcters' és un $resultat";

//Null. Valor null
$resultat = gettype( null ); //Ens retornarà null
echo "<br>null és un $resultat";


