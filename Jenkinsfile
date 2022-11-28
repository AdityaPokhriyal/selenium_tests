node {
	stage ('SCM checkout'){
		git "https://github.com/AdityaPokhriyal/selenium_tests.git"
		}
	stage ('Build'){
    	dir("seleniumJavaFramework") {
	   sh "mvn clean install"
       }
       	dir("seleniumJavaFramework/target") {
	   sh "java -jar seleniumJavaFramework-0.0.1-SNAPSHOT.jar"
       }
		}
}
