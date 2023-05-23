# living-doc-kotlin-spring-sample

This project is a sample using Kotlin, Cucumber, Serenity and Gradle to show some features for a BDD approach
to generate project business documentation into the SDLC (software development life cycle). The idea is to bring some 
light about the chance of though the product versions delivery make it possible to have the business explained according
to the testing validations done and the business requirements those validations are related to.

To make it possible it was created a fictitious business scenario for a course center to illustrate an example of 
this approach. Through the business definitions it proposes an organization of the topics similar to an Epic/User Stories
organization to describe the validation cases and business rules applied to it.

## The Business Scenario and Modeling

According to the mentioned idea, here is the fictitious scenario to help us to describe the living documentation approach. 
To make it closer to an ongoing project following an Agile SDLC, we are going to have features done, features in validation, 
and pending features to be implemented.

[//]: # (bring the SLDC flow)

### User Stories over the sample scenario

[//]: # (bring use cases and stories documented)

![cached image](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/tnfigueiredo/living-doc-kotlin-spring-sample/master/docs/myfictitious-course-center-domain.puml)

#### Departments use cases
![cached image](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/tnfigueiredo/living-doc-kotlin-spring-sample/master/docs/departments-use-cases.puml)

#### Courses use cases
![cached image](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/tnfigueiredo/living-doc-kotlin-spring-sample/master/docs/courses-use-cases.puml)

#### Students use cases

![cached image](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/tnfigueiredo/living-doc-kotlin-spring-sample/master/docs/students-use-cases.puml)

### Expected result over the documentation

[//]: # (mention the document structure)

The expected results is to have a separation of topics according to the project epics (Departments, Students, Courses). The project epics
will be the starting point to crate the user stories relates to those mapped use cases presented previously.

## Project configuration

[//]: # (Mention project dependencies and build configuration)

### Document files structure

[//]: # (Mention the Gherkin + test cases integration)
[//]: # (Show how to create readme files and gherkin files)

## Project build and report results

[//]: # (Show report structure)

## How to integrate living documentation in CI/CD Pipelines

[//]: # (Github actions example)
[//]: # (find somewhere to publish. best approach local docker contianer for the sample)

## How to bring value to your project with this approach

[//]: # (sprint flow and SLDC software deliverables include docs)

## References

[//]: # (show url references)