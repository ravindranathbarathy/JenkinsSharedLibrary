def call(body){
pipeline {
    agent any
    stages {
        stage("build") {
            steps{
                println("This is my full pipeline")
            }
        }
    }
    }
}