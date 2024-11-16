# Basic CI/CD Pipeline with GitHub Actions

## Lesson Overview :pencil2:

In this lesson, we will explore the fundamentals of Continuous Integration and
Continuous Deployment (CI/CD) and how to implement a basic pipeline using
GitHub Actions.
We’ll discuss the history and evolution of Software Engineering as a field,
highlighting the challenges of older approaches and the benefits of CI/CD

<br>  <!-- don't remove -->

## Learning Objectives :notebook:

By the end of this lesson, you will be able to:

1. Define CI/CD and explain its importance in modern software development.
1. Identify the core components and features of GitHub Actions.
1. Create a basic GitHub Actions workflow to automate the testing or build process.
1. Configure triggers, jobs, and steps in a GitHub Actions pipeline.

<br>

## Key Definitions and Examples :key:

### History of CI: Why It’s Needed in Modern Software Development

#### The Old Ways: Traditional Development  
- **Description:**  
  In traditional software development workflows, teams often worked in silos.
  Developers built features in isolation over weeks or months without integrating
  their code. Integration happened only at the end of the development cycle.

  While softwares can be tightly specified and designed, those specifications
  will eventually leave some room for ambiguity and interpretation, sometimes
  without even the developers noticing. If two different developers are working
  on parts of the project that will eventually interact with each other, they
  they may accidentally make assumptions about the other's work that are not
  true.

- **Challenges of Traditional Approaches:**  
  1. **Integration Hell:** When teams finally attempted to merge their work,
    they often encountered massive conflicts, which required extensive effort to resolve.  
  2. **Delayed Feedback:** Bugs weren’t discovered until much later in the process,
    increasing the cost and effort to fix them.  
  3. **Unpredictable Releases:** Since integration and testing were done manually,
    release timelines were often missed due to unforeseen issues.  

In short - developing code in isolation without regular integration and testing
makes the feedback loop quite big. This in itself trickles down into the overall
time budget of the project. Furthermore, this approach creates additional
problems of its own.

#### Enter Continuous Integration  
- **Definition:**  
  Continuous Integration introduced the practice of merging all developers'
  changes into a shared repository multiple times a day,
  followed by automated testing to identify issues early.  

- **Advantages:**  
  1. **Early Bug Detection:** Developers receive early feedback on their changes.  
  2. **Improved Collaboration:** Regular integration encourages teamwork and prevents siloed work.  
  3. **Reliable Builds:** Frequent automated builds ensure a deployable product is always available.

  In short, when contrasted with the older model, a structure based on CI/CD
  practices allows for a more predictable and reliable development process.

#### Example: Traditional vs. Modern CI Workflow  
**Traditional Workflow:**  
1. Teams work separately for months.  
2. Code is merged manually, resulting in integration conflicts.  
3. Testing is delayed until the end, often leading to major rework.  

**Modern CI Workflow:**  
1. Developers push code changes daily.  
2. Changes are automatically tested and integrated into the main branch.  
3. Teams resolve issues incrementally, maintaining steady progress.  

### CI/CD

Continuous Integration (CI) refers to the practice of automatically integrating
code changes into a shared repository, followed by automated testing.

Continuous Deployment (CD) extends this process by automatically deploying
validated changes to production environments.

The key in both of them is automation - all of this is done automatically, without
human intervention. Once a CI/CD pipeline is set up, it will run automatically
under some conditions, such as a new commit to the repository, a new Pull Request,
or a new release.

Different companies and projects may use different CI/CD pipelines and triggers,
but the fundamental idea is the same - automate the process of integrating, testing,
and deploying code changes.

<br>  <!-- don't remove -->

#### Example

Imagine a team working on a Java application. Each time a developer pushes code
to a feature branch, the CI/CD pipeline does the following:

1. Runs unit tests to ensure the new code doesn’t break existing functionality.  
2. Builds the application into a deployable artifact.  
3. Optionally deploys the changes to a staging or production server.

And finally, once the branch is merged into the main branch, the pipeline runs
again to ensure the changes are still valid. In some cases, the pipeline may
require that the branch is up-to-date with the main branch before merging,
so that the integration is as smooth as possible.

Notice how testing - and automated testing at that - is a key part of the CI/CD.
Without a reliable test suite, it would be impossible to ensure that the changes
made to the codebase are safe to deploy.

### GitHub Actions

CI and CD pipelines must be executed _somewhere_. Normally a server. There are
many different ways to setup this and we can even do manually, using shell scripts
and other forms of custom automation.

GitHub Actions is an automation tool integrated into GitHub repositories.
It enables users to create workflows triggered by events like `push`, `pull_request`,
or scheduled tasks like daily or weekly.
Workflows are defined using YAML files and consist of jobs
that execute steps to perform specific tasks.  

<br>  <!-- don't remove -->

#### Concept 2 Example

[🚨 to be removed, only for SME eyes🚨 - start]
[*Provide a practical example or code demonstration for Concept 2. Make sure the example reinforces the associated learning objectives.*]
[🚨 to be removed, only for SME eyes🚨 - end]

<br>  <!-- don't remove -->

<!-- Continue adding concepts and examples as needed -->

## Additional Resources :clipboard: 

If you would like to study these concepts before the class or would benefit from some remedial studying, please utilize the resources below:

- [External resource 1](link-to-external-resource-1)
- [External resource 2](link-to-external-resource-2)
