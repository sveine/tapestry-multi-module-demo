package com.demo.core.components;

import com.demo.core.services.HelloService;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;

@Import(stylesheet = {"css/commonstyle.css"})
public class CommonHelloCpo {
    @SuppressWarnings("unused")
    @Property
    private String hello = "Hello from @Property in common module";
    @Inject
    private AjaxResponseRenderer ajaxResponseRenderer;
    @Inject
    private HelloService helloService;

    public String getHelloService() {
        return helloService.hello();
    }


    public void onSayHelloCommon() {
        ajaxResponseRenderer.addCallback((JavaScriptCallback) javascriptSupport -> javascriptSupport.require("common/jscommon").invoke("helloFromCommon"));
    }

    @SuppressWarnings("unused")
    private void dummyForInUse() {
        onSayHelloCommon();
    }
}