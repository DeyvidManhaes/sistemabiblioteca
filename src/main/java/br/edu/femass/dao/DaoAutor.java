package br.edu.femass.dao;

import br.edu.femass.model.Autor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoAutor {

private static List<Autor> autores = new ArrayList<Autor>();

public void gravar(Autor autor) throws Exception{
    autores.add(autor);

    ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(autores);

    FileOutputStream out = new FileOutputStream("autor.json");
    out.write(json.getBytes());
    out.close();

    }

public  List<Autor> getAutores() throws  Exception{

    FileInputStream in = new FileInputStream("autor.json");
    String json = new String(in.readAllBytes());

    ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.readValue(json, new TypeReference<List<Autor>>(){});

    return autores;
   }

}
