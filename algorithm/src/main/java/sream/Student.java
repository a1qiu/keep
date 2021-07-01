package sream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author mawei
 * @date 4/29/21
 */
@Data
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private Integer tail;

}
