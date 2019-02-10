package info.niteshjha.spring_aop_annotation;

import java.util.Map;

public interface BussinessService {
    public Map<String, String> getNames();

    public String getName(String name);

    public void displayName();

    public void throwException();

    public void addName(String name);
}
