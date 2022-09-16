# springboot-validation
**Validation API Request using annotation**
Prerequisite
1. You familiar implement spring boot app from scratch
2. You understand implementing validation requests, using a programmatic approach
3. Understand implementing globalException handler (if not you can check my previous tutorial, how to create global handler spring boot)


In the previous tutorial, i validate API request using a programmatic approach.
In this tutorial i will validation using annotation approach.

Purpose validation request using annotation?
1. simplicity of code
2. reduce boilerplate code
3. services layer focus on busines logic not validation 


Let's jump right in
1. open pom.xml and add validation dependency
2. open entity class which handle request
3. add validation using annotation in entity class
4. add @valid annotation in controller which handle request
5. open global handler and create method for check, that entity sent to server is valid
6. Delete all validation in service layer
7. try to run app
You can download this tutorial in my github
Happy learning and happy sharing!!!
