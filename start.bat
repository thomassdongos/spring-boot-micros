echo "hi"

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

cd app1-2

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..

choice /d y /t 10 > nul

cd app2-1

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..
choice /d y /t 10 > nul

cd app2-2

start cmd.exe /k "mvnw clean spring-boot:run"

cd ..