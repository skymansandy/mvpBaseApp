package in.codeshuffle.mvpskeleton.data.network;

import in.codeshuffle.mvpskeleton.data.network.model.BlogResponse;
import in.codeshuffle.mvpskeleton.data.network.model.LoginRequest;
import in.codeshuffle.mvpskeleton.data.network.model.LoginResponse;
import in.codeshuffle.mvpskeleton.data.network.model.LogoutResponse;
import in.codeshuffle.mvpskeleton.data.network.model.OpenSourceResponse;

import io.reactivex.Single;

/**
 * Created by skymansandy on 27/01/17.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}
