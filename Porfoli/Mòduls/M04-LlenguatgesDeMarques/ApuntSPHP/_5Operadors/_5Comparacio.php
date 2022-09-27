<?php
//Compararem els valors assignats a les següents variables
$a = 1;
$b = 2;
$caracterA = "a"; //"a" és equivalent al nombre decimal 97 en el codi ASCII
$caracterB = "b"; //"b" és equivalent al nombre decimal 98 en el codi ASCII

//$a menor que $b
echo "\$a < \$b retorna ".( $a<$b )."<br/>"; //Retorna verdader (el navegador imprimeix 1)

//$caracterA menor que $caracterB. Compara el codi ASCII dels caràcters.
echo "\$caracterA < \$caracterB retorna ".( $caracterA<$caracterB )."<br/>"; //Retorna verdader (el navegador imprimeix 1)

//$a major que $b
echo "\$a > \$b retorna ".( $a>$b )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$caracterA major que $caracterB
echo "\$caracterA > \$caracterB retorna ".( $caracterA>$caracterB )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$a menor o igual que $b
echo "\$a <= \$b retorna ".( $a <= $b )."<br/>"; //Retorna verdader (el navegador imprimeix 1)

//$caracterA menor o igual que $caracterB
echo "\$caracterA <= \$caracterB retorna ".( $caracterA <= $caracterB )."<br/>"; //Retorna verdader (el navegador imprimeix 1)

//$a major o igual que $b
echo "\$a >= \$b retorna ".( $a >= $b )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$caracterA major o igual que $caracterB
echo "\$caracterA >= \$caracterB retorna ".( $caracterA >= $caracterB )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$a igual que $b
echo "\$a == \$b retorna ".( $a == $b )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$caracterA igual que $caracterB
echo "\$caracterA == \$caracterB retorna ".( $caracterA == $caracterB )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$a igual que $a i són del mateix tipus
echo "\$a === \$a retorna ".( $a === $a )."<br/>"; //Retorna verdader (el navegador imprimeix 1)

//$a igual que "1" i no són del mateix tipus
echo "\$a === \"1\" retorna ".( $a === "1" )."<br/>"; //Retorna fals (el navegador no imprimeix res)

//$a diferent que $b
echo "\$a != \$b retorna ".( $a != $b )."<br/>"; //Retorna verdader (el navegador imprimeix 1)

//$caracterA diferent que $caracterB
echo "\$caracterA != \$caracterB retorna ".( $caracterA != $caracterB )."<br/>"; //Retorna verdader (el navegador imprimeix 1)