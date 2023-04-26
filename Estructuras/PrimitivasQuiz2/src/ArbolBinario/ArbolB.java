/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

/**
 *
 * @author Andres
 */
public class ArbolB {

    private NodoArbolB pRoot;

    public ArbolB() {
    }

    /*
    Verifica si esta vacio
     */
    public boolean esVacio() {
        return (this.getpRoot() == null);
    }

    /*
    Recorre arbol en preorden
     */
    public String preorden() {
        return this.preorden(this.getpRoot(), "");
    }

    public String preorden(NodoArbolB raiz, String ruta) {
        ruta += raiz.getElement() + ",";
        if (raiz.getHijo_izq() != null) {
            ruta = preorden(raiz.getHijo_izq(), ruta);
        }
        if (raiz.getHijo_derecho() != null) {
            ruta = preorden(raiz.getHijo_derecho(), ruta);
        }
        return ruta;
    }

    /*
    Recorre arbol en postorden
     */
    public String postorden() {
        return this.postorden(this.getpRoot(), "");
    }

    public String postorden(NodoArbolB raiz, String ruta) {
        if (raiz.getHijo_izq() != null) {
            ruta = postorden(raiz.getHijo_izq(), ruta);
        }
        if (raiz.getHijo_derecho() != null) {
            ruta = postorden(raiz.getHijo_derecho(), ruta);
        }
        ruta += raiz.getElement() + ",";
        return ruta;
    }


    /*
    Recorre arbol en inorden
     */
    public String inorden() {
        return this.inorden(this.getpRoot(), "");
    }

    public String inorden(NodoArbolB raiz, String ruta) {
        if (raiz.getHijo_izq() != null) {
            ruta = inorden(raiz.getHijo_izq(), ruta);
        }
        ruta += raiz.getElement() + ",";
        if (raiz.getHijo_derecho() != null) {
            ruta = inorden(raiz.getHijo_derecho(), ruta);
        }
        return ruta;
    }

    /*
    Buscar al padre
     */
    public NodoArbolB buscarPadre(NodoArbolB raiz, Object padre) {
        NodoArbolB encontrado = null;
        if (raiz.getElement().equals(padre)) {
            return raiz;
        }
        if (raiz.getHijo_izq() != null && encontrado == null) {
            encontrado = buscarPadre(raiz.getHijo_izq(), padre);
        }
        if (raiz.getHijo_derecho() != null && encontrado == null) {
            encontrado = buscarPadre(raiz.getHijo_derecho(), padre);
        }
        return encontrado;
    }

    /*
    Insertar nodo
     */
    public void insertar(Object hijo, Object padre, String side) {
        NodoArbolB nodoHijo = new NodoArbolB(hijo);
        if (this.esVacio()) {
            this.setpRoot(nodoHijo);
        } else {
            NodoArbolB nodopadre = this.buscarPadre(this.getpRoot(), padre);

            if (nodopadre == null) {
                System.out.println("El padre no existe.");
            } else if (side.equals("left") && nodopadre.getHijo_izq() == null) {
                nodopadre.setHijo_izq(nodoHijo);

            } else if (side.equals("right") && nodopadre.getHijo_derecho() == null) {
                nodopadre.setHijo_derecho(nodoHijo);
            } else {
                System.out.println("Ambos hijos estan llenos");
            }
        }
    }

    /*
    Este metodo verifica si dos arboles son indenticos, recorriendo en preorden
     */
    public boolean sonIdenticosPreorden(ArbolB ab1) {
        return sonIdenticosPreorden(this.getpRoot(), ab1.getpRoot());
    }

    public boolean sonIdenticosPreorden(NodoArbolB raiz1, NodoArbolB raiz2) {
        boolean igualdad = true;
        if (raiz1 == null || raiz2 == null || raiz1.getElement() != raiz2.getElement()) {
            return false;
        }
        if ((raiz1.getHijo_izq() != null || raiz2.getHijo_izq() != null) && igualdad) {
            igualdad = sonIdenticosPreorden(raiz1.getHijo_izq(), raiz2.getHijo_izq());
        }
        if ((raiz1.getHijo_derecho() != null || raiz2.getHijo_derecho() != null) && igualdad) {
            igualdad = sonIdenticosPreorden(raiz1.getHijo_derecho(), raiz2.getHijo_derecho());
        }

        return igualdad;
    }

    /*
    Este metodo verifica si dos arboles son indenticos, recorriendo en postorden
     */
    public boolean sonIdenticosPostorden(ArbolB ab1) {
        return sonIdenticosPreorden(this.getpRoot(), ab1.getpRoot());
    }

    public boolean sonIdenticosPostorden(NodoArbolB raiz1, NodoArbolB raiz2) {
        boolean igualdad = true;
        if (raiz1 == null || raiz2 == null || raiz1.getElement() != raiz2.getElement()) {
            return false;
        }
        if ((raiz1.getHijo_izq() != null || raiz2.getHijo_izq() != null) && igualdad) {
            igualdad = sonIdenticosPreorden(raiz1.getHijo_izq(), raiz2.getHijo_izq());
        }
        if ((raiz1.getHijo_derecho() != null || raiz2.getHijo_derecho() != null) && igualdad) {
            igualdad = sonIdenticosPreorden(raiz1.getHijo_derecho(), raiz2.getHijo_derecho());
        }

        return igualdad;
    }

    /**
     * @return the pRoot
     */

    public NodoArbolB getpRoot() {
        return pRoot;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(NodoArbolB pRoot) {
        this.pRoot = pRoot;
    }

}
