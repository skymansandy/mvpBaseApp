package in.codeshuffle.mvpskeleton.di.component;

import in.codeshuffle.mvpskeleton.di.PerService;
import in.codeshuffle.mvpskeleton.di.module.ServiceModule;
import in.codeshuffle.mvpskeleton.service.SyncService;

import dagger.Component;

/**
 * Created by skymansandy on 01/02/17.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

    void inject(SyncService service);

}
