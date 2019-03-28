package in.codeshuffle.mvpskeleton.di.component;

import in.codeshuffle.mvpskeleton.di.PerActivity;
import in.codeshuffle.mvpskeleton.di.module.ActivityModule;
import in.codeshuffle.mvpskeleton.ui.about.AboutFragment;
import in.codeshuffle.mvpskeleton.ui.feed.FeedActivity;
import in.codeshuffle.mvpskeleton.ui.feed.blogs.BlogFragment;
import in.codeshuffle.mvpskeleton.ui.feed.opensource.OpenSourceFragment;
import in.codeshuffle.mvpskeleton.ui.login.LoginActivity;
import in.codeshuffle.mvpskeleton.ui.main.MainActivity;
import in.codeshuffle.mvpskeleton.ui.main.rating.RateUsDialog;
import in.codeshuffle.mvpskeleton.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by skymansandy on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

}
