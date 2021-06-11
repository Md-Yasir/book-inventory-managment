# Book-Inventory-Managment

# Api's for maintaining a book inventory using SpringBoot, Java and MySQL

# Steps for running and testing the services

Clone the Project in your system

Import the DB Sript file in the src/main/resource folder in your system

Running the project in eclipse or other java ide's (Your project serves in lcalhost:8080  OR

open the cmd in the root loccation and type the command mvn spring-boot:run

For running the project prerequisites 

Java, maven and MySQL should be available in the system

I have configured the prject with swagger for easy testing(like postman which gives a UI for tesing the api's while running the project in localhost)

open this url(http://localhost:8080/swagger-ui.html#/)

Steps

# Post calls

I have given the example Request Bodies you can use it when you do post calls

#Add user

{
  "name": "string",
  "password": "string"
}

#Add a book

{
  "google_id": 0,
  "name": "string",
  "publication": "string"
}


#Add a Store

{
  "name": "string",
  "userid": 0
}

#Add inventory (Adding books to the specific store)
 {
  "bookId": 0,
  "count": 0,
  "storeId": 0
  }
 
#Update inventory (Updating count of book in a store(bookId and storeId should be existing)
{
  "id" : 0,
  "bookId": 0,
  "count": 0,
  "storeId": 0
}

# Get Calls

List Books in the store - Give the storeId as parameter

List Stores of the User - Give userId as parameter

