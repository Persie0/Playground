package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class oaf {

    /* JADX INFO: renamed from: a */
    final Unsafe f45120a;

    public oaf(Unsafe unsafe) {
        this.f45120a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo18338a(long j);

    /* JADX INFO: renamed from: b */
    public abstract double mo18339b(Object obj, long j);

    /* JADX INFO: renamed from: c */
    public abstract float mo18340c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract void mo18341d(long j, byte[] bArr, long j2, long j3);

    /* JADX INFO: renamed from: e */
    public abstract void mo18342e(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: f */
    public abstract void mo18343f(Object obj, long j, byte b);

    /* JADX INFO: renamed from: g */
    public abstract void mo18344g(Object obj, long j, double d);

    /* JADX INFO: renamed from: h */
    public abstract void mo18345h(Object obj, long j, float f);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo18346i(Object obj, long j);

    /* JADX INFO: renamed from: j */
    public final int m18347j(Object obj, long j) {
        return this.f45120a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public final long m18348k(Object obj, long j) {
        return this.f45120a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public final void m18349l(Object obj, long j, int i) {
        this.f45120a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m18350m(Object obj, long j, long j2) {
        this.f45120a.putLong(obj, j, j2);
    }
}
