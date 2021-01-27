# Spring-Boot-Elastic-Starter
starter spring boot elastic project

## Setup Instructions
1. Clone the repository
1. Start a local elasticsearch instance
1. Upload the supplied books.json file to your cluster with the supplied shell script
> bash upload.sh
1. Open the BrainsSpringElastic directory with an ide (tested on intellij)
1. Run the project

## Usage
1. To search book by title
> localhost:8080/book/title/{insert_title_here}
1. To search book by author
> localhost:8080/book/author/{author_name_here}

### Credits
1. [Data books.csv](https://gist.github.com/jaidevd/23aef12e9bf56c618c41)
1. [Spring boot elasticsearch tutorial pratik das](https://reflectoring.io/spring-boot-elasticsearch/)
1. [Java-Techie-jt spring boot elasticsearch tutorial](https://github.com/Java-Techie-jt/spring-boot-elasticsearch-queryDSL)
1. [TechPrimers](https://github.com/TechPrimers/spring-data-elastic-example-1)

### Notes
1. the csv file was converted to json by convert.py
1. this project uses spring data elasticsearch high level rest api 
