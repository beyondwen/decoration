package com.wenhao.decoration.decoration.impl;

import com.wenhao.decoration.common.Component;
import com.wenhao.decoration.decoration.Decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
        System.out.println("装修小弟1");
    }

    public void method1() {
        System.out.println("我就是来装饰主角的具体方法1");
        System.out.println("装修小弟1的过人技能");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
        System.out.println("使用装修小弟1的新技能");
    }
}
