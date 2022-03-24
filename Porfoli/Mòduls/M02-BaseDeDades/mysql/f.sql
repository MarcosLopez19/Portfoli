use motoGP;

/*Mostra quins pilots no han abandonat mai en cap cursa.*/
select distinct p.nombre 
from resultados r, pilotos p
where r.distanciaganador != "Abandono" 
and p.codigo = r.codpiloto
group by r.nombregp, r.anyo;

/*Mostra quin pilots, i en quina cursa, han quedat en última posició (tenint en compte els abandonaments).*/
select p.nombre, r.nombregp, r.anyo 
from resultados r, pilotos p
where puesto = (select max(puesto) from resultados where nombregp = r.nombregp and anyo = r.anyo) and p.codigo = r.codpiloto
group by r.nombregp, r.anyo;

/*Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb menor longitud.*/
select disenyador from circuitos
where longitud=(select min(longitud) from circuitos );

/*Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop.*/
select p.nombre, p.nombreescuderia 
from resultados r, pilotos p
where p.codigo = r.codpiloto and r.puesto = 1
group by p.nombre
having count(r.puesto) > 1;


/*Mostra el nom dels pilots, menors de 30 anys, que no han guanyat cap cursa (posició 1a) en el 2011.*/
select distinct p.nombre 
from  pilotos p
where p.codigo not in (select p.codigo 
					from pilotos p, resultados r 
                    where r.puesto=1 and r.anyo=2011
                    and (p.codigo = r.codpiloto))
                    and ( year(now()) - year(p.fechanacimiento)) <30;


/*Mostra els circuits en els quals no ha guanyat cap pilot alemany.*/
select  distinct c.nombrecircuito 
from carreras c
where c.nombrecircuito!=(select c.nombrecircuito 
						from pilotos p,resultados r,carreras c 
						where p.nacionalidad="Alemana" 
                        and r.puesto = 1 group by c.nombrecircuito and (c.año = r.anyo) 
                        and (c.nombregp = r.nombregp) and (p.codigo=r.codpiloto));

/*Mostra per a cadascun dels pilots, el seu codi i quants cops ha quedat
 tercers al 2010 (ordenats del nombre de vegades de major a menor).*/
 
 select p.nombre,p.codigo ,count(*)
 from pilotos p,resultados r
 where puesto='3' and anyo='2010' and (p.codigo=r.codpiloto)
group by p.nombre
order by count(r.puesto) desc;
 

/*Digues quines són les instruccions necessàries per afegir als insert de "resultados" a la columna "distanciaganador"
00:00.00 als que han quedat en 1a posició.*/
/*Digues les instruccions necessàries per introduir les tres primeres posicions als resultats del GP Àfrica celebrat al 2012.*/
/*Afegeix la columna puntuació a la taula resultados on es podran emmagatzemar números enters positius.*/
