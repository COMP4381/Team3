 Project Final Repoert 
Web services course (COMP4382) >> Team 3 : Nagham Jawabra 1150309 || Israa Hamed 1153216
# PALScan service for cultural heritage protection   


# Motivation
A service used to protect cultural heritage through scan and upload valuable media to a cloud server !

> What is the problem domain ?

Our Problem domain is Archiving and Crowdsourcing data collecting

>What is the specific SOA-based solution ?

IT-motivated solution for cultural protection that enables people themselves to document and preserve cultural documents, photos, audio, etc …

>Why use service computing?
 
Cheaper solution,because the already used tools in the archiving process is very expensive. Reusability because we will use it in our grad project, and Availability.

# Service Design 
### SOA Diagram 
![soa](https://user-images.githubusercontent.com/36053501/48878861-04135d00-ee12-11e8-8325-636ac3bcfa9e.png)

#### Explaination in detail:

> We have Composite Service Called : Palscan Service
![picture1](https://user-images.githubusercontent.com/36053501/50541129-b4aa1480-0ba7-11e9-99cf-2b14393a1072.jpg)

> We use Different Atomic services which are : Google places , scan service , filter service, Google cloud datastore

> And the 3rd party services we use are :Google places,Google cloud datastore
![image](https://user-images.githubusercontent.com/36053501/50541168-7103da80-0ba8-11e9-8abd-1a8c11c68375.png)


### BPMN Diagram
![untitled diagram 1](https://user-images.githubusercontent.com/44175754/49721442-e09e3e00-fc6a-11e8-9fb4-fffd5dce408f.jpg)
PS : if the photos is not clear > GO to WIKI file to find  google drive links for the diagrams 

# Implementation Details
We impelemented our services using the RESTful service development paradigm. Which is based on the HTTP protocol which is an RPC-based synchronous communication protocol.And our Data representation is JSON.

## Composite Service Algorithm According to BPMN 2.0
## Applied Technologies
development environment: eclipse
programming languages : java (JDK 8)
frameworks and libraries : swagger 2.0, Spring boot
deployment platforms (PaaS): Google App Engine (GAE), which is a Google Cloud Platform(GCP) service provided by Google
application server: Apache Tomcat

 ![picture2](https://user-images.githubusercontent.com/36053501/50541186-0f903b80-0ba9-11e9-9331-e06f7772a110.png)

# Service Deployment and Monitoring
## Log file

# Conclusion and Discussion


# Bonus Zone
## Design Patterns
## Service Monitoring


# APPENDIX
## Documentation for API Endpoints :
### CompositeServiceControllerApi 
### Atomic Controllers 
## Documentation for Models
## Documentation for Authorization
## Authors
> jawabranagham@gmail.com
> Israarajahamed@gmail.com










## Progress : 

### First Draft : Model,controlers and Documentation(Assignment 3.1):
[java-client-generated.zip](https://github.com/COMP4381/Team3/files/2602052/java-client-generated.zip)
