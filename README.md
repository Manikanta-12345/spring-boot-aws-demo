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
