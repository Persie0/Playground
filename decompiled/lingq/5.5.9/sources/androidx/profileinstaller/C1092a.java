package androidx.profileinstaller;

import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1092a {
    /* JADX INFO: renamed from: a */
    public static boolean m4045a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = m4045a(file2) && z10;
        }
        return z10;
    }
}
