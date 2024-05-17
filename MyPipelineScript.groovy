pipeline {
    agent any 
    stages {
            stage ("build"){
                steps {
                    echo "build"
                }
            }
            stage ("test"){
                steps{
                    echo "main test"
                }
                    stage("test1"){
                        steps {
                            echo "test1"
                        }
                    }
                    stage("test2"){
                        steps{
                            echo "test2"
                        }
                    }
            }
            stage ("deploy"){
                steps {
                    echo "deploy"
                }
            }
    }
}