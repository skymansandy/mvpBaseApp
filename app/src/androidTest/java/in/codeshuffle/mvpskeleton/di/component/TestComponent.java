
package in.codeshuffle.mvpskeleton.di.component;

import in.codeshuffle.mvpskeleton.di.module.ApplicationTestModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by amitshekhar on 03/02/17.
 */
@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {
}
