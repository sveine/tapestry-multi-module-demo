Open in intelliJ

File > Open..., ...\t5multimodule\module1-root\pom.xml
Accept the "Frameworks detected: Tapestry framework is detected in the project" from tml files
Open View: "Maven Projects"
Expand module1 > Plugins > jetty, right click on jetty:run and select Debug
Goto http://localhost:8080/module1/

Open Run/Debug Configuration > Maven > module 1 > Parameters, Add Before launch: Run Maven Goal 'module1-root: install'
