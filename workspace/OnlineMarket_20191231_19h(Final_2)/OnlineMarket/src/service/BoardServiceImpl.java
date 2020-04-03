package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.BoardVO;
import vo.CategoryVO;
import vo.UserVO;
import dao.BoardDao;
import dao.BoardDaoImpl;
import dao.CartDao;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import data.Database;
import data.Session;

public class BoardServiceImpl implements BoardService {

	private static BoardServiceImpl instance;

	private BoardServiceImpl() {
	}

	public static BoardServiceImpl getInstance() {
		if (instance == null) {
			instance = new BoardServiceImpl();
		}
		return instance;
	}

	BoardDao boardDao = BoardDaoImpl.getInstance();
	CategoryDao categoryDao = CategoryDaoImpl.getInstance();

	@Override
	public void write() {

		UserVO writer = Session.loginUser; // session

		BoardVO board = new BoardVO();
		
		board.setWriter(writer.getId());	//hh.joo 20191231 add
//		System.out.println(writer.getId());

		// remove
		// printCategoryList(); //print selling product list


		Scanner s = new Scanner(System.in);

		/*
		 * 결제내역 리스트 출력하기
		 *//* System.out.println(); */
		PayService payService = PayServiceImpl.getInstance();
		payService.payList();
		
		System.out.println("이전페이지로 돌아가겠습니까?(Y/N)");
		String answer = s.nextLine();
		if(answer.equals("Y") || answer.equals("y")){
			return; 
		}
		
		
		
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();
		CategoryVO category = new CategoryVO();
		
		
		System.out.println("후기를 작성할 상품 ID를 입력해주세요.");
		int productId = Integer.parseInt(s.nextLine());
		


		CategoryVO categoryCheck = categoryDao.selectCategory("ID", productId);
	
		if(categoryCheck != null){
			//board.setProductId(category.getProductId());
			board.setProductId(productId);  //hh.joo 20191231 add
				
		}
		else {
			System.out.println("일치하는 상품이 없습니다.");
			write();
		}
//		board.setProductId(productId);
		System.out.println("별점 개수를 입력해주세요.");
		int star = Integer.parseInt(s.nextLine());
		board.setStar(star);
		
		System.out.println("내용을 입력해주세요.");
		String contents = s.nextLine();
		board.setContents(contents);
		
//		board.setWriter(writer.getName());

		String boardRegDate;
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		boardRegDate = format1.format(time);
		board.setRegDate(boardRegDate);
		
		boardDao.insertBoard(board);
		}

	@Override
	public void selectMyBoardAndPrint() {
		UserVO writer = Session.loginUser; // session
		BoardVO board = new BoardVO();
		if (writer == null) {
			System.out.println("로그인을 먼저 해주세요!");
			return;
		}
		else
		{
			String UserId = writer.getId();
			
			
//			System.out.println(">>>>>>>>" + UserId);	//test
			
			boardDao.selectBoardAndPrint("WRITER", UserId);
		}
		
	}

	@Override
	public void boardListAll() {
//		BoardDao board = BoardDao.get
//		selectBoardList()
		boardDao.boardListAll();
	}
	

//	@Override
//	public void boardList() {
//
//		ArrayList<BoardVO> boardList = boardDao.selectBoardList();
//		CategoryVO category = new CategoryVO();
//		System.out
//				.println("---------------------------------내가쓴리뷰보기----------------------------------");
//
//		// for(int i = 0 ; i < boardList.size() ; i++)
//		for (int i = boardList.size() - 1; 0 <= i; i--) {
//			BoardVO board = boardList.get(i);
//			System.out.println(i + 1 + " 상품번호 : " + board.getProductId()
//					+ "\t" + board.getNo() + " 별점 : " + board.getStar() + "\t"
//					+ board.getContents() + "\t" + "작성자 : " + board.getWriter()
//					+ "날짜 : " + board.getRegDate());
//		}
//		System.out
//				.println("------------------------------------------------------------------------------------");
//		System.out.println();
//
//	}

//	@Override
//	public void proBoardList() {
//		ArrayList<BoardVO> proBoardList = boardDao.selectBoardList();
//		Database database = Database.getInstance();
//		/* 상품내역출력 */
//		Scanner s = new Scanner(System.in);
//		System.out.println("상품을 선택해주세요.");
//
//		int productId = Integer.parseInt(s.nextLine());
//
//		System.out
//				.println("---------------------------------상품별리뷰보기----------------------------------");
///*		CategoryVO categoryCheck = categoryDao.selectCategory("ID", productId);
//	
//		if(categoryCheck != null){
//			board.setProductId(category.getProductId());
//			}*/
//		for (int i = 0; i < database.tb_category.size(); i++) {
//			BoardVO board = proBoardList.get(i);
////			CategoryVO category = new CategoryVO();
//			CategoryVO categoryCheck = categoryDao.selectCategory("ID", productId);
//			if (/*productId == category.getProductId()*/categoryCheck != null) {
//				System.out.println(i + 1 + " 상품번호 : " + categoryCheck.getCategoryId() + "\t"
//						+ board.getNo() + " 별점 : " + board.getStar() + "\t"
//						+ board.getContents() + "\t" + "작성자 : "
//						+ board.getWriter() + "날짜 : " + board.getRegDate());
//			} else {
//				System.out.println("test");
//			}
//
//		}
//	}
}
