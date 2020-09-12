# assessment

As per the requirments project has built in Jenkins. below is the Link

username : admin
password : admin

http://ec2-18-217-63-227.us-east-2.compute.amazonaws.com:8080/job/football-league/6/console

And Api's are

Countries
curl http://ec2-18-217-63-227.us-east-2.compute.amazonaws.com:8080/api/v1/countries

Leagues
curl http://ec2-18-217-63-227.us-east-2.compute.amazonaws.com:8080/api/v1//leagues/{countryId}

Teams
curl http://ec2-18-217-63-227.us-east-2.compute.amazonaws.com:8080/api/v1//teams/{leugueId}

Position
curl http://ec2-18-217-63-227.us-east-2.compute.amazonaws.com:8080/api/v1//position/{leugueId}


Docker build and run commands

docker build -t football_league:latest .

docker run -d  -p 8181:8181 football_league



