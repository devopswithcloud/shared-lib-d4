// Pipeline + groovy 
// import the Calcclulator class from com.i27academy.build package
import com.i27academy.builds.Calculator

// An instance of the class called calculator is created
Calculator calculator = new Calculator(this)

Pipeline {
    agent any 
    stages {
        stage('AdditionStage') {
            steps {
                script {
                   echo "Printing Sum of 2 numbers"
                   println calculator.add(3,4) // add expects 2 parameters
                }
            }
        }
    }
}