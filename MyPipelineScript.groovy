pipeline {
    agent any 
    stages {
        stage("build") {
            steps {
                echo "build"
            }
        }
        stage("test") {
            steps{
                script{
                    parallel(
                        "Test": {
                            echo "main test"
                        },
                   "test1" :{
                          echo "test1"
            },
          "test2": {
        
                    echo "test2"
            }
                    )
                }

            }
        }
        stage("deploy") {
            steps {
                echo "deploy"
            }
        }
    }
}
