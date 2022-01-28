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
         echo "Running script"
         script {
             println Jenkins.instance.getAllItems(Job.class).size()
         }
       }
     }
   }
}
