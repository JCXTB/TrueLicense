package com.example.demo;

import com.example.demo.license.LicenseVerify;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrueLicenseApplicationTests {
    private LicenseVerify licenseVerify;

    @Autowired
    public void setLicenseVerify(LicenseVerify licenseVerify) {
        this.licenseVerify = licenseVerify;
    }

    @Test
    void contextLoads() {
        System.out.println("licese是否有效：" + licenseVerify.verify());
    }
}
