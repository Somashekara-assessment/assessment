node {

  stage('checkout') {
    checkout scm
  }

  if (env.BRANCH_NAME == 'master') {
      stage('Build') {
        try {
          //withCredentials([usernamePassword(credentialsId: 'docker-user', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
          //  println 'login to docker registry'
          //  sh(
          //    returnStdout: true,
          //    script: 'docker login -u="${DOCKER_USER}" -p="${DOCKER_PASS}"
          //  )

            println 'building'
  


            sh docker build -t football_league:latest .
            //sh docker push somk0306/assessment:ootball_league:latest
            sh docker run -d  -p 8080:8080 football_league

         // }
        } finally {

        }
      }




  }
}