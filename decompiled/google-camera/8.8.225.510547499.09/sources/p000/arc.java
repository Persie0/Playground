package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arc implements aqt {

    /* JADX INFO: renamed from: a */
    public final Context f2177a;

    /* JADX INFO: renamed from: b */
    public final String f2178b;

    /* JADX INFO: renamed from: c */
    public final aqq f2179c;

    /* JADX INFO: renamed from: d */
    public final boolean f2180d;

    /* JADX INFO: renamed from: e */
    public final boolean f2181e;

    /* JADX INFO: renamed from: f */
    public final ojy f2182f = lkm.m15593t(new C0910po(this, 6));

    /* JADX INFO: renamed from: g */
    public boolean f2183g;

    public arc(Context context, String str, aqq aqqVar, boolean z, boolean z2) {
        this.f2177a = context;
        this.f2178b = str;
        this.f2179c = aqqVar;
        this.f2180d = z;
        this.f2181e = z2;
    }

    @Override // p000.aqt
    /* JADX INFO: renamed from: a */
    public final aqp mo1802a() {
        return m1882b().m1881b();
    }

    /* JADX INFO: renamed from: b */
    public final arb m1882b() {
        return (arb) this.f2182f.mo18586a();
    }

    @Override // p000.aqt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2182f.mo18587b()) {
            m1882b().close();
        }
    }
}
