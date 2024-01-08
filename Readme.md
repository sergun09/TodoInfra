Projet Infra
Notre projet est une todo list déployée sur le cloud Azure.
Structure du projet :

Frontend : React
Backend : Java Spring Boot
Base de données : Base de données SQL externe gratuite https://www.freesqldatabase.com/

Lien GitHub : https://github.com/sergun09/TodoInfra
Lien Docker Hub : https://hub.docker.com/

Déploiement en local :
Il faut déployer le frontend et le backend séparément. Ils se trouvent respectivement dans les dossier frontend et backend dans lesquels on va y exécuter la commande :
docker compose up -d
Déploiement en ligne :
Lien frontend : https://todolistcloud.azurewebsites.net/
Lien backend : https://backendtodosite.azurewebsites.net/
/!\ La BDD étant hébergée sur un autre site, il faut souvent réactualiser le site.

Membres :
AMAREH Ali Houssein : 2194734
ERGUN Sinan: 22106110
LEGRAND Kévin: 2181156
MALON Loïc : 2198645

Version :
Nous avons utilisé Semver pour le versioning. La version déployée est la 1.0.0. De plus, nous avons utilisé deux pratiques supplémentaires :
URI : versioning via l’uri en précisant un “v1” dans cette dernière.
Custom Header : Ajouter d’un custom header “X-API-Version” dans les requêtes envoyées au serveur pour préciser la version des différentes méthodes que l’on souhaite appelée. 

Tâches accomplies :

Conception
Complétude du diagramme par rapport à ce que vous avez développé et déployé. V
Développement
Utilisation de Docker.  V
Implémentation du versioning (https://semver.org/lang/fr/).  V
Gestion de la configuration en dehors du code.  X 
Gestion des code erreur HTTP. V
Vérification des paramètres en entrée des endpoints (exemple : erreur 400 si paramètre KO...)  V
Déploiement
Utilisation d'un service SaaS / PaaS dans Azure.  V
Minimiser les coûts d'exploitation (exemple : utiliser des services à la bonne taille / gratuits, implémenter une politique de mise à l'échelle permettant d'arrêter les services la nuit...).  V
Monitoring
Implémenter Application Insights front-to-back (https://learn.microsoft.com/fr-fr/azure/azure-monitor/app/app-insights-overview).  V
Sécurité
Utilisation d'au moins 1 outil de sécurité dans la CI (exemple : semgrep => https://owasp.org/www-community/Source_Code_Analysis_Tools, SonarQube). X ( On as rajouté un containeur Sonarqube à notre groupe de ressource mais nous n’avons pas pu le lier au code github )
Si github, activer Dependabot et merge les PRs.  V
Livrables
Documentation (README, Swagger/OpenAPI...).  V
Diagramme architectural détaillé de l'application (draw.io par exemple).  V
Code source hosté sur github (ou gitlab...).  V
Application déployée en Dev (URL). X ( Nous n’avons pas pu déployer séparément nos environnement de prod et dev même avec la création d’une branche dev car nous n’avons pas réussi à gérer les variables de configuration en dehors du code. )
Application déployée en Prod (URL).  V

