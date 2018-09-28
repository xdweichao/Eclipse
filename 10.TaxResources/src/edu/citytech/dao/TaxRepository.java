package edu.citytech.dao;
import java.util.ArrayList;
import java.util.List;

import edu.citytech.cst.marginaltax.MarginalTax;

public class TaxRepository {

	public static List<MarginalTax> getTaxRules(){
		List<MarginalTax> list = new ArrayList<>();
		
		MarginalTax t1= new MarginalTax(2017,"SI",.10f,		0f,			9_326f);
		MarginalTax t2= new MarginalTax(2017,"SI",.15f,		9_326f,		37_951f);
		MarginalTax t3= new MarginalTax(2017,"SI", .25f,	37_951f,	91_909f);
		MarginalTax t4= new MarginalTax(2017,"SI", .28f,	91_909f,	191_651f );
		MarginalTax t5= new MarginalTax(2017,"SI", .33f,	191_651f , 	416_701f );
		MarginalTax t6= new MarginalTax(2017,"SI", .35f,	416_701f , 	418_401f );
		MarginalTax t7= new MarginalTax(2017,"SI", .396f,	418_401f,	2_000_000f );
		
		MarginalTax h1= new MarginalTax(2017,"HH",.10f,	0f,		 	13_351);
		MarginalTax h2= new MarginalTax(2017,"HH",.15f,	13_351 	,	50_801);
		MarginalTax h3= new MarginalTax(2017,"HH",.25f,	50_801  ,	131_201);
		MarginalTax h4= new MarginalTax(2017,"HH",.28f,	131_201 ,	212_501);
		MarginalTax h5= new MarginalTax(2017,"HH",.33f,	212_501 , 	416_701);
		MarginalTax h6= new MarginalTax(2017,"HH",.35f,	416_701 , 	444_551);
		MarginalTax h7= new MarginalTax(2017,"HH",.396f,444_501	,	2_000_000f );
		
		MarginalTax mfs1= new MarginalTax(2017,"MFS",.10f,	0f,		 		9_321f );
		MarginalTax mfs2= new MarginalTax(2017,"MFS",.15f,	9_321f , 		37_951f);
		MarginalTax mfs3= new MarginalTax(2017,"MFS",.25f,	37_951f , 		76_551);
		MarginalTax mfs4= new MarginalTax(2017,"MFS",.28f,	76_551, 		116_676);
		MarginalTax mfs5= new MarginalTax(2017,"MFS",.33f,	116_676 ,		208_351f);
		MarginalTax mfs6= new MarginalTax(2017,"MFS", .35f,	208_351f , 		235_351);
		MarginalTax mfs7= new MarginalTax(2017,"MFS", .396f,235_351,		2_000_000f);
		
		MarginalTax mfj1= new MarginalTax(2017,"MFJ",.10f,	0f,		 	18_650f );
		MarginalTax mfj2= new MarginalTax(2017,"MFJ",.15f,	18_651 ,	75_900 );
		MarginalTax mfj3= new MarginalTax(2017,"MFJ",.25f,	75_901 ,	153_101f );
		MarginalTax mfj4= new MarginalTax(2017,"MFJ",.28f,	153_101f,	233_351f );
		MarginalTax mfj5= new MarginalTax(2017,"MFJ",.33f,	233_351f , 	416_701f );
		MarginalTax mfj6= new MarginalTax(2017,"MFJ",.35f,	416_701f ,	470_701f);
		MarginalTax mfj7= new MarginalTax(2017,"MFJ",.396f,	470_701f,	2_000_000f);
		
		MarginalTax qw1= new MarginalTax(2017,"QW", .10f,	0f,		 	18_650f);
		MarginalTax qw2= new MarginalTax(2017,"QW",.15f,	18_651,	 	75_900);
		MarginalTax qw3= new MarginalTax(2017,"QW",.25f,	75_901,	 	153_101f);
		MarginalTax qw4= new MarginalTax(2017,"QW",.28f,	153_101f,	233_351f);
		MarginalTax qw5= new MarginalTax(2017,"QW", .33f,	233_351f, 	416_701f);
		MarginalTax qw6= new MarginalTax(2017,"QW",.35f,	416_701f,	470_701f);
		MarginalTax qw7= new MarginalTax(2017,"QW",.396f,	470_701f,	2_000_000f);

		MarginalTax na1= new MarginalTax(2017,"NA",.396f,	0f,		 	2_000_000f);

		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		list.add(h1);
		list.add(h2);
		list.add(h3);
		list.add(h4);
		list.add(h5);
		list.add(h6);
		list.add(h7);
		
		list.add(mfs1);
		list.add(mfs2);
		list.add(mfs3);
		list.add(mfs4);
		list.add(mfs5);
		list.add(mfs6);
		list.add(mfs7);
		
		list.add(mfj1);
		list.add(mfj2);
		list.add(mfj3);
		list.add(mfj4);
		list.add(mfj5);
		list.add(mfj6);
		list.add(mfj7);
		
		list.add(qw1);
		list.add(qw2);
		list.add(qw3);
		list.add(qw4);
		list.add(qw5);
		list.add(qw6);
		list.add(qw7);
		
		list.add(na1);
		
		return list;
	};
}
