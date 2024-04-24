<!-- # From Prototype to Powerhouse: Building the Base with Flask -->

## Introduction :pencil2:

This activity will help you practice and assess the knowledge and skills you just learned. During a bootcamp, it's important to spend a lot of time practicing what you've learned. The exercises given to you are just the start. You will get the opportunity to practice more in labs and later, in projects.

We encourage you that once you finish the exercises on the Student Portal platform, try to find more challenges to work on online

**Note:** You are provided with solution to each exercise. The purpose of providing solutions to exercises is to allow you to compare your own work to see if you have a similar or correct approach.

It is not meant to be used as a way to cheat or copy the answers.

It is important to understand the reasoning behind the solution in order to improve your own understanding and problem-solving abilities.

<br>

## Introduction to Flask Templates Exercise

### Instructions

<br>

Learn about [Jinja2](https://codeburst.io/jinja-2-explained-in-5-minutes-88548486834e)

<br>

<details style="font-size: 14px; cursor: pointer; outline: none;">
<summary> Click for Solution </summary>

Read and understand the jinja 2 explanation

</details>

<br>

## Setting Up Your Templates Exercise

### Instructions

1. **Create a Templates Folder:** Inside your Flask application, create a folder named templates. Flask will look for templates in this directory by default.

2. **Create a Base Template:** Inside the templates folder, create an HTML file named base.html. This file will serve as your layout foundation and should include your HTML structure (<html>, <head>, <body>, etc.), links to CSS, and Jinja2 block tags for content that will change in child templates.

3. **Create a Child Template:** Create a new HTML file for your specific page, such as index.html, inside the templates folder. At the top of this file, use `{% extends 'base.html' %}` to inherit from the base template.

4. **Override Blocks:** Within index.html, override the blocks from base.html by redefining them. For example, place the HTML for your NLP prototype's form inside the `{% block content %}` that you defined in your base template.

5. **Modify Flask Routes:** In your `app.py`, import `render_template` from the Flask library.

6. **Render Templates:** Modify your view functions to return render_template('index.html') instead of a string, so that it renders your new index.html template when you navigate to the root URL.

<br>

<details style="font-size: 14px; cursor: pointer; outline: none;">
<summary> Click for Solution </summary>

The files are already on the flask-docker-app, change them so you can practice

</details>

<!-- keep adding as many as you find suitable -->


