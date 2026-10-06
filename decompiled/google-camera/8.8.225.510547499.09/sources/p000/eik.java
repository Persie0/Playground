package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eik extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ key f14146a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kbg f14147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eim f14148c;

    public eik(eim eimVar, key keyVar, kbg kbgVar) {
        this.f14148c = eimVar;
        this.f14146a = keyVar;
        this.f14147b = kbgVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        Long l;
        kpp kppVarMo7042c = this.f14146a.mo7042c();
        if (kppVarMo7042c != null) {
            this.f14148c.f14156g.mo3594a(kppVarMo7042c);
            eil eilVar = this.f14148c.f14161l;
            if (eilVar != null && (l = (Long) kppVarMo7042c.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
                float fLongValue = l.longValue();
                eiw eiwVar = ((eja) eilVar).f14252f;
                float f = fLongValue / 1000000.0f;
                synchronized (eiwVar.f14206q) {
                    eiwVar.f14207r = f;
                }
            }
        }
        this.f14146a.close();
        int i = 1;
        if (this.f14148c.f14163n.compareAndSet(false, true)) {
            this.f14148c.f14154e.execute(new ekr(this, this.f14147b, i));
        }
    }
}
