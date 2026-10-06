package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edm implements kbg {

    /* JADX INFO: renamed from: a */
    public volatile kpp f13500a;

    /* JADX INFO: renamed from: b */
    private final fwc f13501b;

    public edm(fwc fwcVar) {
        this.f13501b = fwcVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        kpp kppVar = (kpp) obj;
        if (kppVar.mo9517d(CaptureResult.COLOR_CORRECTION_GAINS) == null || kppVar.mo9517d(CaptureResult.COLOR_CORRECTION_TRANSFORM) == null || kppVar.mo9517d(CaptureResult.CONTROL_AE_REGIONS) == null || !this.f13501b.mo8862a(kppVar)) {
            return;
        }
        this.f13500a = kppVar;
    }
}
