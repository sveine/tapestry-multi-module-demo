package com.demo.core;

import com.demo.core.components.CoreHelloCpo;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DummyForNoClassWarningsOnCore {
    public List<Class> getDummyForNoClassWarnings() {
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<Class> dummyClasses = new ArrayList<>();
        dummyClasses.add(CoreHelloCpo.class);
        return dummyClasses;
    }
}
