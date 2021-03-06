package com.avbravo.microjavaxnosql.field;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.json.bind.config.PropertyVisibilityStrategy;

public class FieldPropertyVisibilityStrategy implements PropertyVisibilityStrategy {

    @Override
    public boolean isVisible(Field field) {
        return true;
    }

    @Override
    public boolean isVisible(Method method) {
        return true;
    }
}
