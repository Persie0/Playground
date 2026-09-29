package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class bj5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8607a = AtomicReferenceFieldUpdater.newUpdater(bj5.class, Object.class, "_cur$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f8608b = m7d.f50741a.objectFieldOffset(bj5.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new dj5(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m3776a(Runnable runnable) {
        bj5 bj5Var;
        while (true) {
            f8607a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f8608b;
            dj5 dj5Var = (dj5) unsafe.getObjectVolatile(this, j);
            int iM10409a = dj5Var.m10409a(runnable);
            if (iM10409a == 0) {
                return true;
            }
            if (iM10409a == 1) {
                dj5 dj5VarM10412d = dj5Var.m10412d();
                while (true) {
                    Unsafe unsafe2 = m7d.f50741a;
                    bj5Var = this;
                    if (unsafe2.compareAndSwapObject(bj5Var, f8608b, dj5Var, dj5VarM10412d) || unsafe2.getObjectVolatile(bj5Var, j) != dj5Var) {
                        break;
                    }
                    this = bj5Var;
                }
            } else {
                if (iM10409a == 2) {
                    return false;
                }
                bj5Var = this;
            }
            this = bj5Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3777b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8607a;
            atomicReferenceFieldUpdater.getClass();
            dj5 dj5Var = (dj5) m7d.f50741a.getObjectVolatile(this, f8608b);
            if (dj5Var.m10411c()) {
                return;
            } else {
                e65.m10885q(atomicReferenceFieldUpdater, this, dj5Var, dj5Var.m10412d());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3778c() {
        f8607a.getClass();
        dj5 dj5Var = (dj5) m7d.f50741a.getObjectVolatile(this, f8608b);
        dj5Var.getClass();
        long j = dj5.f35714f.get(dj5Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: d */
    public final Object m3779d() {
        bj5 bj5Var;
        while (true) {
            f8607a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f8608b;
            dj5 dj5Var = (dj5) unsafe.getObjectVolatile(this, j);
            Object objM10413e = dj5Var.m10413e();
            if (objM10413e != dj5.f35715g) {
                return objM10413e;
            }
            dj5 dj5VarM10412d = dj5Var.m10412d();
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                bj5Var = this;
                if (unsafe2.compareAndSwapObject(bj5Var, f8608b, dj5Var, dj5VarM10412d) || unsafe2.getObjectVolatile(bj5Var, j) != dj5Var) {
                    break;
                }
                this = bj5Var;
            }
            this = bj5Var;
        }
    }
}
