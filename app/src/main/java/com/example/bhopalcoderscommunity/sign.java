package com.example.bhopalcoderscommunity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sign extends AppCompatActivity {
EditText email,name,college,mobno,ln,fb,git,why,sug,res,exp,pref,othet;
Button sign;
Spinner Yos;
SeekBar age;
RadioGroup gender;
RadioButton male,female,other;
CheckBox isagree,rO,de,market,write,program,manage,py,java,react,ang,html,php,node,sql,c,go,oth,webd,appd,sd,ml,block,cc,dev,quant,compe,prod,cyber;
TextView t;
int ages=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        sign=(Button)findViewById(R.id.signbt);
        email=(EditText)findViewById(R.id.emailET);
        name=(EditText)findViewById(R.id.nameET);
        college=(EditText)findViewById(R.id.collegeET);
        mobno=(EditText)findViewById(R.id.mobnoET);
        Yos=(Spinner) findViewById(R.id.yosSP);
        age=(SeekBar)findViewById(R.id.agSB);
        gender=(RadioGroup)findViewById(R.id.genderRG);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton)findViewById(R.id.female);
        other=(RadioButton)findViewById(R.id.ot);
        rO=(CheckBox)findViewById(R.id.roCB);
        de=(CheckBox)findViewById(R.id.desCB);
        market=(CheckBox)findViewById(R.id.marketCB);
        write=(CheckBox)findViewById(R.id.writeCB);
        program=(CheckBox)findViewById(R.id.programCB);
        manage=(CheckBox)findViewById(R.id.manageCB);
        py=(CheckBox)findViewById(R.id.pyCB);
        java=(CheckBox)findViewById(R.id.jsCB);
        react=(CheckBox)findViewById(R.id.rtCB);
        ang=(CheckBox)findViewById(R.id.angCB);
        html=(CheckBox)findViewById(R.id.htmlCB);
        php=(CheckBox)findViewById(R.id.phpCB);
        node=(CheckBox)findViewById(R.id.nodeCB);
        sql=(CheckBox)findViewById(R.id.sqlCB);
        c=(CheckBox)findViewById(R.id.cCB);
        go=(CheckBox)findViewById(R.id.goCB);
        oth=(CheckBox)findViewById(R.id.othCB);
        webd=(CheckBox)findViewById(R.id.wdCB);
        appd=(CheckBox)findViewById(R.id.adCB);
        sd=(CheckBox)findViewById(R.id.sdCB);
        ml=(CheckBox)findViewById(R.id.dsCB);
        block=(CheckBox)findViewById(R.id.bcCB);
        cc=(CheckBox)findViewById(R.id.ccCB);
        dev=(CheckBox)findViewById(R.id.devCB);
        quant=(CheckBox)findViewById(R.id.qcCB);
        compe=(CheckBox)findViewById(R.id.cpCB);
        prod=(CheckBox)findViewById(R.id.pdCB);
        cyber=(CheckBox)findViewById(R.id.csCB);
        fb=(EditText)findViewById(R.id.fbET);
        ln=(EditText)findViewById(R.id.ldET);
        git=(EditText)findViewById(R.id.gitET);
        why=(EditText)findViewById(R.id.whyET);
        sug=(EditText)findViewById(R.id.sugET);
        res=(EditText)findViewById(R.id.resumeET);
        exp=(EditText)findViewById(R.id.expET);
        pref=(EditText)findViewById(R.id.perET);
        isagree=(CheckBox)findViewById(R.id.agree);
        othet=(EditText)findViewById(R.id.othET);
        t=(TextView)findViewById(R.id.dispage);
othet.setEnabled(false);

age.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
        int min = 1;
        if (i < min) {
        ages=min;
    }else{
            ages=i;
        }
        t.setText(Integer.toString(ages));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});
