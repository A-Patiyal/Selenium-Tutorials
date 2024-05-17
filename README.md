# **Selenium WebDriver**
## **Selenium Components**
Selenium has 3 main components

### 1. **Selenium IDE**

The Selenium IDE is a browser extension that records and plays back a user’s actions.

A Chrome, Firefox and Edge add-on that will do simple record-and-playback of interactions with the browser.

### 2. **Selenium WebDriver**
 
 Collection of language specific bindings to drive a browser - the way it is meant to be driven.
 
**WebDriver drives a browser natively, as a user would, either locally or on a remote machine using the Selenium server, marks a leap forward in terms of browser automation.**
 
Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.


**Selenium WebDriver is a W3C Recommendation**

* WebDriver is designed as a simple and more concise programming interface.

* WebDriver is a compact object-oriented API.

* It drives the browser effectively.


### 3. **Selenium Grid**

Selenium Grid allows the execution of WebDriver scripts on remote machines by routing commands sent by the client to remote browser instances.

**Grid aims to:**

* Provide an easy way to run tests in parallel on multiple machines
* Allow testing on different browser versions
* Enable cross platform testing

## **WebDriver** 
* WebDriver is an API and protocol that defines a language-neutral interface for controlling the behaviour of web browsers.
* Each browser is backed by a specific WebDriver implementation, called a driver. 
* The driver is the component responsible for delegating down to the browser, and handles communication to and from Selenium and the browser 

## Locators in Selenium

### Basic Locators    
#### 1. Id
**Syntax:** `driver.findElement(By.id("id"));`

#### 2. Name
**Syntax:** `driver.findElement(By.name("name"));`

#### 3. LinkText
**Syntax:** `driver.findElement(By.linkText("Text"));`

#### 4. PartialLinkText
**Syntax:** `driver.findElement(By.partialLinkText("Partial Text"));`