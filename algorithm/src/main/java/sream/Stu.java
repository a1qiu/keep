package sream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mawei
 * @date 4/29/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private String name;
    private int age;
    private int susture;
    private speciallyEnum speciallyEnum;
}
