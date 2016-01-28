
# 2. Architecture
## 2.1. Microservices
TODO - Talk about how CIPs are realised as microservices. Although there are no agreed definitions around microservices, need to provide some context and show how the CIP key architectural principles map to it.   

## 2.2. Containers
TODO - Talk about what containers (in the generic sense) are. So would cover traditional application servers, EJB, OSGi, Spring(?) and the newer LXC (Linux Containers) (Docker and Rocket). Need to carefully explain how containers relate to machines/VMs. Talk about models of deploying microservices to containers. Define our model, explain advantages and disadvantages:
*	Container = LXC aka Docker
*	Microservice = Linux application
*	Each microservice is packaged and deployed in a single container

## 2.3. Care Integration Patterns
TODO - Explain the concept of a CIP. Define the key architectural principles CIPs implement and explain why. These will include:
*	Interface Contracts – standard public interface definitions.
*	Dependency Injection – just through configuration e.g. say a CIP needs to persist data to a message queue; then the location and name of that message queue would be a configuration item that is loaded at run time.
*	Monitoring and management – being able to see what the CIP is doing (has done) and provide some external control over at least its lifecycle, but possibly its internal behaviour. Done through interface contracts.
*	Diagnostics – essentially being able to ask a CIP to self-test itself. Done through interface contracts.
*	Composing – being able to wire together different CIPs without the CIPs individually needing to be aware.

## 2.4. Applications
TODO - Talk about composing CIPs into Care apps.

## 2.5. Clouds
TODO - Our containers are deployed to essentially a cloud of real machines or VMs. Talk about the key issues to address at the cloud level (may not be able to actually provide answers for some of these yet as this is the bleeding edge of containers). These will include:
*	Deployment of containers
*	Configuration of containers
*	Monitoring and management of containers
*	Scalability and resilience of containers – this is around having multiple instances of the same container with load balancing in front, and having run policies e.g. I want 5 instances of this container operational at any one time
*	Security – this is perimeter security in and out of the cloud, not necessary at the container to container level – although this is up for debate
*	Composing/wiring containers together
Define our model and explain advantages and disadvantage. This may include going for Kubernetes (though Docker are rolling their own).

## 2.6. Product and Technology Stack
CIAO uses a variety of open source products and technologies. These provide the supporting services and infrastructure needed to run and manage CIPs.

Figure 2.6-1 here.

### 2.6.1. Linux
CIAO needs to run on Linux to be able to use Docker. However as the CIPs are developed in Java they can be run as non-containerised programs on any operating system that provides a JVM. This will require you to find, deploy, configure and manage your own supporting services, rather than using those that have already been bundled with CIAO for use on Linux.

The version of Linux you use must meet the minimum requirements for Docker:

*	64-bit installation
*	kernel must be 3.10 at minimum
  
We are going to use Ubuntu 14.04 LTS (Trusty) for all our examples, but you can use any Linux distribution that meets the Docker requirements.

Each CIAO Linux host must have the following services and applications installed and running:

*	OpenSSH server
*	curl 
*	[etal]

CIAO assumes that all hosts within a CIAO cloud are connected together in a secure network environment, so that network access to and from the CIAO cloud is controlled, but that IP networking between hosts within the CIAO cloud is unrestricted. It is important that all hosts within the CIAO cloud have Internet access so they can connect to Docker Hub to pull down CIAO Docker images.

### 2.6.2. Docker
To use the CIPs packaged as Docker containers you have to install the Docker daemon (Docker Engine) on each Linux host that will be part of a CIAO cloud.

For installation instructions see:

https://docs.docker.com/installation/

For example for Ubuntu Trusty, add a new gpg key:

`$ sudo apt-key adv --keyserver hkp://pgp.mit.edu:80 -- recv-keys 58118E89F3A912897C070ADBF76221572C52609D`

Open the `/etc/apt/sources.list.d/docker.list` file in an editor. If the file doesn’t exist, create it. Add a single entry:

`deb https://apt.dockerproject.org/repo ubuntu-trusty main`

Save and close the `/etc/apt/sources.list.d/docker.list` file. Update the apt package index:

`$ sudo apt-get update`

Install Docker:

`$ sudo apt-get install docker-engine`

Verify Docker is installed correctly:

`$ sudo docker run hello-world`

This command downloads a test image and runs it in a container. When the container runs, it prints an informational message. Then, it exits.

If you are new to Docker, then you can find comprehensive documentation at:

https://docs.docker.com/ 

Some useful Docker commands to know are listed below.

To list all the Docker images on a host:

`$ sudo docker images`

To list all the Docker containers on a host:

`$ sudo docker ps –a`

To list all the running Docker containers on a host:

`$ sudo docker ps` 

To connect a new TTY to a running container:

`$ sudo docker exec –t –i {container name} /bin/bash`

To stop all Docker containers on a host:

`$ sudo docker stop $(sudo docker ps -q)`

To remove all Docker containers on a host:

`$ sudo docker rm $(sudo docker ps -a -q)`
   
To remove all Docker images on a host:

`$ sudo docker rmi $(sudo docker images -q)`


