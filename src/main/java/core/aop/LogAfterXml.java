package core.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
public class LogAfterXml implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("***后置通知：目标对象："+target+",调用方法名："+method.getName()
                           +",方法参数个数"+args.length+",方法返回值"+returnValue);
    }
}
