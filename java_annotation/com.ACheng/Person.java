import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by tsk on 2017/4/6.
 */
@Target(ElementType.TYPE)//标注的目标
@Documented //标记生成javadoc
public @interface Person {
}
