package com.example.SpringBootCaching;



import com.example.SpringBootCaching.mybeans.BookPricing;
import com.example.SpringBootCaching.mybeans.Monitoring;
import com.example.SpringBootCaching.mybeans.TableOfContents;
import com.example.SpringBootCaching.repository.SimpleBookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.management.*;
import java.lang.management.ManagementFactory;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final SimpleBookRepository bookRepository;

    @Autowired
    TableOfContents tableOfContents;

    @Autowired
    BookPricing bookPricing;

    @Autowired
    Monitoring monitoring;

    public AppRunner(SimpleBookRepository bookRepository) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        this.bookRepository = bookRepository;


    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(".... Fetching books");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        tableOfContents.printInfo();

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.example:type=MonitoringBean");
        mbs.registerMBean(monitoring, name);
        monitoring.printOut();
    }

}
