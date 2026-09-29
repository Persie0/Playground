package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class stb extends fdd {

    /* JADX INFO: renamed from: b */
    public static final Unsafe f61398b;

    /* JADX INFO: renamed from: c */
    public static final long f61399c;

    /* JADX INFO: renamed from: d */
    public static final long f61400d;

    /* JADX INFO: renamed from: e */
    public static final long f61401e;

    /* JADX INFO: renamed from: f */
    public static final long f61402f;

    /* JADX INFO: renamed from: g */
    public static final long f61403g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new kub());
            }
            try {
                f61400d = unsafe.objectFieldOffset(ytb.class.getDeclaredField("c"));
                f61399c = unsafe.objectFieldOffset(ytb.class.getDeclaredField("b"));
                f61401e = unsafe.objectFieldOffset(ytb.class.getDeclaredField("a"));
                f61402f = unsafe.objectFieldOffset(ttb.class.getDeclaredField("a"));
                f61403g = unsafe.objectFieldOffset(ttb.class.getDeclaredField("b"));
                f61398b = unsafe;
            } catch (NoSuchFieldException e) {
                v63.m23141s(e);
            }
        } catch (PrivilegedActionException e2) {
            ij6.m13958p("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: a */
    public final mtb mo11788a(pxb pxbVar) {
        mtb mtbVar;
        mtb mtbVar2 = mtb.f51835d;
        do {
            mtbVar = pxbVar.f70459b;
            if (mtbVar2 == mtbVar) {
                break;
            }
        } while (!mo11792e(pxbVar, mtbVar, mtbVar2));
        return mtbVar;
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: b */
    public final ttb mo11789b(pxb pxbVar) {
        ttb ttbVar;
        ttb ttbVar2 = ttb.f62872c;
        do {
            ttbVar = pxbVar.f70460c;
            if (ttbVar2 == ttbVar) {
                break;
            }
        } while (!mo11794g(pxbVar, ttbVar, ttbVar2));
        return ttbVar;
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: c */
    public final void mo11790c(ttb ttbVar, ttb ttbVar2) {
        f61398b.putObject(ttbVar, f61403g, ttbVar2);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: d */
    public final void mo11791d(ttb ttbVar, Thread thread) {
        f61398b.putObject(ttbVar, f61402f, thread);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: e */
    public final boolean mo11792e(pxb pxbVar, mtb mtbVar, mtb mtbVar2) {
        return hub.m13482a(f61398b, pxbVar, f61399c, mtbVar, mtbVar2);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: f */
    public final boolean mo11793f(ytb ytbVar, Object obj, Object obj2) {
        return hub.m13482a(f61398b, ytbVar, f61401e, obj, obj2);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: g */
    public final boolean mo11794g(ytb ytbVar, ttb ttbVar, ttb ttbVar2) {
        return hub.m13482a(f61398b, ytbVar, f61400d, ttbVar, ttbVar2);
    }
}
