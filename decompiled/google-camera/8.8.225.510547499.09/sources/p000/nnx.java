package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nnx extends nnk {

    /* JADX INFO: renamed from: a */
    static final Unsafe f43958a;

    /* JADX INFO: renamed from: b */
    static final long f43959b;

    /* JADX INFO: renamed from: c */
    static final long f43960c;

    /* JADX INFO: renamed from: d */
    static final long f43961d;

    /* JADX INFO: renamed from: e */
    static final long f43962e;

    /* JADX INFO: renamed from: f */
    static final long f43963f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new nnw());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            f43960c = unsafe.objectFieldOffset(nnz.class.getDeclaredField("waiters"));
            f43959b = unsafe.objectFieldOffset(nnz.class.getDeclaredField("listeners"));
            f43961d = unsafe.objectFieldOffset(nnz.class.getDeclaredField("value"));
            f43962e = unsafe.objectFieldOffset(nny.class.getDeclaredField("thread"));
            f43963f = unsafe.objectFieldOffset(nny.class.getDeclaredField("next"));
            f43958a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        } catch (RuntimeException e4) {
            throw e4;
        }
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: a */
    public final nno mo17525a(nnz nnzVar, nno nnoVar) {
        nno nnoVar2;
        do {
            nnoVar2 = nnzVar.listeners;
            if (nnoVar == nnoVar2) {
                return nnoVar2;
            }
        } while (!mo17529e(nnzVar, nnoVar2, nnoVar));
        return nnoVar2;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: b */
    public final nny mo17526b(nnz nnzVar, nny nnyVar) {
        nny nnyVar2;
        do {
            nnyVar2 = nnzVar.waiters;
            if (nnyVar == nnyVar2) {
                return nnyVar2;
            }
        } while (!mo17531g(nnzVar, nnyVar2, nnyVar));
        return nnyVar2;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: c */
    public final void mo17527c(nny nnyVar, nny nnyVar2) {
        f43958a.putObject(nnyVar, f43963f, nnyVar2);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: d */
    public final void mo17528d(nny nnyVar, Thread thread) {
        f43958a.putObject(nnyVar, f43962e, thread);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: e */
    public final boolean mo17529e(nnz nnzVar, nno nnoVar, nno nnoVar2) {
        return nnv.m17533a(f43958a, nnzVar, f43959b, nnoVar, nnoVar2);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: f */
    public final boolean mo17530f(nnz nnzVar, Object obj, Object obj2) {
        return nnv.m17533a(f43958a, nnzVar, f43961d, obj, obj2);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: g */
    public final boolean mo17531g(nnz nnzVar, nny nnyVar, nny nnyVar2) {
        return nnv.m17533a(f43958a, nnzVar, f43960c, nnyVar, nnyVar2);
    }
}
