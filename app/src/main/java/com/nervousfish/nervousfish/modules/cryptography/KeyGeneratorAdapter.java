package com.nervousfish.nervousfish.modules.cryptography;

import com.nervousfish.nervousfish.service_locator.IServiceLocator;
import com.nervousfish.nervousfish.service_locator.IServiceLocatorBridge;
import com.nervousfish.nervousfish.service_locator.ModuleWrapper;

/**
 * An adapter to the default Java class for generating keys
 */
public final class KeyGeneratorAdapter implements IKeyGenerator {
    /**
     * Creates a new instance of itself and wraps it in a {@link ModuleWrapper} so that only an {@link IServiceLocatorBridge}
     * can access the new module to create the new {@link IServiceLocator}.
     *
     * @param serviceLocatorBridge The service locator bridge that creates the new service locator
     * @return A wrapper around a newly created instance of this class
     */
    public static ModuleWrapper<KeyGeneratorAdapter> newInstance(IServiceLocatorBridge serviceLocatorBridge) {
        return new ModuleWrapper<>(new KeyGeneratorAdapter(serviceLocatorBridge));
    }

    /**
     * Prevents construction from outside the class.
     * @param serviceLocatorBridge The object responsible for creating the service locator
     */
    private KeyGeneratorAdapter(IServiceLocatorBridge serviceLocatorBridge) {
        final IServiceLocator serviceLocator = serviceLocatorBridge.getServiceLocator();
    }
}