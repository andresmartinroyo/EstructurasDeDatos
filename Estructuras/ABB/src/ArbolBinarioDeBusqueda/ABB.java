/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinarioDeBusqueda;

/**
 *
 * @author Andres
 */
public class ABB {

    private NodoABB pRoot;

    public ABB() {
    }

    /*
    Es vacio
     */
    public boolean esVacio() {
        return this.getpRoot() == null;
    }

    /*
    Recorrer arbol preorden
     */
    public String preorden() {
        return this.preorden(this.pRoot, "");
    }

    public String preorden(NodoABB raiz, String ruta) {
        ruta += raiz.getElement() + ",";
        if (raiz.getLeft() != null) {
            ruta = preorden(raiz.getLeft(), ruta);
        }
        if (raiz.getRight() != null) {
            ruta = preorden(raiz.getRight(), ruta);
        }
        return ruta;
    }

    /*
    Recorrer arbol postorden
     */
    public String postorden() {
        return this.postorden(this.pRoot, "");
    }

    public String postorden(NodoABB raiz, String ruta) {
        if (raiz.getLeft() != null) {
            ruta = postorden(raiz.getLeft(), ruta);
        }
        if (raiz.getRight() != null) {
            ruta = postorden(raiz.getRight(), ruta);
        }
        ruta += raiz.getElement() + ",";
        return ruta;
    }

    /*
    Recorrer arbol preorden
     */
    public String inorden() {
        return this.inorden(this.pRoot, "");
    }

    public String inorden(NodoABB raiz, String ruta) {
        if (raiz.getLeft() != null) {
            ruta = inorden(raiz.getLeft(), ruta);
        }
        ruta += raiz.getElement() + ",";
        if (raiz.getRight() != null) {
            ruta = inorden(raiz.getRight(), ruta);
        }
        return ruta;
    }

    /*
    Insertar nodo... ¿Por qué error?
     */
//    public void insertar(int dato) {
//        if (this.esVacio()) {
//            NodoABB nuevo = new NodoABB(dato);
//            this.setpRoot(nuevo);
//        } else {
//
//            insertar(dato, this.pRoot);
//        }
//
//    }
//    public void insertar(int dato, NodoABB raiz) {
//        if (raiz == null) {
//            NodoABB nuevo = new NodoABB(dato);
//            raiz = nuevo;
//        }
//        if (dato < raiz.getElement()) {
//            insertar(dato, raiz.getLeft());
//        } else if (dato > raiz.getElement()) {
//            insertar(dato, raiz.getRight());
//        } else if (dato == raiz.getElement()) {
//            System.out.println("El valor ya existe.");
//        }
//
//    }
    /*
    Buscar al padre 
     */
    public NodoABB searchPadre(NodoABB current, int data) {
        NodoABB found = null;
        if (data < current.getElement()) {
            if (found != null) {
                return found;
            } else if (current.getLeft() != null) {
                found = this.searchPadre(current.getLeft(), data);
            } else {
                return current;
            }
        } else if (data > current.getElement()) {
            if (found != null) {
                return found;
            } else if (current.getRight() != null) {
                found = this.searchPadre(current.getRight(), data);
            } else {
                return current;

            }
        }
        return found;
    }

    /*
    Insertar
     */
    public void insertar(int data) {
        NodoABB node = new NodoABB(data);
        if (this.esVacio()) {
            this.setpRoot(node);
        } else {
            NodoABB nodeP = this.searchPadre(this.getpRoot(), data);
            if (nodeP == null) {
                System.out.println("El valor ya esta en el ABB.");
            } else if (nodeP.getElement() > node.getElement()) {
                nodeP.setLeft(node);
            } else if (nodeP.getElement() < node.getElement()) {
                nodeP.setRight(node);
            }
        }
    }

    /*
    Buscar un Nodo
     */
    public boolean existe(int dato) {
        return this.buscarNodo(dato) != null;
    }

    public NodoABB buscarNodo(int dato) {
        return buscarNodo(this.getpRoot(), dato);
    }

    public NodoABB buscarNodo(NodoABB raiz, int dato) {
        NodoABB found = null;
        if (found == null) {
            if (raiz.getElement() == dato) {
                return raiz;
            } else if (dato < raiz.getElement()) {
                if (raiz.getLeft() != null) {
                    found = buscarNodo(raiz.getLeft(), dato);

                }
            } else if (dato > raiz.getElement()) {
                if (raiz.getRight() != null) {
                    found = buscarNodo(raiz.getRight(), dato);
                }
            }
        }
        return found;
    }

    /*
    Eliminar nodo
     */
    public void eliminar(int dato) {
        NodoABB nodoP = this.searchPadre(this.getpRoot(), dato);
        if (nodoP != null) {

        } else {

        }
    }

    /**
     * @return the pRoot
     */
    public NodoABB getpRoot() {
        return pRoot;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(NodoABB pRoot) {
        this.pRoot = pRoot;
    }

}
