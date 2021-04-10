package mygitpackage;

public class MyGitClass {
	
public static void main(String[] args) {
	System.out.println("Version 1");
	System.out.println("Version 1, 2.commit");
	System.out.println("Version 1, 2, 3.commit");
	
	System.out.println("Ziya Branchinde yapilan kodlar");

		
	/* 
	  
	  Staging Area(Gecici Bellek)
	  Local Repository(yerel depo)
	  Remote Repository(Uzak Sunucu)
	  
	 
	  Eclipse'den Githup'a (ilk Version)
	  
	  1.Javadaki proje icine girilmesi lazim
	  
	  2.git init  ( ilk seferde yapilmasi yeterlidir )
	  
	  			Projenin en basinda Tek sefer kullanilir
	 			Projenin icindeyken, git init dedigimizde, .git folderi olusur.
	 			Bu folderda git bilgilerimiz saklanir. Kisaca local repository olusturur.
	  
	    
	  3.git status (zorunlu degil)-> kirmiziliklar bilgisayarimdaki degisiklikleri gosteriyor
	  
	  4.git add
	  
	  5.git status (zorunlu degil)-> yesil renkler kodlarin staging area da oldugunu gosterir
	  
	  6.Github'da repository olusturulur
	  
	  			---GITHUB DA REPOSITORY NASIL OLUSTURULUR----
		Assagidaki islemler tek seferligine yapilir
		https://github.com/
		New e tikla
		Repository Name : mygitproject
		Public yapalim
		Create repository ye tikla
	  
	  7.git commit -m "mesaj buraya yazilir"   (yeni versiyon olusturulur. Staging area daki kodlari local repoya ekler)
	  
	  8.git remote add origin (kismi github'dan kopyalaniyor cmd ye atiliyor)
	  
	  
	  		resime bakabilirsin.(github proje ekleme 8.madde)
	  git remote add origin https://github.com/ZiyaaddinYaramis/winter2021turkish.git
	  		
	  		: Bu islem projeyi ilk sefer github a gondermek icin zorunludur. 
			Sonraki islemlerde bu adima gerek olmayacak
	   
	  9.git push -u master (github a yeni versiyonlarimizi gonderiyoruz)
	  
	  
	  		NOTE: "main" kismini assaigidaki gibi "master" ile degistirelim
			git push -u origin master   : Bu islem ilk olarak tek seferlik yapilir 
			
			
	  10. Sayfayayi yenileyelim (Replace Editor Content Gorurseniz o secenege tiklayin)
	
		Local bilgisayarimdaki kodlar github.com a copyalanmis oldu
		
		
	 
	 Github'dan Eclipse'e
		================================================
	   1. git fetch -> github'daki kodlari local repository' e alir ama kodlari birlestirmez
	   2. git merge -> githubdaki codlari bilgisayarimizdaki kodlarla birlestirir
	   3. git pull = git fetch + git merge          
		================================================
	
 		NOTE: git pull yeterli, ama git fetch ve git merge ild baslarda adim adim gitmek icin onemli
	 
	 
	 		Degisiklikleri yeni version (Kisa):
 		  
 		  1.git add .
 		  2.git commit -m "Mesaj buraya"
 		  3.git push  
 		  
 		  
 		  	Degisiklikleri yeni version (Uzun):
 		  	
 		  1. Kod ekle
    	  2.git status (zorunlu degil)-> kirmiziliklar bilgisayarimdaki degisiklikleri gosteriyor
    	  3.git add . -> staging area ya kodlarimizi ekler
    	  4.git status (zorunlu degil)-> yesil renkler kodlarin staging area da oldugunu gosterir
    	  5.git commit -m "ISTEGINMIZ MESAJI VEREBILIRIZ" -> yeni versiyon olusturdum. Staging area daki kodlari local repoya ekler
    	  6.git status (zorunlu degil)-> kirmiziliklar bilgisayarimdaki degisiklikleri gosteriyor
    	  7.git push -> github a yeni versiyonlarimizi gonderiyoruz
	 
	 */	
	}	

}
 