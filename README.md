# 🚀 Selenium 4 Automation Framework

A **Java-based Selenium 4 automation framework** designed to demonstrate modern web UI test automation practices, reusable framework components, and the latest capabilities introduced with **Selenium 4**.

This project focuses on building maintainable and scalable UI automation using **Selenium WebDriver, Java, TestNG, Maven, and Page Object Model (POM)** principles.

---

## 📌 Overview

This framework is created to explore and implement **Selenium 4 WebDriver features** while following a structured automation framework design.

The goal is to move beyond writing individual Selenium scripts and build a reusable automation foundation that can support:

* 🔹 Maintainable test automation
* 🔹 Reusable WebDriver utilities
* 🔹 Page Object Model
* 🔹 TestNG-based test execution
* 🔹 Maven-based dependency management
* 🔹 Cross-browser automation
* 🔹 Selenium 4 WebDriver capabilities
* 🔹 Clean separation of test, page, and utility layers

---

## 🛠️ Tech Stack

| Technology                | Purpose                              |
| ------------------------- | ------------------------------------ |
| ☕ **Java**                | Programming language                 |
| 🧪 **Selenium 4**         | Web UI automation                    |
| 🔬 **TestNG**             | Test execution and test organization |
| 📦 **Maven**              | Build & dependency management        |
| 🏗️ **Page Object Model** | Maintainable page automation design  |
| 🌐 **WebDriver**          | Browser automation                   |
| 🔧 **Git/GitHub**         | Version control                      |

---

## ✨ Key Areas Covered

### 🔹 Selenium 4 WebDriver

The framework demonstrates modern Selenium 4 APIs and WebDriver capabilities, including features introduced as part of the Selenium 4 upgrade.

Selenium 4 uses the **W3C WebDriver standard** as its underlying protocol.

### 🔹 Relative Locators

Selenium 4 provides relative locator strategies that allow elements to be located based on their relationship to other elements.

Examples include:

```java
above()
below()
toLeftOf()
toRightOf()
near()
```

These can be useful when traditional locator strategies are difficult to apply.

---

### 🔹 Multiple Windows & Tabs

The framework demonstrates Selenium 4's improved APIs for working with browser windows and tabs.

This allows automation flows to switch between browsing contexts while keeping the test code clean and readable.

---

### 🔹 Browser Options & Capabilities

Browser configuration is handled using Selenium's modern browser options APIs.

This provides a cleaner approach for configuring browser-specific behavior and capabilities.

---

### 🔹 Page Object Model

The framework follows the **Page Object Model (POM)** approach to separate:

```text
Test Logic
    ↓
Page Objects
    ↓
WebDriver / Selenium
    ↓
Browser
```

This improves:

* Maintainability
* Reusability
* Readability
* Locator management
* Test scalability

---

## 📂 Framework Structure

A typical structure of the automation framework follows a separation of responsibilities:

```text
Framework-using-Selenium4.0-Latest-Features
│
├── src
│   ├── main
│   │   └── java
│   │       └── ...
│   │
│   └── test
│       ├── java
│       │   └── ...
│       │
│       └── resources
│           └── ...
│
├── pom.xml
├── testng.xml
└── README.md
```

> The exact package structure may evolve as the framework is extended with additional automation capabilities.

---

## ⚙️ Prerequisites

Before running the framework, make sure you have:

* Java JDK installed
* Maven installed
* Git installed
* IntelliJ IDEA / Eclipse / another Java IDE
* A supported browser such as Chrome or Firefox

Verify Java:

```bash
java -version
```

Verify Maven:

```bash
mvn -version
```

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Kartikahalawat/Framework-using-Selenium4.0-Latest-Features.git
```

### 2️⃣ Navigate to the project

```bash
cd Framework-using-Selenium4.0-Latest-Features
```

### 3️⃣ Install dependencies

```bash
mvn clean install
```

### 4️⃣ Execute the tests

```bash
mvn test
```

You can also execute the configured TestNG suite directly from your IDE.

---

## 🧪 Test Execution Flow

The framework follows a simple automation flow:

```text
TestNG Test
     ↓
Test Class
     ↓
Page Object
     ↓
WebDriver
     ↓
Selenium 4 API
     ↓
Browser
     ↓
Validation / Assertion
```

This structure keeps test cases focused on **business flow and validation**, while reusable browser interactions remain within the framework/page layers.

---

## 🎯 Why This Project?

The purpose of this project is not just to automate browser actions, but to understand how a **real-world Selenium automation framework** can be structured.

The project demonstrates practical concepts around:

* Framework architecture
* Selenium WebDriver
* Selenium 4 APIs
* Page Object Model
* TestNG
* Maven
* Reusable automation components
* Browser automation
* Maintainable test design

---

## 📚 Selenium 4 Concepts

Some of the important Selenium 4 concepts explored through this project include:

* W3C WebDriver standard
* Relative Locators
* New window/tab handling
* Browser Options
* WebDriver APIs
* Modern synchronization approaches
* Selenium 4 migration concepts

Selenium's official upgrade documentation also highlights changes such as `Duration`-based timeout APIs in Java and the removal of legacy protocol behavior.

---

## 🔮 Future Enhancements

The framework can be further extended with:

* [ ] Parallel test execution
* [ ] Cross-browser execution
* [ ] Data-driven testing
* [ ] External test data management
* [ ] Extent/Allure reporting
* [ ] Screenshot capture on failure
* [ ] Logging
* [ ] Retry mechanism
* [ ] CI/CD integration with Jenkins
* [ ] Dockerized Selenium Grid
* [ ] API + UI automation integration

---

## 💡 Learning Outcomes

Through this project, the following SDET skills can be practiced:

```text
Java
  ↓
Selenium WebDriver
  ↓
Selenium 4
  ↓
Page Object Model
  ↓
TestNG
  ↓
Maven
  ↓
Automation Framework Design
  ↓
Scalable UI Test Automation
```

---

## 👨‍💻 Author

**Kartik Ahalawat**

SDET | Quality Engineering | Test Automation | Java | Selenium | Playwright | API Testing

---

## ⭐ Support

If you find this project useful for learning Selenium 4 and automation framework design, consider giving the repository a ⭐.
