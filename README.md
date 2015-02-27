# ciao Design
This is a repository to share and discuss the architecture and design of ciao.
This is a repository for those interested in contributing to the development of ciao.
This will form the basis for all documentation about ciao, and much of this content may be reproduced on the developer network, or elsewhere once complete.
For an introduction to ciao, please see the [ciao pages on the developer network](http://developer.nhs.uk/library/interoperability/ciao-care-integration-orchestration/)


# Part 1 Introduction

## [Say Hello to CIAO](./HelloCIAO/)
Succinct definition of what CIAO is and what it isn’t.
This should enable a reader to quickly understand what CIAO is.

## [CIAO Objectives](./Objectives/)
This should paint a picture of the current health and social care landscape in terms of health economies organisation, processes and supporting IT systems. The economic and social drivers on these health economies and the subsequent requirements placed on the supporting IT systems. Why current IT systems are failing to meet these requirements and what needs to be done, with a focus on the integration space. Quick survey of integration market – generic commercial and open source middleware, care specific commercial and open source middleware – to position CIAO. Outline the advantages (benefits) of CIAO and also any disadvantages (costs) also.
This chapter should enable a reader to understand why they might want to use CIAO.

## [Using CIAO](./UsingCIAO/)
This should outline the various types of professionals who might want to use CIAO, and signposts what they need to understand about CIAO to help them use it and where to find that information in the book. Possible professionals are:
•	Decision Makers – decide on IT strategy, technology and product choices
•	Architects – want to take an enterprise or solution level view of integration 
•	Developers – want to design, build and test new CIPs or adapt existing ones
•	System Administrators – want to deploy, operate and manage CIPs
This chapter should enable a reader to understand how they might use CIAO.

## [User Stories](./UserStories/)
This will be a set of user stories that have driven the requirements for CIAO.

# Part 2 Architecture

## [Care Integration Patterns](./CIPArchitecture/)
Explain the concept of a CIP. Define the key architectural principles CIPs implement and explain why. These will include:
* Interface Contracts – standard public interface definitions.
* Dependency Injection – just through configuration e.g. say a CIP needs to persist data to a message queue; then the location and name of that message queue would be a configuration item that is loaded at run time.
* Configuration Management - managing the configuration for CIPs
* Monitoring and management – being able to see what the CIP is doing (has done) and provide some external control over at least its lifecycle, but possibly its internal behaviour. Done through interface contracts.
* Diagnostics – essentially being able to ask a CIP to self-test itself. Done through interface contracts.

## [Composing CIPs](./ComposingCIPs/)
Being able to wire together different CIPs without the CIPs individually needing to be aware.

## [Microservices](./Microservices/)
Talk about how CIPs are realised as microservices. Although there are no agreed definitions around microservices, need to provide some context and show how the CIP key architectural principles map to it.

## [Containers](./Containers/)
Talk about what containers (in the generic sense) are. So would cover traditional application servers, EJB, OSGi, Spring(?) and the newer LXC (Linux Containers) (Docker and Rocket). Need to carefully explain how containers relate to machines/VMs. Talk about models of deploying microservices to containers. Define our model, explain advantages and disadvantages:
* Container = LXC aka Docker
* Microservice = Linux application
* Each microservice is packaged and deployed in a single container

## [Clouds](./Clouds/)
Our containers are deployed to essentially a cloud of real machines or VMs. Talk about the key issues to address at the cloud level (may not be able to actually provide answers for some of these yet as this is the bleeding edge of containers). These will include:
* Deployment of containers
* Configuration of containers
* Monitoring and management of containers
* Scalability and resilience of containers – this is around having multiple instances of the same container with load balancing in front, and having run policies e.g. I want 5 instances of this container operational at any one time
* Security – this is perimeter security in and out of the cloud, not necessary at the container to container level – although this is up for debate
* Composing/wiring containers together
Define our model and explain advantages and disadvantage. This may include going for Kubernetes (though Docker are rolling their own).

## [Technology Stack](./TechnologyStack/)
Define our technology stack at the levels of cloud, container and CIP. Some of the technology choice is mandatory, for example at the cloud level the OS must be some flavour of Linux, and others could be recommendations.

## [Architecture Blueprint](./ArchitectureBlueprint/)
Pull everything together from previous architecture chapters into some architecture views. Where we have specific products (e.g. Docker, Kubernetes) incorporate them into the views.

# Part 3 Design

## [Design Principles](./DesignPrinciples/)
Talk about the key design principles that should be used when designing a new CIP and how to apply them at the code level, also any patterns or conventions. Also talk about initially assessing if a candidate CIP needs disaggregating into separate independent CIPs. Illustrate with our exemplar CIP (:-) suggest we use this as a single example that is carried through the rest of the text).

## [Design Methods and Tools](./DesignMethods/)
Talk about useful design methods and tools to use.

## [Design Outputs](./DesignOutputs/)
Talk about the design outputs – illustrate with exemplar CIP.

# Part 4 Build

## [Environments and Tools](./BuildEnvironments/)
Talk about setting up environments based on our technology stack (this will be covered in Part 5, so maybe pointers to there).
Talk about development and testing tools.
Talk about source control and also container control (Docker Hub)

## [Testing](./Testing/)
Talk about unit testing etc. Illustrate with exemplar CIP.

## [Development](./Development/)
Talk about the actual coding. Illustrate with exemplar CIP.

## [Contribution](./Contribution/)
Talk about contributing both the source code and the container as open source – the how. Talk about documentation. Talk about the CIAO Hub – need something that people can go to discover what CIPs are out there, and somewhere developers can signpost their new CIP (this could be just a section of nhs developer network or whatever). 

## [Assurance](./Assurance/)
Talk about when a CIP needs some sort of assurance (or accreditation), who does this, what it is, where this gets recorded.

# Part 5 Run

## [Deploying the Cloud](./CloudDeployment/)
A cloud can vary from a single machine to many. Talk about installing and configuring the full portfolio of infrastructure software e.g. OS, Docker, Kubernetes, system tools etc. Illustrate with an example deployment.

## [Operating the Cloud](./CloudOperations/)
Talk about system management of the cloud infrastructure. Illustrate with an example deployment.

## [Deploying CIPs](./CIPDeployment/)
Talk about installing and configuring CIPs. Illustrate with an example cloud deployment and exemplar CIP. Talk about assurance.
Talk about alternate methods of using CIPs:
* In alternate containers (OSGi - Apache Service Mix)
* Embedded in an existing Java application

## [Operating CIPs](./CIPOperations/)
Talk about system management of CIPs. Illustrate with an example cloud deployment and exemplar CIP.

# Part 6 CIP Catalogue

This will include chapters on each CIP, indicating the status of each: proposed, development, test, complete.

[Open Catalogue](./CIPCatalogue/)
