package p000;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eav {

    /* JADX INFO: renamed from: a */
    public final end f13133a;

    /* JADX INFO: renamed from: b */
    public final boolean f13134b;

    /* JADX INFO: renamed from: c */
    public final boolean f13135c;

    public eav(end endVar, fvu fvuVar, kmd kmdVar) {
        this.f13133a = endVar;
        this.f13134b = kmdVar.mo14558k() == kmq.BACK;
        Integer num = (Integer) fvuVar.mo14559l(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        this.f13135c = num != null && num.equals(1);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7022a(knh knhVar) {
        knhVar.mo6999b(this.f13133a.mo7553a() + 1, Long.MAX_VALUE, new eau(this, 0));
    }
}
