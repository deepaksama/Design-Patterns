# Chain Of Responsibility Design Pattern

### Intent
>	Avoid coupling the sender of a request to its receiver by giving morethan on objects a chance to handle the request.  Chain the receiving object and pass the request along the chain until an object handles it.

### UML Diagram
![Chain Of Responsibility UML Diagram](https://github.com/deepaksama/Images/blob/master/DesignPatterns/chain_of_responsibility.png)  

#### Client :  Initiates the request to a  Concrete Handler object in chain

#### Handler: 
... Defines an interface for handling request
... Implements successor link (optional)

#### Concrete Handler: 
... * Handles requests it is responsible for.
... * Can access its successor
... * If Concrete handler can handle the request , it does so; otherwise it forwards the request to its successor.

### Applicability

#### When to use

	* You want to issue a request to one of several object without specifying the receiver exactly ( Decouple sender of request from receiver or handler of request)

	* The set of objects that can handle request need to be specified dynamically.

### Consequences


Chain of responsibility has following benefits and liabilities:
* Reduced Coupling : 
This pattern frees an object from knowing which object handles the request. Both receiver and sender have no explicit knowledge of each other. Objects in the chain does not have to know about the chain structure. As a result, instead of objects maintaining reference to all candidate receivers, they keep a single reference to their successor.
* Added Flexibility in assigning responsibilities to objects: 
Chain of responsibility gives added flexibility in distributing responsibilities among objects. We can add or change responsibilities for handling requests by adding new objects to chain or changing the chain at runtime
* Receipt is not guaranteed: 
Since a request has no explicit receiver, there is no guarantee that it'll be handled. The request can fall off the end of the chain without ever being handled. A request can go unhandled when the chain is not configured properly.

### Implementation

* Connecting successor 

	In case if there are no pre-existing links for defining the chain, we'll have to introduce them ourselves.   In this case Handler not only defines  interface for requests, but also provides the default implementation that forwards the request to successor .  If the ConcreteHandler subclass is not interested in the request, it doesn't have to override the forwarding operation.

* Representing request:
	There are different options available for representing request
** Each request is a hardcoded operation invocation.  
		Advantage : Convenience and safe.
		Disadvantage : We can forward only fixed set of requests that Handler defines.
** Use handler function that takes request code as parameter.
**** Advantage : Supports open-ended set of requests.
**** Disadvantage: 
**** Sender and Receiver agree on how the request should be encoded.  
**** Requires conditional statements for dispatching the request based on code
**** There is no type-safe way to pass parameter. 
**** Use separate request objects for each request to bundle request parameters.  A request class can represent request explicitly, and new kinds of requests can be defined by sub classing the Request class.  Subclass can define different parameters.  Each Handler must know the kind of request to which it can handle.   To identify the request, Request can define an accessor function that returns an identifier for the class.  Alternatively, the receiver can use RTTI (Runtime Type Identification) , if the implementation language supports it.

