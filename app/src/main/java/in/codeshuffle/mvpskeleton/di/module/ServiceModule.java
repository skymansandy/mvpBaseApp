package in.codeshuffle.mvpskeleton.di.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by skymansandy on 01/02/17.
 */

@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}
