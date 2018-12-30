Web Services Course (COMP4382) >> Project Final Repoert >> Team 3 : Nagham Jawabra 1150309 || Israa Hamed 1153216

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
## SOA Diagram 


![soa](https://user-images.githubusercontent.com/36053501/50541484-9e07bb80-0baf-11e9-860b-f61a33ed914c.png)

#### Explaination in detail:

We have Composite Service Called : Palscan Service  

We use Different Atomic services which are : Google places , scan service , filter service, Google cloud datastore  

And the 3rd party services we use are :Google places,Google cloud datastore


> ![image](https://user-images.githubusercontent.com/36053501/50541522-44ec5780-0bb0-11e9-8ea3-d4ac5c61b768.png)


## BPMN Diagram


![picture3](https://user-images.githubusercontent.com/36053501/50541256-4e72c100-0baa-11e9-91c0-3262a0a73e83.jpg)


# Implementation Details
We impelemented our services using the RESTful service development paradigm. Which is based on the HTTP protocol which is an RPC-based synchronous communication protocol.And our Data representation is JSON.

## Composite Service Algorithm According to BPMN 2.0
## Applied Technologies

development environment: eclipse  <br/>
programming languages : java (JDK 8)<br/>
frameworks and libraries : swagger 2.0, Spring boot<br/>
deployment platforms (PaaS): Google App Engine (GAE), which is a Google Cloud Platform(GCP) service provided by Google<br/>
application server: Apache Tomcat<br/>

> ![image](https://user-images.githubusercontent.com/36053501/50541416-343ae200-0bae-11e9-8926-1e9c04020e54.png)
 

# Service Deployment and Monitoring
## Log file

# Conclusion and Discussion


# Bonus Zone
## Design Patterns
## Service Monitoring


# APPENDIX
## Documentation for API Endpoints :

        Team3/PalScanControllerApi.md
      
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
