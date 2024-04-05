def call(body) {
    // Delegate processing of the DSL block to another method
    pipeline {
        agent any
        stages {
            stage('Build') {
                 steps {
                    // Example Maven build step
                      echo "Hello how are you"
                       }
                 }
              }
            }  
}
