package com.wenhao.decoration.protagonist;

import com.wenhao.decoration.common.Component;

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("我才是主角");
    }
}
