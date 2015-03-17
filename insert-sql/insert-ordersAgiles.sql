--//Insert OrdersAgiles
--insert de perfiles
insert into ordprf values(ordsequencia('ordusr'),'Perfil de administracion de la app OrdersAGILES',1,'Administrador')

--insert de bodegas
insert into ordbdg values(ordsequencia('ordbdg'),'Bodega Principal de prueba',1,'Bodega Principal','Local')

--
insert into ordkja values(ordsequencia('ordkja'),'Caja #1','Caja #1 de prueba',1)
ALTER SEQUENCE ordprm_id_seq restart 1;

-- permisos
insert into ordprm values(1,'permiso administrador',1,'Nivel Alto')
select * from ordprm_id_seq