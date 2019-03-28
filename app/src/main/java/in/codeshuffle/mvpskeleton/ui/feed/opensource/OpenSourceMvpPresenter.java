
package in.codeshuffle.mvpskeleton.ui.feed.opensource;

import in.codeshuffle.mvpskeleton.ui.base.MvpPresenter;

/**
 * Created by skymansandy on 25/05/17.
 */

public interface OpenSourceMvpPresenter<V extends OpenSourceMvpView>
        extends MvpPresenter<V> {

    void onViewPrepared();
}
