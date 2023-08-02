package com.math.entity;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
*/

public class Rainbow implements Comparable<Rainbow> {
    private String color;

    public Rainbow(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean startsWith(String prefix) {
        if(prefix == null) {
            return true;
        }

        return this.color.startsWith(prefix);
    }

    @Override
    public int compareTo(Rainbow color) {
        return this.getColor().compareTo(color.getColor());
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rainbow other = (Rainbow) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Arco-íris [cor = " + color + "]";
    }
}
