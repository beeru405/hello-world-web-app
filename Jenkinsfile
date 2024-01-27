// Jenkinsfile
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    def mvnHome = tool 'Maven'
                    sh "${mvnHome}/bin/mvn clean package"
                }
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                script {
                    def tomcatHome = '/opt/apache-tomcat-9.0.85'
                    def warFile = sh(returnStdout: true, script: 'ls target/*.jar').trim()
                    sh "cp ${warFile} ${tomcatHome}/webapps"
                }
            }
        }
    }
}
