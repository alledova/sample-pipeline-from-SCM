pipeline {    
    
    agent any
    
    stages {
        stage('Build') {
            def msg = "¡Hola Mundo!"
            steps {                
                echo "Building...Hola, adios y hasta luego"
                
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
