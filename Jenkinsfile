pipeline {    
    
    agent any

    stages {
        stage('Build') {
            steps { 
                script{
                def cowsay = load 'lib/cowsay.groovy'
                cowsay.example1()
                }
              
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
