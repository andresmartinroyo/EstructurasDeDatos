/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinarioDeBusqueda;

import javax.swing.JOptionPane;

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
        ruta += raiz.getElement();
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
        ruta += raiz.getElement();
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
        ruta += raiz.getElement();
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
    Buscar Padre de un nodo 
     */
    public NodoABB devolverPadre(int dato) {
        if (this.pRoot.getElement() == dato) {
            System.out.println("El dato " + dato + " es la raiz, por lo ranto no tiene padre.");
            return null;
        } else {
            return devolverPadre(this.pRoot, dato);
        }
    }

    public NodoABB devolverPadre(NodoABB raiz, int dato) {
        NodoABB found = null;
        if (found == null) {
            if (dato < raiz.getElement()) {
                if (raiz.getLeft() != null) {
                    if (raiz.getLeft().getElement() == dato) {
                        return raiz;
                    } else {
                        found = devolverPadre(raiz.getLeft(), dato);
                    }
                }
            } else if (raiz.getElement() < dato) {
                if (raiz.getRight() != null) {
                    if (raiz.getRight().getElement() == dato) {
                        return raiz;
                    } else {
                        found = devolverPadre(raiz.getRight(), dato);
                    }
                }
            }
        }
        return found;
    }

    /*
    Eliminar nodo
     */
    public void eliminar(int dato) {
        this.setpRoot(this.eliminar(this.getpRoot(), dato));
    }

    public NodoABB eliminar(NodoABB raiz, int dato) {
        if (raiz == null) {
            return raiz;
        }
        if (dato < raiz.getElement()) {
            raiz.setLeft(this.eliminar(raiz.getLeft(), dato));
        } else if (raiz.getElement() < dato) {
            raiz.setRight(this.eliminar(raiz.getRight(), dato));
        } else {
            if (raiz.getLeft() == null && raiz.getRight() == null) {
                raiz = null;
            } else if (raiz.getRight() != null) {
                raiz.setElement(this.sucesor(raiz));
                raiz.setRight(this.eliminar(raiz.getRight(), raiz.getElement()));
            } else {
                raiz.setElement(this.predecesor(raiz));
                raiz.setLeft(this.eliminar(raiz.getLeft(), raiz.getElement()));

            }
        }
        return raiz;
    }

    /*
    devuelvee el numero del dato del sucesor de la raiz introdcido 
     */
    public int sucesor(NodoABB raiz) {
        raiz = raiz.getRight();
        while (raiz.getLeft() != null) {
            raiz = raiz.getLeft();
        }
        return raiz.getElement();
    }

    /*
    Decuelve el numero del dato del predecesor de la raiz introducida
     */
    public int predecesor(NodoABB raiz) {
        raiz = raiz.getLeft();
        while (raiz.getRight() != null) {
            raiz = raiz.getRight();
        }
        return raiz.getElement();
    }

    /**
     * @return the pRoot
     */
    public NodoABB getpRoot() {
        return pRoot;
    }

    /*
    Ancestro comun más pequeño
     */
    public NodoABB buscarmca(int dato1, int dato2) {
        if (dato1 == dato2) {
            return this.devolverPadre(dato2);
        } else if (dato1 == this.getpRoot().getElement() || dato2 == this.getpRoot().getElement()) {
            return this.getpRoot();

        } else {
            return buscarmca(this.getpRoot(), dato1, dato2);
        }

    }

    public NodoABB buscarmca(NodoABB raiz, int dato1, int dato2) {
        NodoABB mca = null;
        if ((raiz.getElement() < dato2 && raiz.getElement() > dato1) || ((raiz.getElement() > dato2 && raiz.getElement() < dato1))) {
            mca = raiz;
        } else if ((dato2 < raiz.getElement() && dato1 < raiz.getElement()) && raiz.getLeft() != null) {
            if ((raiz.getLeft().getElement() == dato1) || (raiz.getLeft().getElement() == dato2)) {
                mca = raiz;
            } else {
                if (mca == null) {
                    mca = buscarmca(raiz.getLeft(), dato1, dato2);
                }
            }
        } else if ((raiz.getElement() < dato2 && raiz.getElement() < dato1) && raiz.getRight() != null) {
            if ((raiz.getRight().getElement() == dato1) || (raiz.getRight().getElement() == dato2)) {
                mca = raiz;
            } else {
                if (mca == null) {
                    mca = buscarmca(raiz.getRight(), dato1, dato2);

                }
            }
        }
        return mca;
    }

    /*
    Metodo que verifica siun arbol es degenerado
     */
    public boolean esDegenerado() {
        if (!this.esVacio()) {
            return this.esDegenerado(this.getpRoot(), true);
        } else {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio.");
        }
        return false;
    }

    public boolean esDegenerado(NodoABB raiz, boolean propiedad) {
        if (propiedad) {
            if (raiz.getLeft() == null && raiz.getRight() == null) {
                return true;
            } else if (raiz.getLeft() != null && raiz.getRight() != null) {
                return false;
            } else if (raiz.getLeft() != null) {
                propiedad = esDegenerado(raiz.getLeft(), propiedad);
            } else if (raiz.getRight() != null) {
                propiedad = esDegenerado(raiz.getRight(), propiedad);
            }

        }
        return propiedad;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(NodoABB pRoot) {
        this.pRoot = pRoot;
    }

}
