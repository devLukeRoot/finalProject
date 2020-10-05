package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
    video v[] = new video[1];
    v[0] = new video("Aula 1 de POO");
    v[1] = new video("XXE REVERSE IN A NUTSHELL");
    
    User u[] = new User [2];
    u[0] = new User("Cleitin Rei delas" , "Cleiton" , "M" , 14);
    u[1] = new User("DJ AAAzeitona" , "Mc Poze" , "M" , 22);
    
    Visualizacao vis = new Visualizacao(u[1], v[0]);
        System.out.println(vis.toString());
    
        System.out.println(u[0].toString());
        
    }
    
}
