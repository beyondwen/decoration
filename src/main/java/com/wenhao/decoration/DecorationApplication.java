package com.wenhao.decoration;

import com.wenhao.decoration.common.Component;
import com.wenhao.decoration.decoration.impl.ConcreteDecorator1;
import com.wenhao.decoration.decoration.impl.ConcreteDecorator2;
import com.wenhao.decoration.protagonist.ConcreteComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecorationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorationApplication.class, args);
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }

}
