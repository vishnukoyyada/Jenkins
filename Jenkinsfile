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
            stages{
                stage("test1"){
                    steps{
                        echo "test1"
                    }
                }
                stage("test2"){
                    steps{
                        echo "test2"
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
