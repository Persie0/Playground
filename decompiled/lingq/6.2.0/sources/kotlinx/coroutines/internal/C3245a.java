package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.d32;
import p000.e65;
import p000.ho2;
import p000.m7d;
import p000.ue5;
import p000.ul6;
import p000.z58;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.a */
/* JADX INFO: loaded from: classes.dex */
public class C3245a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48158a = AtomicReferenceFieldUpdater.newUpdater(C3245a.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48159b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48160c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f48161d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ long f48162e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f48163f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = m7d.f50741a;
        f48161d = unsafe.objectFieldOffset(C3245a.class.getDeclaredField("_next$volatile"));
        f48159b = AtomicReferenceFieldUpdater.newUpdater(C3245a.class, Object.class, "_prev$volatile");
        f48162e = unsafe.objectFieldOffset(C3245a.class.getDeclaredField("_prev$volatile"));
        f48160c = AtomicReferenceFieldUpdater.newUpdater(C3245a.class, Object.class, "_removedRef$volatile");
        f48163f = unsafe.objectFieldOffset(C3245a.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX INFO: renamed from: i */
    public static C3245a m15573i(C3245a c3245a) {
        while (c3245a.mo15582n()) {
            f48159b.getClass();
            c3245a = (C3245a) m7d.f50741a.getObjectVolatile(c3245a, f48162e);
        }
        return c3245a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15574e(C3245a c3245a, int i) {
        C3245a c3245aM15581m;
        do {
            c3245aM15581m = m15581m();
            if (c3245aM15581m instanceof ue5) {
                return (((ue5) c3245aM15581m).f63809g & i) == 0 && c3245aM15581m.m15574e(c3245a, i);
            }
        } while (!c3245aM15581m.m15575f(c3245a, this));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15575f(C3245a c3245a, C3245a c3245a2) {
        f48159b.getClass();
        Unsafe unsafe = m7d.f50741a;
        unsafe.putObjectVolatile(c3245a, f48162e, this);
        f48158a.getClass();
        long j = f48161d;
        unsafe.putObjectVolatile(c3245a, j, c3245a2);
        while (true) {
            Unsafe unsafe2 = m7d.f50741a;
            C3245a c3245a3 = this;
            C3245a c3245a4 = c3245a;
            C3245a c3245a5 = c3245a2;
            if (unsafe2.compareAndSwapObject(c3245a3, f48161d, c3245a5, c3245a4)) {
                c3245a4.m15578j(c3245a5);
                return true;
            }
            if (unsafe2.getObjectVolatile(c3245a3, j) != c3245a5) {
                return false;
            }
            this = c3245a3;
            c3245a2 = c3245a5;
            c3245a = c3245a4;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15576g(ul6 ul6Var) {
        C3245a c3245a;
        ul6 ul6Var2;
        f48159b.getClass();
        Unsafe unsafe = m7d.f50741a;
        unsafe.putObjectVolatile(ul6Var, f48162e, this);
        f48158a.getClass();
        long j = f48161d;
        unsafe.putObjectVolatile(ul6Var, j, this);
        while (this.m15579k() == this) {
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                c3245a = this;
                ul6Var2 = ul6Var;
                if (unsafe2.compareAndSwapObject(c3245a, f48161d, this, ul6Var2)) {
                    ul6Var2.m15578j(c3245a);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(c3245a, j) != c3245a) {
                        break;
                    }
                    this = c3245a;
                    ul6Var = ul6Var2;
                }
            }
            this = c3245a;
            ul6Var = ul6Var2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final C3245a m15577h() {
        C3245a c3245a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f48159b;
            atomicReferenceFieldUpdater2.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f48162e;
            C3245a c3245a2 = (C3245a) unsafe.getObjectVolatile(this, j);
            c3245a = c3245a2;
            while (true) {
                C3245a c3245a3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f48158a;
                    atomicReferenceFieldUpdater.getClass();
                    e65.m10887s(c3245a);
                    Unsafe unsafe2 = m7d.f50741a;
                    objectVolatile = unsafe2.getObjectVolatile(c3245a, f48161d);
                    if (objectVolatile == this) {
                        if (c3245a2 != c3245a && !e65.m10866B(atomicReferenceFieldUpdater2, this, c3245a2, c3245a)) {
                            break;
                        }
                        break;
                    }
                    if (mo15582n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof z58)) {
                        objectVolatile.getClass();
                        c3245a3 = c3245a;
                        c3245a = (C3245a) objectVolatile;
                    } else {
                        if (c3245a3 != null) {
                            break;
                        }
                        e65.m10887s(c3245a);
                        c3245a = (C3245a) unsafe2.getObjectVolatile(c3245a, j);
                    }
                }
                if (!e65.m10868D(atomicReferenceFieldUpdater, c3245a3, c3245a, ((z58) objectVolatile).f70957a)) {
                    break;
                }
                c3245a = c3245a3;
            }
        }
        return c3245a;
    }

    /* JADX INFO: renamed from: j */
    public final void m15578j(C3245a c3245a) {
        C3245a c3245a2;
        while (true) {
            f48159b.getClass();
            if (c3245a == null) {
                ho2.m13383c();
                return;
            }
            Unsafe unsafe = m7d.f50741a;
            long j = f48162e;
            C3245a c3245a3 = (C3245a) unsafe.getObjectVolatile(c3245a, j);
            if (this.m15579k() != c3245a) {
                return;
            }
            while (true) {
                if (c3245a == null) {
                    ho2.m13383c();
                    return;
                }
                Unsafe unsafe2 = m7d.f50741a;
                c3245a2 = this;
                C3245a c3245a4 = c3245a;
                if (unsafe2.compareAndSwapObject(c3245a4, f48162e, c3245a3, c3245a2)) {
                    if (c3245a2.mo15582n()) {
                        c3245a4.m15577h();
                        return;
                    }
                    return;
                } else {
                    if (c3245a4 == null) {
                        ho2.m13383c();
                        return;
                    }
                    c3245a = c3245a4;
                    if (unsafe2.getObjectVolatile(c3245a4, j) != c3245a3) {
                        break;
                    } else {
                        this = c3245a2;
                    }
                }
            }
            this = c3245a2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m15579k() {
        f48158a.getClass();
        return m7d.f50741a.getObjectVolatile(this, f48161d);
    }

    /* JADX INFO: renamed from: l */
    public final C3245a m15580l() {
        Object objM15579k = m15579k();
        z58 z58Var = objM15579k instanceof z58 ? (z58) objM15579k : null;
        if (z58Var != null) {
            return z58Var.f70957a;
        }
        objM15579k.getClass();
        return (C3245a) objM15579k;
    }

    /* JADX INFO: renamed from: m */
    public final C3245a m15581m() {
        C3245a c3245aM15577h = m15577h();
        if (c3245aM15577h != null) {
            return c3245aM15577h;
        }
        f48159b.getClass();
        return m15573i((C3245a) m7d.f50741a.getObjectVolatile(this, f48162e));
    }

    /* JADX INFO: renamed from: n */
    public boolean mo15582n() {
        return m15579k() instanceof z58;
    }

    /* JADX INFO: renamed from: o */
    public final C3245a m15583o() {
        C3245a c3245a;
        while (true) {
            Object objM15579k = this.m15579k();
            if (objM15579k instanceof z58) {
                return ((z58) objM15579k).f70957a;
            }
            if (objM15579k == this) {
                return (C3245a) objM15579k;
            }
            objM15579k.getClass();
            C3245a c3245a2 = (C3245a) objM15579k;
            z58 z58VarM15584p = c3245a2.m15584p();
            while (true) {
                f48158a.getClass();
                Unsafe unsafe = m7d.f50741a;
                long j = f48161d;
                c3245a = this;
                if (unsafe.compareAndSwapObject(c3245a, j, objM15579k, z58VarM15584p)) {
                    c3245a2.m15577h();
                    return null;
                }
                if (unsafe.getObjectVolatile(c3245a, j) != objM15579k) {
                    break;
                }
                this = c3245a;
            }
            this = c3245a;
        }
    }

    /* JADX INFO: renamed from: p */
    public final z58 m15584p() {
        f48160c.getClass();
        Unsafe unsafe = m7d.f50741a;
        long j = f48163f;
        z58 z58Var = (z58) unsafe.getObjectVolatile(this, j);
        if (z58Var != null) {
            return z58Var;
        }
        z58 z58Var2 = new z58(this);
        unsafe.putObjectVolatile(this, j, z58Var2);
        return z58Var2;
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this, d32.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + d32.m10016N(this);
    }
}
