public class D_VariableGlobaldanLokal {
    static int VarGlobal =34;

    public static void main(String[] args) {
        VarGlobal=25;
        System.out.println(" VarGlobal diakses di method main dengan nilai ="+VarGlobal);
        double VarLokal=3.14;
        System.out.println("VarLokal hanya bisa diakses dimethod main dengan nilai="+VarLokal);
        aksesVariableLokal();
    }
    public static void aksesVariableLokal(){
        System.out.println("VarLokal bisa diakses di method aksesVariableLokal dengan nilai="+VarGlobal);
        //VarLokal=2.5;
        System.out.println("VarLokal tidak bisa diakses di method aksesVariableLokal ini");

    }
}
