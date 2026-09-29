package p000;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class br1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final m58 f8880a;

    /* JADX INFO: renamed from: b */
    public final C1150a f8881b;

    /* JADX INFO: renamed from: c */
    public final Thread.UncaughtExceptionHandler f8882c;

    /* JADX INFO: renamed from: d */
    public final up1 f8883d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f8884e = new AtomicBoolean(false);

    public br1(m58 m58Var, C1150a c1150a, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, up1 up1Var) {
        this.f8880a = m58Var;
        this.f8881b = c1150a;
        this.f8882c = uncaughtExceptionHandler;
        this.f8883d = up1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4115a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f8883d.m22849b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8882c;
        AtomicBoolean atomicBoolean = this.f8884e;
        atomicBoolean.set(true);
        try {
            try {
                if (m4115a(thread, th)) {
                    this.f8880a.m16647m(this.f8881b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                iy5 iy5Var = iy5.f44770f;
                if (iy5Var.m14204d(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                if (uncaughtExceptionHandler != null) {
                    iy5Var.m14205e("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    iy5Var.m14205e("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
