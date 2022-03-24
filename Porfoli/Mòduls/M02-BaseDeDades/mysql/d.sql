use hospital;

/*Mostra per a cada àrea el número total d'infermes i el total de metges que té.*/
select a.nomArea,count(i.nom), count(m.nom)
from area a,metge m, infermer i
where (i.numArea=a.numArea) and (m.numArea=a.numArea)
group by a.numArea;

/*Mostra quin ha sigut el diagnòstic més freqüent durant el mes de març*/

select diagnostic
from visita
where diagnostic in (select diagnostic from visita where month(data)=3)
group by diagnostic
having count(diagnostic)
order by count(diagnostic) desc limit 1;

/*Mostra el pacient i el número de proves que s'ha fet,
 el pacient que més visities ha tingut.*/
select dniPac,count(dniPac)
 from realitzacio
 where dniPac=(select dniPac from visita group by dniPac order by count(diagnostic) desc limit 1);
 
 /*Mostra el nom de les àrees on hi ha algun metge
 que cobra un sou per baix de la mitjana de tots els metges.*/
 select distinct a.nomArea
 from metge m,area a 
 where m.sou>(select avg(sou) from metge);
 
 /*Digues la diferència de llits que hi ha entre la planta
 que més llits té i la planta que menys llits té.*/
 select distinct ( select count(numLlit)
 from llit
 group by numPl
 order by count(numLlit) desc limit 1)
 -
 ( select count(numLlit)
 from llit
 group by numPl
 order by count(numLlit)  limit 1)
 from llit;
 
 /*Mostra quants llits no han estat assignats.*/
 
 select ( select count(numLlit)
 from llit)-( select count(nom)
 from pacient);

/*Mostra el nom i els cognoms dels pacients que se'ls ha fet més d'una prova i també més d'una visita.*/
select
from where
