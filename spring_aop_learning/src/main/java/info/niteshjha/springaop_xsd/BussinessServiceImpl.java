package info.niteshjha.springaop_xsd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public class BussinessServiceImpl implements BussinessService {

    private static final Map<String, String> STRING_MAP = new HashMap<String, String>();
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    static {
        for (int i = 1; i <= 10; i++) {
            STRING_MAP.put("ID_" + i, "Test_" + i);
        }
    }

    public Map<String, String> getNames() {
        logger.info("BEGIN--> class : " + this.getClass().getSimpleName() + " :method : getNames()");
        return Collections.unmodifiableMap(STRING_MAP);
    }

    public String getName(String name) {
        logger.info("BEGIN--> class : " + this.getClass().getSimpleName() + " :method : getName(String name)");
        return STRING_MAP.getOrDefault(name, "NOT_FOUND");
    }

    @Override
    public void displayName() {
        logger.info("BEGIN--> class : " + this.getClass().getSimpleName() + " :method : displayName()");
    }

    @Override
    public void throwException() {
        logger.info("BEGIN--> class : " + this.getClass().getSimpleName() + " :method : throwException()");
        throw new RuntimeException("throwing from throwException method");
    }

    @Override
    public void addName(String name) {
        logger.info("BEGIN--> class : " + this.getClass().getSimpleName() + " :method : addName(String name)");
    }
}
