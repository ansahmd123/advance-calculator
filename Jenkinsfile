// simple pipeline
pipeline {
    agent any

    environment {
        NEXUS_URL = 'http://localhost:8081' // Nexus URL
        NEXUS_REPO = 'my-artifacts' // Nexus Repository name
        NEXUS_USER = 'admin' // Nexus username
        NEXUS_PASSWORD = 'ansahmd123' // Nexus password
        ARTIFACT_GROUP = 'com.nasdaq' // Your Maven group ID
        ARTIFACT_NAME = 'my-application-0.0.1-SNAPSHOT.jar' // Your Spring Boot app name
        ARTIFACT_VERSION = '0.0.1' // Artifact version
    }

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

        stage('Publish to Nexus') {
            steps {
                script {
                    def artifactPath = "build/libs/${ARTIFACT_NAME}-${ARTIFACT_VERSION}.jar"
                    sh """
                        curl -u admin:ansahmd123 \
                             --upload-file build/libs/my-application-0.0.1-SNAPSHOT.jar \
                             http://nexus:8081/repository/maven-releases/com/nasdaq/calculator/0.0.1/my-application-0.0.1-SNAPSHOT.jar
                    """
                }
            }
        }
//         stage('Upload Jacoco Coverage') {
//             steps {
//                 jacoco(execPattern: 'build/jacoco/test.exec')
//             }
//         }
        stage('Post-Build Actions') {
            steps {
                //archive all artifacts
                archiveArtifacts artifacts: '**/build/*'
                // publish junit test results
                junit 'build/test-results/**/*.xml'            }
        }
    }
}