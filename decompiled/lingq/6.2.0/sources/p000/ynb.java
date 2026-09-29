package p000;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class ynb {

    /* JADX INFO: renamed from: d */
    public static volatile wdb f70126d;

    /* JADX INFO: renamed from: a */
    public final uoc f70127a;

    /* JADX INFO: renamed from: b */
    public final u62 f70128b;

    /* JADX INFO: renamed from: c */
    public volatile long f70129c;

    public ynb(uoc uocVar) {
        lda.m16130p(uocVar);
        this.f70127a = uocVar;
        this.f70128b = new u62(3, this, uocVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo55a();

    /* JADX INFO: renamed from: b */
    public final void m25215b(long j) {
        m25216c();
        if (j >= 0) {
            uoc uocVar = this.f70127a;
            uocVar.mo5911c().getClass();
            this.f70129c = System.currentTimeMillis();
            if (m25217d().postDelayed(this.f70128b, j)) {
                return;
            }
            uocVar.mo5909b().f68080f.m17924b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25216c() {
        this.f70129c = 0L;
        m25217d().removeCallbacks(this.f70128b);
    }

    /* JADX INFO: renamed from: d */
    public final Handler m25217d() {
        wdb wdbVar;
        if (f70126d != null) {
            return f70126d;
        }
        synchronized (ynb.class) {
            try {
                if (f70126d == null) {
                    f70126d = new wdb(this.f70127a.mo5915e().getMainLooper(), 2);
                }
                wdbVar = f70126d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wdbVar;
    }
}
