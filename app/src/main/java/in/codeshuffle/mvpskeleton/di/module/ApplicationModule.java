package in.codeshuffle.mvpskeleton.di.module;

import android.app.Application;
import android.content.Context;

import in.codeshuffle.mvpskeleton.BuildConfig;
import in.codeshuffle.mvpskeleton.R;
import in.codeshuffle.mvpskeleton.data.AppDataManager;
import in.codeshuffle.mvpskeleton.data.DataManager;
import in.codeshuffle.mvpskeleton.data.db.AppDbHelper;
import in.codeshuffle.mvpskeleton.data.db.DbHelper;
import in.codeshuffle.mvpskeleton.data.network.ApiHeader;
import in.codeshuffle.mvpskeleton.data.network.ApiHelper;
import in.codeshuffle.mvpskeleton.data.network.AppApiHelper;
import in.codeshuffle.mvpskeleton.data.prefs.AppPreferencesHelper;
import in.codeshuffle.mvpskeleton.data.prefs.PreferencesHelper;
import in.codeshuffle.mvpskeleton.di.ApiInfo;
import in.codeshuffle.mvpskeleton.di.ApplicationContext;
import in.codeshuffle.mvpskeleton.di.DatabaseInfo;
import in.codeshuffle.mvpskeleton.di.PreferenceInfo;
import in.codeshuffle.mvpskeleton.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by skymansandy on 27/01/17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}
