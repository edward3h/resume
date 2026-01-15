---
lang: en
title: Edward Harman
subtitle: Metro Boston, MA
mainfont: Aptos, Calibri, Arial, sans-serif
maxwidth: 50rem
backgroundcolor: lightgrey
linkcolor: rgb(0, 0, 238)
header-includes: |
  <style>
  .subtitle {
    font-weight: bold;
  }
  header {
    margin-bottom: 1em;
  }
  body {
    background-color: white;
    hyphens: none;
    text-align: justify;
  position: relative;
  }
  .title {
  margin-top: 0.7em;
  }
  h2 {
    color: #0F4761;
  }
  h2, h4, .center {
    text-align: center;
  }
  table {
    display: table;
    margin: 1em auto;
    width: auto;
  }
  th, tbody {
    border: 0;
  }
  #buttons {
  position: absolute;
  top:0.5rem;
  right:0.5rem;
  }
  #buttons p {
  margin:0;
  }
  #buttons a {
  display: inline-block;
  padding: 0.5rem;
  background-color: lightgrey;
  margin-right: 0.5rem;
  }
  h5 {
  margin: 0.8em 0;
  font-style: normal;
  }
  h6 {
  margin: 0.2em 0 0;
  font-style: normal;
  font-weight: bold;
  }
  @media print {
      html {
        background-color: white;
      }
        body {
  font-size:0.85em;
        margin: 0;
        padding: 0;
        }
  h1,h2,h3,h4,h5,h6 {
  page-break-after: avoid;
  }
  ul {
  page-break-inside: avoid;
  }
  #buttons {
  display:none;
  }
  }
  @page {
    size: letter;
  }
  </style>
...

---

:::{.if FORMAT=html}
<div id="buttons">
[Download PDF](Edward_Harman_Resume.pdf)
[Download docx](Edward_Harman_Resume.docx)
</div>
:::

:::{.if FORMAT=docx}
edward@ethelred.org`<w:r><w:tab/></w:r>`{=openxml}[linkedin.com/in/edwardharman](https://www.linkedin.com/in/edwardharman/)`<w:r><w:tab/></w:r>`{=openxml}[github.com/edward3h](https://github.com/edward3h)
:::

:::{.if FORMAT=html}
:::center
[edward@ethelred.org](mailto:edward+resume@ethelred.org) |
[linkedin.com/in/edwardharman](https://www.linkedin.com/in/edwardharman/) |
[github.com/edward3h](https://github.com/edward3h)
:::
:::

## Principal Software Engineer

#### Delivering innovative software through best practices, automation, & mentorship.

Accomplished Software Engineer with deep expertise across the full software stack, specializing in building maintainable, reliable applications.
Dedicated to reducing development friction through automation, robust testing, and continuous integration, ensuring seamless delivery pipelines.
Excited about mentoring developers, fostering best practices, and advocating for informed technical decision-making to elevate team capabilities.
Committed to continuous learning and sharing emerging technologies to drive innovation and operational excellence.

:::{.list-table header-rows=0 widths=1,1,1}
* * Web application development
  * High-scale concurrent services
  * Java expert
  
* * Build Tools & Automated testing
  * Continuous Integration
  * Microservices Architecture

* * Code Reviews & Mentorship
  * Cloud-native Development
  * Infrastructure As Code
:::

## Technical Skills

:::{.list-table widths=1,4 header-rows=0 header-cols=1 aligns=l,l}
* - Languages
  - Java, SQL, Bash, Javascript, Typescript, Groovy, Ruby

* - Frameworks
  - Spring Boot, Micronaut, Rails, React, Svelte

* - Build tools
  - Gradle, Gitlab CI, GitHub Actions, AWS CDK, OpenRewrite

* - Platforms
  - Linux, Docker, AWS, Postgres
:::

## Professional Experience

### Tripadvisor, Needham, MA

##### *Principal Software Engineer* 2025
##### *Senior Software Engineer* 2008 - 2025

Full-stack engineer for a popular travel website. Many contributions over a long tenure.

###### Build Tooling & Developer Productivity

* Designed and maintained Gradle build pipelines that fully codified project setup, eliminating manual steps and reducing onboarding errors.
* Built custom Gradle plugins to enforce company-wide code style, dependency standards, and build conventions, improving consistency and reducing low-value code review feedback.
* Developed internal test and build tools that reduced iteration time on the team’s primary service by several minutes per cycle, significantly improving feedback loops.

###### Technical Leadership & Knowledge Sharing

* Steered technical book groups (e.g. Effective Java), contextualizing best practices for company systems and constraints.
* Delivered internal presentations on external technologies and in-house tooling, to share knowledge.
* Conducted thorough code reviews emphasizing education, maintainability, and long-term system health.

###### Cloud & Platform Engineering

* Migrated legacy back-office jobs to AWS, improving scalability and operational reliability. AWS CDK Pipeline, Docker, AWS Batch.
* Contributed to cross-team planning and execution of microservice migrations to AWS, identifying risks, dependencies, and success metrics. Spring Boot on AWS ECS.
* Refactored legacy systems incrementally to modern architectures without service disruption.

###### High-Scale Backend Systems

* Developed and maintained a highly concurrent hotel meta-search service processing over 1B rate requests per day.

###### Product & Cross-Team Collaboration

* Unblocked maintainability of a widely used internal application, by migrating from Rails to a modern microservice platform with React frontend.
* Planned and led a company-wide project migrating the source-of-truth for foreign exchange rates to a new database and AWS service, guiding and assisting dozens of teams.

## Additional Experience

### Virtue Fusion Ltd, London, UK - *Java Developer*

### Ciber UK Ltd, London, UK - *Consultant*

## Education

**Bachelor of Arts (BA)**, *Maths and Computer Science*\
University of Cambridge, Cambridge, UK

## Open Source

A contributor and maintainer of [jte: Java Template Engine](https://jte.gg/).

*Updated {{FORMATTED_DATE}}*