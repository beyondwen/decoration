package com.wenhao.decoration.decoration.impl;

import com.wenhao.decoration.common.Component;
import com.wenhao.decoration.decoration.Decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
        System.out.println("装修小弟2");
    }

    public void method2() {
        System.out.println("我就是来装饰主角的具体方法2");
        System.out.println("装修小弟2的过人技能");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
        System.out.println("使用装修小弟2的新技能");
    }
}
