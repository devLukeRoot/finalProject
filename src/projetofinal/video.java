package projetofinal;

public class video implements AcoesVideo {
    private String titulo;
    private boolean reproduzindo;
    private int views,curtidas,avaliacao;

    public video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    
    
    @Override
    public void play() {
    if(this.reproduzindo = false){
    this.reproduzindo = true;
      }else{
        System.out.println("O video ja esta sendo reproduzido!");
    }
    }
    
    @Override
    public void pause() {
        if (this.reproduzindo = true) {
            this.reproduzindo = false;
        } else {
            System.out.println("Video ja pausado!");
        }
    }

    @Override
    public void like() {
       this.curtidas ++ ;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "video{" + "titulo=" + titulo + ", reproduzindo=" + reproduzindo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + '}';
    }

    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int setAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    
}
