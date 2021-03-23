pipeline {
  
  agent {
    docker {
        image "maven:3.6.0-jdk-13"
        label "docker"
    }
  }

  //tools {
  //  maven "Maven_3.6.3_1"
  //}
  stages{
      
    stage("Build"){
      steps {
        echo "Building the application ..."
        sh "mvn -version"
        sh "mvn clean install"
      }
    }
    
    stage("Test"){
      steps {
        echo "Testing the application"
      }
    }
    
    stage("Deploy"){
      steps {
        echo "Deploying the application"
      }       
    }
  }

  post {
    always {
        cleanWs()
    }
  }

}
