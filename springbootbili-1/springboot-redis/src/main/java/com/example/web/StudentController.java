package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/put")
    public @ResponseBody Object put(String key, String value){
        studentService.put(key,value);
        return "值已成功放入redis";
    }
}
