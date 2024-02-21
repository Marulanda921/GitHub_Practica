#configuracion

version git 
git -v



comandos para configurar git por primera vez

git config --global user.name "your name"
git config --global user.email "alejandromarulanda702@gmail.com"


comando para ver que usuario esta configurado o con que correo electronico
git config --global user.name



saber toda la configuracion de git
git --list


Comando para inicializar git en un directorio 
git init


Pasos para crear una version de mi codigo
Agregar cambios: 

git add . todos los archivos
git add \*.js todos los javascript
git add \*.html todos los html
git add "Nombre archivo"



Ver archivos no agregados a la version actual o para ver el estado de los archivos
git status


Comprometer los archivos 
git commit -m "Descripcion del commit"


Mostrar todo en una linea los commits
git log --oneline

#Comando para eliminar rama

git branch -D + nombre rama

#Cambiar de rama 

git switch + mas nombre rama
git checkout + nombreRama


#Desvincular Un archivo de git que se le estaba dando seguimiento

git rm --cached + Nombre Archivo

#Crear nueva version con archivos que se le estaban dando seguimiento

git commit -am + "Nombre commit"

#Comando para Unir ramas

git merge + Nombre de la rama