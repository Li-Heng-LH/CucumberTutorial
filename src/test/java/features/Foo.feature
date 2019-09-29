@FooTest
Feature: Foo Object Test

  Scenario: Cucumber can pick up complete Foo object
    Given createFoo
    |id | name | rate | sign | flag|
    | 0 | abc  | 3.45 | def  | true|
    | 1 | ccf  | 5.6  | ccx  |false|


