package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rcd {
    /* JADX INFO: renamed from: a */
    public static final CancellationException m20580a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20581b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
