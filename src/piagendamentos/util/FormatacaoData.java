
package piagendamentos.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoData {
    
    //método para receber um Date e retorná-lo no padrão yyyy-MM-dd
	
    public static String convertToString(Date data){
		
        //classe para formatação de datas no java
		
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
        //retornando a data formatada
		
        return sdf.format(data);
		
    }
    
    public static String convertToStringExibicao(Date data){
		
        //classe para formatação de datas no java
		
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
        //retornando a data formatada
		
        return sdf.format(data);
		
    }
    
	
    //método para redceber uma string yyyy-MM-dd e gerar um Date
	
    public static Date convertToDate(String data){
		
        //Exemplo: 2016-05-16
		
	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        Date dataConv;
        
        try {
            
            dataConv = formato.parse(data);
            
        } 
        catch (ParseException ex) {
            
            System.out.println("Erro data");
            
            return null;
        }

	return dataConv;	
    }
    
    public static String getDateTime() {
        
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
	Date date = new Date();
        
	return dateFormat.format(date);
    }
    
    public static boolean verificaDataAnterior(Date dataSistema, Date dataComparar){
        
	boolean dataValida;
        
	if (dataSistema.before(dataComparar)){
            
            dataValida = true;
                
	}
	else if (dataSistema.after(dataComparar)){
            
		dataValida = false;
        }
	else{
            
            dataValida = true;
            
        }
		
	return dataValida;
    }
    
}
