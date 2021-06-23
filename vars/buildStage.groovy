def call(body){

    stage("build") {
        steps{
            println("this is a build stage")
        }
    }
}