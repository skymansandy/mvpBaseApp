package in.codeshuffle.mvpskeleton.ui.about;

import in.codeshuffle.mvpskeleton.data.DataManager;
import in.codeshuffle.mvpskeleton.ui.base.BasePresenter;
import in.codeshuffle.mvpskeleton.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by skymansandy on 27/01/17.
 */

public class AboutPresenter<V extends AboutMvpView> extends BasePresenter<V>
        implements AboutMvpPresenter<V> {

    @Inject
    public AboutPresenter(DataManager dataManager,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
