package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p116fc.C5504a;

/* JADX INFO: renamed from: com.google.firebase.messaging.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3238d0 {

    /* JADX INFO: renamed from: a */
    public static final long f16375a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    public static final Object f16376b = new Object();

    /* JADX INFO: renamed from: c */
    public static C5504a f16377c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m9252a(Intent intent) {
        synchronized (f16376b) {
            if (f16377c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f16377c.m11735c();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static ComponentName m9253b(Context context, Intent intent) {
        synchronized (f16376b) {
            if (f16377c == null) {
                C5504a c5504a = new C5504a(context);
                f16377c = c5504a;
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
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f16377c.m11733a(f16375a);
            }
            return componentNameStartService;
        }
    }
}
