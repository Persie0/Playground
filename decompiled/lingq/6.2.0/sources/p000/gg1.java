package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class gg1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40757a = AtomicReferenceFieldUpdater.newUpdater(gg1.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40758b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ long f40759c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f40760d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = m7d.f50741a;
        f40759c = unsafe.objectFieldOffset(gg1.class.getDeclaredField("_next$volatile"));
        f40758b = AtomicReferenceFieldUpdater.newUpdater(gg1.class, Object.class, "_prev$volatile");
        f40760d = unsafe.objectFieldOffset(gg1.class.getDeclaredField("_prev$volatile"));
    }

    public gg1(au8 au8Var) {
        this._prev$volatile = au8Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m12572a() {
        f40758b.getClass();
        m7d.f50741a.putObjectVolatile(this, f40760d, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final gg1 m12573c() {
        gg1 gg1VarM12576f = m12576f();
        while (gg1VarM12576f != null && gg1VarM12576f.mo3060g()) {
            f40758b.getClass();
            gg1VarM12576f = (gg1) m7d.f50741a.getObjectVolatile(gg1VarM12576f, f40760d);
        }
        return gg1VarM12576f;
    }

    /* JADX INFO: renamed from: d */
    public final gg1 m12574d() {
        Object objM12575e = m12575e();
        if (objM12575e == AbstractC3184kh.f47264f) {
            return null;
        }
        return (gg1) objM12575e;
    }

    /* JADX INFO: renamed from: e */
    public final Object m12575e() {
        f40757a.getClass();
        return m7d.f50741a.getObjectVolatile(this, f40759c);
    }

    /* JADX INFO: renamed from: f */
    public final gg1 m12576f() {
        f40758b.getClass();
        return (gg1) m7d.f50741a.getObjectVolatile(this, f40760d);
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo3060g();

    /* JADX INFO: renamed from: h */
    public final boolean m12577h() {
        C0842cc c0842cc = AbstractC3184kh.f47264f;
        while (true) {
            f40757a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f40759c;
            gg1 gg1Var = this;
            if (unsafe.compareAndSwapObject(gg1Var, j, (Object) null, c0842cc)) {
                return true;
            }
            if (unsafe.getObjectVolatile(gg1Var, j) != null) {
                return false;
            }
            this = gg1Var;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12578i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Unsafe unsafe;
        Object objectVolatile;
        gg1 gg1VarM12574d;
        if (m12574d() == null) {
            return;
        }
        while (true) {
            gg1 gg1VarM12573c = m12573c();
            gg1 gg1VarM12574d2 = m12574d();
            gg1VarM12574d2.getClass();
            while (gg1VarM12574d2.mo3060g() && (gg1VarM12574d = gg1VarM12574d2.m12574d()) != null) {
                gg1VarM12574d2 = gg1VarM12574d;
            }
            do {
                atomicReferenceFieldUpdater = f40758b;
                atomicReferenceFieldUpdater.getClass();
                unsafe = m7d.f50741a;
                objectVolatile = unsafe.getObjectVolatile(gg1VarM12574d2, f40760d);
            } while (!hn1.m13348A(atomicReferenceFieldUpdater, gg1VarM12574d2, objectVolatile, ((gg1) objectVolatile) == null ? null : gg1VarM12573c));
            if (gg1VarM12573c != null) {
                f40757a.getClass();
                unsafe.putObjectVolatile(gg1VarM12573c, f40759c, gg1VarM12574d2);
            }
            if (!gg1VarM12574d2.mo3060g() || gg1VarM12574d2.m12574d() == null) {
                if (gg1VarM12573c == null || !gg1VarM12573c.mo3060g()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12579j(au8 au8Var) {
        while (true) {
            f40757a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f40759c;
            gg1 gg1Var = this;
            au8 au8Var2 = au8Var;
            if (unsafe.compareAndSwapObject(gg1Var, j, (Object) null, au8Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(gg1Var, j) != null) {
                return false;
            }
            this = gg1Var;
            au8Var = au8Var2;
        }
    }
}
