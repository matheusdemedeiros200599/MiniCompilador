package analisador;

import java.util.Objects;

/**
 * Classe identificadora
 *
 * @author Edoardo, Lucas e Matheus
 */
public class Identificador {

    private String nome;
    private int ID;

    /**
     * Construtor vazio
     */
    public Identificador() {
    }

    /**
     * Construtor
     *
     * Passa os seguintes parametros:
     *
     * @param nome
     * @param ID
     */
    public Identificador(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
    }

    /**
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return id
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return String.format("ID(%d) %s;", getID(), getNome());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Identificador other = (Identificador) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

}
