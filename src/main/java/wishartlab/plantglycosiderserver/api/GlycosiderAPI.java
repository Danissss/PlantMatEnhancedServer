package wishartlab.plantglycosiderserver.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import WishartLab.PlantGlycosider.PlantGlycosider;


@RestController
@RequestMapping("/api/generate")
public class GlycosiderAPI {
	
//	@Autowired
//	private IFooService service;
	
	
	@GetMapping(path = "/{structure}")
	@ResponseStatus(code = HttpStatus.OK)
    public Map<String, Object> generateStructure(@PathVariable("structure") String structure) {
		
		Map<String, Object> json = new LinkedHashMap<String, Object>();
		
		// json.put("test", structure);
		PlantGlycosider pgs = new PlantGlycosider();
		try {
			Map<String, String[]> result = pgs.runPlantMatAPI(structure, null);
			String[] smiles = result.get("result");
			if(smiles == null) {
				String[] error = result.get("error");
				json.put("Error", error[0]);
			}
			else {
				
				for(int i = 0; i < smiles.length; i++) {
					json.put(String.valueOf(i), smiles[i]);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			json.put("Error", "Internal Error");
		}
		
//		json.put("test", "test");
		
		
		return json;
    }
	
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public Long create(@RequestBody Foo resource) {
//        Preconditions.checkNotNull(resource);
//        return service.create(resource);
//    }
	
//	@PutMapping(value = "/{id}")
//	public void update(@PathVariable( "id" ) Long id, @RequestBody Foo resource) {
//		//
//    }
	
//	@DeleteMapping(value = "/{id}")
//  @ResponseStatus(HttpStatus.OK)
//	public void delete(@PathVariable("id") Long id) {
//        service.deleteById(id);
//    }
}
