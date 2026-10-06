package p000;

import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imi implements fbp, fbn {

    /* JADX INFO: renamed from: a */
    public final oju f31512a;

    /* JADX INFO: renamed from: b */
    public final oju f31513b;

    /* JADX INFO: renamed from: c */
    public final hah f31514c;

    /* JADX INFO: renamed from: d */
    public final hai f31515d;

    /* JADX INFO: renamed from: e */
    public final PackageInfo f31516e;

    /* JADX INFO: renamed from: f */
    public final jvd f31517f;

    /* JADX INFO: renamed from: g */
    public final fan f31518g;

    /* JADX INFO: renamed from: h */
    public final fcp f31519h;

    public imi(oju ojuVar, oju ojuVar2, hah hahVar, hai haiVar, PackageInfo packageInfo, jvd jvdVar, fan fanVar, fcp fcpVar) {
        this.f31512a = ojuVar;
        this.f31513b = ojuVar2;
        this.f31514c = hahVar;
        this.f31515d = haiVar;
        this.f31516e = packageInfo;
        this.f31517f = jvdVar;
        this.f31518g = fanVar;
        this.f31519h = fcpVar;
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        int iMo18502b = (int) ohs.f46034a.mo6051a().mo18502b();
        if (iMo18502b == -1 || ((Integer) this.f31514c.mo10031c(gzy.f27023ag)).intValue() < iMo18502b) {
            ((imh) this.f31512a.get()).mo11470c();
        }
    }
}
