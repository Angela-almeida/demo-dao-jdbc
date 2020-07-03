package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //fun��o responsavel pela inser��o de dados
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //consulta o banco de dados atrav�s deste ID. se o id n�o existir retorna null
	List<Department> findAll();
}
