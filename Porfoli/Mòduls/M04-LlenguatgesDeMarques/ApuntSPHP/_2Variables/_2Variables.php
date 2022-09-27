<?php
    /* Les variables han de començar amb el símbol $ seguit d'una lletra o el símbol _ 
     * després poden contenir lletres, números i el símbol _ .
     * Són case sensitive.*
     * Quan es declaren, no s'ha d'indicar el tipus de valor que li assignarem a 
     * la variable i tampoc cal inicialitzar-les, encara que és una bona pràctica 
     * fer-ho. */

    /* Hem d'utilitzar l'escapament per mostrar el símbol $ sinó s'interpreta com 
     * inici d'una variable.*/

     $inicial = "Això és el contingut de la variable \$inicial en l'script extern a HTML";
    
     $_unaAltraVariable = 2; //Un altre possible format de nom per una variable a la qual assignem un enter
    
     $_1234_abc = true; //Un altre possible format de nom per una variable a la qual assignem un enter
    
     //Imprimim el valor de les variables amb un salt de línia al final.
     echo "$inicial<br/>";
     echo "$_unaAltraVariable<br/>";
     echo "$_1234_abc<br/>";
?>

<html>
    <head>
        <title>Variables en PHP</title>
        <meta charset="UTF-8"/>
    </head>

    <body>
        <?php
            /* Imprimim la variable $inicial de l'script extern al document HTML */
        
            echo "$inicial <br/>"; //S'imprimeix el seu valor original
            
            include "_2Inicial.php"; 
        ?>
    </body>

</html>
