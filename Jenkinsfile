pipeline {    
    
    agent any
     parameters {
        string(msg: '¡Hola Mundo!')
    }
    
    stages {
        stage('Build') {
            def msg = "¡Hola Mundo!"
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
