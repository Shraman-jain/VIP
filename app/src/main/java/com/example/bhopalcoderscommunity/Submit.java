package com.example.bhopalcoderscommunity;

import java.io.Serializable;

public class Submit implements Serializable {

    String name,college,email,gen,yos,expe,mob,area,tech,spez,link,fb,res,git,why,pref,suug;
int age;


    public Submit(String name, String college, String email, int age, String gen, String yos, String mob,String area, String tech, String spez, String link, String fb, String res, String git, String why, String expe, String pref, String suug) {
        this.name = name;
        this.college = college;
        this.email = email;
        this.age = age;
        this.gen = gen;
        this.yos = yos;
        this.mob = mob;
        this.area = area;
        this.tech = tech;
        this.spez = spez;
        this.link = link;
        this.fb = fb;
        this.res = res;
        this.git = git;
        this.why = why;
        this.pref = pref;
        this.suug = suug;
        this.expe = expe;

    }

    public String getYos() {
        return yos;
    }

    public void setYos(String yos) {
        this.yos = yos;
    }

    public String getExpe() {
        return expe;
    }

    public void setExpe(String expe) {
        this.expe = expe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCollege()
    {
        return college;
    }

    public void setCollege
            (String college)
    {
        this.college = college;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getSpez() {
        return spez;
    }

    public void setSpez(String spez) {
        this.spez = spez;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    public String getSuug() {
        return suug;
    }

    public void setSuug(String suug) {
        this.suug = suug;
    }
}
