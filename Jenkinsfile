pipeline {

    @lib/cowsay.groovy
    
    agent any
    
    stages {
        stage('Build') {
            def msg = "¡Hola Mundo!"
            cs = new cowsay()
            
            steps {                
                echo "Building...Hola, adios y hasta luego"
                cs.main(msg)
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....'
            }
        }
    }
}
