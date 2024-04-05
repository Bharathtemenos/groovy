def call(body) {
    // Delegate processing of the DSL block to another method
    pipeline {
        agent any
        stages {
            // Execute the provided closure (body) within the pipeline block
            echo 'Hello how are you'
        }
    }
}
