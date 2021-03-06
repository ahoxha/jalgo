# The `jalgo` Library
Contains implementations of various algorithms.

## How to build the project?

After cloning the repository, CD into the project's folder and type:

`./gradlew build` -- using gradle wrapper (no need to have gradle installed)

## How to run the tests?

CD into the project's folder and type:

`./gradlew test`

You can see the **test results** in the `{project_folder}/build/reports/tests/test/index.html` file.


## Code coverage

I've used the `jacoco` gradle plugin to run the code coverage analysis. 

**To run the code coverage task**

CD into the project's folder, then type `./gradlew build jacocoTestReport`. 
You can see the **code coverage results** in the `{project_folder}/build/reports/jacoco/test/html/index.html` file.


## How to make it an Eclipse/IntelliJ IDEA project and continue working on it?

CD into the project directory and type:

`./gradlew eclise` for Eclipse

`./gradlew idea` for IntelliJ IDEA

Then you can import it into your corresponding IDE.



