package com.goo32v2.gagger;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Alexander Steblin (goo32v2)
 * @date 24.08.2017
 */

@Module
public interface MainActivityModule {

    @ContributesAndroidInjector(modules = FragmentOneModule.class)
    FragmentOne subFragmentOne();

    @ContributesAndroidInjector(modules = FragmentTwoModule.class)
    FragmentTwo subFragmentTwo();

}
