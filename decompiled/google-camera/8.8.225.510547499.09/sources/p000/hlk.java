package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlk {

    /* JADX INFO: renamed from: a */
    public static final Object f28264a = new Object();

    /* JADX INFO: renamed from: a */
    public final void m10446a(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m10446a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("Failed to delete file: ".concat(String.valueOf(file2.getAbsolutePath())));
                }
            }
            file.delete();
        }
    }
}
