package in.neuron.demo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.neuron.demo.bean.Question;
import in.neuron.demo.service.QuestionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService service;

	@GetMapping("/show")
	public List<Question> findAll() {
		return service.showAll();
	}

}
