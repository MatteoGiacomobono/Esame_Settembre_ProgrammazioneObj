/* 
 * Author: Giacomobono Matteo   id: 1081643
 * Section: Controller
 * Fuction: Handle the API request and the path for Spring WS
 * 
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.json.simple.*;

//  Class that handle the GET call  //
@RestController
public class Controller {
	
	//Print all data from the dataset in Json form
		/**
		 * 
		 * @return lista completa
		 * @throws FileNotFoundException
		 * @throws IOException
		 */

}
