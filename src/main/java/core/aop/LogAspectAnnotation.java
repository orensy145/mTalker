package core.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author the Ren
 */
@Component("logAspectAnnotation")
@Aspect
public class LogAspectAnnotation {
    @Around(value = "execution(public * showHobby(..))")
    public void myAround(ProceedingJoinPoint jp){
        System.out.println("前置通知");
        try{
            jp.proceed();
            System.out.println("后置通知");
        }catch (Throwable e){
            System.out.println("异常通知");
        }finally {
            System.out.println("最终通知");
        }
    }
}
