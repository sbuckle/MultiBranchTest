pipeline {
   agent any 
   options {
     disableConcurrentBuilds()
   }
   stages {
     stage('Hello') {
       steps {
         echo "Hello"
       }
     }
     stage('Jobs') {
       steps {
         "${env.WORKSPACE}/jobs.groovy"
       }
     }
   }
}
