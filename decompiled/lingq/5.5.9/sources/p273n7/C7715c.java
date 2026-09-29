package p273n7;

import android.support.v4.media.session.C0166e;
import java.io.File;
import java.io.IOException;
import p193j7.C6421a;
import p193j7.InterfaceC6422b;
import p216k7.C6626a;
import p259m7.C7493a;

/* JADX INFO: renamed from: n7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7715c {
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C6421a m15305a(InterfaceC6422b interfaceC6422b, C7493a c7493a) throws IllegalAccessException, IOException {
        boolean z10;
        C6421a c6421aM13256b = (C6421a) interfaceC6422b;
        int iM13044c = c6421aM13256b.m13044c();
        String headerField = c6421aM13256b.f36897a.getHeaderField("Location");
        int i10 = 0;
        do {
            if (iM13044c != 301 && iM13044c != 302 && iM13044c != 303 && iM13044c != 300 && iM13044c != 307) {
                if (iM13044c != 308) {
                    z10 = false;
                }
                if (z10) {
                    return c6421aM13256b;
                }
                if (headerField != null) {
                    throw new IllegalAccessException("Location is null");
                }
                c7493a.f41389c = headerField;
                c6421aM13256b = C6626a.f37566f.m13256b();
                c6421aM13256b.m13043b(c7493a);
                iM13044c = c6421aM13256b.m13044c();
                headerField = c6421aM13256b.f36897a.getHeaderField("Location");
                i10++;
            }
            z10 = true;
            if (z10) {
                return c6421aM13256b;
            }
            if (headerField != null) {
                throw new IllegalAccessException("Location is null");
            }
            c7493a.f41389c = headerField;
            c6421aM13256b = C6626a.f37566f.m13256b();
            c6421aM13256b.m13043b(c7493a);
            iM13044c = c6421aM13256b.m13044c();
            headerField = c6421aM13256b.f36897a.getHeaderField("Location");
            i10++;
        } while (i10 < 10);
        throw new IllegalAccessException("Max redirection done");
    }

    /* JADX INFO: renamed from: b */
    public static String m15306b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbM771r = C0166e.m771r(str);
        sbM771r.append(File.separator);
        sbM771r.append(str2);
        sb2.append(sbM771r.toString());
        sb2.append(".temp");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m15307c(String str, String str2) throws IOException {
        File file = new File(str);
        try {
            File file2 = new File(str2);
            if (file2.exists() && !file2.delete()) {
                throw new IOException("Deletion Failed");
            }
            if (!file.renameTo(file2)) {
                throw new IOException("Rename Failed");
            }
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th2) {
            if (file.exists()) {
                file.delete();
            }
            throw th2;
        }
    }
}
