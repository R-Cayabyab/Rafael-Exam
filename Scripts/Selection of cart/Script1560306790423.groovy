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

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/a_Hello Sign in  Account  List (1)'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/span_Sign in (2)'))

WebUI.setText(findTestObject('Page_Amazon Sign In/input_Email (phone for mobile'), 'spk.ralph@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Amazon Sign In/input_Forgot your password_pas'), 'TYHl+L7WH80WnAtMQvCx7Q==')

WebUI.click(findTestObject('Page_Amazon Sign In/input_Enter your password_sign'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for/span_Cart'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/span_Sign Out'))

WebUI.closeBrowser()
