package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o58 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f53867a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b */
    public IBinder f53868b;

    /* JADX INFO: renamed from: a */
    public final IBinder m17807a() throws InterruptedException {
        this.f53867a.await(5L, TimeUnit.SECONDS);
        return this.f53868b;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        componentName.getClass();
        this.f53867a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.f53868b = iBinder;
        this.f53867a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
