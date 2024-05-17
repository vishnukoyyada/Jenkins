pipeline{
    agent any{
        stages{
            stage("build"){
                echo "hello from build"
            }
            stage("test"){
                echo "test"
            }
            stage("deploy"){
                echo "deploy"
            }
        }
    }
}