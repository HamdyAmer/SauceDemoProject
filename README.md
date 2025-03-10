Test Automation Framework
This is a Page Object Model (POM) based test automation framework built using Selenium WebDriver, Page Factory, and TestNG. It is designed to provide a scalable, maintainable, and reusable structure for automating web application tests. The framework externalizes test data using a properties file, ensuring flexibility and ease of configuration.
Framework Overview
The framework follows the Page Object Model (POM) design pattern, which separates test logic from page-specific logic. It uses Page Factory to initialize web elements, making the code cleaner and more maintainable. Test data is managed through a properties file, allowing for easy configuration and data-driven testing.
Key Features
1.	Page Object Model (POM):
o	Each page in the application has a corresponding class containing web elements and methods to interact with them.
o	Promotes reusability and maintainability by centralizing page-specific logic.
2.	Page Factory:
o	Uses @FindBy annotations to initialize web elements, reducing boilerplate code.
o	Ensures lazy initialization of elements, improving performance.
3.	Externalized Test Data:
o	Test data (e.g., URL, credentials) is stored in a properties file, making it easy to modify without changing the code.
4.	TestNG Integration:
o	Supports test case management, parallel execution, and reporting.
o	Provides annotations for setup, teardown, and test execution.
5.	Scalable and Modular:
o	New pages and test cases can be added easily without affecting existing code.
o	Encourages best practices in test automation.
How It Works
1.	Page Classes:
o	Each page class represents a page in the application.
o	Web elements are defined using @FindBy annotations.
o	Methods are created to perform actions on the web elements.
2.	Test Cases:
o	Test classes contain test methods that use the page classes to interact with the application.
o	Test data is fetched from the properties file using the Config.Properties utility.
3.	Properties File:
o	Stores key-value pairs for test data (e.g., URLs, credentials).
o	Accessed by the Config.Properties  class to provide data to the tests.
4.	Test Execution:
o	TestNG annotations are used to manage test execution, setup, and teardown.
o	WebDriver is initialized before each test and closed after each test.
