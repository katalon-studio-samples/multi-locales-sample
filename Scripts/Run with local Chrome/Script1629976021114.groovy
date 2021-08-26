import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Map prefs = ["intl.accept_languages": locale]

RunConfiguration.setWebDriverPreferencesProperty("prefs", prefs)

WebUI.openBrowser('google.com')

WebUI.delay(5)

WebUI.closeBrowser()

