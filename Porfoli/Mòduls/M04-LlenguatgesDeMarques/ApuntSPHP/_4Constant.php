<?php
	/* Les constants es defineixen mitjançant la funció define o la paraula reservada const.
	 * Una vegada que la constant està definida, no podem modificar el seu valor.
	 * Solament es pot definir com a constants valors escalars (boolean, integer, float i string) i arrays
	 * Per convenció el nom de les constants sempre ha d'anar amb majúscula.
	 */

                const SALUTACIO="Bon dia!";
                
                echo SALUTACIO;
                
                echo "<br/>";
                
                define("PI", 3.141592); //Passem com a paràmetre nom de la constant i valor.
                
		echo "El valor de la constant PI és ".PI;
                
        /*Constants "màgiques". Predefinides pel llenguatge el seu valor s'assigna quan es
          compila el fitxer. Els valors són predefinits pel llenguatge*/
                
                echo "<br/>";
                
                echo __FILE__; //Mostrem l'adreça i nom del fitxer.
                
                echo "<br/>";
                
                echo __LINE__; //Mostrem el número de línia on es troba aquesta constant.
?>
