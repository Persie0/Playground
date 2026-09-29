package p000;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class job extends Thread {

    /* JADX INFO: renamed from: a */
    public final WeakReference f45936a;

    /* JADX INFO: renamed from: b */
    public final long f45937b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f45938c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public boolean f45939d = false;

    public job(AdvertisingIdClient advertisingIdClient, long j) {
        this.f45936a = new WeakReference(advertisingIdClient);
        this.f45937b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f45936a;
        try {
            if (this.f45938c.await(this.f45937b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.m5264a();
            this.f45939d = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.m5264a();
                this.f45939d = true;
            }
        }
    }
}
