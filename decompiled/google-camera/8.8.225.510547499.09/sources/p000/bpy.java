package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bpy {

    /* JADX INFO: renamed from: a */
    static final Charset f4130a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    static void m2901a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: b */
    static void m2902b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(String.valueOf(file))));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m2902b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }
    }
}
