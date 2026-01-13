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
    max-width: 75%;
  }
  .spread {
    display: flex;
    justify-content: space-between;
  }
  .spread div {
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
      table {
        max-width: 90%;
      }
        body {
  font-size:0.85em;
        margin: 0;
        padding: 0;
        }
  h1,h2,h3,h4,h5,h6 {
  page-break-after: avoid;
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
[edward@ethelred.org](edward+resume@ethelred.org) |
[linkedin.com/in/edwardharman](https://www.linkedin.com/in/edwardharman/) |
[github.com/edward3h](https://github.com/edward3h)
:::
:::

## Principal Software Engineer

#### End-To-End Software Delivery | Reducing Development Friction | Mentoring Developers

Expertise across the software stack: front-end, back-end, microservices, back-office.
Focus on build tools, automated testing, continuous integration.
Teach best practice by example, with code reviews and presentations.
Advocate for informed decisions.
Insatiable appetite for learning and sharing new technology.

:::{.list-table header-rows=0 widths=1,1}
* * * Web application development
    * High-scale concurrent services
    * Java expert
  * * Automated testing
    * Continuous Integration
    * Programming mentor
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

##### *Principal Software Engineer* - March 2025 - November 2025
##### *Senior Software Engineer* - March 2008 - March 2025

Full-stack engineer for a popular travel website. Many contributions over a long tenure.

###### Build Tooling & Developer Productivity
* Designed and maintained Gradle build pipelines that fully codified project setup, eliminating manual steps and reducing onboarding errors.
* Built custom Gradle plugins to enforce company-wide code style, dependency standards, and build conventions, improving consistency and reducing low-value code review feedback.
* Developed internal test and build tools that reduced iteration time on the team’s primary service by several minutes per cycle, significantly improving developer feedback loops.

###### Technical Leadership & Knowledge Sharing
* Led technical book groups (e.g., Effective Java), contextualizing best practices for company systems and constraints.
* Delivered internal presentations on external technologies and in-house tooling.
* Conducted thorough code reviews emphasizing education, maintainability, and long-term system health. 

###### Cloud & Platform Engineering
* Migrated legacy back-office jobs to AWS, improving scalability and operational reliability. AWS CDK Pipeline, Docker, AWS Batch.
* Contributed to cross-team planning and execution of microservice migrations to AWS, identifying risks, dependencies, and success metrics. Spring Boot on AWS ECS.
* Refactored legacy systems incrementally to modern architectures without service disruption.

###### High-Scale Backend Systems
* Developed and maintained a highly concurrent hotel meta-search service processing over 1B rate requests per day to external partners.
* Focused on performance, reliability, and observability in production systems.

###### Product & Cross-Team Collaboration
* Built internal tools used by account managers to support partner operations.
* Participated in cross-team design reviews to evaluate architecture decisions, surface risks, and define success metrics.
* Coordinated a legacy data migration that impacted 20+ services across 5+ teams.

## Additional Experience

### Virtue Fusion Ltd, London, UK - *Java Developer*

### Ciber UK Ltd, London, UK - *Consultant*

## Education

**Bachelor of Arts (BA)**, *Maths and Computer Science*\
University of Cambridge, Cambridge, UK

## Open Source

A contributor and maintainer of [jte: Java Template Engine](https://jte.gg/).

*Updated {{FORMATTED_DATE}}*