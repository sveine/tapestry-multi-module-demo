package com.demo.commonlib.components;

import com.demo.commonlib.services.HelloService;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

@Import(stylesheet = {"css/commonstyle.css"})
public class CommonHelloCpo {
    @Property
    private String hello = "Hello from @Property in common module";
    @Inject
    AjaxResponseRenderer ajaxResponseRenderer;
    @Inject
    HelloService helloService;

    public String getHelloService() {
        return helloService.hello();
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