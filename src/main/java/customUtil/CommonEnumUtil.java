package customUtil;/*
 * Created by hylee@insterior.co.kr
 * Since 2021/01/08
 */

public class CommonEnumUtil {
    public static <E extends Enum<E>> E getValueByName(Class<E> e, String name){
        for (E value : e.getEnumConstants()){
            if(value.name().equals(name)){
                return value;
            }
        }
        return null;
    }
}
