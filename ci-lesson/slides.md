# Basic CI/CD Pipeline with GitHub Actions
### Automate Testing and Deployment Easily

---

## What is CI/CD?

---

**Continuous Integration (CI):**
- Merges code changes frequently into a shared repository.
- Automates testing and validation.

---

**Continuous Deployment/Delivery (CD):**
- Deploys code automatically to production or staging environments.

---



![](images/butwhy.jpg)


---

### Before CI/CD:

- Developers worked in silos for months.
- Manual code integration caused "integration hell."
- Delayed feedback on bugs.
- Unpredictable release timelines.

---

### After CI/CD:

- Early bug detection.
- Faster feedback cycles.
- Reliable and repeatable builds.

---


## What are GitHub Actions?

GitHub's automation tool for:
- **Testing:** Automate tests on code changes.
- **Building:** Run build scripts automatically.
- **Deploying:** Push validated code to staging or production.

---

## Basic Workflow YAML Example

```yaml
name: CI Pipeline

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v3

      - name: Set up Java
        uses: actions/setup-java@v3
        with:
          distribution: "temurin"
          java-version: "17"
          cache: "maven"

      - name: Build and test with Maven
        run: mvn clean verify
```

---

## Hands-On: Create Your First Workflow

- Go to your repository.
- Create a `.github/workflows/ci.yml` file.
- Paste the example workflow YAML.
- Push code to trigger the pipeline.

---

## Real-World Benefits of CI/CD

- For Developers:
  - Saves time by automating repetitive tasks.
  - Ensures higher quality code.
- For Teams:
  - Enhances collaboration and transparency.
  - Makes deployments predictable and reliable.

---

## Deployment in CI/CD:
1. **Build Phase:** Prepare the application for deployment.
2. **Deploy Phase:** Publish the built application to a server or hosting platform.

---

## Deployment Example: GitHub Pages

We'll deploy our Java application's docs to **GitHub Pages** as a static HTML site.

1. Add a build step to package your app into a static format.
2. Use a GitHub Action to push the build output to the `gh-pages` branch.

---

```yaml
# Step 4: Generate Documentation (Example Output)
      - name: Generate docs
        run: mvn javadoc:javadoc

      # Step 5: Deploy to GitHub Pages
      - name: Deploy to GitHub Pages
        uses: peaceiris/actions-gh-pages@v3
        with:
          personal_token: ${{ secrets.GITHUB_TOKEN }}
          publish_dir: ./target/reports/apidocs
```

---

Now, this workflow:
- Generates documentation (or build artifacts) to be deployed.
- Deploys the generated content to the gh-pages branch, which serves the content on GitHub Pages.

---

## Viewing the Deployment
- Navigate to your repository's Settings > Pages.
- Set the source branch to gh-pages.
- Access your deployed site at
`https://<your-username>.github.io/<repository-name>/`

---

## Questions?