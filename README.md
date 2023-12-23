# ProjetInfra

cd front
npm i

bdd :
docker run --name c1 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=todoDB -d mysql:8.1

