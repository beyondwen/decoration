package com.wenhao.decoration.decoration;

import com.wenhao.decoration.common.Component;

/**
 * 用来装饰主角的
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        System.out.println("装修公司");
        this.component = component;
    }

    @Override
    public void operate() {
        System.out.println("装修公司的操作");
        this.component.operate();
    }
}
