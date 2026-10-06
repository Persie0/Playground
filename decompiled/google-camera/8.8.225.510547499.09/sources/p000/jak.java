package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jak extends izs {

    /* JADX INFO: renamed from: a */
    public boolean f33572a;

    /* JADX INFO: renamed from: c */
    public boolean f33573c;

    /* JADX INFO: renamed from: d */
    private final AlarmManager f33574d;

    /* JADX INFO: renamed from: e */
    private Integer f33575e;

    protected jak(izv izvVar) {
        super(izvVar);
        this.f33574d = (AlarmManager) m11924d().getSystemService("alarm");
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        try {
            m12785c();
            if (jah.m12771b() > 0) {
                Context contextM11924d = m11924d();
                ActivityInfo receiverInfo = contextM11924d.getPackageManager().getReceiverInfo(new ComponentName(contextM11924d, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                m11936q("Receiver registered for local dispatch.");
                this.f33572a = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m12784b() {
        if (this.f33575e == null) {
            this.f33575e = Integer.valueOf("analytics".concat(String.valueOf(m11924d().getPackageName())).hashCode());
        }
        return this.f33575e.intValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m12785c() {
        this.f33573c = false;
        try {
            AlarmManager alarmManager = this.f33574d;
            Context contextM11924d = m11924d();
            alarmManager.cancel(PendingIntent.getBroadcast(contextM11924d, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextM11924d, "com.google.android.gms.analytics.AnalyticsReceiver")), 33554432));
        } catch (NullPointerException e) {
        }
        JobScheduler jobScheduler = (JobScheduler) m11924d().getSystemService("jobscheduler");
        int iM12784b = m12784b();
        m11937r("Cancelling job. JobID", Integer.valueOf(iM12784b));
        jobScheduler.cancel(iM12784b);
    }
}
