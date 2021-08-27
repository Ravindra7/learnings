## Monolithic(Old form) or Microservices(New form)?

With the experience of more than 6 years in the Information Technology inductry here i will present which is the best among with monolithic or microservices.

### Points to Think of

- Is the application is mission critical
- Is the application needs very powerful database operation
- Is the application need frequent upgrades/patches
- Is the application is written with latest frameworks/Technologies available in market
- Is the applicaion interacts with multiple componets ( Having more integration points to be considered)

### One Application must follow
- Highly scalable
- Ad-hoc releases whenever required
- Updated with latest security patches
- Testable - with Aspect of the performing the regression
- Easily Upgradable

#### Monolithic Style
```
The Choice behind having an application might be that product having legacy history when the Microservice word itself was known but not mostly adopted by the industries.
Monolithic Style have all the components bundled together and are tightly coupled with each other
```
Consider as we have an online shopping application, where we have 
- User Interface
- Business Logic layes - we call it as Backend
  - Cart processing 
  - Checking out Item(s) from the cart
  - Payment gateway communication
  - etc etc
- Database - Which is accessed by Business layer to persisit the data which is required.

In above all the components are part of a single component where they can not run independently from each other.

![image](https://user-images.githubusercontent.com/6447414/131162226-ea93f281-8151-479a-9e5d-f1e7a9fb5617.png)


#### Microservices Style
```
As we have talked about monolithic above, this Microservices design as name suggest divided into multiple smaller componets where one service communicates with the other business service and then collectively they perform a tasks
```

Considering the same shopping application with Microservice way
- User Interface - Service
- Business Logic layer
  - Cart processing - Service
  - Checkout Item(s) - Service
  - Payment gateway communication - Service
  - etc etc ( depends on how much decouple you want your application to be)
- Database -  Service

![image](https://user-images.githubusercontent.com/6447414/131162337-6a2f1f21-4cb9-4257-8ba7-7d39bea63773.png)

### Which to choose when
#### Monolithic


#### Microservice

