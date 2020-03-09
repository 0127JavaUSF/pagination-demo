# Bean Validation
*Note: This is a Java Bean, not a Spring Bean*

## Standards Definitions
 JSR-303, JSR-380 define the Bean Validation standards

## How it works
These standards define annotations which can be used to provide rules for validation.
JSR-303 and 380 are just standards, however.  These standards must be implemented
to be used.  Hibernate provides an implementation called Hibernate Bean Validator
that is both 303 and 380 compliant. You already have Hibernate Bean Validator if
you're using Spring Boot and Spring ORM.

Validation can be automated and will result in ValidationException when validation
fails.  Using Bean Validation can save you tons of time writing custom validation
logic. 

You don't have to type this, Mason.