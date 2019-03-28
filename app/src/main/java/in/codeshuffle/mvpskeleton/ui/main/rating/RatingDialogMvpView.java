package in.codeshuffle.mvpskeleton.ui.main.rating;

import in.codeshuffle.mvpskeleton.ui.base.DialogMvpView;

/**
 * Created by skymansandy on 24/05/17.
 */

public interface RatingDialogMvpView extends DialogMvpView {

    void openPlayStoreForRating();

    void showPlayStoreRatingView();

    void showRatingMessageView();

    void hideSubmitButton();

    void disableRatingStars();

    void dismissDialog();
}
