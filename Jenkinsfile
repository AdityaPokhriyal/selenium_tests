node {
	stage ('SCM checkout'){
		git "https://github.com/AdityaPokhriyal/selenium_tests.git"
		}
	stage ('Build'){
    	dir("C:/Users/asus/eclipse-workspace/seleniumJavaFramework") {
	   bat "mvn clean install"	
       }
		}
}
