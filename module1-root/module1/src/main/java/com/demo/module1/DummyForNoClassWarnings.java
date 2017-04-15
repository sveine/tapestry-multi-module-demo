package com.demo.module1;


import com.demo.module1.pages.AjaxDemo;
import com.demo.module1.pages.LiveClassReloadFromDemoCore;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DummyForNoClassWarnings {
    public List<Class> getDummyForNoClassWarnings() {
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<Class> dummyClasses = new ArrayList<>();
        dummyClasses.add(LiveClassReloadFromDemoCore.class);
        dummyClasses.add(AjaxDemo.class);
        return dummyClasses;
    }
}