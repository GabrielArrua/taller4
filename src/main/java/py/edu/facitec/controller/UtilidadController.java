package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller//indica que se trata de una clase

public class UtilidadController {
   //mapea una url para gestionar
   @RequestMapping("/comollegar")
    public String index(){
	System.out.println("pagina");
	

    //nombre del archivo
	return "comollegar";
}

}