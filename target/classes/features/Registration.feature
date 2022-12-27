@smoke
Feature: User can register to the website so that he could use the website's features

  Background:
    Given User is on the registration page

  Scenario Outline: User can register with valid data
    When User enters "<name>" in the name field
    And User enters "<email>" in the email field
    And User enters "<password>" in the password field
    And User enters "<mobile>" in the mobile field
    And User clicks on register button
    Then User should be redirected to the OTP page
    Examples:
      |name|email|password|mobile|
      |Test    |TestTG22@test2.com     |Test123456789        |565105599      |

  Scenario Outline: User can't register with invalid data
    When User enters "<name>" in the name field
    And User enters "<email>" in the email field
    And User enters "<password>" in the password field
    And User enters "<mobile>" in the mobile field
    And User clicks on register button
    Then "<error>" message should appear
    Examples:
      |name|email|password|mobile|error|
      |    |TestTG@error.com     |Test123456789        |565105599      | الاسم مطلوب.     |
      |test    |     |Test123456789        |565105599      | البريد الالكتروني مطلوب.     |
      |test    |TestTG@error.com     |        |565105599      |  كلمة المرور مطلوبة    |
      |test    |TestTG@error.com     |Test123456789        |      |  رقم الجوال مطلوب.    |
      |test    |TestTG2.com     |Test123456789        |565105599      | يجب كتابة البريد الإلكتروني بشكل صحيح     |
      |test    |TestTG3@error.com     |Test123456789        |565105599      | البريد الإلكتروني مستخدم من قبل.     |
      |test    |TestTG@error.com     |12345        |565105599      |  كلمة المرور يجب ان تحتوي على 8 حروف أو ارقام على الأقل     |
      |test    |TestTG@error.com     |Test123456789        |554431      |  رقم الجوال يجب ان يحتوي على 8 أرقام على الأقل     |