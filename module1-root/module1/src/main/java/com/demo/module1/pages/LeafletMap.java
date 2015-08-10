package com.demo.module1.pages;

import org.apache.tapestry5.annotations.AfterRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

public class LeafletMap {
    @Inject
    private JavaScriptSupport javaScriptSupport;
    @AfterRender
    void showMap() {
        javaScriptSupport.require("map/leafletmap").invoke("init");
    }
}