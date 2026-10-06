package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eiz implements kao {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gqs f14220a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eja f14221b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f14222c;

    public eiz(eja ejaVar, gqs gqsVar, int i) {
        this.f14221b = ejaVar;
        this.f14220a = gqsVar;
        this.f14222c = i;
    }

    @Override // p000.kao
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3483a(Object obj) {
        this.f14220a.mo7367e(this);
        this.f14221b.f14230G = SystemClock.uptimeMillis();
        eja ejaVar = this.f14221b;
        fcp fcpVar = ejaVar.f14255i;
        int i = this.f14222c;
        ejaVar.f14232I.m7359c();
        eja ejaVar2 = this.f14221b;
        fcpVar.mo8180ay(i, ejaVar2.f14230G - ejaVar2.f14229F, Math.max(ejaVar2.f14228E - ejaVar2.f14227D, 0L), this.f14221b.m7383b(), ((Boolean) this.f14221b.f14254h.mo3831be()).booleanValue());
        synchronized (this.f14221b.f14258l) {
            eja ejaVar3 = this.f14221b;
            ejaVar3.f14258l.remove(ejaVar3.f14232I.m7357a());
        }
    }
}
