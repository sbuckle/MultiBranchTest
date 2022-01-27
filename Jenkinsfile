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
         def j = load 'jobs.groovy'
         echo j.allJobs()
       }
     }
   }
}
