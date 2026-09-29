package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w4c {

    /* JADX INFO: renamed from: a */
    public final Unsafe f66399a;

    public w4c(Unsafe unsafe) {
        this.f66399a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final long m23753a(Field field) {
        return this.f66399a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: b */
    public final void m23754b(long j, Object obj, int i) {
        this.f66399a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo22459c(Object obj, long j, double d);

    /* JADX INFO: renamed from: d */
    public abstract void mo22460d(Object obj, long j, float f);

    /* JADX INFO: renamed from: e */
    public final void m23755e(Object obj, long j, long j2) {
        this.f66399a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo22461f(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: g */
    public final int m23756g(Object obj, long j) {
        return this.f66399a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m23757h(Object obj, long j) {
        return this.f66399a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo22462i(Object obj, long j);

    /* JADX INFO: renamed from: j */
    public abstract float mo22463j(Object obj, long j);

    /* JADX INFO: renamed from: k */
    public abstract double mo22464k(Object obj, long j);

    /* JADX INFO: renamed from: l */
    public abstract byte mo22465l(Object obj, long j);
}