oth.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        othet.setEnabled(true);
    }
});
        sign.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String Name = name.getText().toString();
             String College = college.getText().toString();
             String Email = email.getText().toString();
             String yos = Yos.getSelectedItem().toString();
             String Mob = mobno.getText().toString();
             String gen = null;
             int Age =age.getProgress();


             if (male.isChecked()) {
                 gen = "male";
             }
             if (female.isChecked()) {
                 gen = "female";
             }
             if (other.isChecked()) {
                 gen = "other";
             }
             Boolean isAg = isagree.isChecked();
             String area = "";
             if (rO.isChecked()) {
                 area = area + "Reaching Out";
             }
             if (de.isChecked()) {
                 area = area + "Designing";
             }
             if (market.isChecked()) {
                 area = area + "Marketing";
             }
             if (write.isChecked()) {
                 area = area + "Writing";
             }
             if (program.isChecked()) {
                 area = area + "Programming";
             }
             if (manage.isChecked()) {
                 area = area + "Managing";
             }

             String tech = "";
             if (py.isChecked()) {
                 tech = tech + "python";
             }
             if (java.isChecked()) {
                 tech = tech + "Java";
             }
             if (react.isChecked()) {
                 tech = tech + "React";
             }
             if (ang.isChecked()) {
                 tech = tech + "Angular";
             }
             if (html.isChecked()) {
                 tech = tech + "Html or CSS";
             }
             if (php.isChecked()) {
                 tech = tech + "Php";
             }
             if (node.isChecked()) {
                 tech = tech + "Node.js";
             }
             if (sql.isChecked()) {
                 tech = tech + "SQL";
             }
             if (c.isChecked()) {
                 tech = tech + "C";
             }
             if (go.isChecked()) {
                 tech = tech + "Go";
             }
             if (oth.isChecked()) {
                 tech = tech + "Other";
             }

             String spez = "";
             if (webd.isChecked()) {
                 spez = spez + "Web Development";
             }
             if (appd.isChecked()) {
                 spez = spez + "App Development";
             }
             if (sd.isChecked()) {
                 spez = spez + "Software Development";
             }
             if (ml.isChecked()) {
                 spez = spez + "Data Science/ML/DL";
             }
             if (block.isChecked()) {
                 spez = spez + "Block Chain";
             }
             if (cc.isChecked()) {
                 spez = spez + "Cloud Computing";
             }
             if (dev.isChecked()) {
                 spez = spez + "DevOps";
             }
             if (quant.isChecked()) {
                 spez = spez + "Quantum Programmimg";
             }
             if (compe.isChecked()) {
                 spez = spez + "Competetive Programming";
             }
             if (prod.isChecked()) {
                 spez = spez + "Product Design";
             }
             if (cyber.isChecked()) {
                 spez = spez + "Cyber Security";
             }

             String link = ln.getText().toString();
             String fcb = fb.getText().toString();
             String resume = res.getText().toString();
             String expe = exp.getText().toString();
             String gith = git.getText().toString();
             String whyy = why.getText().toString();
             String sugg = sug.getText().toString();
             String prefe = pref.getText().toString();
            int ages = age.getProgress();
             Submit sub = new Submit(Name, College, Email, ages, gen, yos, Mob, area, tech, spez, link, fcb, resume, gith, whyy, expe, prefe, sugg);


             if (name.length() == 0 || mobno.length() == 0 || email.length() == 0 || college.length() == 0 || yos.length() == 0 || area.length() == 0 || tech.length() == 0 || spez.length() == 0 || why.length() == 0) {
                 Toast.makeText(getApplicationContext(), "Fill Mandatory Fields", Toast.LENGTH_LONG).show();
             }
             else if(isagree.isChecked()==false){
                 Toast.makeText(getApplicationContext(),"accept term and condition",Toast.LENGTH_LONG).show();
             }

             else {
                 Intent i = new Intent(sign.this, thank.class);
                 i.putExtra("RESPONSE", sub);
                 startActivity(i);
             }
         }
        });
    }

}
