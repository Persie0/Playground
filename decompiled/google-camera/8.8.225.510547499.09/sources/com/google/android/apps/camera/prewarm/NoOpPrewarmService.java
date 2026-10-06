package com.google.android.apps.camera.prewarm;

import android.content.Intent;
import android.service.media.CameraPrewarmService;
import p000.cih;
import p000.emv;
import p000.fcp;
import p000.gpn;
import p000.gpz;
import p000.gtd;
import p000.hki;
import p000.jvt;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NoOpPrewarmService extends CameraPrewarmService {

    /* JADX INFO: renamed from: a */
    public static final nbh f6849a = nbh.m17259h("com/google/android/apps/camera/prewarm/NoOpPrewarmService");

    /* JADX INFO: renamed from: b */
    public fcp f6850b;

    /* JADX INFO: renamed from: c */
    public jvt f6851c;

    /* JADX INFO: renamed from: d */
    public hki f6852d;

    /* JADX INFO: renamed from: e */
    public gtd f6853e;

    @Override // android.service.media.CameraPrewarmService
    public final void onCooldown(boolean z) {
        this.f6851c.m13586a();
        this.f6850b.mo8142Q();
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((gpz) ((emv) getApplication()).mo4193e(gpz.class)).mo7820o(this);
        super.onCreate();
        this.f6852d.m10423a();
    }

    @Override // android.service.media.CameraPrewarmService
    public final void onPrewarm() {
        this.f6851c.m13587b(new gpn(this, 6));
        this.f6850b.mo8133H();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ((cih) getApplicationContext()).mo3799b().m6071g(2);
        if (this.f6853e.m9749n()) {
            return 1;
        }
        ((nbe) ((nbe) f6849a.m17251b()).mo17276G((char) 3177)).mo17290o("KeepAlive is off. Prewarm ran, but the service won't stick.");
        return 2;
    }
}
