package com.demo.core.components;

import com.demo.core.services.HelloService;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;

@Import(stylesheet = {"css/commonstyle.css"})
public class CoreHelloCpo {
    @SuppressWarnings("unused")
    @Property
    private String hello = "Hello from @Property in Core module";
    @Inject
    private AjaxResponseRenderer ajaxResponseRenderer;
    @Inject
    private HelloService helloService;

    public String getHelloService() {
        return helloService.hello();
    }


    public void onSayHelloCore() {
        ajaxResponseRenderer.addCallback((JavaScriptCallback) javascriptSupport -> javascriptSupport.require("core-test").invoke("helloFromCore"));
    }

    @SuppressWarnings("unused")
    private void dummyForInUse() {
        onSayHelloCore();
    }
}