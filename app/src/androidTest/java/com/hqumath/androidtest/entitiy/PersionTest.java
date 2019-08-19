package com.hqumath.androidtest.entitiy;

import android.os.Parcel;
import android.os.Parcelable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ****************************************************************
 * 文件名称: PersionTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/19 10:37
 * 文件描述: Parcelable读写测试
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
public class PersionTest {

    private static String TEST_NAME = "xiaoming";
    private static int TEST_AGE = 19;
    private Persion persion;

    @Before
    public void setUp() throws Exception {
        persion = new Persion();
        persion.setName(TEST_NAME);
        persion.setAge(TEST_AGE);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void persionParcelableWriteRead(){
        // Write the data
        Parcel parcel = Parcel.obtain();
        persion.writeToParcel(parcel, persion.describeContents());

        // After you're done with writing, you need to reset the parcel for reading.
        parcel.setDataPosition(0);

        // Read the data
        Persion persion1 = Persion.CREATOR.createFromParcel(parcel);

        // Verify that the received data is correct.
        assertEquals(TEST_NAME, persion1.getName());
        assertEquals(TEST_AGE, persion1.getAge());
    }
}