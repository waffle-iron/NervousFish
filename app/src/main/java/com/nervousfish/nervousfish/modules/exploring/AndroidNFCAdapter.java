package com.nervousfish.nervousfish.modules.exploring;

import com.nervousfish.nervousfish.service_locator.IServiceLocator;
import com.nervousfish.nervousfish.service_locator.IServiceLocatorBridge;
import com.nervousfish.nervousfish.service_locator.ModuleWrapper;

/**
 * An adapter to the default Android bluetooth library
 */
public final class AndroidNFCAdapter implements INFCHandler {
    /**
     * Creates a new instance of itself and wraps it in a {@link ModuleWrapper} so that only an {@link IServiceLocatorBridge}
     * can access the new module to create the new {@link IServiceLocator}.
     *
     * @param serviceLocatorBridge The service locator bridge that creates the new service locator
     * @return A wrapper around a newly created instance of this class
     */
    public static ModuleWrapper<AndroidNFCAdapter> newInstance(IServiceLocatorBridge serviceLocatorBridge) {
        return new ModuleWrapper<>(new AndroidNFCAdapter(serviceLocatorBridge));
    }

    /**
     * Prevents construction from outside the class.
     * @param serviceLocatorBridge The object responsible for creating the service locator
     */
    private AndroidNFCAdapter(IServiceLocatorBridge serviceLocatorBridge) {
        final IServiceLocator serviceLocator = serviceLocatorBridge.getServiceLocator();
    }
}