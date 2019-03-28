
package in.codeshuffle.mvpskeleton.ui.feed;

import in.codeshuffle.mvpskeleton.data.DataManager;
import in.codeshuffle.mvpskeleton.ui.base.BasePresenter;
import in.codeshuffle.mvpskeleton.ui.base.MvpView;
import in.codeshuffle.mvpskeleton.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by skymansandy on 25/05/17.
 */

public class FeedPresenter<V extends MvpView> extends BasePresenter<V> implements
        FeedMvpPresenter<V> {

    private static final String TAG = "FeedPresenter";

    @Inject
    public FeedPresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
