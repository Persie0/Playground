package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.p021io.FileAlreadyExistsException;
import kotlin.p021io.FileSystemException;
import kotlin.p021io.NoSuchFileException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v33 extends pb1 {
    /* JADX INFO: renamed from: S */
    public static void m23077S(File file, File file2) throws IOException {
        file2.getClass();
        if (!file.exists()) {
            throw new NoSuchFileException(file);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(qcd.m19863a(file, file2, "Failed to create target directory."));
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                pb1.m19048r(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(fileInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static String m23078T(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return vk9.m23369E0('.', name, "");
    }

    /* JADX INFO: renamed from: U */
    public static String m23079U(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return vk9.m23372H0(name);
    }

    /* JADX INFO: renamed from: V */
    public static File m23080V(File file) {
        int iM23388k0;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int length = 0;
        int iM23388k1 = vk9.m23388k0(path, c, 0, 4);
        if (iM23388k1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iM23388k0 = vk9.m23388k0(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iM23388k2 = vk9.m23388k0(path, c, iM23388k0 + 1, 4);
                length = iM23388k2 >= 0 ? iM23388k2 + 1 : path.length();
            }
        } else if (iM23388k1 > 0 && path.charAt(iM23388k1 - 1) == ':') {
            length = iM23388k1 + 1;
        } else if (iM23388k1 == -1 && vk9.m23382e0(path, ':')) {
            length = path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if (string.length() == 0 || vk9.m23382e0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }
}
