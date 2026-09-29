package androidx.datastore.core;

import p000.lda;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t, vi3 vi3Var) throws Throwable {
        t.getClass();
        vi3Var.getClass();
        try {
            R r = (R) vi3Var.invoke(t);
            try {
                t.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                return r;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                t.close();
            } catch (Throwable th3) {
                lda.m16117c(th2, th3);
            }
            throw th2;
        }
    }
}
