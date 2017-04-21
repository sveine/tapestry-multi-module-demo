package com.demo.module1.pages;

import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;

import java.util.HashMap;

public class PublishEventDemo {
    @Inject
    private AjaxResponseRenderer ajaxResponseRenderer;
    @Persist
    private HashMap<Long, String> keyVals;

    public static final String CALLBACK_EVENT = "GetData";

    @SetupRender
    void setupRender() {
        keyVals = new HashMap<>();
        keyVals.put(1L, "One");
        keyVals.put(2L, "Two");
        keyVals.put(3L, "Three");
    }

    @OnEvent(CALLBACK_EVENT)
    @PublishEvent
    JSONObject getData(@RequestParameter(value = "key") Long key) {
        return new JSONObject("origin", keyVals.getOrDefault(key, "Not found"));
    }

    void onRunAjax(Long key) {
        ajaxResponseRenderer.addCallback((JavaScriptCallback) javascriptSupport
                -> javascriptSupport.require("publisheventdemo").invoke("init").with(CALLBACK_EVENT, key));
    }
}