package com.example.learn.controller;

import com.example.learn.model.Mahasiswa;
import com.example.learn.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;;

@Controller
public class MahasiswaController {
    private MahasiswaService mahasiswaService;

    @Autowired
    public void setMahasiswaService(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }
    
        
    
	@RequestMapping("/mahasiswa")
	public String MahasiswaList(Model model) {
       model.addAttribute("mahasiswas", mahasiswaService.ListMahasiswa());
		return "mahasiswa";
	}
	
	@RequestMapping(value="/mahasiswa/create", method = RequestMethod.GET)
	public String ShowMahasiswaForm(Model model) {
		model.addAttribute("mahasiswa", new Mahasiswa());
		return "formMahasiswa";
	}

	@RequestMapping(value="/mahasiswa/create", method = RequestMethod.POST)
	public String SaveMahasiswa(Model model, Mahasiswa mahasiswa) {
    	model.addAttribute("mahasiswa", mahasiswaService.saveOrUpdate(mahasiswa));
    	return "redirect:/mahasiswa";
	}

	@RequestMapping(value="/mahasiswa/edit/{id}", method = RequestMethod.GET)
	public String ShowMahasiswaEditForm(@PathVariable Integer id, Model model){
		model.addAttribute("mahasiswa", mahasiswaService.getIdMahasiswa(id));
    	return "formMahasiswa";
	}

	@RequestMapping(value="/mahasiswa/destroy/{id}", method = RequestMethod.POST)
	public String DestroyDataMahasiswa(@PathVariable Integer id, Model model){
    	mahasiswaService.DeleteData(id);
    	return  "redirect:/mahasiswa";
	}
}
