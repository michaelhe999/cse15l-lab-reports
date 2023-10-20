# Lab Report 2

## Part 1

### `StringServer` code:
![Image](StringServer_Code.png)

### First `/add-message`
![Image](StringServerRunning1.png)

* Which methods in your code are called?
  
  The `handleRequest` method is called. 
* What are the relevant arguments to those methods, and the values of any relevant fields of the class?
  
  The argument of the `handleRequest` method is the URI `url`, and the field in the class is the `ArrayList` variable `added`. This stores all the messages added with `/add-message`. There are also important variables in the method, like the String `returns` which outputs the values added, and the array `parameters`, which takes in the query after the path and splits it into the `s` and the value added. 
* How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.
  
  The ArrayList `added` goes from being empty to having a new element at index 0, `skdjf`. Other variables are not fields because they do not belong to the overall class. 

### Second `/add-message`
![Image](StringServerRunning2.png)

* Which methods in your code are called?
  
  The `handleRequest` method is called. 
* What are the relevant arguments to those methods, and the values of any relevant fields of the class?
  
  The argument of the `handleRequest` method is the URI `url`, and the field in the class is the `ArrayList` variable `added`. This stores all the messages added with `/add-message`. There are also important variables in the method, like the String `returns` which outputs the values added, and the array `parameters`, which takes in the query after the path and splits it into the `s` and the value added. 
* How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.
  
  The ArrayList `added` goes from having one element at index 0 to having 2 elements, `skdjf` and `kesdhdfi2`. Other variables are not fields because they do not belong to the overall class.

## Part 2

### Path to private key
![Image](SSHPrivateKeyPath.png)

### Path to public key
![Image](SSHPublicKeyPath.png)

### SSH login with no password: 
![Image](SSHNoPassword.png)

## Part 3

While most of the topics covered in Week 2 were topics I learned before, this week I learned how you can use commands to make it so that a your personal computer can access a remote shell without need to enter a password every time. I think this is very interesting because I used to be very into RSA encryption. While the public key is still encrypted, I think it's interesting that from the public key, you can figure out the private key. 
