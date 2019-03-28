
package in.codeshuffle.mvpskeleton.ui.feed.blogs;

import in.codeshuffle.mvpskeleton.data.network.model.BlogResponse;
import in.codeshuffle.mvpskeleton.ui.base.MvpView;

import java.util.List;

/**
 * Created by skymansandy on 25/05/17.
 */

public interface BlogMvpView extends MvpView {

    void updateBlog(List<BlogResponse.Blog> blogList);
}
