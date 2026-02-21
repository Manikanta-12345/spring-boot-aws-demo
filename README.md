![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot.png)

Create VPC and Edit VPC settins and enable both as per below screenshot

![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-2.png)

Create subnets 
![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-3.png)

Create IGW
![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-4.png)

Attach IGW to VPC
![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-5.png)

Create Public Route Table
![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-6.png)

Edit Route table and add route with 0.0.0.0/0 pointing to IGW
![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-7.png)

Edit subnet associations and select subnets need public access
![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-8.png)

![image](https://github.com/Manikanta-12345/spring-boot-aws-demo/blob/master/screenshot/Screenshot-9.png)


✅ PHASE 3 — Create EC2 (Build Machine)

Launch EC2 in public subnet temporarily.

Install:

sudo yum update -y
sudo yum install java-17-amazon-corretto -y
sudo yum install git -y
sudo yum install maven -y
Clone your project:

git clone <repo>
cd project
mvn clean package
Move JAR:

sudo mkdir /opt/app
sudo mv target/demo.jar /opt/app/

✅ PHASE 4 — Create systemd Service (IMPORTANT)

Create:

sudo vi /etc/systemd/system/springboot.service
Add:

sudo tee /etc/systemd/system/springboot.service > /dev/null <<EOF
[Unit]
Description=Spring Boot App
After=network.target

[Service]
User=ec2-user
Group=ec2-user
Type=simple
WorkingDirectory=/opt/app
ExecStart=/usr/bin/java -Xms256m -Xmx512m -jar /opt/app/spring-ec2-web-0.0.1-SNAPSHOT.jar
SuccessExitStatus=143
Restart=always
RestartSec=5
LimitNOFILE=65536
StandardOutput=journal
StandardError=journal

[Install]
WantedBy=multi-user.target
EOF

Test:

curl localhost:8080/ip
If working ✅ continue.