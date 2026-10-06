package com.google.android.apps.camera.prewarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import java.util.concurrent.Executor;
import p000.ebw;
import p000.gqa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProcessingBoostService extends Service {

    /* JADX INFO: renamed from: a */
    public ebw f6854a;

    /* JADX INFO: renamed from: b */
    public Executor f6855b;

    /* JADX INFO: renamed from: c */
    private final Messenger f6856c = new Messenger(new gqa(this));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f6856c.getBinder();
    }
}
