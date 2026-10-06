package p000;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdp extends kfv {

    /* JADX INFO: renamed from: a */
    private final Set f24328a;

    /* JADX INFO: renamed from: b */
    private long f24329b = -1;

    /* JADX INFO: renamed from: c */
    private double f24330c = -1.0d;

    public gdp(Set set) {
        this.f24328a = set;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        double d;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        long jLongValue = l == null ? -1L : l.longValue();
        long j = this.f24329b;
        double d2 = -1.0d;
        if (j >= 0) {
            long j2 = jLongValue - j;
            double d3 = this.f24330c;
            d2 = d3 > 0.0d ? d3 : -1.0d;
            double dM13805H = jzn.m13805H(j2);
            this.f24330c = dM13805H;
            d = d2;
            d2 = dM13805H;
        } else {
            d = -1.0d;
        }
        this.f24329b = jLongValue;
        Iterator it = this.f24328a.iterator();
        while (it.hasNext()) {
            ((gdo) it.next()).mo9080a(kppVar, d2, d);
        }
    }
}
