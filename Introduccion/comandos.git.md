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


Mostrar las versiones modificadas
git log --all


volver a la version anterior

git checkout y el id de la version 
git checkout 2d2532c


cambiar de rama
git chekout <nombre de la rama o del identificador de la version>


volver a la version anterior sin saber el id
git checkout --.

