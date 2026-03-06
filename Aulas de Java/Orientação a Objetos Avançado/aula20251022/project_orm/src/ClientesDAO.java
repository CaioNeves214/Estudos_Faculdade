public class ClientesDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");

    public void inserir(Clientes c) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }

    public List<Clientes> listar() {
        EntityManager em = emf.createEntityManager();
        List<Clientes> lista = em.createQuery("from Clientes", Clientes.class).getResultList();
        em.close();
        return lista;
    }
}
