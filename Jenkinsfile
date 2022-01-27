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
         sh "groovy ${env.WORKSPACE}/jobs.groovy"
       }
     }
   }
}
