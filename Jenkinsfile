node {
	stage ('SCM checkout'){
		git "https://github.com/AdityaPokhriyal/selenium_tests.git"
		}
	stage ('Build'){
    	dir("C:/Users/asus/eclipse-workspace/seleniumJavaFramework") {
	   bat "mvn clean install"
       }
       	dir("C:/Users/asus/eclipse-workspace/seleniumJavaFramework/target") {
	   bat "java -jar seleniumJavaFramework-0.0.1-SNAPSHOT.jar"
       }
		}
}
