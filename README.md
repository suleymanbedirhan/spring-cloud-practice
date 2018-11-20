Spring Cloud Practice

yuo need to create some prperties for your configuration name as below:
  "carservices.properties" -> for this file needs to contain "server.port=8101" or you can give any port
  "reservationbusinessservices.properties" -> for this file needs to contain "server.port=8500" or you can give any port
And then commit the git and give the git url for your config file to application.properties that is under config-server module.
