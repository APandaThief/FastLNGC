package cn.hpc.test;

import cn.hpc.util.Decompress;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class TestDecompress {
    Decompress decompress;
    String path = "E:/DataSet/Gene/data.txt";

    @Before
    public void initial() {
        decompress = new Decompress();
        File pathFile = new File(path);
        decompress.initial(pathFile);
    }

    @Test
    public void testDecompress() {
        Long startTime = System.currentTimeMillis();
        decompress.Decompress(path);
        Long endTime = System.currentTimeMillis();
        System.out.println("Decompress time " + (endTime - startTime) / 1000 + "s");
    }
}
