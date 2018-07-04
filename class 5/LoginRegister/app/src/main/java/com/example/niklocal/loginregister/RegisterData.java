package com.example.niklocal.loginregister;

import android.database.sqlite.SQLiteDatabase;

public class RegisterData {

        int id;
        String first_name;
        String last_name;
        String email_id;
        String mobile_number;
public String getPassword() {
        return password;
        }
        public void setPassword(String password) {
        this.password = password;
        }

        String password;

public RegisterData(){

        }

public RegisterData(int id, String first_name, String  last_name, String email_id, String phone_number, String mobile_number){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id=email_id;
        this.mobile_number=mobile_number;
        }


        public int getID(){
        return this.id;
        }

        public void setID(int id){
        this.id = id;
        }

public String getfirstName() {
        return first_name;
        }

        public void setfirstName(String first_name){
        this.first_name =first_name;
        }
public String getlastName() {
        return last_name;
        }

        public void setlastName(String last_name){
        this.last_name =last_name;
        }
public String getEmailId() {
        return email_id;
        }
        public void setEmailId(String email_id){
        this.email_id =email_id;
        }
public String getMobNo() {
        return mobile_number;
        }

        public void setMobNo(String mobile_number){
        this.mobile_number=mobile_number;
        }


        public void setfirst_name(String first_name) {
                this.first_name = first_name;
        }

        public void setmobile_number(String mobile_number) {
                this.mobile_number = mobile_number;
        }

        public void setemail_id(String email_id) {
                this.email_id = email_id;
        }
}