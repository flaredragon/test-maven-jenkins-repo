pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "maven"
   }

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            // Run Maven on a Unix agent.
            sh "mvn -Dmaven.test.failure.ignore=true clean package"

            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
      stage('Run') {
         steps {
            sh "java -cp target/factorial-0.0.1-SNAPSHOT.jar com.training.jenkins.runner.runners"
         }
      }
   }
}
