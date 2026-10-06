package p000;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czl implements kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f10105a = nbh.m17259h("com/google/android/apps/camera/camcorder/surface/CachedPersistentSurface");

    /* JADX INFO: renamed from: b */
    public final Object f10106b = new Object();

    /* JADX INFO: renamed from: c */
    public Surface f10107c;

    /* JADX INFO: renamed from: d */
    public Surface f10108d;

    /* JADX INFO: renamed from: e */
    public final jzn f10109e;

    /* JADX INFO: renamed from: f */
    private jxp f10110f;

    public czl(jzn jznVar, byte[] bArr, byte[] bArr2) {
        this.f10109e = jznVar;
    }

    /* JADX INFO: renamed from: a */
    public final mrm m5738a(jxp jxpVar) {
        mrm mrmVarM16828h;
        synchronized (this.f10106b) {
            if (this.f10110f != jxpVar) {
                this.f10110f = jxpVar;
                close();
            }
            mrmVarM16828h = mrm.m16828h(this.f10107c);
        }
        return mrmVarM16828h;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f10106b) {
            Surface surface = this.f10107c;
            if (surface != null) {
                surface.release();
                this.f10107c = null;
            }
            Surface surface2 = this.f10108d;
            if (surface2 != null) {
                surface2.release();
                this.f10108d = null;
            }
        }
    }
}
