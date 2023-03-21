pipeline {
    agent any

    stages {
        stage('Github Pull') {
            steps {
                git branch: 'main', credentialsId: 'alpineFrost', url: 'https://github.com/alpineFrost/Calculator_Project.git'
            }
        }
        stage('Maven build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker build') {
            steps{
                script {
                    imageName=docker.build "abhigna4443/calculator_project"
                }
            }
        }
        stage('Docker push img') {
            steps {
                script{
                    docker.withRegistry('','abhignaDocker'){
                    imageName.push()
                    }
                }
            }
        }
        stage('ansible pull img') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
}