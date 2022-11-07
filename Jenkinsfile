pipeline {
    agent any

    stages {
        stage('Build') {
            def miversion=env.BRANCH_NAME
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
