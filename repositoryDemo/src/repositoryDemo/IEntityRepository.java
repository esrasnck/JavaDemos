package repositoryDemo;

public interface IEntityRepository<T> {
	
	void add(T entity);
	
	void delete(T entity);
	
	void update(T entity);

}
