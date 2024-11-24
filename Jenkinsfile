// simple pipeline
pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
        timestamps()
    }

    tools {
        // define the gradle tool
        gradle 'Gradle'
    }

    stages {
        stage('Prepare Environment') {
            steps {
                checkout scm
            }
        }
        stage('Build&Test') {
            steps {
                sh 'gradle clean build test'
            }
        }
        stage('Upload Jacoco Coverage') {
            steps {
                jacoco(execPattern: 'build/jacoco/test.exec')
            }
        }
        stage('Post-Build Actions') {
            steps {
                // archive artifacts
                archiveArtifacts artifacts: 'build/libs/*.jar'
                // publish junit test results
                junit 'build/test-results/**/*.xml'            }
        }
    }
}