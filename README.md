# songr application 1.0

## Running the Application

- To start this application run `./gradlew bootRun` in the terminal
- Listening at http://localhost:8080

## Routes 

-  `/ ` This is the splash page.
-  `/hello` : The user gets greeted with a Hello message
- `/capitalize/{capitalizedGreeting}` : Where {word} is whatever word you want to capitalize, the word will be displayed on the page
- `/album:` Shows a list of hardcoded albums, it displays the name, the artist, and the number of songs

## songr application 2.0

- ***UPDATE `/album:` Gives the user the option to add an Album, and be able to see all the added albums***
-  `/ ` This is the splash page.
-  `/hello` : The user gets greeted with a Hello message
- `/capitalize/{capitalizedGreeting}` : Where {word} is whatever word you want to capitalize, the word will be displayed on the page

## songr application 3.0 

***UPDATE A model, controller, repository and route for Song `/song`  was added. This allows the user to See information of all songs on the site under the corresponding album*** 
-  `/ ` This is the splash page.
-  `/hello` : The user gets greeted with a Hello message
- `/capitalize/{capitalizedGreeting}` : Where {word} is whatever word you want to capitalize, the word will be displayed on the page
- 