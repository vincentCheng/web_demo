pipeline {
   agent any

   stages {
      stage('拉取代码') {
         steps {
            echo 'github 克隆 web_demo'
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '004', url: 'git@github.com:vincentCheng/web_demo.git']]])
         }
      }
      stage('构建项目') {
         steps {
            echo '构建项目'
            sh label: '', script: 'mvn clean package'
         }
      }
      stage('发布项目') {
         steps {
            echo '发布项目'
            deploy adapters: [tomcat8(credentialsId: '45ca8331-f81f-4be8-ac79-cf63eb4bdf90', path: '', url: 'http://192.168.0.104:8080/')], contextPath: null, war: 'target/*.war'
         }
      }
   }
}
