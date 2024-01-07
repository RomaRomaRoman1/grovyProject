package model;

public class SecondBean {
    private Prototype prototype;
    private Singleton singleton;

    public SecondBean(Prototype prototype, Singleton singleton) {
        this.prototype = prototype;
        this.singleton = singleton;
        System.out.println("second bean created" + prototype.toString());
        System.out.println("second bean created" + singleton.toString());
    }
}
