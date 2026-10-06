package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gou implements fwc {

    /* JADX INFO: renamed from: a */
    private final CaptureResult.Key f25902a;

    /* JADX INFO: renamed from: b */
    private final Object f25903b;

    public gou(CaptureResult.Key key, Object obj) {
        this.f25902a = key;
        this.f25903b = obj;
    }

    @Override // p000.fwc
    /* JADX INFO: renamed from: a */
    public final boolean mo8862a(kpp kppVar) {
        if (kppVar == null) {
            ((nbe) ((nbe) gow.f25905a.m17252c()).mo17276G((char) 3134)).mo17290o("Missing metadata.");
            return false;
        }
        if (mpw.m16768g(kppVar.mo9517d(this.f25902a), this.f25903b)) {
            return true;
        }
        nbe nbeVar = (nbe) ((nbe) gow.f25905a.m17252c()).mo17276G(3133);
        CaptureResult.Key key = this.f25902a;
        nbeVar.mo17271B("Metadata mismatch for key %s. Expected: %s, got: %s.", key, this.f25903b, kppVar.mo9517d(key));
        return false;
    }
}
