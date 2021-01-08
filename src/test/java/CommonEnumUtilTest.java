import customUtil.CommonEnumUtil;
import exampleData.myenum.ResidenceType;
import exampleData.myenum.State;
import org.junit.Test;

public class CommonEnumUtilTest {

    @Test
    public void test1(){
        System.out.println("result = "+CommonEnumUtil.getValueByName(ResidenceType.class, "NORMAL"));
    }
}
