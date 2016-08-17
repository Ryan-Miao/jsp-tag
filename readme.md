jsp self tag
============
Learning to customize jsp tag, and run with embedded tomcat.   
#Run

```
gradlew tomcatRun
```

The com.bmuschko.tomcat plugin pre-defines the following tasks out-of-the-box:
```
Task Name	Depends On	Type	Description
tomcatRun	-	TomcatRun	Starts a Tomcat instance and deploys the exploded web application to it.
tomcatRunWar	-	TomcatRunWar	Starts a Tomcat instance and deploys the WAR to it.
tomcatStop	-	TomcatStop	Stops the Tomcat instance.
tomcatJasper	-	TomcatJasper	Runs the JSP compiler and turns JSP pages into Java source using Jasper.
```

#Debug
```
gradlew tomcatRun -Dorg.gradle.debug=true
```
Then listening for transport dt_socket at address: 5005    
for idea: Run->edit configuration->remote


###refer:

####Tomcat
https://github.com/bmuschko/gradle-tomcat-plugin/blob/master/README.md   
https://docs.gradle.org/current/userguide/gradle_command_line.html    
https://docs.gradle.org/current/userguide/build_environment.html#sec:gradle_properties_and_system_properties
    
####JSP tag
http://www.runoob.com/jsp/jsp-debugging.html
https://www.ibm.com/developerworks/cn/java/j-lo-jsp2tag/
http://www.oschina.net/question/5189_4130


   




