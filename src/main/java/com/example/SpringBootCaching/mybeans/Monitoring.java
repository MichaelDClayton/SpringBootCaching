package com.example.SpringBootCaching.mybeans;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import javax.management.*;

@Component
@ManagedResource(objectName = "MonitoringBean:category=MBeans, name=testMonitoringBean")
public class Monitoring implements MonitoringMBean{

    public Monitoring() throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException {

    }

    @ManagedOperation
    public void printOut(){
        System.out.println("monitoring!");
    }




}
