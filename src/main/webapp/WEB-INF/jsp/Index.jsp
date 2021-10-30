<!DOCTYPE html>
<%@ taglibprefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglibprefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglibprefix="sf" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
    <head>
        <title>Poor, Lonely & Hungry</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/main.css" />
    </head>
    <body>
        <sf:form method="POST" commandName="recipe" action="/recipe">
        </sf:form>
        <header>
            <h1>Poor, Lonely & Hungry </h1>
        </header>

        <section class="tiles">
				<article class="style1">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipes/Recipe.html">
				        <h2>Breakfast</h2>
				    </a>
				</article>
                <article class="style2">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipe/Recipes.html">
				        <h2>Lunch</h2>
				    </a>
				</article>
                <article class="style3">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipe/Recipes.html">
				        <h2>Dinner</h2>
				    </a>
				</article>
            <article class="style4">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipe/Recipes.html">
				        <h2>Desert</h2>
				    </a>
				</article>
            <article class="style5">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipe/Recipes.html">
				        <h2>Brunch</h2>
				    </a>
				</article>
            <article class="style6">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipe/Recipes.html">
				        <h2>Healthy</h2>
				    </a>
				</article>
            <article class="style7">
                    <span class="image">
				        <img src="images/logo-star-trek-starfleet-symbol-png-favpng-MeDeSSKAHVSgj0be4y2zSN1qR.jpg" alt="" />
				    </span>
				    <a href="recipe/Recipes.html">
				        <h2>Not healthy</h2>
				    </a>
				</article>
        </section>
    </body>
</html>