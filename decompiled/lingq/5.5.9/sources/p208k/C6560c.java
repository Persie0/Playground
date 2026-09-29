package p208k;

import android.os.Looper;
import android.support.v4.media.AbstractC0140a;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6560c extends AbstractC0140a {

    /* JADX INFO: renamed from: b */
    public static volatile C6560c f37354b;

    /* JADX INFO: renamed from: c */
    public static final ExecutorC6559b f37355c = new ExecutorC6559b(0);

    /* JADX INFO: renamed from: a */
    public final C6561d f37356a = new C6561d();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public static C6560c m13159k0() {
        if (f37354b != null) {
            return f37354b;
        }
        synchronized (C6560c.class) {
            if (f37354b == null) {
                f37354b = new C6560c();
            }
        }
        return f37354b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m13160l0(Runnable runnable) {
        C6561d c6561d = this.f37356a;
        if (c6561d.f37359c == null) {
            synchronized (c6561d.f37357a) {
                if (c6561d.f37359c == null) {
                    c6561d.f37359c = C6561d.m13161k0(Looper.getMainLooper());
                }
            }
        }
        c6561d.f37359c.post(runnable);
    }
}
