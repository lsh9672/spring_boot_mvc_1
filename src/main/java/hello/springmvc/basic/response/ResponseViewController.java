package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello").addObject("data","hello!");

        return mav;
    }

    //이 스타일을 추천
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){
        model.addAttribute("data","hello!");

        return "response/hello";
    }

    //경로의 이름이랑 찾으려고 하는 뷰의 논리적 이름이 같으면 스프링이 경로의 이름으로 논리적 뷰 이름으로 사용
    //너무 불명확해서 추천안함
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model){
        model.addAttribute("data","hello!");

    }
}
