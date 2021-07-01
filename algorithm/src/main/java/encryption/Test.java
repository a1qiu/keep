package encryption;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author mawei
 * @date 5/13/21
 */

/**
 * 密码加密以及匹配
 */
public class Test {
    @org.junit.Test
    public void bcrypt() {
        String source = "helloWorld";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodeSource = passwordEncoder.encode(source);
        System.out.println("first" + encodeSource);
        System.out.println("first match:" + passwordEncoder.matches(source, encodeSource));
        String secondSource = passwordEncoder.encode(source);
        System.out.println("second" + secondSource);
        System.out.println("second match:" + passwordEncoder.matches(source, secondSource));

    }
}
