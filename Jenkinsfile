pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          def cowsay = load 'lib/cowsay.groovy'
          cowsay.example1()
        }

        build 'mijob'
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