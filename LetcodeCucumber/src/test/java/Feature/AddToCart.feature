Feature: Book Cart Application Demo to add a Book

  @Reg
  Scenario Outline: Add a product to a cart
    Given User should navigate to the application for add a book to the cart
    And User should enter the "<UserName>" and "<Password>"
    And User search a "<Book>"
    When User add a book to cart
    Then the cart badge should be updated

    Examples: 
      | UserName | Password | Book                        |
      | ortoni   | pass1234 | Marriage of Inconvenience   |
      | testuser | Test@123 | All the Light We Cannot See |

    @Dev
    Examples: 
      | UserName | Password | Book            |
      | ortoni   | pass1234 | The Art of Life |
