package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import p136gc.AbstractC5751g;
import p241le.C7332f;
import p241le.C7336h;
import p241le.C7337h0;
import p241le.C7338i;
import p241le.CallableC7340k;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3212a implements C3214c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3213b f16203a;

    public C3212a(C3213b c3213b) {
        this.f16203a = c3213b;
    }

    /* JADX INFO: renamed from: a */
    public final void m9161a(InterfaceC8996f interfaceC8996f, Thread thread, Throwable th2) {
        AbstractC5751g<TContinuationResult> abstractC5751gMo12105g;
        C3213b c3213b = this.f16203a;
        synchronized (c3213b) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C7332f c7332f = c3213b.f16209e;
            CallableC7340k callableC7340k = new CallableC7340k(c3213b, jCurrentTimeMillis, th2, thread, interfaceC8996f);
            synchronized (c7332f.f41052c) {
                try {
                    abstractC5751gMo12105g = c7332f.f41051b.mo12105g(c7332f.f41050a, new C7336h(callableC7340k));
                    c7332f.f41051b = abstractC5751gMo12105g.mo12104f(c7332f.f41050a, new C7338i());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            try {
                C7337h0.m14755a(abstractC5751gMo12105g);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}
