to test it : 
mvn clean install

mvn spring-boot:run 

 curl -X POST http://localhost:8080/shapes/area      -H "Content-Type: application/json"      -d '{
           "type": "circle",
           "radius": 10
         }'
