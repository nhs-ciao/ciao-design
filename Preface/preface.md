# Preface
## About This Book
This book is about CIAO – Care Integration and Orchestration - free open source software that allows care ICT systems to route, transform and work flow information between themselves and NHS England national care ICT services.

To be more precise CIAO is a library of free open source pre-built and tested Care Integration Patterns (CIPs) installable on a Linux platform for specific routing, transformation and work flow tasks. CIPs are packaged as Docker images so they can be easily deployed, configured and composed.

CIAO is also a development kit providing guidance and base code libraries for developing new CIPs.

CIAO originated as an open source project by a group of technologists; Adam Hatherly, Mike Kelly, Richard Dobson and Iestyn Evans, at the Health and Social Care Information Centre, UK. Open source projects are often poorly documented; therefore it was decided early on to write CIAO the Book as the definitive source of information about the project.         

## Who Should Read This Book
For decision makers who decide on IT strategy, technology and product choices this book provides an overview of what problems CIAO seeks to solve and CIAO’s approach.

For architects who take an enterprise or solution level view of integration this book details the CIAO architecture and the library of developed CIPs.
  
For developers who want to design, build and test new CIPs or adapt existing ones this book gives guidance on software development.

For system administrators who want to deploy, operate and manage CIPs this book provides operational instructions.

## Navigating This Book
This book is divided into four parts.

**Part one** provides an introduction to CIAO and describes the architecture CIAO is built on.

**Part two** is the Care Integration Pattern catalogue. This contains detailed information for each of the individual CIPs developed by HSCIC. It also provides some examples of composing these CIPs into applications to solve specific care integration problems.

**Part three** gives instructions on how to deploy and run CIPs on the Linux platform.

**Part four** provides guidance on how to; design, code and test new CIPs.

## Conventions Used in This Book
The following typographical conventions are used in this book:

*Italic* - Indicates new terms, URLs, email addresses, filenames, and file extensions.

`Constant width` - Used for program listings, as well as within paragraphs to refer to program elements such as variable or function names, databases, data types, environment variables, statements, and keywords.

**`Constant width bold`** - Shows commands or other text that should be typed literally by the user.

`*Constant width italic*` - Shows text that should be replaced with user-supplied values or by values determined by context.

## Downloads
The CIAO source code for the software components developed by HSCIC can be found in the public repositories on GitHub at:

https://github.com/nhs-ciao 

Jenkins is used as the continuous integration server to build the latest CIAO binaries for the software components developed by HSCIC. The binaries can be found at:

http://hcdn-build1.cloudapp.net/view/CIAO/  

[This may change to an non-Azure URL]

To find a binary:
*	select a project
*	select workspace
*	select target
*	select binary file (.jar, .tar.gz or .zip) to download

Docker images for the CIPs developed by HSCIC and additional Docker images for supporting services packaged for CIAO can be found on Docker Hub at:

https://hub.docker.com/u/hscic/ 

## Further Reading
Haloi, S. Apache ZooKeeper Essentials. Packt Publishing, 2015.

Hochstein, L. Ansible: Up and Running. O'Reilly Media, 2015.

Ibsen, C. & Anstey, J. Camel in Action. Manning Publications, 2010.

Newman, S. Building Microservices. O'Reilly Media, 2015.

Snyder, B., Bosanac, D. & Davies, R. ActiveMQ in Action. Manning Publications, 2011.

## Acknowledgments
The authors would like to thank the dragons in the internal HSCIC Innovation competition dragons den; Andy Williams, Tom Denwood, Beverley Bryant and [etal] for launching CIAO by choosing it as an innovation winner. Hopefully Beverley the lads have indeed “cracked on” as you requested.

Without the resources secured by Peter Counter moving CIAO from idea to working code would not have been possible.

We would also like to thank all our colleagues at HSCIC who have directly or indirectly contributed to CIAO. We would particularly like to thank; Marcus Fearnett, [etal]

## About the Cover Illustration
The cover illustration is from the specialist cancer care centre at University College London Hospital, England. In the Entrance hall a huge installation hangs from the ceiling with objects of significance in a variety of shapes and sizes; an apposite metaphor for the current state of ICT integration within the care and health sector.
