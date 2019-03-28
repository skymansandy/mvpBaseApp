package in.codeshuffle.mvpskeleton.ui.main;

import in.codeshuffle.mvpskeleton.data.db.model.Question;
import in.codeshuffle.mvpskeleton.ui.base.MvpView;

import java.util.List;

/**
 * Created by skymansandy on 27/01/17.
 */

public interface MainMvpView extends MvpView {

    void openLoginActivity();

    void showAboutFragment();

    void refreshQuestionnaire(List<Question> questionList);

    void reloadQuestionnaire(List<Question> questionList);

    void updateUserName(String currentUserName);

    void updateUserEmail(String currentUserEmail);

    void updateUserProfilePic(String currentUserProfilePicUrl);

    void updateAppVersion();

    void showRateUsDialog();

    void openMyFeedActivity();

    void closeNavigationDrawer();

    void lockDrawer();

    void unlockDrawer();
}
