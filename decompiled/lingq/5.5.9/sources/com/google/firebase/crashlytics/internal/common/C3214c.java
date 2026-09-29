package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import ie.InterfaceC6320a;
import java.util.concurrent.atomic.AtomicBoolean;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3214c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final a f16221a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8996f f16222b;

    /* JADX INFO: renamed from: c */
    public final Thread.UncaughtExceptionHandler f16223c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6320a f16224d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f16225e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.c$a */
    public interface a {
    }

    public C3214c(C3212a c3212a, C3215a c3215a, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC6320a interfaceC6320a) {
        this.f16221a = c3212a;
        this.f16222b = c3215a;
        this.f16223c = uncaughtExceptionHandler;
        this.f16224d = interfaceC6320a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9168a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        boolean z10 = true;
        if (!this.f16224d.mo12946b()) {
            return true;
        }
        if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16223c;
        AtomicBoolean atomicBoolean = this.f16225e;
        boolean z10 = true;
        atomicBoolean.set(true);
        try {
            try {
                if (m9168a(thread, th2)) {
                    ((C3212a) this.f16221a).m9161a(this.f16222b, thread, th2);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                    }
                }
                if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z10 = false;
                }
                if (z10) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
                if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z10 = false;
                }
                if (z10) {
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
        } catch (Throwable th3) {
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
