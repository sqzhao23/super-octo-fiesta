package cn.nice2cu.work;

import java.awt.datatransfer.MimeTypeParseException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.activation.MimetypesFileTypeMap;

/**
 * TODO
 *
 * @author zhaosq
 * @date 2022/4/13
 */
public class GetFileHead {

    public static final String PATH = "C:\\Users\\zhaosq\\Desktop\\GT-AX11000_386_46065_koolshare_cferom_ubi_koolcenter_20220413.w";

    public static void main(String[] args) {
        File file = new File(PATH);
        MimetypesFileTypeMap map = new MimetypesFileTypeMap();
        System.out.println(map.getContentType(file));
        /*try {
            String result = getFileHead(new File(PATH));
            System.out.println(result.substring(0, 24));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
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
