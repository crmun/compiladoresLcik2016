/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import jsonparser.io.FileManager;
import jsonparser.tokenizer.JsonStringTokenizer;

/**
 *
 * @author CMunizaga
 */
public class JsonParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaDeEntrada = null;
        //Si recibimos el argumento intentamos leer el archivo y obtener las lineas
        if(args!= null && args.length > 0){                       
            cadenaDeEntrada = FileManager.obtenerLineas(args[0]);                        
        }else{//Si no recibimos argumento trabajaremos con un ejemplo en duro
            
            cadenaDeEntrada = "{  \n" +
                                 "   \"personas\":[  \n" +
                                 "      {  \n" +
                                 "         \"ci\":1234567,\n" +
                                 "         \"nombre\":\"Julio Pérez\",\n" +
                                 "         \"casado\":false,\n" +
                                 "         \"hijos\":[  \n" +
                                 "\n" +
                                 "         ]\n" +
                                 "      },\n" +
                                 "      {  \n" +
                                 "         \"ci\":7654321,\n" +
                                 "         \"nombre\":\"Juan Gómez\",\n" +
                                 "         \"casado\":true,\n" +
                                 "         \"hijos\":[  \n" +
                                 "            {  \n" +
                                 "               \"nombre\":\"Jorge\",\n" +
                                 "               \"edad\":18\n" +
                                 "            },\n" +
                                 "            {  \n" +
                                 "               \"nombre\":\"Valeria\",\n" +
                                 "               \"edad\":16\n" +
                                 "            }\n" +
                                 "         ]\n" +
                                 "      }\n" +
                                 "   ]\n" +
                                 "}";
        }
        JsonStringTokenizer tk = new JsonStringTokenizer(cadenaDeEntrada);
        tk.realizarAnalisisLexico();
    }
    
}
