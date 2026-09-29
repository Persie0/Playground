package p338qd;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: qd.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8523a1 {

    /* JADX INFO: renamed from: a */
    public static final C8564o0 f45789a = new C8564o0(0);

    /* JADX INFO: renamed from: b */
    public static final C8564o0 f45790b = new C8564o0(2);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static String m16631a(List list) throws NoSuchAlgorithmException, IOException {
        int i10;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    i10 = fileInputStream.read(bArr);
                    if (i10 > 0) {
                        messageDigest.update(bArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            } while (i10 != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16632b(int i10) {
        if (i10 != 2 && i10 != 7) {
            if (i10 != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16633c(int i10, int i11) {
        if (i10 == 5) {
            if (i11 != 5) {
                return true;
            }
            i10 = 5;
        }
        if (i10 == 6) {
            if (i11 != 6 && i11 != 5) {
                return true;
            }
            i10 = 6;
        }
        if (i10 == 4 && i11 != 4) {
            return true;
        }
        if (i10 == 3 && (i11 == 2 || i11 == 7 || i11 == 1 || i11 == 8)) {
            return true;
        }
        return i10 == 2 && (i11 == 1 || i11 == 8);
    }
}
