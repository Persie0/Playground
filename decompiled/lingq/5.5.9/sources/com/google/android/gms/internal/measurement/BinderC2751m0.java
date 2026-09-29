package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2751m0 extends AbstractBinderC2830s0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f14305a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public boolean f14306b;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r7 = r7.get("r");
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8057b1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2843t0
    /* JADX INFO: renamed from: U */
    public final void mo8058U(Bundle bundle) {
        synchronized (this.f14305a) {
            try {
                this.f14305a.set(bundle);
                this.f14306b = true;
                this.f14305a.notify();
            } catch (Throwable th2) {
                this.f14305a.notify();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final String m8059h0(long j10) {
        return (String) m8057b1(m8060j(j10), String.class);
    }

    /* JADX INFO: renamed from: j */
    public final Bundle m8060j(long j10) {
        Bundle bundle;
        synchronized (this.f14305a) {
            if (!this.f14306b) {
                try {
                    this.f14305a.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f14305a.get();
        }
        return bundle;
    }
}
