package com.goo32v2.gagger.di;

import com.goo32v2.gagger.FragmentOneModule;
import com.goo32v2.gagger.FragmentTwoModule;
import com.goo32v2.gagger.MainActivity;
import com.goo32v2.gagger.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Alexander Steblin (goo32v2)
 * @date 24.08.2017
 */

@Module(includes = AndroidSupportInjectionModule.class)
public interface ActivityModule {

    @ContributesAndroidInjector(modules = { MainActivityModule.class, FragmentOneModule.class, FragmentTwoModule.class })
    MainActivity subMainActivity();


}
