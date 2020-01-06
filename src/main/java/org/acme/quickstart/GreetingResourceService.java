package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by sylvester
 * Project getting-started
 * User: sylvester
 * Date: 1/6/20
 * Time: 2:36 PM
 */
@ApplicationScoped
public class GreetingResourceService {
    String greeting(String name){
        return "Hello "+ name;
    }
}
