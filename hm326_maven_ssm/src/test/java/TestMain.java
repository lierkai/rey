import com.itheima.ssm.pojo.Item;
import com.itheima.ssm.service.ItemService;
import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class TestMain {


    @Autowired
    private ItemService itemService;

    @Test
    public void testMybatisSpring() throws Exception {
        List<Item> itemList = itemService.queryItemList();
        if (itemList != null && itemList.size() > 0){
            for (int i = 0; i < itemList.size(); i++) {
                Item item =  itemList.get(i);
                System.out.println(item);
            }
        }
    }
}
