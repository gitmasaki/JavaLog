package jp.techacademy.masaki.ohmura.javalog;

import android.util.Log;

class Human extends Animal {

    public Human (String name, int age , String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        }

    public void say(){
        Log.d("javatest","私の名前は" + this.name + "です。年は" + this.age +"歳です。");
    }

    public void think(){
        Log.d("javatest" , "私は" + this.hobby + "について考える");
    }
}
