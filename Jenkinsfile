pipeline {
    agent {label 'master'}
    tools{
        jdk 'jdk11'
        maven 'maven'
    }
    environment {
        CHEIF_AUTHOR = 'Asher'
        RETRY_CNT = 3
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '3')) 
        disableConcurrentBuilds()
        quietPeriod(30)
    }
    parameters {
     choice(name: 'TARGET_ENV', choices: ['UAT', 'SIT', 'STAGING'], description: 'Pick something')
    }
    triggers {
         pollSCM('*/5 * * * *')
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
                sh 'echo ${env.CHEIF_AUTHOR}'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
    }
}
