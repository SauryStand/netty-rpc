package com.newlandFramework.rpc.compiler.invoke;
import java.lang.reflect.Method;
/**
 * @Description:
 * @Created by Johnny Chou on 2018/1/8.
 * @Author：
 */
public interface ObjectInvoker {
    Object invoke(Object proxy, Method method, Object... arguments) throws Throwable;
}
