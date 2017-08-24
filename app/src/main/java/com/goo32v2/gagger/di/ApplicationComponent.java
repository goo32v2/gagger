package com.goo32v2.gagger.di;

import com.goo32v2.gagger.App;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author Alexander Steblin (goo32v2)
 * @date 24.08.2017
 */

@Component(modules = {ActivityModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance Builder app(App app);
        ApplicationComponent build();
    }

    void inject(App app);
}
