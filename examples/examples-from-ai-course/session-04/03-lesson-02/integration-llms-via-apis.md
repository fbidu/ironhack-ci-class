<!-- # Integrating LLMs via APIs -->

## Lesson Overview :pencil2:

This lesson will delve into the world of Application Programming Interfaces (APIs), focusing on their crucial role in integrating Large Language Models (LLMs) like OpenAI's GPT into web applications. Participants will learn how to select a suitable LLM API for their specific project needs, craft API requests, and effectively handle responses within a Flask application. The session will combine theoretical knowledge with practical exercises, showcasing real-world examples of API calls and response processing.

<br>  <!-- don't remove -->

## Learning Objectives :notebook:

By the end of this lesson, you will be able to:

1. Understand the concept of APIs and their significance in integrating LLMs into applications.
2. Choose an appropriate LLM API for a given project requirement.
3. Learn the mechanics of sending API requests and processing the responses within a Flask framework.

<br>

## Key Definitions and Examples :key:

### API (Application Programming Interface)

An API is a set of rules and protocols that allows different software applications to communicate with each other. It defines the methods and data formats for requesting and exchanging information between systems, enabling them to share functions and data in a secure, reliable manner.

<br>  <!-- don't remove -->

**API Example**:

For instance, when a web application needs to fetch user data from a server, it sends an API request to the server's API endpoint. The server processes the request and sends back the data in a structured format, typically JSON, which the application can then use.

```python
import requests

response = requests.get('https://api.example.com/users/123')
print(response.json())
```

<br>  <!-- don't remove -->

### REST (Representational State Transfer):

REST is an architectural style for designing networked applications. It relies on stateless, client-server communication, typically using HTTP. RESTful APIs use standard HTTP methods like GET, POST, PUT, and DELETE.

<br>  <!-- don't remove -->

### Endpoint:

In the context of APIs, an endpoint is a specific URL where an API can be accessed. It represents a specific function or resource available in the API.

<br>  <!-- don't remove -->

### JSON (JavaScript Object Notation):

JSON is a lightweight data-interchange format that's easy for humans to read and write and easy for machines to parse and generate. It's commonly used for transmitting data in web applications between clients and servers.

<br>  <!-- don't remove -->

### How to choose an appropiate LLM API for a given project requirement?

1. **Define Project Needs:**
Identify the specific tasks (e.g., content generation, summarization) and performance requirements. Consider scalability based on expected traffic.

2. **Research API Capabilities:**
Look into various LLM APIs (like OpenAI's GPT, Google's BERT) to find one that matches your use case. Check for language support and model capabilities relevant to your project.

3. **Consider Costs and Limits:**
Evaluate the pricing model against your budget and understand any rate limits or quotas that could affect your application.

4. **Assess Integration and Support:**
Ensure the API integrates smoothly with your tech stack. Good documentation and an active developer community are invaluable for support.

5. **Test and Prototype:**
Use trials or sandbox environments to prototype with the API. Real-world testing helps assess the API's effectiveness for your needs.

6. **Review Legal and Ethical Aspects:**
Ensure the API complies with relevant data privacy laws and has adequate content filtering to prevent generating inappropriate outputs.

<br>  <!-- don't remove -->

#### Example of how to choose an appropriate LLM API for a given project requirement

1. **Define Project Needs:**
For a chat application, you need an LLM API capable of understanding context, maintaining conversational flow, and generating human-like responses. The application should scale to accommodate potentially high user interaction volumes.

2. **Research API Capabilities:**
OpenAI offers GPT-3, known for its advanced natural language understanding and generation capabilities, making it suitable for conversational AI. It supports multiple languages and offers various models tailored to different tasks, including chat.

3. **Consider Costs and Limits:**
OpenAI's pricing model is based on the number of tokens processed. For a chat application, you'll need to estimate the volume of text interactions to understand potential costs. OpenAI also imposes rate limits, which are important to consider for ensuring your application can handle user demand.

4. **Assess Integration and Support:**
OpenAI provides extensive documentation and SDKs for popular programming languages, facilitating integration. The active developer community and official forums can provide additional support and insights.

5. **Test and Prototype:**
You can use OpenAI's playground or trial options to test GPT-3 with typical chat scenarios your application might encounter. This helps in assessing the API's conversational capabilities, response quality, and latency.

6. **Review Legal and Ethical Aspects:**
Ensure compliance with data privacy laws, especially if your chat application handles sensitive information. OpenAI provides content moderation tools to help filter and control the output, aligning with ethical use standards.

<br>

### OpenAi API requests examples in flask

Follow the instructions on the [Open AI - API - Quickstart](https://platform.openai.com/docs/quickstart?context=python) to get your token.

1. Flask Application Setup.

    Create a new Flask application. In your _app.py_ file, import Flask and the OpenAI client, and initialize your Flask app and OpenAI client with your API key.

    ```python
    from flask import Flask, request, render_template
    from openai import OpenAI

    app = Flask(__name__)
    client = OpenAI(
        api_key=os.environ.get("OPEN_AI_API_KEY")
    )

    @app.route('/')
    def index():
        return render_template('index.html')
    ```
<br>

2. Create a Flask route for OpenAI Requests.

    Add a new route to your Flask application that handles form submissions where users can input their requests. This route will use the OpenAI client to send the request and retrieve the response.

    ```python
    @app.route('/ask', methods=['POST'])
    def ask():
        user_input = request.form['user_input']  # Get user input from the form

        completion = client.chat.completions.create(
            model="gpt-3.5-turbo",
            messages=[
                {"role": "system", "content": "You are a poetic assistant, skilled in explaining complex programming concepts with creative flair."},
                {"role": "user", "content": user_input}
            ]
        )

        response_message = completion.choices[0].message  # Extract the response
        return render_template('response.html', response=response_message)  # Render a template to display the response
    ```

<br>

## Additional Resources :clipboard: 

If you would like to study these concepts before the class or would benefit from some remedial studying, please utilize the resources below:

- [Open AI - API - Quickstart](https://platform.openai.com/docs/quickstart?context=python)
- [Whats an API](https://www.okta.com/blog/2020/10/api-application-programming-interface/)
