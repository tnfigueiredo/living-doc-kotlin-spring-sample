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
and pending features to be implemented. So it is taken in consideration that it is like a sprint development, following a 
prioritized backlog for a small product.

Taking this previous description in consideration, here follows a class diagram to bring an idea of the domain model for the
project. In this domain it is possible to consider as main business concepts: departments, courses, and students. Those 
domain concepts will be mapped as the epics for this project, and they will be the criteria for the user stories classification.

![cached image](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/tnfigueiredo/living-doc-kotlin-spring-sample/master/docs/myfictitious-course-center-domain.puml)

Here comes the point where it is proposed for developing the features a possible BDD approach. The stories that join the sprint had 
its business scope and technical definition discussed, and the first step is to create the Gherkin readme.md and feature files 
to allow the description of the acceptance criteria test cases. Due to the acceptance criteria test cases defined in the 
Gherkin files, in the application test scope it is necessary to create the test case classes with pending implementation. 
The expected result in the end of the feature implementation is the software feature developed, and tested. Before bring an 
example related to this it could be interesting to take a look in the application use cases that will be the source of information 
to the user stories.

### User Stories for the sample scenario

To have a summary of the business rules related to the domain areas it is possible to propose a set of propositions to help 
describe a set os use cases scope:

- There are 4 possible user types: DEPARTMENT_ADMIN, DEPARTMENT_OFFICER, STUDENT, TEACHER.
- The DEPARTMENT_ADMIN profile can manage department information.
- The DEPARTMENT_ADMIN and DEPARTMENT_OFFICER profiles can manage students information.
- The DEPARTMENT_ADMIN and DEPARTMENT_OFFICER profiles use reports to have information of courses by departments.
- The STUDENT, DEPARTMENT_ADMIN and DEPARTMENT_OFFICER profiles use reports to have information about a student grades by course.
- The DEPARTMENT_ADMIN and DEPARTMENT_OFFICER profiles can create and deactivate courses.
- The STUDENT profile can request to join a course.
- The STUDENT profile can request to cancel a course participation.
- The STUDENT, DEPARTMENT_ADMIN and DEPARTMENT_OFFICER profiles can use a report to check the courses a student is enrolled.

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