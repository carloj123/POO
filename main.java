import java.util.List;
import java.util.Stack;
import java.util.stream.Collector;

public class main {
    public static List<Funcionario> filtro(List<Funcionario> lista, Filtrador<Funcionario> f) {
        List<Funcionario> list = new Stack<>();
        for (int i = 0; i < lista.size(); i++) {
            if (f.filter(lista.get(i)).equals(true)) {
                list.add(lista.get(i));
            }
        }
        return list;
    }
    //public static List<Funcionario> filtro2(Filtrador2<Funcionario> f){
     //   List<Funcionario>lixta=new Stack<>();
      //  for( int i = 0; i<lixta.size();i++){
      //      if(f.filter(lixta.get(i))){// nao entendi onde ele nota ondeta a logica
       //         lixta.add(lixta.get(i).getNroDependentes());
      //      }

     //   }
     //   return lixta;
    //}



    public static void main(String args[]) throws InterruptedException {
        List<Funcionario>list=new Stack<>();
        list.add( new Funcionario(111,"Carlos",2000,5,true));
        list.add( new Funcionario(114,"Marco",2000,5,false));
        list.add( new Funcionario(1131,"Carlo Jose",3000,5,true));
        list.add( new Funcionario(14411,"Anelize",250000,5,false));
        
        List<Funcionario> soIns = list.stream()
        		                      .filter((Funcionario f)->f.getInsalubridade())
        		                      .collect(Collector.toList());
        
        for (Funcionario i:filtro(list,f->f.getInsalubridade())){
            System.out.println(i);
        }
        System.out.println("\n\n\n\n\n\n");
        for(Funcionario i : filtro(list, (Funcionario k)->k.getNroDependentes()>0)){
            System.out.println(i);
        }



    }
}
