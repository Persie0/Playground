package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abt {
    /* JADX INFO: renamed from: a */
    public static Drawable m154a(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: b */
    static File m155b(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: c */
    static File m156c(Context context) {
        return context.getNoBackupFilesDir();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m157d(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static long[] m158e(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }
}
