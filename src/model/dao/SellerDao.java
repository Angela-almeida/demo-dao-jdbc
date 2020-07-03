package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //fun��o responsavel pela inser��o de dados
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); //consulta o banco de dados atrav�s deste ID. se o id n�o existir retorna null
	List<Seller> findAll();
	List<Seller> findByDepartment (Department department);//procura por departamento

}
