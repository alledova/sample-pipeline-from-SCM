pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                miversion=env.BRANCH_NAME
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
