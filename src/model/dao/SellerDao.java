package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //função responsavel pela inserção de dados
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); //consulta o banco de dados através deste ID. se o id não existir retorna null
	List<Seller> findAll();
	List<Seller> findByDepartment (Department department);//procura por departamento

}
