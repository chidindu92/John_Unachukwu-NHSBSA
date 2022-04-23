Feature:
  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Background:
    Given I am accessing the CheckerTool from <Browser Type>
      |chrome|
      And I click next to start
      And I select my country of <Residence> and click next
      |wales|

  @smoke
  Scenario: As a single person above 18years, who claims tax benefit, also has access to paid universal credit, LCW and take-home above £935
    When I select the location of my <GP Practice> and click next
      |no|
    And I select the Country of <Dental Practice> and click next
      |England|
    And I enter my <Day><Month><Year> of birth and click next
      |15 |7    |1996|
    And I select my <Relationship Status> and click next
      |no|
    And I select <Tax Credit> option and click next
      |yes|
    And I select if I get paid <Universal Credit> and click next
      |yes|
    And I select <Liability> option for my universal credit and click next
      |yes|
    And I select if my <Take-Home> pay for my last universal credit period is 935 or less
      |yes|
    Then I should be able to see if I can get the <Treatment> I need
      |You get help with NHS costs|






