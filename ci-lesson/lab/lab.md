### **Lab: Building and Deploying a Calculator Web API with CI/CD**

---

#### **Lab Overview**
In this lab, students will build a Java-based RESTful API for a calculator app, integrate it with a CI/CD pipeline using GitHub Actions, and deploy it to a hosting platform (e.g., GitHub Pages or Heroku). The lab spans multiple days, with each day focusing on a specific phase of the project. By the end of the lab, students will have a fully functional and deployed web API with an automated CI/CD workflow.

---

#### **Lab Goals**
1. Reinforce concepts of CI/CD and GitHub Actions.
2. Gain hands-on experience with building, testing, and deploying a Java application.
3. Collaborate effectively in small groups to complete a project.

---

### **Lab Structure**

#### **Phase 1: Setting Up the Project (Day 1)**

- **Objective:** Create the foundational structure for the calculator app.
- **Tasks:**
  1. Set up a new Maven project with the necessary dependencies:
     - Spring Boot for creating a RESTful API.
     - JUnit 5 for testing.
  2. Implement basic arithmetic operations (`add`, `subtract`, `multiply`, `divide`) in the `Calculator` class.
  3. Write unit tests for these operations using JUnit.

- **Starter Code:**
  - Provide a skeleton Maven project structure.
  - Include a partially implemented `Calculator` class.

- **Deliverables:**
  - A local Maven project with implemented arithmetic operations and passing unit tests.

---

#### **Phase 2: Creating the RESTful API (Day 2)**

- **Objective:** Build a RESTful API to expose calculator operations as endpoints.
- **Tasks:**
  1. Create a Spring Boot application.
  2. Define endpoints for the following operations:
     - `GET /add?a=5&b=3` → Returns the sum of `a` and `b`.
     - `GET /subtract?a=5&b=3` → Returns the difference of `a` and `b`.
     - `GET /multiply?a=5&b=3` → Returns the product of `a` and `b`.
     - `GET /divide?a=5&b=3` → Returns the quotient of `a` and `b`.
  3. Write integration tests for the API endpoints using Spring Boot's test framework.

- **Starter Code:**
  - Provide a basic Spring Boot application configuration.
  - Include starter files for the API controller.

- **Deliverables:**
  - A functional RESTful API running locally.
  - All endpoints return correct results with passing integration tests.

---

#### **Phase 3: Integrating CI/CD (Day 3)**

- **Objective:** Set up a CI/CD pipeline with GitHub Actions.
- **Tasks:**
  1. Write a GitHub Actions workflow (`.github/workflows/ci.yml`) that:
     - Runs unit and integration tests on every `push` to `main`.
     - Builds the application.
  2. Verify the pipeline by pushing changes and confirming the workflow runs successfully.

- **Starter Code:**
  - Provide a template GitHub Actions workflow file with placeholders for steps.

- **Deliverables:**
  - A repository with a functional CI pipeline that runs tests and builds the project.

---

#### **Phase 4: Deployment (Day 4)**

- **Objective:** Deploy the API to a hosting platform (e.g., Heroku or a containerized local environment).
- **Tasks:**
  1. Configure the Spring Boot application for deployment.
     - Set up necessary properties in `application.yml`.
  2. Deploy the application:
     - Use Heroku's Maven plugin for deployment, or containerize the app and run it locally.
  3. Add a GitHub Actions step to deploy the application automatically after a successful build.

- **Starter Code:**
  - Provide instructions and necessary configuration files for Heroku or Docker.

- **Deliverables:**
  - A live, deployed calculator API accessible via a public URL.

---

#### **Phase 5: Code Review and Documentation (Day 5)**

- **Objective:** Document the project and review the workflow.
- **Tasks:**
  1. Write a `README.md` file that includes:
     - Project overview.
     - Instructions for running the app locally.
     - API endpoint details.
  2. Conduct a group review:
     - Each group presents their pipeline, deployment, and challenges faced.

- **Deliverables:**
  - A repository with a clear `README.md`.
  - Feedback and discussion notes from the group review.

---

### **Lab Organization**
- **Group Work (Recommended):** Groups of 2-3 students.
- **Submission Requirements:**
  - A GitHub repository containing the complete project.
  - At least one group member should submit the repository link.
