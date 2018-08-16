echo "hi"


cd auth-center

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..

choice /d y /t 10 > nul

cd eureka-server

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..

choice /d y /t 10 > nul


cd zuul

start cmd.exe /k "mvnw clean spring-boot:run"

cd .. 

choice /d y /t 10 > nul

cd app1-1

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..



choice /d y /t 10 > nul

cd resource-center

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..