package com.demo.module1.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.RequestParameter;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;

import java.util.HashMap;


public class AjaxDemo {
    @Inject
    private AjaxResponseRenderer ajaxResponseRenderer;
    @Persist
    private HashMap<Long, String> keyVals;

    @SetupRender
    void setupRender() {
        keyVals = new HashMap<>();
        keyVals.put(1L, "One");
        keyVals.put(2L, "Two");
        keyVals.put(3L, "Three");
    }


    void onRunAjax(Long key) {
        ajaxResponseRenderer.addCallback((JavaScriptCallback) javascriptSupport
                -> javascriptSupport.require("ajaxdemo").invoke("init").with(key));
    }

    @SuppressWarnings("unused")
    JSONObject onGetData(@RequestParameter(value = "key") Long key) {
        return new JSONObject("result", keyVals.getOrDefault(key, "Not found"));
    }

    @SuppressWarnings("unused")
    private void dummyForInUse() {
        setupRender();
        onRunAjax(0L);
    }
}