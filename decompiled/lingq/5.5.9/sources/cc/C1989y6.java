package cc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C2709j0;

/* JADX INFO: renamed from: cc.y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1989y6 extends AbstractC1774a7 {

    /* JADX INFO: renamed from: d */
    public final AlarmManager f10420d;

    /* JADX INFO: renamed from: e */
    public C1809e6 f10421e;

    /* JADX INFO: renamed from: f */
    public Integer f10422f;

    public C1989y6(C1846i7 c1846i7) {
        super(c1846i7);
        this.f10420d = (AlarmManager) ((C1897o4) this.f10430a).f10076a.getSystemService("alarm");
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
        AlarmManager alarmManager = this.f10420d;
        if (alarmManager != null) {
            alarmManager.cancel(m5931n());
        }
        JobScheduler jobScheduler = (JobScheduler) ((C1897o4) this.f10430a).f10076a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m5930m());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5929l() {
        m5494h();
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5623a("Unscheduling upload");
        AlarmManager alarmManager = this.f10420d;
        if (alarmManager != null) {
            alarmManager.cancel(m5931n());
        }
        m5932o().m5745a();
        JobScheduler jobScheduler = (JobScheduler) ((C1897o4) interfaceC1781b5).f10076a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m5930m());
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m5930m() {
        if (this.f10422f == null) {
            this.f10422f = Integer.valueOf("measurement".concat(String.valueOf(((C1897o4) this.f10430a).f10076a.getPackageName())).hashCode());
        }
        return this.f10422f.intValue();
    }

    /* JADX INFO: renamed from: n */
    public final PendingIntent m5931n() {
        Context context = ((C1897o4) this.f10430a).f10076a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C2709j0.f14262a);
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC1874m m5932o() {
        if (this.f10421e == null) {
            this.f10421e = new C1809e6(this, this.f10436b.f9902l, 2);
        }
        return this.f10421e;
    }
}
