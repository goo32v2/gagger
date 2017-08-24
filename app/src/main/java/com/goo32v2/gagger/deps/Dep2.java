package com.goo32v2.gagger.deps;

import javax.inject.Inject;

/**
 * @author Alexander Steblin (goo32v2)
 * @date 24.08.2017
 */

public class Dep2 {

    private final Dep1 dep1;

    @Inject
    public Dep2(Dep1 dep1) {
        this.dep1 = dep1;
    }
}
