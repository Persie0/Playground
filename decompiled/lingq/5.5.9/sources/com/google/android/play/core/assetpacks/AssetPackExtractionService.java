package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p080e.C5288t;
import p338qd.BinderC8575s;
import p338qd.C8540g0;
import p338qd.C8573r0;
import p338qd.C8583u1;

/* JADX INFO: loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: a */
    public BinderC8575s f15886a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f15886a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        C8540g0 c8540g0;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (C8573r0.class) {
            try {
                if (C8573r0.f45964a == null) {
                    C5288t c5288t = new C5288t();
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (applicationContext2 != null) {
                        applicationContext = applicationContext2;
                    }
                    C8583u1 c8583u1 = new C8583u1(applicationContext);
                    c5288t.f33503b = c8583u1;
                    C8573r0.f45964a = new C8540g0(c8583u1);
                }
                c8540g0 = C8573r0.f45964a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15886a = (BinderC8575s) c8540g0.f45848a.zza();
    }
}
