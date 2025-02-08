import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanSecond.getMessage());
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat beanSecondCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanSecondCat.getMessage());
        System.out.println(bean==beanSecond);
        System.out.println(beanCat==beanSecondCat);

    }
}