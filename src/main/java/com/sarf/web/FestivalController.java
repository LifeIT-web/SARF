package com.sarf.web;


import java.io.File;

import java.util.Iterator;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sarf.service.Fst_BoardService;
import com.sarf.vo.Fst_BoardVO;

@Controller
@RequestMapping("/festival/*")
public class FestivalController {
	private static final Logger logger = LoggerFactory.getLogger(FestivalController.class);

	@Inject
	Fst_BoardService service;
	
	// κ²μ? λͺ©λ‘ μ‘°ν
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		logger.info("~~~get list~~~");
		
		model.addAttribute("gangdonglist", service.list1());
		model.addAttribute("gangseolist", service.list2());
		model.addAttribute("gangnamlist", service.list3());
		model.addAttribute("gangbuklist", service.list4());
		
		return "/festival/fst_list";
	}

	// κ²μ? κΈ? ??± ?λ©?
	@RequestMapping(value = "/writeView", method = RequestMethod.GET)
	public String writeView() throws Exception{
		logger.info("~~~get λͺμ writeView~~~");
		
		return "/festival/fst_writeView";
	}
	
	// κ²μ? κΈ? ??±
	@RequestMapping(value="/write", method = RequestMethod.POST)
	public String write(Fst_BoardVO boardVO, MultipartHttpServletRequest mtf) throws Exception {
		logger.info("~~~λͺμ κ²μ? write~~~");
		
		Iterator<String> files = mtf.getFileNames();
		
		//??Ό κΈ°λ³Έκ²½λ‘
		String dftFilePath = mtf.getSession().getServletContext().getRealPath("/");
		System.out.println("@@@@@??Ό κΈ°λ³Έκ²½λ‘" + dftFilePath);
		
		// ?λ‘λ ??Ό?΄ ???₯?  κ²½λ‘ 
		String filePath = dftFilePath + "resources" + File.separator + "fileupload" + File.separator;
		System.out.println("?λ‘λ ??Ό ???₯κ²½λ‘" + filePath);
		
		// ?¬μ§μ ?λ‘λ?μ§? ??? ? default ?΄λ―Έμ?
		boardVO.setImg1("/resources/fileupload/bg.jpg");
		boardVO.setImg2("/resources/fileupload/bg.jpg");
		boardVO.setImg3("/resources/fileupload/bg.jpg");
		
		while (files.hasNext()) {
			String fileTag = (String)files.next();
			System.out.println(fileTag);
			// ??Ό ?΄λ¦? 
			MultipartFile file = mtf.getFile(fileTag);
			String fileName = file.getOriginalFilename(); 
			System.out.println("fileName@@@@ : " + fileName);
			
			// ??Ό ? ?‘ 
			try { 
				file.transferTo(new File(filePath + fileName)); 
			} catch(Exception e) { 
				System.out.println("?λ‘λ ?€λ₯?"); 
				e.printStackTrace();
			}
			
			// input file? κ°μλ§νΌ vo? set
			String img;
			
			if(fileTag.equals("file") && !(fileName.equals(""))) {
				System.out.println("1λ²ν?΄");
				img = "/resources/fileupload/" + fileName;
				boardVO.setImg1(img);
			}
			if(fileTag.equals("file2") && !(fileName.equals(""))) {
				System.out.println("2λ²ν?΄");
				img = "/resources/fileupload/" + fileName;
				boardVO.setImg2(img);
			}
			if(fileTag.equals("file3") && !(fileName.equals(""))) {
				System.out.println("3λ²ν?΄");
				img = "/resources/fileupload/" + fileName;
				boardVO.setImg3(img);
			}
		}
		
		service.write(boardVO);
				
		return "redirect:/festival/list";
	}

	// κ²μλ¬? ?? λ·?(κ°λ)
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(Fst_BoardVO boardVO, Model model) throws Exception{
		logger.info("~~~get updateView~~~");

		model.addAttribute("update", service.updateview(boardVO.getBno()));
		return "festival/fst_updateView";
	}
		
	// κ²μλ¬? ?? 
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Fst_BoardVO boardVO, @RequestParam String newkey) throws Exception{
		logger.info("~~~post updateView~~~");
		// keyκ°? ?λ‘μ΄ keyλ‘? λ³?κ²?
		boardVO.setKey(newkey);
		service.update(boardVO);
			
		return "redirect:/festival/list";
	}

	// κ²μλ¬? ?­? 
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Fst_BoardVO boardVO) throws Exception{
		logger.info("?λ¦¬νΈ");
			
		service.delete(boardVO.getBno());
			
		return "redirect:/festival/list";
	}
}
