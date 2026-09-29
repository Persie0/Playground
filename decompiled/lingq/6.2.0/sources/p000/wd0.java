package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class wd0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public boolean f66634a = false;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue f66635b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public final IBinder m23852a() throws TimeoutException {
        lda.m16129o("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f66634a) {
            C3386nv.m17633t("Cannot call get on this connection more than once");
            return null;
        }
        this.f66634a = true;
        IBinder iBinder = (IBinder) this.f66635b.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f66635b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
