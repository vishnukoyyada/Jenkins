pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add build steps here
            }
        }
        stage('Test') {
            steps {
                script {
                    parallel (
                        "Main Tests": {
                            echo 'Running main tests...'
                            // Add main test steps here
                        },
                        "Additional Test 1": {
                            echo 'Running additional test 1...'
                            // Add additional test 1 steps here
                        },
                        "Additional Test 2": {
                            echo 'Running additional test 2...'
                            // Add additional test 2 steps here
                        }
                    )
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment steps here
            }
        }
    }
}
