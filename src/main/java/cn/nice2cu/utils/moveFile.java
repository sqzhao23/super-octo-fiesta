package cn.nice2cu.utils;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 移动文件夹下特点后缀的文件到另一个目录
 *
 * @author sqzhao
 * @since 2022-04-03
 */
public class moveFile {
    
    // 源文件的上层文件夹
    static String sourcePath = "E:" + File.separator + "MV";
    // 目标文件夹
    static String targetPath = "E:" + File.separator + "MV-bp";
    // 移动的文件后缀
    static String suffix = ".mp4";
    
    public static void main(String[] args) {
        // moveFiles(getSpecialFilePaths(sourcePath, suffix));
        // rename();
    }
    
    static List<File> getSpecialFilePaths(String sourcePath, String suffix) {
        
        // 要移动的文件集合
        List<File> sourceFilePaths = new ArrayList<>();
        
        File file = new File(sourcePath);
        // 该路径下的文件夹集合
        File[] folderList = file.listFiles();
        if (folderList != null && folderList.length > 0) {
            // 遍历所有子文件夹
            for (File folder : folderList) {
                if (Objects.requireNonNull(folder.listFiles()).length > 0) {
                    // 遍历子文件下的文件
                    for (File sourceFile : Objects.requireNonNull(folder.listFiles())) {
                        // 以特定后缀结尾的就存入集合
                        if (sourceFile.getName().endsWith(suffix)) {
                            sourceFilePaths.add(sourceFile);
                        }
                    }
                }
            }
        }
        return sourceFilePaths;
    }
    
    static String organizeFilePath(String name) {
        name = name.substring(name.indexOf("】") + 1);
        name = name.substring(0, name.indexOf("》") + 1) + ".mp4";
        return targetPath + File.separator + name;
    }
    
    static void moveFiles(List<File> sourceFilePaths) {
        for (File sourceFilePath : sourceFilePaths) {
            File targetFile = new File(organizeFilePath(sourceFilePath.getName()));
            sourceFilePath.renameTo(targetFile);
        }
    }
    
    static void rename() {
        File file = new File("E:" + File.separator);
        // 该路径下的文件夹集合
        File[] folderList = file.listFiles();
        // 遍历所有子文件夹
        for (File folder : folderList) {
            // 以特定后缀结尾的就存入集合
            if (folder.getName().startsWith("MV")) {
                String name = folder.getName().substring(folder.getName().indexOf("V") + 1);
                File file1 = new File("E:" + File.separator + "MV" + File.separator + name);
                folder.renameTo(file1);
            }
            
            
        }
    }
    
}
