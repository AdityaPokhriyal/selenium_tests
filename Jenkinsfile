node {
	stage ('SCM checkout'){
		git "https://github.com/AdityaPokhriyal/selenium_tests.git"
		}
	stage ('Build'){
    	dir("C:/Users/asus/eclipse-workspace/seleniumJavaFramework") {
	   bat "mvn clean install"
	   currentBuild.result = 'SUCCESS'
   	   return	
       }
       	dir("C:/Users/asus/eclipse-workspace/seleniumJavaFramework/target") {
	   bat "java -jar seleniumJavaFramework-0.0.1-SNAPSHOT.jar"
       }
		}
}
