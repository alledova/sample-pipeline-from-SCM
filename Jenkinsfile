pipeline {    
    
    agent any
    
    stages {
        stage('Build') {
                       
            steps {                
                echo "Building...Hola, adios y hasta luego"
                def msg = "¡Hola Mundo!"
                cs = load 'lib/cowsay.groovy'
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
