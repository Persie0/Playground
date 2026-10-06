package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asj {

    /* JADX INFO: renamed from: a */
    static final ArrayList f2251a;

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f2252b;

    static {
        new asm(null);
        f2252b = new ThreadLocal();
        f2251a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    static C1109wy m1958a() {
        C1109wy c1109wy;
        ThreadLocal threadLocal = f2252b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1109wy = (C1109wy) weakReference.get()) != null) {
            return c1109wy;
        }
        C1109wy c1109wy2 = new C1109wy();
        threadLocal.set(new WeakReference(c1109wy2));
        return c1109wy2;
    }
}
