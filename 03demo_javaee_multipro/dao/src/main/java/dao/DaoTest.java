package dao;
import model.ModelTest;

public class DaoTest {
    public String showDao(){
        ModelTest modelTest  = new ModelTest();
        return modelTest.showModel()+":我是dao!";
    }
}
