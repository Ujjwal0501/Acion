package kshitij.com.acion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ujjwal and kshitij on 17-01-2018.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String DBNAME = "Recipes.db";
    private static final int VERSION = 1;

    SQLiteDatabase myDB;
    public DBHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryTable = "CREATE TABLE IF NOT EXISTS appdb1 (name varchar(150) NOT NULL, description varchar(10000), ingredients varchar(21844), procedure varchar(21844), vlink varchar(200), difficulty integer, time integer, serves varchar(50), img varchar(20));";
        db.execSQL(queryTable);
        queryTable = "CREATE TABLE IF NOT EXISTS appdb0 (name varchar(150) NOT NULL, ingredients varchar(21844));";
        db.execSQL(queryTable);
        queryTable = "INSERT INTO appdb0 VALUES(\"Green Mango and Cumin Drink (Aam Panna)\",\"mangoes,sugar,salt,cumin seeds,chili,mint leaves\"), (\"Appam\",\"rice,coconut,sugar,salt,yeast\"), (\"Baati\",\"wheat flour,salt,oil,ghee\"), (\"Caesar Salad\",\"Romaine lettuce,extra-virgin olive oil,soft-boiled eggs,salt,black pepper, red wine vinegar,Worcestershire sauce, Garlic croûtons\"), (\"Cardamom Bread\",\"yeast,water,milk,sugar,salt,eggs,ground cardamom, flour,butter,orange,sugar,almonds\"), (\"Cucumber Sprout Sandwich\",\"whole wheat bread,cream cheese,cucumber,alfalfa sprouts,olive oil,red wine vinegar,tomato,romaine lettuce leaf,pepperoncini,avocado,salt,pepper\"), (\"Egg Noodles\",\"eggs,salt,olive oil,flour\"), (\"French Fries\",\"potatoes,oil,salt\"), (\"Giblet Soup\",\" beef,mutton,veal,water,giblets, butter, flour,parsley, chives, pennyroyal, sweet marjoram, Madeira wine, salt, Cayenne pepper\"), (\"Jalebi\",\"all-purpose flour,  baking powder,water,sugar,cream of tartar, red and yellow food coloring,rosewater\");";
        db.execSQL(queryTable);

        queryTable = "INSERT INTO appdb1 VALUES (\"Green Mango and Cumin Drink (Aam Panna)\", \"Aam panna is a green mango drink widely consumed in northern India during summer months. Apart from being delicious and refreshing, aam panna is believed to have several health benefits. The recipe calls for green mangoes, sugar, rock salt, roasted cumin seeds and mint leaves. The quantities can (and should) be varied to suit individual taste preferences. This recipe yields a concentrate which can be stored for around 2 weeks in the refrigerator.\", \"4 medium-sized green mangoes, ½ cup (120 mL) sugar, 2 level tablespoons (30 mL) rock salt, 1 level teaspoon (5 mL) roasted cumin seeds, 1 roasted chili, A handful of fresh mint leaves\", \"Cut mangoes into 3 slices each - two from either side of the seed and one with the seed in it. Pressure cook mangoes with one small cup of water. Turn off heat as soon as the pressure cooker whistles once. Open cooker after 5-7 minutes and leave to cool. Alternatively roast the whole mangoes over an open flame, ill the skin gets chared and the flesh is soft. The charred skin will peel off easily and you can squeeze out the pulp with your hands. This gives a nice smoky flavour to the dish. Grind sugar and roasted cumin seeds using a food processor. (If using chilli, grind that too.) Mince mint leaves in a food processor. When cool, squeeze pulp of mangoes into a blender using hands. Discard skin and seeds. Purée mango pulp until smooth. Add ground sugar, rock salt, roasted cumin seeds, chilli powder and minced mint leaves. Blend well. Store in clean plastic/ glass bottle. Refrigerate. To serve, add 4-5 teaspoons of concentrate to a glass of water. Enjoy!\", \"http://sites.google.com/site/nehasrecipe/recipes/beverages/green-mango-juice\", 3, 15, \"4 serves\",\"aampanna\"), (\"Appam\", \"Appam, a fermented rice pancake, is a speciality of the South Indian coastal state of Kerala. It is especially popular among the Christian communities of that state. Appam are often served along with a coconut-flavoured vegetable stew. It is also very popular in Sri Lanka, were it is known as appa (or hopper) and often served with an added egg.\", \"1½ cups uncooked white rice, 1½ cups fresh grated coconut, 1 tablespoon sugar, 1 teaspoon salt, or to taste, 2 tablespoons white rice, cooked, water for soaking rice, and 2 to 2½ cups for grinding,optional: ½ teaspoon yeast or kefir, to start the ferment\", \"Soak the raw rice in water. Grind the soaked rice until about ¼ ground. Add the grated coconut along with a little water and continue grinding. Add the sugar, cooked rice and yeast or kefir, and keep grinding until the whole mixture becomes smooth. It should be thinner than pancake batter. Transfer it to a wide open container and leave it to rise overnight. The next morning, add salt and refrigerate the batter until use. To fry the appams, use a tava or a small bowl-shaped pan with either a non-stick coating or a little oil or ghee. Pour a full serving spoon of batter into the middle of the pan and swirl it around a single time so that a little of the batter sticks to the sides. Cover the pan with a hot lid and remove the appam with a spatula after 2-3 minutes, when it becomes slightly browned around the edges. It should be round, with a thick centre and thin, lacy edges. Makes 12.\", \"\", 4, 30, \"3 serves\",\"appam\"), (\"Baati\", \"Baati is a hard, unleavened bread cooked in desert areas of Rajasthan, Malwa, and Gujarat in North India. It is prized there for its exceptionally long life and high energy content, as well as the minimal quantity of water required in its preparation.\", \"1 pound (450 g) wheat flour, 1/2 teaspoon salt, 3 tablespoons oil, 1 1/2 teaspoons ghee (for serving)\", \"Mix the flour and salt. Put about a cup of the mix in a small bowl and add a little oil, mixing it in well and breaking up any lumps. Pour in water about a tablespoon at a time and keep kneading with your hands. You only need three or four tablespoons, but you must knead the dough very hard to make it stick together in a ball. The more compact the dough, the better and denser the baati will be. Let the balls sit for 5 minutes. Flatten out each ball with first your hands and then a rolling pin until they are smooth discs 4 inches (10cm) across and 1/2 inch (1.25 cm) thick. Cook in a dry metal pan on a low flame. Flip once when the bottom begins to harden, then pinch all over with two fingers so the dough is not too thick and has a bumpy texture on one side. Check the bottom until it browns in spots, then remove the baati and place it upside-down on a grate or pan with holes in it. This will blacken the top a little, especially on the tops of the pinched bumps. To serve, drizzle liberally with ghee and accompany with a dhal or vegetable. Makes 4-6 Baati\", \"\", 4, 40, \"5 serves\",\"baati\"), (\"Broccoli Stir Fry\", \"\", \"broccoli, chicken or other meat., powdered ginger (optional), soy sauce, oil to fry with, possibly including sesame oil, sesame seeds\", \"Cut raw meat into small pieces. Chop the broccoli head into medium-small pieces, perhaps 1.2-inch diameter. Cut the stalk to be like disks, 1/8-inch thick. Place oil in a wok and turn on the heat. High temperatures can produce a better result, but require rapid stirring to prevent burning. Slow beginners should use lower temperatures. Split the cooking into batches as needed to ensure that your wok is not too full; there should be plenty of room to stir and toss the food in your wok. You may prefer to cook each ingredient separately, then mix them at the end. Place sesame seeds into the wok. Stir fry them until they are golden-brown. Remove them, and put them aside for later. Stir-fry the meat. Drain juices and add more oil as needed. Add soy sauce. For a typical wok full of food, add a tablespoon. If using low-salt soy sauce, you can add much more without making the food too salty. Add back the sesame seeds. If using ginger, add about 1/4 teaspoon, depending on taste. Ginger is somewhat hot. Add the broccoli, stalks first. When done, the broccoli should be just slightly softened. Broccoli should end up being very bright green, losing the bluish cast but not gaining any hint of a yellow-brown cast\", \"\", 4, 25, \"3 serves\",\"broccolistirfry\"), (\"Caesar Salad\", \"The Caesar salad is a traditional salad served in American restaurants, often prepared table side. It is referred to by some as the king of salads. Its origin is largely credited to Italian immigrant Caesar Cardini, a restaurateur and chef in Tijuana, Baja California del Norte, Mexico. Cardini reportedly tossed the first such salad table side at his restaurant on July 4, 1924.\", \"1 head Romaine lettuce, roughly chopped[N 1], 1/4 cup (about 50ml) extra-virgin olive oil, divided, 2 soft-boiled eggs, Heavy pinch of sea salt. Don't use table salt, or else you're not making Caesar salad., Freshly ground black pepper, Drizzle red wine vinegar, 3 shots Worcestershire sauce, Garlic croûtons (below)\", \"Drizzle lettuce with 2 tbsp extra-virgin olive oil. Toss to coat. Add salt and pepper. Toss to coat. Add vinegar and toss to coat. Drizzle Worcestershire sauce over lettuce. Toss to coat. Crack eggs over salad. Toss to coat. Top with garlic croûtons and serve.\", \"\", 2, 20, \"5 serves\",\"caesarsalad\"), (\"Cardamom Bread\", \"Cardamom bread is a sweet yeast bread of Scandinavian origin which is good served at breakfast, with coffee, or as a light dessert. This recipe makes two loaves.\", \"1 pkg yeast, 1/4 c warm water, 3/4 c warm milk, 1/2 c sugar, 1/2 t salt, 2 eggs, 1 tsp ground cardamom (about 20 green pods), 4 1/2 c flour, 1/2 c butter, grated peel of 1 orange, pearl sugar, sliced almonds\", \"In a large mixing bowl, mix flour, salt and orange peel; whisk gently to distribute the ingredients. Split green cardamom pods and remove the seeds inside. With a mortar and pestle, grind the seeds into a powder and add this to the other dry ingredients. In a small bowl, combine yeast, warm water and sugar. Stir gently for a few seconds, then let stand until the yeast is frothy. In a small saucepan on low-to-medium heat, combine butter and milk and bring the mixture to at least 180 °F (82 °C) while stirring, then turn off heat to let it cool. In a separate bowl, beat 2 eggs and set aside. Check that the milk and butter mixture is not hot, then add the it into the dry ingredients and mix. Knead the dough until it is smooth and elastic. Place the kneaded dough in a greased bowl and let rise in a warm place (in the oven, for example) until it doubles in size, about one hour. Knock back the dough, and cut in two parts (one for each loaf).\", \"\", 3, 30, \"1 serve\",\"cardamombread\"), (\"Cucumber Sprout Sandwich\", \"These Cucumber Sprout sandwiches are stuffed with cucumbers, alfalfa sprouts, tomatoes, and avocados.\", \"2 slices whole wheat bread, 2 tbs. cream cheese, softened, 6 slices peeled cucumber, 2 tbs. alfalfa sprouts, 1 tsp. olive oil, 1 tsp. red wine vinegar, 1 tomato, sliced, 1 romaine (cos) lettuce leaf, 2 tbs. pepperoncini, sliced, 1/2 avocado, peeled and mashed, salt and pepper to taste\", \"Spread 1 tablespoon cream cheese on each slice of bread. Arrange cucumber slices in a single layer on one slice of bread. Cover same slice of bread with alfalfa sprouts, sprinkle with oil and vinegar. Layer same slice of bread with tomato slices, lettuce, and pepperoncini. Spread mashed avocado on other slice of bread. Add salt and pepper to taste Assemble sandwich and serve immediately\", \"\", 3, 30, \"2 serves\",\"cucumbersproutsandwich\"), (\"Egg Noodles\", \"\", \"3 whole eggs, 1/8 teaspoon salt, 1/2 cup (120ml) wine, 1 Tablespoon of olive oil, 3 cups (700g) flour\", \"In a bowl beat together eggs, salt, olive oil, and wine. Stir in 1 cup flour with fork. Gently add 2nd cup of flour after 1st is mixed thoroughly. Remove mixture from bowl and place on a lightly floured work surface. Knead in the last cup of flour a bit at a time. If the dough becomes too dry, add a bit of cold water. Continue kneading until the dough is uniform and satinny in appearance. Roll into a large ball and cut into quarters. Overturn the mixing bowl over the cut pieces to protect from dust. Let dough relax for approx. 30 minutes.\", \"\", 4, 40, \"5 serves\",\"eggnoodles\"), (\"French Fries\", \"French Fries (or chips) are a well-known element of fast food.\", \"potatoes ( potatoes with a high dry matter content, such as Russet or Maris Piper work best.), cooking oil, Paper towels, salt\", \"Peel potatoes Slice potatoes into thin straw-like pieces. Wash well with water to remove excess starch. Place fries in a pan with water and simmer or par boil on the stove for about 15 mins. Sieve and dry fries off. Deep fry at 175°C in vegetable oil, lard or dripping for 4 to 5 minutes to a light golden crisp. Remove and place on plate with paper towels to absorb the leftover cooking oil. Transfer to another plate if necessary. Add salt and shake to ensure all French fries are evenly salted.\", \"\", 3, 25, \"3 serves\",\"frenchfries\"), (\"Giblet Soup\", \"\", \"4 pounds of gravy beef, 2 pounds of scrag (neck) of mutton, 2 pounds of scrag (neck) of veal, 2 U.S. gallons of water, 2 pairs of giblets, butter, flour, finely chopped parsley, chives, pennyroyal, sweet marjoram, Madeira wine, salt, Cayenne pepper\", \"Take 4 pounds of gravy beef, 2 pounds of scrag of mutton, and 2 pounds of scrag of veal; boil them in 2 gallons of water, stew them gently till it begins to taste well,, pour it out and let it stand till cold, skim off all the fat. Take 2 pairs of giblets well scaled, put them to the broth, and simmer them till they are very tender. Take them out and strain the soup through a cloth. Put a piece of butter rolled in flour into the stewpan with some fine chopped parsley, chives, a little pennyroyal, and sweet marjoram. Place the soup over a slow fire, put in the giblets, fried butter, herbs, a little Madeira wine, some salt, and Cayenne pepper; when the herbs are tender, send the soup and giblets intermixed to table. This forms a very savory dish.\", \"\", 4, 45, \"3 serves\",\"gibletsoup\"), (\"Jalebi\", \"Jalebi is a syrupy sweet that is shaped like a slightly large, chaotic pretzel and is traditionally prepared in India and Pakistan. Well-made jalebi has a tart element with a sweet taste.\", \"3 cups all-purpose flour, ¼ cup gram flour, ¼ teaspoon baking powder, 5 cups water, 4 cups sugar, 3 cups of water, ? teaspoon cream of tartar, red and yellow food coloring, 1 teaspoon rosewater\", \"Mix up the batter ingredients until smooth. Let the batter sit unrefrigerated and uncovered overnight (about 12 hours). Mix the sugar, water, and cream of tartar for the syrup. Stir the syrup over moderate heat until the sugar is dissolved. Put on high heat and boil for 5 minutes. Let the syrup cool, and stir in the rosewater and food coloring (color it to light orange). Put the vegetable oil in a wide wok-like dish, and heat to about 350°F (175°C). Put the batter into a pastry bag with about a ¼ inch opening. If it is too dry to squeeze out, mix in a bit of water. Squeeze the batter into the oil, making a couple of figure 8s and loops on top of each other. The shape should be about 3 inches on its longest side. Fry each jalebi until golden brown. Remove, let the oil drain off, then soak in syrup for a minute. Serves 7.\", \"\", 4, 30, \"7 serves\",\"jalebi\");";
        db.execSQL(queryTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void closeDB() {
        if (myDB != null && myDB.isOpen())
            myDB.close();
    }


    String queryInsert = ";";

}

