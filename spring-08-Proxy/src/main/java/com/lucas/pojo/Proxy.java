package com.lucas.pojo;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void lookHouse(){
        System.out.println("I can take clients to look houses");
    }

    public void fare(){
        System.out.println("I need to take some extra money");
    }

    public void contract(){
        System.out.println("Make contract with clients");
    }

    @Override
    public void rent() {
        lookHouse();
        fare();
        contract();
        host.rent();
    }
}
