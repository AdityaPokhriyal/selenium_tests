node {
	stage ('SCM checkout'){
		git "https://www.amazon.in/"
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
