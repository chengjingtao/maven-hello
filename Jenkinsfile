node{
    
  stage("Checkout"){
    def scmVars = checkout([
              $class: 'GitSCM',
              userRemoteConfigs: [[
                   url: "https://github.com/chengjingtao/maven-hello.git"
              ]]
          ])
          env.GIT_COMMIT = scmVars.GIT_COMMIT
          env.GIT_BRANCH = scmVars.GIT_BRANCH
  }

  stage("Build"){
    sh "mvn compile"
  }

  stage("Test"){
    sh "mvn test"
  }

  stage("Package"){
      sh "mvn package"
  }

  stage("Build-Push-Image"){
    docker.withRegistry("https://index.alauda.cn", "index.alauda.cn-jtcheng"){
      docker.build("index.alauda.cn/alaudaorg/maven-hello:${env.GIT_COMMIT}").push()
    }
  }
  
  stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }

}
