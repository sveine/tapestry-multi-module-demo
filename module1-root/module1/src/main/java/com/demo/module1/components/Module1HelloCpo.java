package com.demo.module1.components;

import com.demo.core.services.HelloService;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;

@Import(stylesheet = {"democore/css/commonstyle2.css", "css/module1style.css"})
public class Module1HelloCpo {
    @Property
    private String hello = "Hello from @Property in module1";
    @Inject
    AjaxResponseRenderer ajaxResponseRenderer;
    @Inject
    HelloService helloService;

    public String getHelloService() {
        return helloService.hello();
    }

    public void onSayHelloModule1() {
        ajaxResponseRenderer.addCallback((JavaScriptCallback) javascriptSupport -> javascriptSupport.require("module1-test").invoke("helloFromModule1"));
    }

    public void onSayHelloCore() {
        ajaxResponseRenderer.addCallback((JavaScriptCallback) javascriptSupport -> javascriptSupport.require("core-test").invoke("helloFromCore"));
    }

    @SuppressWarnings("unused")
    private void dummyForInUse() {
        onSayHelloModule1();
        onSayHelloCore();
    }
}