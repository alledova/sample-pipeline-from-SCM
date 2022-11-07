pipeline {
    
    agent any
    def miversion=env.BRANCH_NAME
    stages {
        stage('Build') {
            
            steps {                
                echo "Building...$miversion"
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
