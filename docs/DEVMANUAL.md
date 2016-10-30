# Developer Manual

## Version Control

Make sure you have Git installed on your computer. To check if you already have it use this command: 
```
git --version
```
If you don't have Git installed you can download it here: [https://git-scm.com/downloads.](https://git-scm.com/downloads)

Now that you have Git up and running on your computer you can fork the repository to your account and clone it to your computer.

The repository is located here: [https://github.com/salinnhanse/TicTacToe.](https://github.com/salinnhanse/TicTacToe)

Once you have forked it you can copy the clone link and use this command:
```
git clone <the clone link from the forked repository>
```
Now you have the repository on your machine.

## Building the project

In order to be able to build the project a java developement kit is necessary.

Check your java version using:
```
java -version
```
And if you don't have a development kit you can download it using these commands:
```
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk
```
Now you should have java installed and are ready to build.

## Build scripts

Use this to get rid of all build artifacts:
```
bin/clean
```
Use this to compile all .java files:
```
bin/compile
```
Use this to create a .jar file, move it to a temporary folder and then run it:
```
bin/deploy
```
Use this to build and run the program:
```
bin/run
```
Use this to create a .jar file and run it.
```
bin/runjar
```
Use this to run all test cases and display their status:
```
bin/test
```