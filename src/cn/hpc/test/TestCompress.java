package cn.hpc.test;

import cn.hpc.util.Compress;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class TestCompress {
    Compress compress;
    String path = "E:/DataSet/Gene/data.txt";

    @Before
    public void initial() {
        compress = new Compress();
        File pathFile = new File(path);
        compress.initial(pathFile);
    }

    @Test
    public void testCompress() {
        Long startTime = System.currentTimeMillis();
        compress.compress(path);
        Long endTime = System.currentTimeMillis();
        System.out.println("Compress time" + (endTime - startTime) / 1000 + "s");
    }
}
