
package in.codeshuffle.mvpskeleton.ui.feed.opensource;

import in.codeshuffle.mvpskeleton.data.network.model.OpenSourceResponse;
import in.codeshuffle.mvpskeleton.ui.base.MvpView;

import java.util.List;

/**
 * Created by skymansandy on 25/05/17.
 */

public interface OpenSourceMvpView extends MvpView {

    void updateRepo(List<OpenSourceResponse.Repo> repoList);
}
