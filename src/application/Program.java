package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TESTE: seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("TESTE: seller findByDepartment");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("TESTE: seller findAll");
        List<Seller> list2 = sellerDao.findAll();
        for (Seller obj : list2){
            System.out.println(obj);
        }
    }
    
}
