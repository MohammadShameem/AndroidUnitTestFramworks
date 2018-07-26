// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zl.weilu.androidut;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.zl.weilu.androidut.net.GithubApi;
import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class MyApp_MembersInjector implements MembersInjector<MyApp> {
  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;

  private final Provider<DispatchingAndroidInjector<BroadcastReceiver>>
      broadcastReceiverInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider;

  private final Provider<DispatchingAndroidInjector<ContentProvider>>
      contentProviderInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>>
      supportFragmentInjectorProvider;

  private final Provider<GithubApi> mGithubApiProvider;

  public MyApp_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider,
      Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastReceiverInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider,
      Provider<DispatchingAndroidInjector<ContentProvider>> contentProviderInjectorProvider,
      Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>>
          supportFragmentInjectorProvider,
      Provider<GithubApi> mGithubApiProvider) {
    this.activityInjectorProvider = activityInjectorProvider;
    this.broadcastReceiverInjectorProvider = broadcastReceiverInjectorProvider;
    this.fragmentInjectorProvider = fragmentInjectorProvider;
    this.serviceInjectorProvider = serviceInjectorProvider;
    this.contentProviderInjectorProvider = contentProviderInjectorProvider;
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.mGithubApiProvider = mGithubApiProvider;
  }

  public static MembersInjector<MyApp> create(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider,
      Provider<DispatchingAndroidInjector<BroadcastReceiver>> broadcastReceiverInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<Service>> serviceInjectorProvider,
      Provider<DispatchingAndroidInjector<ContentProvider>> contentProviderInjectorProvider,
      Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>>
          supportFragmentInjectorProvider,
      Provider<GithubApi> mGithubApiProvider) {
    return new MyApp_MembersInjector(
        activityInjectorProvider,
        broadcastReceiverInjectorProvider,
        fragmentInjectorProvider,
        serviceInjectorProvider,
        contentProviderInjectorProvider,
        supportFragmentInjectorProvider,
        mGithubApiProvider);
  }

  @Override
  public void injectMembers(MyApp instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, activityInjectorProvider.get());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, broadcastReceiverInjectorProvider.get());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, fragmentInjectorProvider.get());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, serviceInjectorProvider.get());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, contentProviderInjectorProvider.get());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    dagger.android.support.DaggerApplication_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    injectMGithubApi(instance, mGithubApiProvider.get());
  }

  public static void injectMGithubApi(MyApp instance, GithubApi mGithubApi) {
    instance.mGithubApi = mGithubApi;
  }
}
