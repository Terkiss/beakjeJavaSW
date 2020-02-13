package com.dotge.chap08_exercise;

import android.os.Parcel;
import android.os.Parcelable;

public class Person2 implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    private String name ;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // 송신 사용 함수

        dest.writeString( name);
        dest.writeInt(age);
    }

    public static final Creator<Person2> CREATOR = new Creator<Person2>() {
        @Override
        public Person2 createFromParcel(Parcel source) {
            Person2 sampleData = new Person2();
            sampleData.setName(source.readString());
            sampleData.setAge(source.readInt());
            return sampleData;
        }

        @Override
        public Person2[] newArray(int size) {
            return new Person2[0];
        }
    };
}
