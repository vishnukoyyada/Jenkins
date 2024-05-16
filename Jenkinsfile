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
            stages {
                stage('Main Tests') {
                    steps {
                        echo 'Running main tests...'
                        // Add main test steps here
                    }
                }
                stage('Additional Test 1') {
                    steps {
                        echo 'Running additional test 1...'
                        // Add additional test 1 steps here
                    }
                }
                stage('Additional Test 2') {
                    steps {
                        echo 'Running additional test 2...'
                        // Add additional test 2 steps here
                    }
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
