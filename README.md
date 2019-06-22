# springboot_docker_test

#Docker 
>Docker is an open source project that automates the deployment of software application inside container

#Docker image 
>docker images

#check the container lists
>docker ps -a

#Bulid the project 
>docker build -f Dockerfile -t springboot_docker_test .

#Run the docker project
>docker run -p 8080:8080 springboot_docker_test

#Remove the docker repository
>docker rmi <repository_id>

#Conatiner lists
>docker container ls

#Stop the container
>docker container stop <container_id>

>docker stop <container_id>

#Start the container
>docker container start <container_id>

>docker start <container_id>

#Remove the container
>docker container rm <container_id>

>docker rm <container_id>

#Check the logs
>docker container logs -f <container-id>
