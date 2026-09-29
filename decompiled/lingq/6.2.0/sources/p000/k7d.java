package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C1045d;

/* JADX INFO: loaded from: classes.dex */
public final class k7d extends h8d {

    /* JADX INFO: renamed from: d */
    public final AlarmManager f46836d;

    /* JADX INFO: renamed from: e */
    public dsc f46837e;

    /* JADX INFO: renamed from: f */
    public Integer f46838f;

    public k7d(C1045d c1045d) {
        super(c1045d);
        this.f46836d = (AlarmManager) ((kjc) this.f60774a).f47433a.getSystemService("alarm");
    }

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
        AlarmManager alarmManager = this.f46836d;
        if (alarmManager != null) {
            Context context = ((kjc) this.f60774a).f47433a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), osb.f54952a));
        }
        m14948J();
    }

    /* JADX INFO: renamed from: H */
    public final ynb m14946H() {
        if (this.f46837e == null) {
            this.f46837e = new dsc(this, this.f55716b.f12372l, 2);
        }
        return this.f46837e;
    }

    /* JADX INFO: renamed from: I */
    public final void m14947I() {
        m13144E();
        kjc kjcVar = (kjc) this.f60774a;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17923a("Unscheduling upload");
        AlarmManager alarmManager = this.f46836d;
        if (alarmManager != null) {
            Context context = kjcVar.f47433a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), osb.f54952a));
        }
        m14946H().m25216c();
        m14948J();
    }

    /* JADX INFO: renamed from: J */
    public final void m14948J() {
        JobScheduler jobScheduler = (JobScheduler) ((kjc) this.f60774a).f47433a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m14949K());
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m14949K() {
        if (this.f46838f == null) {
            this.f46838f = Integer.valueOf("measurement".concat(String.valueOf(((kjc) this.f60774a).f47433a.getPackageName())).hashCode());
        }
        return this.f46838f.intValue();
    }
}
