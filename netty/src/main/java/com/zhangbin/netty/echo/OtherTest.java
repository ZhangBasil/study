package com.zhangbin.netty.echo;

import io.netty.util.NettyRuntime;

/**
 * @author <a href="mailto:hbsy_zhb@163.com">zhangbin</a>
 */
public class OtherTest {
    public static void main(String[] args) {

        int a = 128;

        a <<= 1;


        System.out.println("newCapacity <<= 1 = " + a);

        System.out.println("NettyRuntime.availableProcessors() = " + NettyRuntime.availableProcessors());

    }
}
