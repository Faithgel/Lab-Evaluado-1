package me.faithgel;
//imports
import me.faithgel.util.TerminalColors;
import me.faithgel.lista.Lista;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        Lista lista = new Lista();
        testLista(lista, array);
    }

    private static void testLista(Lista l, int[] push){
        System.out.println(TerminalColors.BLUE_BOLD + "--- Testing Lista class  ---" + TerminalColors.RESET);

        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD + "--Testeando insercion de elementos--" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        for(int i = 0; i < push.length; i++){
            if(l.insertNth(i, push[i])){
                System.out.println(TerminalColors.GREEN+"Insertado correctamente ૮ ˶ᵔ ᵕ ᵔ˶ ა"+TerminalColors.RESET);
                System.out.println(TerminalColors.BLUE_BOLD+"Lista: "+TerminalColors.RESET+l);
                System.out.println(TerminalColors.BLUE_BOLD+"Tamaño: "+TerminalColors.RESET+l.getSize());
            }else{
                System.err.println("Error al insertar >:(");
                return;
            }
        }

        if(l.getSize() != push.length || !Arrays.toString(push).equals(l.toString())){
            System.err.println("Error: el tamaño de la lista no es correcto y/o los datos no coinciden >:(");
            System.err.println("Tamaño esperado: " + push.length + " Tamaño actual: " + l.getSize());
            System.err.println("Datos esperados: " + Arrays.toString(push) + " Datos actuales: " + l);
            return;
        }

        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD+"--Testeando eliminacion de elementos--"+TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);

        int size = l.getSize();
        for(int i = 0; i < size; i++){
            int pos = (int) (Math.random() * l.getSize());
            if(l.deleteNth(pos)){
                System.out.println(TerminalColors.GREEN+"Eliminado correctamente ⸜(｡˃ ᵕ ˂ )⸝");
                System.out.println(TerminalColors.BLUE_BOLD+"Lista actual: "+TerminalColors.RESET+l);
                System.out.println(TerminalColors.BLUE_BOLD+"Tamaño actual: "+TerminalColors.RESET+l.getSize());
                System.out.println(TerminalColors.BLUE_BOLD+"Posicion eliminada: "+TerminalColors.RESET+pos);
            }else{
                System.err.println("Error al eliminar :C");
                return;
            }
        }

        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD+"--Testeando swap de elementos--"+TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        for(int i = 0; i < push.length; i++){
            l.insertNth(i, push[i]);
        }
        for (int i = 0; i < push.length; i++) {
            int pos1 = (int) (Math.random() * l.getSize());
            int pos2 = (int) (Math.random() * l.getSize());
            if(l.swapNodes(pos1, pos2)){
                System.out.println(TerminalColors.GREEN+"Intercambiado correctamente (๑•̀ㅂ•́)و✧"+TerminalColors.RESET);
                System.out.println(TerminalColors.BLUE+ "Posicion 1: " + TerminalColors.RESET + pos1  + TerminalColors.BLUE + " Posicion 2: " + TerminalColors.RESET + pos2);
                System.out.println(TerminalColors .BLUE + "Lista actual: " + TerminalColors.RESET + l);
            }else{
                System.err.println("Error al intercambiar :C");
                return;
            }

        }

        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD+"--Testeando inversion de lista--"+TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        l.reverse();
        System.out.println(TerminalColors.BLUE+"Lista invertida: "+ TerminalColors.RESET + l);
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD+"--Testeando eliminacion de elementos repetidos--"+TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        l.deleteDuplicates();
        System.out.println(TerminalColors.BLUE+"Lista sin elementos repetidos: "+ TerminalColors.RESET + l );
        System.out.println(TerminalColors.CYAN_BOLD + "---------------------------------" + TerminalColors.RESET);
        System.out.println(TerminalColors.GREEN_BOLD+"--Implementacion sin errores (๑•̀ㅂ•́)و✧ "+TerminalColors.RESET);

    }


}