import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    @org.junit.Test
    public void t1() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        System.out.println(numbersList);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println(listWithoutDuplicates);


        ArrayList<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList1);
        List<Integer> listWithoutDuplicates1 = numbersList.stream().distinct().collect(Collectors.toList());

        System.out.println(listWithoutDuplicates1);

    }

    @org.junit.Test
    public void t2() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]
    }

    @org.junit.Test
    public void t3() {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
    }

    @org.junit.Test
    public void t4() {
        //选项值last不可重复
        String url = "{\"list\":[{\"first\":\"木头\",\"last\":10},{\"first\":\"马尾\",\"last\":10}]}";

        JSONArray listArr = JSONObject.parseObject(url).getJSONArray("list");

//        for (int i = 0; i < listArr.size(); i++) {
//            JSONObject ob = listArr.getJSONObject(i);
//            String lastValue = ob.get("last").toString();
//            list.add(lastValue);
//        }


    }

    @org.junit.Test
    public void t5() {

        JSONArray jsonArray = JSONArray.parseArray("[{\"1\": {\"name\":\"maple\",\"sex\":\"man\",\"childrens\":[{\"name\":\"草根\",\"sex\":\"man\",\"date\":\"2018-01-01\"},{\"name\":\"merry\",\"sex\":\"woman\",\"date\":\"2017-01-01\"},{\"name\":\"liming\",\"sex\":\"woman\",\"date\":\"2016-01-01\"}]}}]");
        jsonArray = jsonArray.stream().map(obj -> {
            JSONObject returnObj = new JSONObject();
            JSONObject jsonObj = (JSONObject) obj;
            jsonObj.forEach((key, val) -> {
                returnObj.put(key, ((JSONObject) val).getJSONArray("childrens"));
            });
            return returnObj;
        }).collect(Collectors.toCollection(JSONArray::new));
        System.out.println(jsonArray);
    }

    @org.junit.Test
    public void t6() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        List<Integer> collect = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    @org.junit.Test
    public void t7() {
        BigDecimal bigDecimal = new BigDecimal(1.4567);
        System.out.println(bigDecimal.setScale(2, RoundingMode.HALF_UP));


    }

    @org.junit.Test
    public void t8() {




    }

}


