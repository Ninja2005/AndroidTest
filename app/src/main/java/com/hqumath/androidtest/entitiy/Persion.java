package com.hqumath.androidtest.entitiy;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * ****************************************************************
 * 文件名称: Persion
 * 作    者: Created by gyd
 * 创建时间: 2019/8/19 10:35
 * 文件描述:
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
public class Persion implements Parcelable {
    private String name;
    private int age;

    public Persion() {
    }

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
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    protected Persion(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<Persion> CREATOR = new Parcelable.Creator<Persion>() {
        @Override
        public Persion createFromParcel(Parcel source) {
            return new Persion(source);
        }

        @Override
        public Persion[] newArray(int size) {
            return new Persion[size];
        }
    };
}
