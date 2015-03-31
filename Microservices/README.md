# Microservices

Talk about how CIPs are realised as microservices.
Although there are no agreed definitions around microservices, need to provide some
context and show how the CIP key architectural principles map to it.

Talk about what containers (in the generic sense) are. So would cover traditional
application servers, EJB, OSGi, Spring(?) and the newer LXC (Linux Containers) (Docker and Rocket).
Need to carefully explain how containers relate to machines/VMs. Talk about models of
deploying microservices to containers. Define our model, explain advantages and disadvantages:
* Container = LXC aka Docker
* Microservice = Linux application
* Each microservice is packaged and deployed in a single container
