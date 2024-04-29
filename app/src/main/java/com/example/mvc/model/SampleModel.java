package com.example.mvc.model;

import com.example.mvc.callback.Callback1;

public class SampleModel implements BaseModel{

    public void getUserInfo(String uid, Callback1<UserInfo> callback1) {
        UserInfo userInfo = new UserInfo();
        callback1.onCallBack(userInfo);
    }

    @Override
    public void onDestroy() {

    }

    public class UserInfo{
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
