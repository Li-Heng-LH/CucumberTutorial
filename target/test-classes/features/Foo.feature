@FooTest
Feature: Foo Object Test

  Scenario: Cucumber can pick up complete Foo object
    Given createFoo
    |id | name | rate | sign | flag|
    | 0 | abc  | 3.45 | def  | true|
    | 1 | ccf  | 5.6  | ccx  |false|


  Scenario: Cucumber can pick up missing field Foo Object
    Given createIncompleteFoo
      |id | name |
      | 0 | abc  |
      | 1 | ccf  |

  @incompleteFoo
  Scenario: Cucumber can pick up missing field Foo Object
    Given createIncompleteFoo
      |id |
      | 0 |
      | 0 |

    @PersistObject
    Scenario: Object Persistence Test
      Given createIncompleteFoo
        |id | name |
        | 0 | abc  |
        | 1 | ccf  |
      When update
      Then shouldChange


