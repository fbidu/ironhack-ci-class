<!-- # From Prototype to Powerhouse: Building the Base with Flask -->

## Lesson Overview :pencil2:

This lesson introduces the fundamentals of web application development using the Flask framework, a lightweight and flexible Python web framework perfect for rapid prototyping and building scalable web applications. Participants will learn the basics of Flask, including its installation, setting up a basic application, and routing to different pages. The lesson will highlight Flask's advantages for quick development and easy integration of web APIs, making it an ideal choice for developers looking to bring their projects from concept to reality efficiently.

<br>  <!-- don't remove -->

## Learning Objectives :notebook:

By the end of this lesson, you will be able to:

1. Understand the principles of web application development and the role of Flask within this domain.
2. Install Flask and the necessary libraries in your preferred development environment.
3. Construct a basic Flask application and establish routing for various pages.
<br>

## Key Definitions and Examples :key:

### Principles of web development.

1. **Client-Server Architecture:** Web applications operate on a client-server model where the client (browser) sends requests to the server, which processes them and returns a response. This separation ensures a scalable and manageable application structure.
2. **Layered System:** Modern web applications are built in layers—presentation (front-end), business logic (back-end), and data storage—each responsible for specific aspects of the application, promoting modularity and maintainability.
3. **Statelessness:** HTTP, the underlying protocol of the web, is stateless, meaning each request-response cycle is independent. Web applications often implement sessions and cookies to maintain user state across multiple requests.
4. **Security:** Security is paramount, with practices like data encryption, user authentication, and authorization being central to protecting user data and ensuring application integrity.
5. **Scalability and Performance:** Efficient handling of user requests, optimizing resources, and minimizing response times are crucial for maintaining a good user experience as the application grows.
6. **Responsive Design:** Web applications must be accessible and usable across various devices and screen sizes, necessitating responsive design practices.
7. **RESTful Services:** Many web applications follow REST (Representational State Transfer) principles for designing networked applications, focusing on stateless communication and resource-based URLs.

<br>

### Flask

Flask is a micro web framework written in Python, known for its simplicity, flexibility, and fine-grained control. It's termed a "micro" framework because it does not require particular tools or libraries. However, it supports extensions that can add application features as if they were implemented in Flask itself.

<br>

[Link to flask documentation](https://flask.palletsprojects.com/en/3.0.x/)

<br>

#### Flask's Role in Web Development

- **Simplicity and Flexibility:** Flask's minimalistic and unopinionated nature allows developers to start quickly and choose the tools and libraries that best fit their project needs, making it ideal for both beginners and experienced developers.
- **Rapid Prototyping:** Flask's ease of setup and straightforward syntax make it an excellent choice for rapid prototyping, enabling developers to bring ideas to life quickly and iterate on them.
- **Scalable and Extendable:** While Flask is lightweight, it can be scaled up with extensions and customizations to build more complex applications, from APIs to full-fledged web applications.
- **Community Support:** Flask boasts a strong and supportive community, along with extensive documentation, making it easier to solve problems and find best practices.
- **Integration and Development:** Flask seamlessly integrates with various front-end technologies and databases, making it a versatile back-end choice for full-stack development.


### Installing Flask

We will be using docker and poetry to work with Flask. We have left a repository so it's really easy to replicate the installations.

**Requirements:**

- Install [docker](https://www.docker.com/).
    - Install [docker desktop](https://www.docker.com/products/docker-desktop/)
- Install [poetry](https://python-poetry.org/).
    - Add poetry to your shell's path if needed.

In the repository flask-docker-app you already have the initial foundation to install flask and start looking at it. 

<br>  <!-- don't remove -->

## Additional Resources :clipboard: 

If you would like to study these concepts before the class or would benefit from some remedial studying, please utilize the resources below:

- [Flask Tutorial](https://flask.palletsprojects.com/en/3.0.x/tutorial/)
- [Docker 101](https://docker-curriculum.com/#introduction)
