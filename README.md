# springboot_docker_test

#Docker 
Docker is an open source project that automates the deployment of software application inside container

#Docker image 
>docker images

#check the container lists
>docker ps -a

#Bulid the project 
>docker build -f Dockerfile -t springboot_docker_test .

#Run the docker project
>docker run -p 8080:8080 springboot_docker_test

#Remove the container
>docker rmi <container_id>

#Stop the docker image
>docker stop <image_id>

#Remove the docker image
>docker rm <image_id>
