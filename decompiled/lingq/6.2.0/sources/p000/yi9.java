package p000;

import androidx.work.impl.C0778d;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class yi9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final il7 f69876a;

    /* JADX INFO: renamed from: b */
    public final zg9 f69877b;

    /* JADX INFO: renamed from: c */
    public final boolean f69878c;

    /* JADX INFO: renamed from: d */
    public final int f69879d;

    public yi9(il7 il7Var, zg9 zg9Var, boolean z, int i) {
        il7Var.getClass();
        zg9Var.getClass();
        this.f69876a = il7Var;
        this.f69877b = zg9Var;
        this.f69878c = z;
        this.f69879d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM14011d;
        C0778d c0778dM14013b;
        boolean z = this.f69878c;
        il7 il7Var = this.f69876a;
        zg9 zg9Var = this.f69877b;
        if (z) {
            int i = this.f69879d;
            il7Var.getClass();
            String str = zg9Var.f71553a.f364a;
            synchronized (il7Var.f44277k) {
                c0778dM14013b = il7Var.m14013b(str);
            }
            zM14011d = il7.m14011d(str, c0778dM14013b, i);
        } else {
            int i2 = this.f69879d;
            il7Var.getClass();
            String str2 = zg9Var.f71553a.f364a;
            synchronized (il7Var.f44277k) {
                try {
                    if (il7Var.f44272f.get(str2) != null) {
                        oj5.m18040f().m18042a(il7.f44266l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) il7Var.f44274h.get(str2);
                        if (set != null && set.contains(zg9Var)) {
                            zM14011d = il7.m14011d(str2, il7Var.m14013b(str2), i2);
                        }
                    }
                    zM14011d = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        oj5.m18040f().m18042a(oj5.m18041h("StopWorkRunnable"), "StopWorkRunnable for " + this.f69877b.f71553a.f364a + "; Processor.stopWork = " + zM14011d);
    }
}
