package com.psv.selenide;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sergei on 13.09.2015.
 */
public class GoogleTest {

    @Test
    public void shouldOpenGoogle() throws Exception {
        open("http://google.com");

    }
}
