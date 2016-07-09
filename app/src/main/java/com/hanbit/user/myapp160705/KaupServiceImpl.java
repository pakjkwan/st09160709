package com.hanbit.user.myapp160705;

/**
 * Created by hb on 2016-07-09.
 */
public class KaupServiceImpl implements KaupService{
    @Override
    public String execute(KaupBean bean) {
        String name = bean.getName();
        int height=bean.getHeight(),weight=bean.getWeight();
        int index = (weight/height*height)*10000;
        String result = "";
       if(index >= 20){
            result = "비만";
       }else if(index >= 18 ){
            result = "과체중";
       }else if(index >= 15){
            result = "정상";
       }else if(index >= 13){
            result = "저체중";
       }else{
            result = "극심한 저체중";
       }
        return name+" : "+result;
    }
}
