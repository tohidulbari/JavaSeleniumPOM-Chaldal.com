package Tests;
import Base.Base;

import Pages.ChaldalProfileSettings;
import org.testng.annotations.Test;

public class ChaldalSettingsTest extends Base {

    @Test
    public void ChaldalProfile_settings() throws InterruptedException {

        ChaldalProfileSettings chaldalProfileSettings = homePage.proSettings();
        chaldalProfileSettings.setLogfInBtn();
        chaldalProfileSettings.setLoggInBtn();
        chaldalProfileSettings.setEmailId();
        chaldalProfileSettings.setPassWord();
        chaldalProfileSettings.setLogInBtn();
        chaldalProfileSettings.setProfileSetting();
        chaldalProfileSettings.setClkOrder();
        chaldalProfileSettings.setClkPayment();
        chaldalProfileSettings.setClkChangePass();


    }

}
