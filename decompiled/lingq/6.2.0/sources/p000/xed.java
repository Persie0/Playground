package p000;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xed {

    /* JADX INFO: renamed from: a */
    public static p04 f68144a;

    /* JADX INFO: renamed from: a */
    public static IOException m24480a(dgd dgdVar, Uri uri, IOException iOException, String str) {
        try {
            eid eidVar = new eid();
            eidVar.f37303a = true;
            File file = (File) dgdVar.m10371a(uri, eidVar);
            if (!file.exists()) {
                return m24481b(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? m24481b(file, iOException, str) : m24481b(file, iOException, str);
                }
                return file.canWrite() ? m24481b(file, iOException, str) : m24481b(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? m24481b(file, iOException, str) : m24481b(file, iOException, str);
            }
            return file.canWrite() ? m24481b(file, iOException, str) : m24481b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    /* JADX INFO: renamed from: b */
    public static IOException m24481b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    return parentFile.canWrite() ? m24482c(file, iOException, str) : m24482c(file, iOException, str);
                }
                return parentFile.canWrite() ? m24482c(file, iOException, str) : m24482c(file, iOException, str);
            }
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? m24482c(file, iOException, str) : m24482c(file, iOException, str);
            }
            return parentFile.canWrite() ? m24482c(file, iOException, str) : m24482c(file, iOException, str);
        }
        return m24482c(file, iOException, str);
    }

    /* JADX INFO: renamed from: c */
    public static IOException m24482c(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }
}
