package com.example.client;

import com.example.service.GreetingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) {
        System.out.println("Cliente iniciado......");
        ServiceReference<GreetingService> ref = context.getServiceReference(GreetingService.class);
        if (ref != null) {
            GreetingService service = context.getService(ref);
            System.out.println(service.greet("Usuario desde el cliente"));
        } else {
            System.out.println("No se encontró el GreetingService.");
        }
    }

    @Override
    public void stop(BundleContext context) {
        System.out.println("Cliente detenido.");
    }
}
