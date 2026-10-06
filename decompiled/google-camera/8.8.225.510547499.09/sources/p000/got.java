package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class got implements fwc {

    /* JADX INFO: renamed from: a */
    private final CaptureResult.Key f25900a;

    /* JADX INFO: renamed from: b */
    private final long f25901b;

    public got(CaptureResult.Key key, long j) {
        this.f25900a = key;
        this.f25901b = j;
    }

    @Override // p000.fwc
    /* JADX INFO: renamed from: a */
    public final boolean mo8862a(kpp kppVar) {
        if (kppVar == null) {
            ((nbe) ((nbe) gow.f25905a.m17252c()).mo17276G((char) 3132)).mo17290o("Missing metadata.");
            return false;
        }
        Long l = (Long) kppVar.mo9517d(this.f25900a);
        if (l == null) {
            ((nbe) ((nbe) gow.f25905a.m17252c()).mo17276G(3131)).mo17293r("Missing value for key %s.", this.f25900a);
            return false;
        }
        if (l.longValue() > this.f25901b) {
            return true;
        }
        ((nbe) ((nbe) gow.f25905a.m17252c()).mo17276G(3130)).mo17271B("Unexpected value for key %s. Expected: greater than %s, got: %s.", this.f25900a, Long.valueOf(this.f25901b), l);
        return false;
    }
}
