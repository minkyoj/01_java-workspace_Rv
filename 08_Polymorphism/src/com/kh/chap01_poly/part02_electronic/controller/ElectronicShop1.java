package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성을 적용 안했을때!!
public class ElectronicShop1 {
	
	// 용산 전자상가에 있는 가게
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 세개의 제품을 갖다 놓기 위해 자리만 마련해둠
	
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~~
		desk = d;
	}
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~~)
		note = n;
	}
	public void insert(Tablet t) { // Tablet d = new Tablet(~~~~)
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	

}
