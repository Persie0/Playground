package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class wta {

    /* JADX INFO: renamed from: a */
    public final gc4 f67287a = new gc4(1);

    /* JADX INFO: renamed from: Q2 */
    public final void m24153Q2(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        gc4 gc4Var = this.f67287a;
        if (gc4Var != null) {
            if (gc4Var.f40528a) {
                gc4.m12476a(autoCloseable);
                return;
            }
            synchronized (((tr3) gc4Var.f40529b)) {
                ((LinkedHashSet) gc4Var.f40531d).add(autoCloseable);
            }
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final void m24154R2(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        gc4 gc4Var = this.f67287a;
        if (gc4Var != null) {
            if (gc4Var.f40528a) {
                gc4.m12476a(autoCloseable);
                return;
            }
            synchronized (((tr3) gc4Var.f40529b)) {
                autoCloseable2 = (AutoCloseable) ((LinkedHashMap) gc4Var.f40530c).put(str, autoCloseable);
            }
            gc4.m12476a(autoCloseable2);
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final void m24155S2() {
        gc4 gc4Var = this.f67287a;
        if (gc4Var != null && !gc4Var.f40528a) {
            gc4Var.f40528a = true;
            synchronized (((tr3) gc4Var.f40529b)) {
                try {
                    Iterator it = ((LinkedHashMap) gc4Var.f40530c).values().iterator();
                    while (it.hasNext()) {
                        gc4.m12476a((AutoCloseable) it.next());
                    }
                    Iterator it2 = ((LinkedHashSet) gc4Var.f40531d).iterator();
                    while (it2.hasNext()) {
                        gc4.m12476a((AutoCloseable) it2.next());
                    }
                    ((LinkedHashSet) gc4Var.f40531d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo8918U2();
    }

    /* JADX INFO: renamed from: T2 */
    public final AutoCloseable m24156T2(String str) {
        AutoCloseable autoCloseable;
        gc4 gc4Var = this.f67287a;
        if (gc4Var == null) {
            return null;
        }
        synchronized (((tr3) gc4Var.f40529b)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) gc4Var.f40530c).get(str);
        }
        return autoCloseable;
    }

    /* JADX INFO: renamed from: U2 */
    public void mo8918U2() {
    }
}
