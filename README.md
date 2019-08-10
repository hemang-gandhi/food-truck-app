# food-truck-app
Prototype for getting food truck information by location from SF data set.

This Spring Boot app manages a service "/food-truck" that tells the user what types of food trucks might be
found near a specific location.

Steps to run the application:

1. Pull from git repository
2. Move to the folder location
3. Run command: ./gradlew bootRun
4. Additionally the application can be imported into an IDE like IntelliJ IDEA and started.
5. Once the application starts, open http://localhost:8080/index.html in the browser.
6. Examples of locationDescription are provided to search. Results are shown in a jqGrid with food items information
for the location.
7. Postman API call: http://localhost:8080/food-truck?locationDescription=02ND ST: BRYANT ST to TABER PL (500 - 518)


Service: /food-truck

The service takes a parameter locationDescription, and searches DataSF: Food Trucks' public API:

https://data.sfgov.org/resource/rqzj-sfat.json?locationdescription=01ST%20ST:%20CLEMENTINA%20ST%20to%20FOLSOM%20ST%20(245%20-%20299)

and fetches relevant information to display food items near that location.

