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

#### 5. className
**Syntax:** `driver.findElements(By.className("class-name"));`

#### 6. tagName
**Syntax:** `driver.findElements(By.tagName("Tag-Name"));`

### CSS Selectors
**Syntax:**	`driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");`  '#' represents Id

**Syntax:** `driver.findElement(By.cssSelector("input.form_input[id=user-name]")).sendKeys("standard_user");`

**Here 'input' represents TagName, '.' represents class name, '#' '[id=user-name]' represents attribute with value

### Xpath Locators
** 1. Absolute or Full Xpath** Starts with '/' 

**Syntax:** `/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]`

** Not Recommanded as using complete element address from starting point to till element.**

** 2. Relative or Partial Xpath** Starts with '//'

### Relative Xpath Options

1. or
**Syntax:** `//tagname[@(attribute)='value' or @(attribute='value')]`

**Example** `driver.findElement(By.xpath("//*[@class='classInfo' or @type='attType']"));`

Returns WebElementt if atleast one of the attribute is correct 

2. and

**Syntax:** `//tagname[@(attribute)='value' and @(attribute='value')]`

**Example** `driver.findElement(By.xpath("//*[@class='classInfo' and @type='attType']"));`

Returns WebElementt when both the attribute is correct 

3. contains()

**Syntax:** `//tagname[contains@(attribute),'value'];`

Returns WebElement if attribute is containing the value

4. starts-with()

**Syntax:** `//tagname[starts-with@(attribute),'value'];`

Returns WebElement if starting with the given value (@(attribute), 'value'))  

5. text()

**Syntax:** `//tagname[text()='TextValue']

6. chained Xpath

**Syntax:** `//tagname[text()='TextValue']//tagname[@attribute='value']

### Xpath-Axes Locators

Xpath axes are those axes that are used to search for the multiple nodes in the XML documents from the current node context.

These methods are mainly used when the web element is not identified with the help of ID, name, class name, link text, and Css selectors.

#### Xpath Axes 

**Self **

** Parent **

** Child **

** Ancestor **

** Descendant **

** Following **

** Following-sibling **

** Preceding **

** Preceding-sibling **