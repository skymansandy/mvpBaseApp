package in.codeshuffle.mvpskeleton.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import in.codeshuffle.mvpskeleton.data.network.model.BlogResponse;
import in.codeshuffle.mvpskeleton.data.network.model.OpenSourceResponse;
import in.codeshuffle.mvpskeleton.di.ActivityContext;
import in.codeshuffle.mvpskeleton.di.PerActivity;
import in.codeshuffle.mvpskeleton.ui.about.AboutMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.about.AboutMvpView;
import in.codeshuffle.mvpskeleton.ui.about.AboutPresenter;
import in.codeshuffle.mvpskeleton.ui.feed.FeedMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.feed.FeedMvpView;
import in.codeshuffle.mvpskeleton.ui.feed.FeedPagerAdapter;
import in.codeshuffle.mvpskeleton.ui.feed.FeedPresenter;
import in.codeshuffle.mvpskeleton.ui.feed.blogs.BlogAdapter;
import in.codeshuffle.mvpskeleton.ui.feed.blogs.BlogMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.feed.blogs.BlogMvpView;
import in.codeshuffle.mvpskeleton.ui.feed.blogs.BlogPresenter;
import in.codeshuffle.mvpskeleton.ui.feed.opensource.OpenSourceAdapter;
import in.codeshuffle.mvpskeleton.ui.feed.opensource.OpenSourceMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.feed.opensource.OpenSourceMvpView;
import in.codeshuffle.mvpskeleton.ui.feed.opensource.OpenSourcePresenter;
import in.codeshuffle.mvpskeleton.ui.login.LoginMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.login.LoginMvpView;
import in.codeshuffle.mvpskeleton.ui.login.LoginPresenter;
import in.codeshuffle.mvpskeleton.ui.main.MainMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.main.MainMvpView;
import in.codeshuffle.mvpskeleton.ui.main.MainPresenter;
import in.codeshuffle.mvpskeleton.ui.main.rating.RatingDialogMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.main.rating.RatingDialogMvpView;
import in.codeshuffle.mvpskeleton.ui.main.rating.RatingDialogPresenter;
import in.codeshuffle.mvpskeleton.ui.splash.SplashMvpPresenter;
import in.codeshuffle.mvpskeleton.ui.splash.SplashMvpView;
import in.codeshuffle.mvpskeleton.ui.splash.SplashPresenter;
import in.codeshuffle.mvpskeleton.utils.rx.AppSchedulerProvider;
import in.codeshuffle.mvpskeleton.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by skymansandy on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
