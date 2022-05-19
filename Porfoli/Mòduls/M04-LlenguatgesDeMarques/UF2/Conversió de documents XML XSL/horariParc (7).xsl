<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">


        <html>
            <head>                
                <title>
                    <xsl:value-of select="parc/@nom"/>
                </title>
                <link rel="stylesheet" type="text/css" href="horariParc.css" />
            </head>



            <body>     

                <!-- Apartat de la capcalera, on afegim la img del logo i on li donerm el tamany del logo-->
                <header class="capcalera">
                    <span>
                        <img alt="logoParc" width="50" heigth="50">
                            <xsl:attribute name="src">
                                <xsl:value-of select="parc/@logo"/>
                            </xsl:attribute>

                        </img>
                    </span>


                    <span class="nom">
                        <xsl:value-of select="parc/@nom"/>
                    </span>
                </header>

                <!-- Apartat de les dades on diem on comença i acaba les dades de obertura i tancament-->
                <header class="dades">
                    Obrim del
                     <xsl:value-of select="parc/dates/dataObertura"/> 
                    al
                     <xsl:value-of select="parc/dates/dataTancament"/>
                </header>

                <!-- Apartat dels mes on diem on afegim el nom del mes-->
                <header class="mes">
                    <xsl:value-of select="parc/horaris/mes[last()-2]/@nom"/>
                </header>   
                
                
                <section>
                    <table>
                        <tr>
                            <!-- Apartat on agafem el mes de Juliol com a referencia per tenir el periode dels dias de la setmana -->
                            <xsl:for-each select="parc/horaris/mes[@nom='Juliol']/periode/diaSetmana"/>
                        </tr>
                        

                        <xsl:for-each select="parc/horaris/mes[@nom='Novembre']/periode">
                            <tr>
                                <!-- Apartat dels dias de la Setmana -->
                                <xsl:for-each select="diaSetmana">       
                                    
                                

                                    <td>
                                        <xsl:choose>
                                            <!--Condicio dels dias del més, que si "El diaMes no esta buit " Afegeix el dia-->                            
                                            <xsl:when test="@diaMes!=''"> 
                                                <div class="dia">
                                                    <xsl:value-of select="@diaMes"/>
                                                </div>


                                                <xsl:choose>    
                                                  <!--Condicio dels dias del més, que si "El dia no esta buit " Afegeix horaObertura i horaTancament-->
                                                    <xsl:when test="@horaObertura!=''"> 
                                                        <xsl:value-of select="@horaObertura"/> 
                                                        - 
                                                        <xsl:value-of select="@horaTancament"/>
                                                    </xsl:when>  
                                                    
                                                    <!--Si En alguns dels casos és buit Afegim a la casella "TANCAT" -->
                                                    <xsl:otherwise> 
                                                        TANCAT
                                                    </xsl:otherwise>                                
                                                </xsl:choose>
                                                
                                            </xsl:when>
                                        </xsl:choose>
                                    </td>
                                </xsl:for-each>
                            </tr>
                        </xsl:for-each>
                    </table>
                </section>
                <!--Apartat de les dades del footer -->
                <footer class="dades">
                    <div>
                         <!--Apartat de la Adreca-->
                        <xsl:value-of select="parc/adreca"/>
                    </div>
                    <div>
                         <!--Apartat de la ciutat i el pais-->
                        <xsl:value-of select="parc/ciutat"/> -  <xsl:value-of select="parc/pais"/>
                    </div>



                    <div>
                        WEB:
                        <a>
                            <!--Apartat de la  URL y la pagina web-->
                            <xsl:attribute name="href">
                                <xsl:value-of select="parc/paginaWeb"/>
                            </xsl:attribute>
                            <xsl:value-of select="parc/paginaWeb"/>
                        </a>
                    </div>



                </footer>
            </body>           
        </html>        
    </xsl:template>
</xsl:stylesheet>
