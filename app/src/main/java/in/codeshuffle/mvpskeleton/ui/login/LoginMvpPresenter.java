package in.codeshuffle.mvpskeleton.ui.login;


import in.codeshuffle.mvpskeleton.di.PerActivity;
import in.codeshuffle.mvpskeleton.ui.base.MvpPresenter;

/**
 * Created by skymansandy on 27/01/17.
 */

@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void onServerLoginClick(String email, String password);

    void onGoogleLoginClick();

    void onFacebookLoginClick();

}
