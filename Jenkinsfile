pipeline {    
    
    agent any

     parameters {
        string(msg: '¡Hola Mundo!')
    }
    
    stages {
        stage('Build') {
            steps {                
                echo "Building...Hola, adios y hasta luego"
                
                cs = load 'lib/cowsay.groovy'
                cs.main(${params.msg})
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
