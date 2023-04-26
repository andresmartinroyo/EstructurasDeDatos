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

    //Arboles AVL
    public void insertarAVL(int valor) {
        this.insertar(valor);

    }

    public void verBalance(int valor) {
        this.verBalance(this.getpRoot(), valor);
    }

    public void verBalance(NodoABB raiz, int valor) {
        if (raiz.getElement() < valor) {
           verBalance(raiz.getLeft(),valor);
        } else if (raiz.getElement() > valor) {
           verBalance(raiz.getRight(),valor);
        }
        
        
    }
    
        //Metodo para buscar
    public NodoABB search(int d, NodoABB r){
        if (this.getpRoot(); == null){
            return null;
        }else if (r.getData() == d){
            return r;
        }else if (r.getData() < d){
            return search(d,r.getRight());
        }else{
            return search(d,r.getLeft());
        }
    }
    
    //Metodo para obtener el factor de equilibrio
    public int getFE(NodoABB x){
        if (x == null){
            return -1;
        }else{
            return x.key;
        }
    }
    
    //Rotación simple a la izquierda
    public NodoABB rotateLeft(NodoABB c){
        NodoABB aux = c.left;
        c.left = aux.right;
        aux.right = c;
        c.key = Math.max(getFE(c.left), getFE(c.right))+1;
        aux.key = Math.max(getFE(aux.left), getFE(aux.right))+1;
        return aux;
    }
    
    //Rotación simple a la derecha
    public NodoABB rotateRight(NodoABB c){
        NodoABB aux = c.right;
        c.right = aux.left;
        aux.left = c;
        c.key = Math.max(getFE(c.left), getFE(c.right))+1;
        aux.key = Math.max(getFE(aux.left), getFE(aux.right))+1;
        return aux;
        
    }
    
    //Rotacion Doble a la izquierda
    public NodoABB rotateDoubleLeft(NodoABB c){
        NodoABB temp;
        c.left = rotateRight(c.left);
        temp = rotateLeft(c);
        return temp;
    }
    
    //Rotacion Doble a la Derecha
    public NodoABB rotateDoubleRight(NodoABB c){
        NodoABB temp;
        c.right = rotateLeft(c.right);
        temp = rotateRight(c);
        return temp;
       
    }
    
    //Insertar AVL
    public NodoABB insertAVL(NodoABB nuevo, NodoABB subAR ){
        NodoABB nuevoPadre = subAR;
        if (nuevo.data < subAR.data){
            if (subAR.left == null){
                subAR.left = nuevo;
            }else{
                subAR.left = insertAVL(nuevo,subAR.left);
                if((getFE(subAR.left)-getFE(subAR.right) == 2)){
                    if (nuevo.data < subAR.left.data){
                        nuevoPadre = rotateLeft(subAR);
                    }else{
                        nuevoPadre = rotateDoubleLeft(subAR);
                    }
                        
                }
            }
        }else if (nuevo.data > subAR.data){
            if (subAR.right == null){
                subAR.right = nuevo;
            }else{
                subAR.right = insertAVL(nuevo,subAR.right);
                if((getFE(subAR.left)-getFE(subAR.right) == 2)){
                    if (nuevo.data > subAR.right.data){
                        nuevoPadre = rotateRight(subAR);
                    }else{
                        nuevoPadre = rotateDoubleRight(subAR);
                    }
                }
            }
        }else{
            System.out.println("Nodo Duplicado");
        }
        //Actualizando la Altura
        if ((subAR.left == null) && (subAR.right != null)){
            subAR.key = subAR.right.key + 1;
        }else if ((subAR.right == null) && (subAR.left != null)){
            subAR.key = subAR.left.key +1;
        }else{
            subAR.key = Math.max(getFE(subAR.left), getFE(subAR.right)) +1;
        }
        return nuevoPadre;
        
    }
    

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(NodoABB pRoot) {
        this.pRoot = pRoot;
    }

}
