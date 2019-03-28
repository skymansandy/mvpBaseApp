package in.codeshuffle.mvpskeleton.di.component;

import android.app.Application;
import android.content.Context;

import in.codeshuffle.mvpskeleton.MvpApp;
import in.codeshuffle.mvpskeleton.data.DataManager;
import in.codeshuffle.mvpskeleton.di.ApplicationContext;
import in.codeshuffle.mvpskeleton.di.module.ApplicationModule;
import in.codeshuffle.mvpskeleton.service.SyncService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by skymansandy on 27/01/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}