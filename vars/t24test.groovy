def call(body) {
    // Delegate processing of the DSL block to another method
    pipeline {
        agent any
        stages {
            body()
        }
    }
}
