package com.zl.weilu.androidut.dagger.ui;

import android.app.Activity;
import com.zl.weilu.androidut.dagger.base.scope.ActivityScope;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = BuildersModule_LoginDaggerActivityInjector.LoginDaggerActivitySubcomponent.class
)
public abstract class BuildersModule_LoginDaggerActivityInjector {
  private BuildersModule_LoginDaggerActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginDaggerActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginDaggerActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface LoginDaggerActivitySubcomponent extends AndroidInjector<LoginDaggerActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginDaggerActivity> {}
  }
}
