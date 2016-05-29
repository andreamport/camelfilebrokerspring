Zuerst anpassen
src/main/resources/META-INF/camel-context.xml
1. ersetzen <<yourinputpath>>
2. ersetzen <<youroutputpath>>

AppAssembly erstellen
mvn clean package appassembler:assemble


Mit AppAssembly starten (File Konsumieren von <inputpath> nach <outputpath>)
filebrokerspring/target/appassembl/bin\ $ ./FileBrokerSpring 

