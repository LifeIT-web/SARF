package com.sarf.web;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sarf.service.Qna_BoardService;
import com.sarf.service.Qna_ReplyService;
import com.sarf.vo.MemberVO;
import com.sarf.vo.PageMaker;
import com.sarf.vo.Qna_BoardVO;
import com.sarf.vo.Qna_ReplyVO;
import com.sarf.vo.SearchCriteria;

@Controller
@RequestMapping("/qna_board/*")
public class Qna_BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	Qna_BoardService service;
	
	@Inject
	Qna_ReplyService replyService;

	// 게시판 목록 조회
	@RequestMapping(value = "/faq", method = RequestMethod.GET)

	public String list()  throws Exception{
		logger.info("박수빈");
		
		return "/qna_board/faq";
	}
	// 게시판 목록 조회
	@RequestMapping(value = "/qna_list", method = RequestMethod.GET)

	public String list(Qna_BoardVO boardVO, Model model, @ModelAttribute("scri") SearchCriteria scri)  throws Exception{
		logger.info("박수빈");

		model.addAttribute("list",service.list(scri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		
		model.addAttribute("pageMaker", pageMaker);

		
		return "/qna_board/qna_list";
	}


	// 게시판 글 작성 화면
	@RequestMapping(value = "/qna_board/qna_writeView", method = RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("작성화면");	
	}
	
	// 게시판 글 작성
	@RequestMapping(value="/qna_board/qna_write", method = RequestMethod.POST)
	public String write(Qna_BoardVO boardVO, HttpSession session) throws Exception {
		logger.info("작성완료");

		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		String boardId = memberVO.getId();
		boardVO.setName(boardId);
		service.write(boardVO);
		return "redirect:/qna_board/qna_list";
	}
		
	// 게시물 조회
	@RequestMapping(value = "/qna_view", method = RequestMethod.GET)

	public String read(Qna_BoardVO boardVO, Qna_ReplyVO replyVO, @ModelAttribute("scri") SearchCriteria scri, Model model, RedirectAttributes rttr) throws Exception{

		logger.info("뷰");
			
		model.addAttribute("read", service.read(boardVO.getBno()));
		
		
		if (replyVO.getAns() == 1) {
			rttr.addAttribute("anwser", true);
		} else if(replyVO.getAns() == 0) {
			rttr.addAttribute("anwser", false);
		}
		
		List<Qna_ReplyVO> replyList = replyService.readReply(boardVO.getBno());
		model.addAttribute("replyList", replyList);
		
		return "qna_board/qna_view";
	}

	// 게시물 수정뷰
	@RequestMapping(value = "/qna_updateView", method = RequestMethod.GET)
	public String updateView(Qna_BoardVO boardVO, Model model) throws Exception{
		logger.info("없데이트뷰");
			
		model.addAttribute("update", service.read(boardVO.getBno()));
			
		return "qna_board/qna_updateView";
	}

}
