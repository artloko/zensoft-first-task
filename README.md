# zensoft-first-task
The solution of the first testing task for a Java Developer at a [Zensoft.io](https://zensoft.io/)

The reason I chose **jsoup** library is that it is a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods.

We're getting document that represents html page, then extract needed data by different queries .

## Getting started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

  ### How to build
  Clone repository:
  ```
  git clone https://github.com/artloko/zensoft-first-task.git
  ```
  
  At a folder with the pom file:
  ```
  mvn clean package
  java -cp target/first-task-1.0-SNAPSHOT-jar-with-dependencies.jar Main
  ```
  
  ### Built with
  - [Maven](https://maven.apache.org/) - Dependency Management
  - [jsoup](https://jsoup.org/) -  Used to extract, and manipulate data stored in HTML documents
  
  ### Author
  - **Artyom Lobko** - [artloko](https://github.com/artloko)
