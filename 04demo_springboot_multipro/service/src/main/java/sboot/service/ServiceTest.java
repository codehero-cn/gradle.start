package sboot.service;
import sboot.dao.DaoTest;
        

public class ServiceTest{
    public String showService(){
        DaoTest daoTest = new DaoTest();
        return daoTest.showDao()+"我是service";
    }
}
        