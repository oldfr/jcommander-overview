Steps to run application:

1. mvn clean install 
2. run below commands:

    a. To get details of all arguments:
        `java -jar jcommander-overview-1.0-SNAPSHOT-jar-with-dependencies.jar --help`

    b. To run the application
        `java -jar jcommander-overview-1.0-SNAPSHOT-jar-with-dependencies.jar --name Ankitha --age 12 --subjects Science,Biology,Maths -p`
    
    c. To run with boolean argument
        ` java -jar jcommander-overview-1.0-SNAPSHOT-jar-with-dependencies.jar --name Ankitha --age 12 --subjects Science,Biology,Maths -p --isSpeciallyAbled`


