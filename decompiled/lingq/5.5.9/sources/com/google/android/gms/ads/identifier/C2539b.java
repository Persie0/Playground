package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.ads.identifier.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2539b extends Thread {

    /* JADX INFO: renamed from: a */
    public final WeakReference<AdvertisingIdClient> f13795a;

    /* JADX INFO: renamed from: b */
    public final long f13796b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f13797c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public boolean f13798d = false;

    public C2539b(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f13795a = new WeakReference<>(advertisingIdClient);
        this.f13796b = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference<AdvertisingIdClient> weakReference = this.f13795a;
        try {
            if (!this.f13797c.await(this.f13796b, TimeUnit.MILLISECONDS) && (advertisingIdClient = weakReference.get()) != null) {
                advertisingIdClient.zza();
                this.f13798d = true;
            }
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f13798d = true;
            }
        }
    }
}
