package in.codeshuffle.mvpskeleton.ui.splash;

import in.codeshuffle.mvpskeleton.ui.base.MvpView;

/**
 * Created by skymansandy on 27/01/17.
 */

public interface SplashMvpView extends MvpView {

    void openLoginActivity();

    void openMainActivity();

    void startSyncService();
}
