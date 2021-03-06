package com.busra.bitirme.commons.services.web;

import com.busra.bitirme.commons.daos.web.GirisSayfasiDao;
import com.busra.bitirme.commons.entities.Satici;

public class GirisSayfasiService{
	
	private GirisSayfasiDao girisSayfasiDao = new GirisSayfasiDao();	
	
	public Satici kullaniciDogrulama(String mail, String sifre) {
		Satici sonucSatici = girisSayfasiDao.mailAdresineGoreBul(mail);
		return sonucSatici;
	}
}
/*
 * TODO: SSL fonksiyonu gelecek, sifreleme icin Veritabanındaki emaile
 * kayitli şifreyi decrypt edip textboxdaki password ile karşılaştıracak
 * maili unique yap, tek mail tek kullanıcı
 */