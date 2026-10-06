package com.google.android.apps.camera.app.silentfeedback;

import android.app.ApplicationErrorReport;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import p000.fbu;
import p000.jdz;
import p000.jec;
import p000.jib;
import p000.jjt;
import p000.jjw;
import p000.jjx;
import p000.jmv;
import p000.not;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SilentFeedbackService extends Service {

    /* JADX INFO: renamed from: a */
    private final Object f6489a = new Object();

    /* JADX INFO: renamed from: b */
    private int f6490b = 0;

    /* JADX INFO: renamed from: c */
    private int f6491c = 0;

    /* JADX INFO: renamed from: a */
    public final void m4034a() {
        Integer numValueOf;
        synchronized (this.f6489a) {
            int i = this.f6490b - 1;
            this.f6490b = i;
            numValueOf = i == 0 ? Integer.valueOf(this.f6491c) : null;
        }
        if (numValueOf != null) {
            stopSelf(numValueOf.intValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        jjx jjxVarM13379f;
        synchronized (this.f6489a) {
            this.f6490b++;
            this.f6491c = i2;
        }
        try {
            if (getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode >= 6577000) {
                jdz jdzVar = new jdz(getApplicationContext());
                jjw jjwVar = new jjw();
                jjwVar.f34193d = new ApplicationErrorReport();
                jjwVar.f34193d.crashInfo = new ApplicationErrorReport.CrashInfo();
                jjwVar.f34193d.crashInfo.throwLineNumber = -1;
                if (intent == null) {
                    jjxVarM13379f = jmv.m13379f(jjwVar);
                } else {
                    jjwVar.f34190a = " ";
                    jjwVar.f34192c = true;
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass")) {
                        jjwVar.f34193d.crashInfo.exceptionClassName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass");
                    }
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace")) {
                        jjwVar.f34193d.crashInfo.stackTrace = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace");
                    }
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass")) {
                        jjwVar.f34193d.crashInfo.throwClassName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass");
                    }
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile")) {
                        jjwVar.f34193d.crashInfo.throwFileName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile");
                    }
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine")) {
                        jjwVar.f34193d.crashInfo.throwLineNumber = intent.getIntExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", -1);
                    }
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod")) {
                        jjwVar.f34193d.crashInfo.throwMethodName = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod");
                    }
                    if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag")) {
                        jjwVar.f34191b = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag");
                    }
                    jjxVarM13379f = jmv.m13379f(jjwVar);
                }
                jec jecVar = jdzVar.f33826i;
                jjt jjtVar = new jjt(jecVar, jjxVarM13379f);
                jecVar.mo12967b(jjtVar);
                jib.m13208m(jjtVar).mo13455h(not.INSTANCE, new fbu(this, 1));
                return 2;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        m4034a();
        return 2;
    }
}
