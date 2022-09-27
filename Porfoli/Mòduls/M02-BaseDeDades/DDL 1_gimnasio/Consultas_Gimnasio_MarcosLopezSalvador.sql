use gimnasio;

/*1.Muestra todos los tipos de máquinas del gimnasio menos la 'Bicicleta Vertical' de la zona de cardio*/
select maq.tipo_maquinas,ps.tipo_MaquinasPesas,cd.tipo_maquinas
from zona_pesas ps,zona_cardio cd,zona_maquines maq
where cd.tipo_maquinas not in(select tipo_maquinas from zona_cardio where tipo_maquinas="Bicicleta Vertical")
and (maq.id_maq=cd.id_maq) and (cd.id_card=ps.id_card);

/*2.Muestra el nombre de los clientes que se apellido empieze por 
'S' y muestra los primeros 3 numeros de id de la tarjeta*/
select c.nombre,LEFT(tr.id_trj,3)
from clientes c,tarjeta tr
where  apellido like "S%" and (tr.id_trj=c.id_trj);

/*3.De La zona de pesas muestrame todos los tipos de maquinas que empiezen por la letra 'B'
 y cardio muestrame todos los tipos de maquina que acabaen por la letra 'R' */

select tipo_maquinas
from zona_cardio 
where tipo_maquinas LIKE "%r"
union

select tipo_MaquinasPesas
from zona_pesas
where tipo_MaquinasPesas LIKE "B%";

/*4. Muestra el nombre de tablets y la cantidad de cada una,
ordenadas descendientemente solo se muestra si hay más de 3 unidades*/
select tablets, count(tablets)
from zona_recepcio
group by tablets
having count(tablets)>=3
order by count(tablets) desc ;

/*5. Muestra el nombre de tablets y El Nombre del propietario de ella menos el que tiene de DNI="99999999N",
ordenadas descendientemente */
select distinct zr.tablets,r.nombre
from zona_recepcio zr,recepcion r
where  r.nombre NOT IN(select nombre from recepcion where DNI_rec="99999999N");
