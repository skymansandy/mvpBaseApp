package in.codeshuffle.mvpskeleton.ui.main.rating;

import in.codeshuffle.mvpskeleton.ui.base.MvpPresenter;

/**
 * Created by skymansandy on 22/03/17.
 */

public interface RatingDialogMvpPresenter<V extends RatingDialogMvpView> extends MvpPresenter<V> {

    void onRatingSubmitted(float rating, String message);

    void onCancelClicked();

    void onLaterClicked();

    void onPlayStoreRatingClicked();
}
