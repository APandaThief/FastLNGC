package cn.hpc.test;

import cn.hpc.util.Compress;
import cn.hpc.util.Decompress;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = args[0];
        File pathFile = new File(path);

        if (args[1].equals("0")) {
            Compress compress = new Compress();
            compress.initial(pathFile);
            Long startCompressTime = System.currentTimeMillis();
            compress.compress(path);
            Long endCompressTime = System.currentTimeMillis();
            System.out.println("Compress time: " + (endCompressTime - startCompressTime) / 1000 + "s");
        } else if (args[1].equals("1")) {
            Decompress decompress = new Decompress();
            decompress.initial(pathFile);
            Long startDecompressTime = System.currentTimeMillis();
            decompress.Decompress(path);
            Long endDecompressTime = System.currentTimeMillis();
            System.out.println("Decompress time: " + (endDecompressTime - startDecompressTime) / 1000 + "s");
        } else {
            System.out.println("Please specify the execution mode, 0 for compression and 1 for decompression");
        }
    }
}
