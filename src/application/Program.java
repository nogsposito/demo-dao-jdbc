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

        System.out.println("TESTE: seller insert");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id: " + newSeller.getId());
    
        System.out.println("TESTE: seller update");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);

        System.out.println("TESTE: seller delete");
        sellerDao.deleteById(4);
        
    }
    
}
