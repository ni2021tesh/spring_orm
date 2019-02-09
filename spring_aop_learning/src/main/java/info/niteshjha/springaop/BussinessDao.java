package info.niteshjha.springaop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BussinessDao {

    private String name;
    private String prop;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public void display() {
        log.info("Before Execution");
        log.info("Display method called by ::" + this.name);
        log.info("After Execution");
    }

    public void throwException() {
        log.info("Begin:: Throw exception.");
        try {
            throw new RuntimeException("Exception thrown for testing AOP by ::" + this.name);
        } catch (Exception e) {
            log.info("exception occurred....");
        }
        log.info("End:: throws Exception.");
    }
}
