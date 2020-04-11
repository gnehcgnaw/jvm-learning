package com.beatshadow.jvmlearning.chapter2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.json.JsonParserFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 19:02
 */
public class Demo6 {
    public static void main(String[] args) throws JsonProcessingException {

        Dept dept = new Dept();
        dept.setName("技术部");
        Emp emp1 = new Emp();
        emp1.setName("zhangsan");
        emp1.setDept(dept);

        Emp emp2 = new Emp();
        emp2.setName("zhangsan");
        emp2.setDept(dept);

        dept.setEmpList(Arrays.asList(emp1,emp2));

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(emp1));
        System.out.println(objectMapper.writeValueAsString(dept));
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Emp {
    private String name ;
    @JsonIgnore
    private Dept dept ;

}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Dept {
    private String name ;

    private List<Emp> empList ;

}
