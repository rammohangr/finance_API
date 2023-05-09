# FinanceAPI
FinanceAPI is a RestFul WebServices Project developed using Java, Spring-Boot, AngularJS, BootStrap, JavaScript, HTML5. It will consume Yahoo Finance Web Services to get stock details. User should enter Company Symbol to get stock details. 
## Clone the Repository
		git clone git@github.com:rajesh612/FinanceAPI.git
## Tools and Softwares Required
###### Spring Tool Suite 3.7.3.RELEASE
###### JDK 1.8
## Maven Dependencies for pom.xml
###### spring-boot-starter-web
###### spring-boot-starter-test
###### scala-library
## Application
#### FinanceApplication is a Spring Boot Application represented by @SpringBootApplication annotation. It is used to run the finance application.

## Controller 
#### FinanceController is represented by @Controller Annotation. It will use service methods to fetch stock details. Service Objects are used as Dependency Injection with @Autowired annotation.Controller will return data to browser.

## Service
#### FinanceService is represented by @Service annotation. Service method will invoke Yahoo Finance Web Service and return the data to Controller. 

## Steps to Run Finance App
- Run the project in STS using spring boot app.
- Open the browser and use url http://localhost:9080/finance.html
- Enter the company symbol and click search button to get stock details.

## References
- Yahoo Developer Network: https://developer.yahoo.com/yql/

- YQL Query: select * from csv where url='http://download.finance.yahoo.com/d/quotes.csv?s=YHOO,GOOG,AAPL&f=sl1d1t1c1ohgv&e=.csv' and    columns='symbol,price,date,time,change,previousClose,high,low,volume'

- Endpoint URL for JSON: https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20csv%20where%20url%3D'http%3A%2F%2Fdownload.fin   ance.yahoo.com%2Fd%2Fquotes.csv%3Fs%3DYHOO%26f%3Dsl1d1t1c1ohgv%26e%3D.csv'%20and%20columns%3D'symbol%2Cprice%2Cdate%2Ctime%2Cchange%2   CpreviousClose%2Chigh%2Clow%2Cvolume'&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys


