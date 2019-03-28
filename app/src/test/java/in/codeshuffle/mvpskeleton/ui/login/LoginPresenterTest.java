
package in.codeshuffle.mvpskeleton.ui.login;

import in.codeshuffle.mvpskeleton.data.DataManager;
import in.codeshuffle.mvpskeleton.data.network.model.LoginRequest;
import in.codeshuffle.mvpskeleton.data.network.model.LoginResponse;
import in.codeshuffle.mvpskeleton.utils.rx.TestSchedulerProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.TestScheduler;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

/**
 * Created by amitshekhar on 02/02/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    LoginMvpView mMockLoginMvpView;
    @Mock
    DataManager mMockDataManager;

    private LoginPresenter<LoginMvpView> mLoginPresenter;
    private TestScheduler mTestScheduler;

    @BeforeClass
    public static void onlyOnce() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        mTestScheduler = new TestScheduler();
        TestSchedulerProvider testSchedulerProvider = new TestSchedulerProvider(mTestScheduler);
        mLoginPresenter = new LoginPresenter<>(
            mMockDataManager,
            testSchedulerProvider,
            compositeDisposable);
        mLoginPresenter.onAttach(mMockLoginMvpView);
    }

    @Test
    public void testServerLoginSuccess() {

        String email = "dummy@gmail.com";
        String password = "password";

        LoginResponse loginResponse = new LoginResponse();

        doReturn(Observable.just(loginResponse))
                .when(mMockDataManager)
                .doServerLoginApiCall(new LoginRequest
                        .ServerLoginRequest(email, password));

        mLoginPresenter.onServerLoginClick(email, password);

        mTestScheduler.triggerActions();

        verify(mMockLoginMvpView).showLoading();
        verify(mMockLoginMvpView).hideLoading();
        verify(mMockLoginMvpView).openMainActivity();
    }


    @After
    public void tearDown() throws Exception {
        mLoginPresenter.onDetach();
    }

}