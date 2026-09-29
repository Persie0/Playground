package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import p068d9.C5097k;
import p116fc.C5504a;
import p118fe.C5509a;
import p136gc.AbstractC5751g;
import p136gc.C5761q;
import p169i4.ExecutorC6178d;
import p290o6.CallableC7948c;

/* JADX INFO: renamed from: com.google.firebase.messaging.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3246i {

    /* JADX INFO: renamed from: c */
    public static final Object f16394c = new Object();

    /* JADX INFO: renamed from: d */
    public static ServiceConnectionC3244g0 f16395d;

    /* JADX INFO: renamed from: a */
    public final Context f16396a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC6178d f16397b = new ExecutorC6178d(1);

    public C3246i(Context context) {
        this.f16396a = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C5761q m9262a(Context context, Intent intent) {
        ServiceConnectionC3244g0 serviceConnectionC3244g0;
        ServiceConnectionC3244g0 serviceConnectionC3244g1;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (C3258u.m9290a().m9292c(context)) {
            synchronized (f16394c) {
                if (f16395d == null) {
                    f16395d = new ServiceConnectionC3244g0(context);
                }
                serviceConnectionC3244g1 = f16395d;
            }
            synchronized (C3238d0.f16376b) {
                if (C3238d0.f16377c == null) {
                    C5504a c5504a = new C5504a(context);
                    C3238d0.f16377c = c5504a;
                    synchronized (c5504a.f34121a) {
                        try {
                            c5504a.f34127g = true;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    C3238d0.f16377c.m11733a(C3238d0.f16375a);
                }
                serviceConnectionC3244g1.m9258b(intent).mo12100b(new C5509a(12, intent));
            }
        } else {
            synchronized (f16394c) {
                try {
                    if (f16395d == null) {
                        f16395d = new ServiceConnectionC3244g0(context);
                    }
                    serviceConnectionC3244g0 = f16395d;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            serviceConnectionC3244g0.m9258b(intent);
        }
        return Tasks.m8539c(-1);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5751g<Integer> m9263b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f16396a;
        boolean z11 = context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        if (z11 && !z10) {
            return m9262a(context, intent);
        }
        CallableC7948c callableC7948c = new CallableC7948c(context, 2, intent);
        ExecutorC6178d executorC6178d = this.f16397b;
        return Tasks.m8538b(executorC6178d, callableC7948c).mo12105g(executorC6178d, new C5097k(context, 7, intent));
    }
}
