import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/span_Sign in (4)'))

WebUI.setText(findTestObject('Page_Amazon Sign In/input_Email (phone for mobile'), 'spk.ralph@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Amazon Sign In/input_Forgot your password_pas'), 'TYHl+L7WH80WnAtMQvCx7Q==')

WebUI.click(findTestObject('Page_Amazon Sign In/input_Enter your password_sign'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/a_Computers  Accessories_a-lin'))

WebUI.click(findTestObject('Object Repository/Page_International Shopping Shop Co/img_NETWORKING PRODUCTS_acs_ti'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Networking Products/img_Include Out of Stock_s-ima'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Roku Express  Easy/div_proceed_to_checkout text h'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Roku Express  Easy/span_Orders_nav-cart-icon nav-'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/input_This order contains a gi'))

WebUI.click(findTestObject('Object Repository/Page_Enter the shipping address for/input_Add Another Address_ship'))

WebUI.closeBrowser()

