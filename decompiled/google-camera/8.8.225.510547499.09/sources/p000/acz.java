package p000;

import android.graphics.drawable.Icon;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acz {
    /* JADX INFO: renamed from: a */
    public static int m254a(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: b */
    public static int m255b(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX INFO: renamed from: c */
    static Uri m256c(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* JADX INFO: renamed from: d */
    static String m257d(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m258e(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m258e(file2) && z;
        }
        return z;
    }
}
