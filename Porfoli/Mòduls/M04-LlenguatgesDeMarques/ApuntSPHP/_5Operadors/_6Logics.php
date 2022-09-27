<?php
//Compararem els valors assignats a les variables
$a = true;
$b = false;

/* Conjunció: and o && . Retorna verdader si els dos operands són verdaders,
  si no sempre retorna fals. */
echo "\$a and \$b retorna " . ( $a and $b ) . "<br/>"; //Retorna fals (el navegador no imprimeix res)
echo "\$a && \$b retorna " . ( $a && $b ) . "<br/>"; //Retorna fals (el navegador no imprimeix res)

/* Disjunció: or o || . Retorna fals si els dos operands són falsos,
  si no sempre retorna verdader. */
echo "\$a or \$b retorna " . ( $a or $b ) . "<br/>"; //Retorna verdader (el navegador imprimeix 1)
echo "\$a || \$b retorna " . ( $a || $b ) . "<br/>"; //Retorna verdader (el navegador imprimeix 1)

/* Disjunció exclusiva: xor. Retorna verdader quan un operand és fals
  i l'altre verdader, sinó sempre retorna fals. */
echo "\$a xor \$b retorna " . ($a xor $b) . "<br/>"; //Retorna verdader (el navegador imprimeix 1)

/* Negació: !. Retorna verdader quan l'operand és fals i fals quan
  l'operand és verdader. */
echo "!\$a retorna " . (!$a) . "<br/>"; //Retorna fals (el navegador no imprimeix res)
echo "!\$b retorna " . (!$b) . "<br/>"; //Retorna verdader (el navegador imprimeix 1)

//Exemple d'expressió amb operadors de comparació i lògics
$x = 1; //Nova variable a la qual assignem un valor enter
echo "(\$x>2)&&(\$x<15) retorna " . ( ( $x > 2 ) && ( $x < 15 ) ); //Retorna fals (el navegador no imprimeix res)