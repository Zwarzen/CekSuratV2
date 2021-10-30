package org.aplas.ceksuratv2;

import java.util.ArrayList;

public class MenuData {
    private static String [] menuList = {
            "Buat Surat",
            "Cek Surat",
            "Kirim Surat",
            "Tentang Aplikasi"
    };

    private static int[] menuImage = {
            R.drawable.report,
            R.drawable.book,
            R.drawable.envelope,
            R.drawable.house
    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();
        for (int position = 0; position < menuList.length; position++){
            Menu menu = new Menu();
            menu.setName(menuList[position]);
            menu.setPhoto(menuImage[position]);
            list.add(menu);
        }
        return list;
    }
}

