# Clouds

Our containers are deployed to essentially a cloud of real machines or VMs. Talk about the key issues to address at the cloud level (may not be able to actually provide answers for some of these yet as this is the bleeding edge of containers). These will include:
* Deployment of containers
* Configuration of containers
* Monitoring and management of containers
* Scalability and resilience of containers - this is around having multiple instances of the same container with load balancing in front, and having run policies e.g. I want 5 instances of this container operational at any one time
* Security - this is perimeter security in and out of the cloud, not necessary at the container to container level - although this is up for debate
* Composing/wiring containers together

Define our model and explain advantages and disadvantage. This may include going for Kubernetes (though Docker are rolling their own).
