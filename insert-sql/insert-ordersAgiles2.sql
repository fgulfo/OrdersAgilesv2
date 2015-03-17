select * from ordprf
select * from ordgpf
select * from ordmnu
select * from ordmxg
select * from ordusr
select * from ordter
delete from ordmnu where id=5
ALTER SEQUENCE ordmnu_id_seq restart 2;

update ordmnu set tipo='ADPDP' where id =2
update ordgpf set ideprf=2 where tipo = 'UCL'

insert into ordusr()

insert into ordmnu values(ordsequencia('ordmnu'),'PRMSS','Permisos',1)

insert into ordmxg values(ordsequencia('ordmxg'),'ADM','ORD',1,1)
insert into ordmxg values(ordsequencia('ordmxg'),'ADM','ORD',1,2)
insert into ordmxg values(ordsequencia('ordmxg'),'ADM','ORD',1,3)
insert into ordmxg values(ordsequencia('ordmxg'),'ADM','ORD',1,4);
insert into ordmxg values(ordsequencia('ordmxg'),'ADM','ORD',1,5);
insert into ordmxg values(ordsequencia('ordmxg'),'ADM','ORD',1,6);
insert into ordmxg values(ordsequencia('ordmxg'),'UOP','ORD',3,1);
insert into ordmxg values(ordsequencia('ordmxg'),'UOP','ORD',3,3);
