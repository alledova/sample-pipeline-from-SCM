pipeline {    
    
    agent any

     parameters {
        string(msg: '¡Hola Mundo!')
    }
    
    stages {
        stage('Build') {
            steps { 
                script{
                def cowsay = load 'lib/cowsay.class'
                cs = new cowsay()
                cs.main(${params.msg})                
                }               
                //echo  "$cowsay"
                //echo "Building...Hola, adios y hasta luego"                
                
                
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
