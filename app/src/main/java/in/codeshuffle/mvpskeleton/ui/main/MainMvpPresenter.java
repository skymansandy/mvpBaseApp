package in.codeshuffle.mvpskeleton.ui.main;


import in.codeshuffle.mvpskeleton.di.PerActivity;
import in.codeshuffle.mvpskeleton.ui.base.MvpPresenter;

/**
 * Created by skymansandy on 27/01/17.
 */

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void onDrawerOptionAboutClick();

    void onDrawerOptionLogoutClick();

    void onDrawerRateUsClick();

    void onDrawerMyFeedClick();

    void onViewInitialized();

    void onCardExhausted();

    void onNavMenuCreated();
}
