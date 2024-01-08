
# Projet Infra - TodoApp

Notre projet est une todo list déployée sur le cloud Azure.

## Structure du projet :

**Frontend :** React

**Backend :** Java Spring Boot

**Base de données :** Base de données SQL externe gratuite https://www.freesqldatabase.com/

**Lien github :** https://github.com/sergun09/TodoInfra

**Lien de l'image frontend :** https://hub.docker.com/repository/docker/ali4445/todosite/general

**Lien de l'image backend :** https://hub.docker.com/repository/docker/ali4445/backendtodo/general

## Déploiement en local :

Il faut déployer le frontend et le backend séparément. Ils se trouvent respectivement dans les dossier frontend et backend dans lesquels on va y exécuter la commande :

```

docker compose up -d

```

## Déploiement en ligne :

**Lien frontend :** https://todolistcloud.azurewebsites.net/

**Lien backend :** https://backendtodosite.azurewebsites.net/

/!\ La BDD étant hébergée sur un autre site, il faut souvent réactualiser le site.

## Membres :

**AMAREH Ali Houssein :** 2194734

**ERGUN Sinan :** 22106110

**LEGRAND Kevin :** 2181156

**MALON Loïc :** 2198645

## Version :

Nous avons utilisé Semver pour le versioning. La version déployée est la 1.0.0. De plus, nous avons utilisé deux pratiques supplémentaires :

URI : versioning via l’uri en précisant un “v1” dans cette dernière.

Custom Header : Ajouter d’un custom header “X-API-Version” dans les requêtes envoyées au serveur pour préciser la version des différentes méthodes que l’on souhaite appelée.

## Tâches accomplies 

#### Conception

<lu>
<li>Complétude du diagramme par rapport à ce que vous avez développé et déployé. ✅</li>
</lu>

#### Développement

<lu>
<li>Utilisation de Docker. ✅</li>

<li>Implémentation du versioning (https://semver.org/lang/fr/). ✅</li>

<li>Gestion de la configuration en dehors du code. ❌</li>

<li>Gestion des code erreur HTTP. ✅</li>

<li>Vérification des paramètres en entrée des endpoints (exemple : erreur 400 si paramètre KO...) ✅</li>

<li>Déploiement/Utilisation d'un service SaaS / PaaS dans Azure. ✅</li>

<li>Minimiser les coûts d'exploitation (exemple : utiliser des services à la bonne taille / gratuits, implémenter une politique de mise à l'échelle permettant d'arrêter les services la nuit...). ✅</li>
</lu>

#### Monitoring

<lu>
<li>Implémenter Application Insights front-to-back (https://learn.microsoft.com/fr-fr/azure/azure-monitor/app/app-insights-overview). ✅</li>
</lu>

#### Sécurité

<lu>
<li>Utilisation d'au moins 1 outil de sécurité dans la CI (exemple : semgrep => https://owasp.org/www-community/Source_Code_Analysis_Tools, SonarQube). X ( On as rajouté un containeur Sonarqube à notre groupe de ressource mais nous n’avons pas pu le lier au code github ) ❌</li>

<li>Si github, activer Dependabot et merge les PRs. ✅</li>
</lu>

#### Livrables

<lu>
<li>Documentation (README, Swagger/OpenAPI...). ✅</li>

<li>Diagramme architectural détaillé de l'application (draw.io par exemple). ✅</li>

<li>Code source hosté sur github (ou gitlab...). ✅</li>

<li>Application déployée en Dev (URL).  ( Nous n’avons pas réussi à déployer séparément nos environnement de prod et dev même avec la création d’une branche dev car nous n’avons pas réussi à gérer les variables de configuration en dehors du code. ) ❌</li>

<li>Application déployée en Prod (URL). ✅</li>
</lu>
