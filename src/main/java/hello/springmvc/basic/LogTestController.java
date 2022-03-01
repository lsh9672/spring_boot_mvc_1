package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j //롬복이 제공하는 어노테이션
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); //@Slf4j가 이를 생략시켜줌

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name );

//        log.info(" info log= "+name); => 이렇게 사용하면 안됨.(문자열 + 연산이 일어나서 사용하지 않아도 메모리 낭비)

        //아래로 내려갈수록 심각도 증가(레벨 증가)
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);//디버깅할떄
        log.info(" info log={}", name);//운영서버에서도 봐야되는 정보
        log.warn(" warn log={}", name);//경고
        log.error("error log={}", name);//위험


        return "ok";

    }
}
