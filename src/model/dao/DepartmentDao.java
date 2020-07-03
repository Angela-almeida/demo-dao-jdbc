package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //função responsavel pela inserção de dados
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //consulta o banco de dados através deste ID. se o id não existir retorna null
	List<Department> findAll();
}
