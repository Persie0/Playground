package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfh extends kfv {

    /* JADX INFO: renamed from: a */
    private final oju f5494a;

    /* JADX INFO: renamed from: b */
    private final nps f5495b;

    /* JADX INFO: renamed from: c */
    private final fvy f5496c;

    /* JADX INFO: renamed from: d */
    private long f5497d = 0;

    public cfh(nps npsVar, fvy fvyVar, oju ojuVar) {
        this.f5496c = fvyVar;
        this.f5495b = npsVar;
        this.f5494a = ojuVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Integer num;
        cet cetVar = (cet) jvh.m13560h(this.f5495b);
        if (cetVar == null || !cetVar.mo3583i()) {
            return;
        }
        long jB = kppVar.mo9515b();
        long j = this.f5497d;
        int iMo3575a = cetVar.mo3575a();
        if (iMo3575a == 0 || jB <= j + ((long) iMo3575a) || (num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)) == null) {
            return;
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
        num2.getClass();
        int iIntValue2 = num2.intValue();
        if (iIntValue == 0 || iIntValue2 == 2 || iIntValue2 == 4) {
            this.f5497d = kppVar.mo9515b();
            this.f5496c.m8843b((fvw) this.f5494a.get());
        }
    }
}
