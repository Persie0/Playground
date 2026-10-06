package com.google.android.apps.camera.brella.mediastore;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import p000.cot;
import p000.cou;
import p000.cov;
import p000.emv;
import p000.kxk;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.npm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MediaListeningService extends JobService {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f6571c = 0;

    /* JADX INFO: renamed from: d */
    private static final nbh f6572d = nbh.m17259h("com/google/android/apps/camera/brella/mediastore/MediaListeningService");

    /* JADX INFO: renamed from: a */
    public cot f6573a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f6574b;

    /* JADX INFO: renamed from: a */
    public static boolean m4069a(Context context) {
        JobInfo.TriggerContentUri triggerContentUri = new JobInfo.TriggerContentUri(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, 1);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            return jobScheduler.schedule(new JobInfo.Builder(371692952, new ComponentName(context, (Class<?>) MediaListeningService.class)).addTriggerContentUri(triggerContentUri).setTriggerContentUpdateDelay(60000L).setTriggerContentMaxDelay(300000L).build()) == 1;
        }
        ((nbe) ((nbe) f6572d.m17252c()).mo17276G((char) 387)).mo17290o("Cannot get scheduler for media listener service.");
        return false;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Object applicationContext = getApplicationContext();
        applicationContext.getClass();
        ((cov) ((emv) applicationContext).mo4193e(cov.class)).mo5216e(this);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Uri[] triggeredContentUris = jobParameters.getTriggeredContentUris();
        if (triggeredContentUris == null || (triggeredContentUris.length) == 0) {
            m4069a(getApplicationContext());
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : triggeredContentUris) {
            uri.getQuery();
            uri.getAuthority();
            mrm mrmVarM5213a = this.f6573a.m5213a(uri);
            if (mrmVarM5213a.mo16813g()) {
                arrayList.add((String) mrmVarM5213a.mo16809c());
            }
        }
        kxk.m14975U(npm.m17611q(this.f6573a.m5214b(arrayList)), new cou(this, jobParameters, 0), this.f6574b);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
