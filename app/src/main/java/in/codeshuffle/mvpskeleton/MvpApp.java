package in.codeshuffle.mvpskeleton;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interceptors.HttpLoggingInterceptor.Level;

import javax.inject.Inject;

import in.codeshuffle.mvpskeleton.data.DataManager;
import in.codeshuffle.mvpskeleton.di.component.ApplicationComponent;
import in.codeshuffle.mvpskeleton.di.component.DaggerApplicationComponent;
import in.codeshuffle.mvpskeleton.di.module.ApplicationModule;
import in.codeshuffle.mvpskeleton.utils.AppLogger;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


/**
 * Created by skymansandy on 27/01/17.
 */

public class MvpApp extends Application {

    @Inject
    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppLogger.init();

        AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(Level.BODY);
        }

        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
