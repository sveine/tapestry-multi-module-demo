Open in intelliJ


1. File > Open..., ..\tapestry-multi-module-demo\module1-root\pom.xml
2. Accept the "Frameworks detected: Tapestry framework is detected in the project" from tml files
3. Open View: "Maven Projects"
4. Expand module1 > Plugins > jetty, right click on jetty:run and select Debug
5. Goto http://localhost:9876

6. Open Run/Debug Configuration > Maven > module 1 > Parameters, Add Before launch: Run Maven Goal 'module1-root: install'

```
MySQL:
Schema: Demo
User/password: demo/demo (see: hibernate.cfg.xml)
CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` int(11) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```
