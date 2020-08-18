# Java Spring Web Server

This is a Web Server application. A Web Server is an application that receives HTTP requests and returns web pages. Spring is a framework that we use to write our web server. It implements a bunch of features that are common to all web servers so we can focus on the portions that unique to our application.

# Getting Started

Here, we have a basic "Hello World" web server. Fork this repository to quickly get your project set up with some starter code.

The server works out of the box, and allows you to send 2 requests:

- **/**: this is the home page of our website
- **/hello**: this is a sub page that you can navigate to

Below are instructions to get the server running using 2 possible methods.

## Via Command Line

Here are the steps to getting started via command line or terminal:

1. Run git clone on your repo and then `cd` into the root folder of your repo.

2. Run gradlew build to compile the application. (On Windows `.\gradlew build`, on Mac `./gradlew build`)

3. Run graldew bootRun to run the server (Windows `.\gradlew bootRun`, Mac `./gradlew bootRun`)

4. Open a browser and navigate to `http://localhost:8080/`. You should see a message that says "Get your greeting here".

5. Navigate to `http://localhost:8080/hello`. You should see "Hello, World!".

6. Navigate to `http://localhost:8080/hello?name=Bob`. You should see "Hello, Bob!". You can change Bob in the url to a different name, and it should change the displayed message.

That's it. You have a working website! Of course the hard part comes next -- building something unique and interesting! 