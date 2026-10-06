package com.google.android.apps.camera.sideline;

import android.app.job.JobParameters;
import android.app.job.JobService;
import p000.emv;
import p000.hby;
import p000.hbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SidelineJobService extends JobService {

    /* JADX INFO: renamed from: a */
    public hbz f6926a;

    @Override // android.app.Service
    public final void onCreate() {
        ((hby) ((emv) getApplicationContext()).mo4193e(hby.class)).mo7826u(this);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (!this.f6926a.m10097b()) {
            return false;
        }
        this.f6926a.m10096a();
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
