package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3556s0 extends vz1 {

    /* JADX INFO: renamed from: l */
    public static final Unsafe f60099l;

    /* JADX INFO: renamed from: m */
    public static final long f60100m;

    /* JADX INFO: renamed from: n */
    public static final long f60101n;

    /* JADX INFO: renamed from: o */
    public static final long f60102o;

    /* JADX INFO: renamed from: p */
    public static final long f60103p;

    /* JADX INFO: renamed from: q */
    public static final long f60104q;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C3518r0());
            }
            try {
                f60101n = unsafe.objectFieldOffset(AbstractC1112b.class.getDeclaredField("c"));
                f60100m = unsafe.objectFieldOffset(AbstractC1112b.class.getDeclaredField("b"));
                f60102o = unsafe.objectFieldOffset(AbstractC1112b.class.getDeclaredField("a"));
                f60103p = unsafe.objectFieldOffset(C3594t0.class.getDeclaredField("a"));
                f60104q = unsafe.objectFieldOffset(C3594t0.class.getDeclaredField("b"));
                f60099l = unsafe;
            } catch (NoSuchFieldException e) {
                v63.m23141s(e);
            }
        } catch (PrivilegedActionException e2) {
            ij6.m13958p("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: E */
    public final C3095i0 mo14229E(AbstractC1112b abstractC1112b) {
        C3095i0 c3095i0;
        C3095i0 c3095i1 = C3095i0.f43266d;
        do {
            c3095i0 = abstractC1112b.f13525b;
            if (c3095i1 == c3095i0) {
                break;
            }
        } while (!mo14233k(abstractC1112b, c3095i0, c3095i1));
        return c3095i0;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: F */
    public final C3594t0 mo14230F(AbstractC1112b abstractC1112b) {
        C3594t0 c3594t0;
        C3594t0 c3594t1 = C3594t0.f61684c;
        do {
            c3594t0 = abstractC1112b.f13526c;
            if (c3594t1 == c3594t0) {
                break;
            }
        } while (!mo14235m(abstractC1112b, c3594t0, c3594t1));
        return c3594t0;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: S */
    public final void mo14231S(C3594t0 c3594t0, C3594t0 c3594t1) {
        f60099l.putObject(c3594t0, f60104q, c3594t1);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: U */
    public final void mo14232U(C3594t0 c3594t0, Thread thread) {
        f60099l.putObject(c3594t0, f60103p, thread);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: k */
    public final boolean mo14233k(AbstractC1112b abstractC1112b, C3095i0 c3095i0, C3095i0 c3095i1) {
        return AbstractC3443p0.m18850a(f60099l, abstractC1112b, f60100m, c3095i0, c3095i1);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: l */
    public final boolean mo14234l(AbstractC1112b abstractC1112b, Object obj, Object obj2) {
        return AbstractC3480q0.m19581a(f60099l, abstractC1112b, f60102o, obj, obj2);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: m */
    public final boolean mo14235m(AbstractC1112b abstractC1112b, C3594t0 c3594t0, C3594t0 c3594t1) {
        return AbstractC3392o0.m17717a(f60099l, abstractC1112b, f60101n, c3594t0, c3594t1);
    }
}
