
package in.codeshuffle.mvpskeleton.ui.feed.blogs;

import in.codeshuffle.mvpskeleton.ui.base.MvpPresenter;

/**
 * Created by skymansandy on 25/05/17.
 */

public interface BlogMvpPresenter<V extends BlogMvpView>
        extends MvpPresenter<V> {

    void onViewPrepared();
}


