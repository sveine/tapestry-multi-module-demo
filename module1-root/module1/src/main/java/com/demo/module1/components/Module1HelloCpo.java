package com.demo.module1.components;

import com.demo.commonlib.services.HelloService;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

@Import(stylesheet = {"commonmodule/css/commonstyle2.css", "css/module1style.css"})
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
        ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
            @Override
            public void run(JavaScriptSupport javascriptSupport) {
                javascriptSupport.require("jsmodule1").invoke("helloFromModule1");
            }
        });
    }

    public void onSayHelloCommon() {
        ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
            @Override
            public void run(JavaScriptSupport javascriptSupport) {
                javascriptSupport.require("common/jscommon").invoke("helloFromCommon");
            }
        });
    }
}