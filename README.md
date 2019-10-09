
<img src="https://res.cloudinary.com/teepublic/image/private/s--3irQSqys--/t_Preview/b_rgb:191919,c_limit,f_jpg,h_630,q_90,w_630/v1511111763/production/designs/2076522_0.jpg" width="100"></img>
<p align="center">

![https://github.com/AliasPedroKarim/KarimAndCo_Composant4/releases](https://img.shields.io/badge/stable-1.1.0-success)  ![https://github.com/AliasPedroKarim/KarimAndCo_Composant4/releases](https://img.shields.io/github/downloads/aliaspedrokarim/KarimAndCo_Composant4/total) ![https://github.com/AliasPedroKarim/KarimAndCo_Composant4/graphs/contributors](https://img.shields.io/github/contributors/aliaspedrokarim/KarimAndCo_Composant4) [![HitCount](http://hits.dwyl.io/AliasPedroKarim/AliasPedroKarim/KarimAndCo_Composant4.svg)](http://hits.dwyl.io/AliasPedroKarim/AliasPedroKarim/KarimAndCo_Composant4)

</p>

### Project Karim and Co - Composant 4
---

#### Introduction
Dans le cadre de création d'un logiciel de gestion de **curriculum vitae**, ce projet où est le composant numéro 4 de ce projet. On pourrait dire que ce composant est l'un des composants principal du projet puisque ce composant a pour but de pouvoir **gérer**, **créer**, **mettre à jour** et surtout **supprimer** le curriculum vitae, avec tous ses contenus, donc ça concerne des formations et les expériences professionnelles.

#### Fonctionnalité
En arrivant sur le composant, comme vous ne possédez pas de CV tous les champs présents actuellement sur le composant seront vides.
Le composant est capable de :

+ Curriculum Vitae
	+ Créer les données
	+ Modifier les données
	+ Supprimer les données
+ Formations et Expériences professionnelles
	+ Créer les données
	+ Modifier les données
	+ Supprimer les données

#### Dépendance
_Pour ce qui concerne les dépendance voir le fichier `pom.xml`_

<p align="center">

[![Generic badge](https://img.shields.io/badge/weblaf-v1.2.9-success)](https://github.com/mgarin/weblaf) [![Generic badge](https://img.shields.io/badge/mysql--connector--j-v5.1.48-success)](https://github.com/mysql/mysql-connector-j)

</p>

#### Documentation
_La JavaDoc est disponible dans le dossier `docs` mais aussi [javadoc](https://aliaspedrokarim.github.io/KarimAndCo_Composant4/)_  
_Une documentation utilisateur est aussi disponible [ici](https://docs.google.com/document/d/1v6MzYAcXDMMQzYLZLa2klrXSc6LA4_zX15RLvXv4bb8/edit)_

#### Comment utiliser ce composant dans votre projet !

+ Le code source est téléchargeable avec ce lien [GitHub](https://github.com/AliasPedroKarim/KarimAndCo_Composant4/archive/master.zip) _(Lien de la branche master)_
+ Comme c'est un fichier zip, veuillez le dé-compilé.
+ Sur l'IDE Netbeans ou autre, créer un nouveau projet Maven
+ Une fois créer, ouvrer aussi le projet composant sous Netbeans
+ Quand le projet composant est charger, vous devrez avoir ce rendu là :    

![](https://i.imgur.com/WbhR3id.png)

+ Maintenant, vous pouvez tous simplement copier le package `com.karimandco.cv` dans votre `Source packages`
+ Ensuite, en ce qui concerne les dépendances, si votre projet est un projet Maven, vous devriez certainement avoir un fichier `pom.xml` dans la racine de votre projet :  

![](https://i.imgur.com/lGaBvGk.png)

	+ Copier ou rajouté ceci à l'intérieur, juste après `<packaging>jar</packaging>` :
	
```xml
<dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.48</version>
    </dependency>
    <dependency>
        <groupId>com.weblookandfeel</groupId>
        <artifactId>weblaf-ui</artifactId>
        <version>1.2.9</version>
    </dependency>
</dependencies>
```

###### _Remarque : La dépendance `com.weblookandfeel` n'est pas requis pour utiliser le composant. Seul le fichier `Main.java` utilise les fonctions de `com.weblookandfeel`, donc vous pouvez le supprimé_

+ Enregistrant, vous ne devriez plus avoir d'erreur :  

![](https://i.imgur.com/llvhEa0.png)

+ Et pour ce qui veulent utilisé le composant sur un projet Java Vanilla vous pouvait télécharger les dépendances avec ces liens :
	+ [mysql-connector-j v5.1.48](https://dev.mysql.com/downloads/connector/j/5.1.html#targetText=Connector/J%205.1.48&targetText=MySQL%20Connector/J%20is%20the,versions%20starting%20with%20MySQL%205.5.)
	+ [weblaf v1.2.9](https://mvnrepository.com/artifact/com.weblookandfeel/weblaf-ui/1.2.9)

+ Done.

#### Fonction importante
Convertir le ResultSet en une liste de cartes, où chaque carte représente une ligne avec columnNames et columValues
```java
private List<Map<String, Object>> resultSetToList(ResultSet res) throws SQLException {
    ResultSetMetaData md = res.getMetaData();
    int columns = md.getColumnCount();
    List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
    while (res.next()) {
        Map<String, Object> row = new HashMap<String, Object>(columns);
        for (int i = 1; i <= columns; ++i) {
            row.put(md.getColumnName(i), res.getObject(i));
        }
        rows.add(row);
    }
    return rows;
}
```
utilisation : 
```java
Statement req = this.connexion.createStatement();
ResultSet res = req.executeQuery("SQL REQUEST");
resultSetToList(res).get("Le numéro de la donnée").get("L'un des champs de la donnée");
```
---
Plusieurs fonctions Get sont à votre disposition.
Exemple : 
```java
public List<Map<String, Object>> getUtilisateur(Integer id) throws SQLException {
	//...
}

public List<Map<String, Object>> getCV(Integer id) throws SQLException {
	//...
}

//Et autre ....
```

Utilisation : 
```java
List<Map<String, Object>> utilisateur = getUtilisateur(idUtilisateur).utilisateur.size();

List<Map<String, Object>> cv = getCV(id)cv.get(0).get("id");
```

#### Crédit
Lycée jean lurçat

[![forthebadge made-with-java]( https://forthebadge.com/images/badges/made-with-java.svg )](https://www.python.org/)
