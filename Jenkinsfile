pipeline {
   agent any 
   options {
     buildDiscarder(logRotator(numToKeepStr: '-1'))
     disableConcurrentBuilds()
   }
   stages {
     stage('Hello') {
       steps {
         echo "Hello, world!"
       }
     }
   }
}
