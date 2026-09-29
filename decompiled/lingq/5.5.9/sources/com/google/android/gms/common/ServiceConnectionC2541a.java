package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.common.a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2541a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public boolean f13867a = false;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue f13868b = new LinkedBlockingQueue();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: a */
    public final IBinder m7533a(TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C6272i.m12914h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f13867a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f13867a = true;
        IBinder iBinder = (IBinder) this.f13868b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13868b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
