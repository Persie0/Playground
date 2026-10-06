package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gov implements fwc {

    /* JADX INFO: renamed from: a */
    private final CaptureResult.Key f25904a;

    public gov(CaptureResult.Key key) {
        this.f25904a = key;
    }

    @Override // p000.fwc
    /* JADX INFO: renamed from: a */
    public final boolean mo8862a(kpp kppVar) {
        if (kppVar == null) {
            ((nbe) ((nbe) gow.f25905a.m17252c()).mo17276G((char) 3136)).mo17290o("Missing metadata.");
            return false;
        }
        if (kppVar.mo9517d(this.f25904a) != null) {
            return true;
        }
        ((nbe) ((nbe) gow.f25905a.m17252c()).mo17276G(3135)).mo17293r("Missing expected metadata value for key %s.", this.f25904a);
        return false;
    }
}
