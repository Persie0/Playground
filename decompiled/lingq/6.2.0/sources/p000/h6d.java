package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h6d {
    /* JADX INFO: renamed from: a */
    public static char m13102a(long j) {
        char c = (char) j;
        bna.m3963n(j, "Out of range: %s", ((long) c) == j);
        return c;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13103b(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static char m13104c(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: d */
    public static void m13105d(Status status, Object obj, wr9 wr9Var) {
        if (status.m5282r()) {
            wr9Var.m24138b(obj);
        } else {
            wr9Var.m24137a(lda.m16138x(status));
        }
    }
}
