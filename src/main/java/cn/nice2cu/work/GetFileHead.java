package cn.nice2cu.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * TODO
 *
 * @author zhaosq
 * @date 2022/4/13
 */
public class GetFileHead {

    public static final String PATH = "C:\\Program Files\\Tabby\\resources\\app.asar.unpacked\\node_modules\\@tabby-gang\\node-pty\\deps\\winpty\\vcbuild.bat";

    public static void main(String[] args) {
        try {
            String result = getFileHead(new File(PATH));
            System.out.println(result.substring(0, 24));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileHead(File file) throws IOException{
        byte[] b = new byte[28];
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
            inputStream.read(b, 0, 28);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw e;
                }
            }
        }

        return bytesToHexString(b);
    }

    private static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }

        for (byte b : src) {
            int v = b & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

}
