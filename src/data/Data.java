package data;

public class Data {
int dia;
int mes;
int ano;

 Data(int dia,int mes,int ano){
     this.dia=dia;
     this.ano=ano;
     this.mes=mes;
     }

    @Override
    public String toString() {
        return String.format("%s/%s/%s",dia,mes,ano);
    }
}
