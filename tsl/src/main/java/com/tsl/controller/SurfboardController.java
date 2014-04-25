package com.tsl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tsl.exception.SurfboardNotFound;
import com.tsl.model.Surfboard;
import com.tsl.service.SurfboardService;

@Controller
@RequestMapping(value = "/surfboard")
public class SurfboardController {

	@Autowired
	private SurfboardService surfboardService;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView newSurfboardPage() {
		ModelAndView mav = new ModelAndView("surfboard-new", "surfboard", new Surfboard());
		return mav;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewSurfboard(@ModelAttribute Surfboard surfboard, final RedirectAttributes redirectAttributes) {

		ModelAndView mav = new ModelAndView();
		String message = "New surfboard " + surfboard.getSurfboardname() + " was successfully created.";

		surfboardService.create(surfboard);
		mav.setViewName("redirect:/index.html");

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView surfboardListPage() {
		ModelAndView mav = new ModelAndView("surfboard-list");
		List<Surfboard> surfboardList = surfboardService.findAll();
		mav.addObject("surfboardList", surfboardList);
		return mav;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editSurfboardPage(@PathVariable Integer id) {
		ModelAndView mav = new ModelAndView("surfboard-edit");
		Surfboard surfboard = surfboardService.findById(id);
		mav.addObject("surfboard", surfboard);
		return mav;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editSurfboard(@ModelAttribute Surfboard surfboard, @PathVariable Integer id, final RedirectAttributes redirectAttributes)
			throws SurfboardNotFound {

		ModelAndView mav = new ModelAndView("redirect:/index.html");
		String message = "Surfboard was successfully updated.";

		surfboardService.update(surfboard);

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteSurfboard(@PathVariable Integer id, final RedirectAttributes redirectAttributes) throws SurfboardNotFound {

		ModelAndView mav = new ModelAndView("redirect:/index.html");

		Surfboard surfboard = surfboardService.delete(id);
		String message = "The surfboard " + surfboard.getSurfboardname() + " was successfully deleted.";

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
}
