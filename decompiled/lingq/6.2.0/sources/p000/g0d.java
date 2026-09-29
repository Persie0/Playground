package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g0d {

    /* JADX INFO: renamed from: a */
    public static final C3275kv f40039a = new C3275kv(0);

    /* JADX INFO: renamed from: a */
    public static synchronized void m12275a() {
        C3275kv c3275kv = f40039a;
        Iterator it = ((C3161jv) c3275kv.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        c3275kv.clear();
    }
}
