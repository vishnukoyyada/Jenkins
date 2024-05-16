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
                echo 'Running tests...'
                // Add test steps here
            }
            steps{
                echo "Test2"
            }
            steps{
                echo "test3"
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
