package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0d {

    /* JADX INFO: renamed from: a */
    public final Unsafe f7743a;

    public b0d(Unsafe unsafe) {
        this.f7743a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo25a(Object obj, long j);

    /* JADX INFO: renamed from: b */
    public final void m3150b(long j, Object obj, int i) {
        this.f7743a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo26c(Object obj, long j, byte b);

    /* JADX INFO: renamed from: d */
    public abstract void mo27d(Object obj, long j, double d);

    /* JADX INFO: renamed from: e */
    public abstract void mo28e(Object obj, long j, float f);

    /* JADX INFO: renamed from: f */
    public final void m3151f(Object obj, long j, long j2) {
        this.f7743a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo29g(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo30h(Object obj, long j);

    /* JADX INFO: renamed from: i */
    public abstract float mo31i(Object obj, long j);

    /* JADX INFO: renamed from: j */
    public abstract double mo32j(Object obj, long j);

    /* JADX INFO: renamed from: k */
    public final int m3152k(Object obj, long j) {
        return this.f7743a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public final long m3153l(Object obj, long j) {
        return this.f7743a.getLong(obj, j);
    }
}
