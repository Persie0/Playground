package p000;

import kotlinx.coroutines.flow.C3229i;

/* JADX INFO: loaded from: classes.dex */
public final class a59 implements ci2 {

    /* JADX INFO: renamed from: a */
    public final C3229i f269a;

    /* JADX INFO: renamed from: b */
    public final long f270b;

    /* JADX INFO: renamed from: c */
    public final Object f271c;

    /* JADX INFO: renamed from: d */
    public final sm0 f272d;

    public a59(C3229i c3229i, long j, Object obj, sm0 sm0Var) {
        this.f269a = c3229i;
        this.f270b = j;
        this.f271c = obj;
        this.f272d = sm0Var;
    }

    @Override // p000.ci2
    /* JADX INFO: renamed from: a */
    public final void mo125a() {
        C3229i c3229i = this.f269a;
        synchronized (c3229i) {
            if (this.f270b >= c3229i.m15556n()) {
                Object[] objArr = c3229i.f48063h;
                objArr.getClass();
                long j = this.f270b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    pb1.m19039i(objArr, j, pb1.f55917e);
                    c3229i.m15552i();
                }
            }
        }
    }
}
