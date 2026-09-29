package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2792p1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f14383a;

    /* JADX INFO: renamed from: b */
    public final long f14384b;

    /* JADX INFO: renamed from: c */
    public final boolean f14385c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2870v1 f14386d;

    public AbstractRunnableC2792p1(C2870v1 c2870v1, boolean z10) {
        this.f14386d = c2870v1;
        c2870v1.f14467b.getClass();
        this.f14383a = System.currentTimeMillis();
        c2870v1.f14467b.getClass();
        this.f14384b = SystemClock.elapsedRealtime();
        this.f14385c = z10;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7635a() throws RemoteException;

    /* JADX INFO: renamed from: b */
    public void mo7651b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2870v1 c2870v1 = this.f14386d;
        if (c2870v1.f14472g) {
            mo7651b();
            return;
        }
        try {
            mo7635a();
        } catch (Exception e10) {
            c2870v1.m8299a(e10, false, this.f14385c);
            mo7651b();
        }
    }
}
