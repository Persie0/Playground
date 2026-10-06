package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p000.ihk;
import p000.jax;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsService extends Service implements jax {

    /* JADX INFO: renamed from: a */
    private ihk f7556a;

    /* JADX INFO: renamed from: c */
    private final ihk m4635c() {
        if (this.f7556a == null) {
            this.f7556a = new ihk((Context) this);
        }
        return this.f7556a;
    }

    @Override // p000.jax
    /* JADX INFO: renamed from: a */
    public final boolean mo4633a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.jax
    /* JADX INFO: renamed from: b */
    public final void mo4634b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m4635c();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m4635c().m11357y();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m4635c().m11358z();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m4635c().m11333C(intent, i2);
        return 2;
    }
}
