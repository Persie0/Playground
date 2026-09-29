package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.bfb;
import p000.kj3;
import p000.tld;
import p000.wr9;

/* JADX INFO: renamed from: com.google.mlkit.common.sdkinternal.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1172a {

    /* JADX INFO: renamed from: b */
    public static final Object f13907b = new Object();

    /* JADX INFO: renamed from: c */
    public static C1172a f13908c;

    /* JADX INFO: renamed from: a */
    public final bfb f13909a;

    public C1172a(Looper looper) {
        bfb bfbVar = new bfb(looper);
        Looper.getMainLooper();
        this.f13909a = bfbVar;
    }

    /* JADX INFO: renamed from: a */
    public static C1172a m6770a() {
        C1172a c1172a;
        synchronized (f13907b) {
            try {
                if (f13908c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f13908c = new C1172a(handlerThread.getLooper());
                }
                c1172a = f13908c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1172a;
    }

    /* JADX INFO: renamed from: b */
    public static tld m6771b(Callable callable) {
        wr9 wr9Var = new wr9();
        zzh.INSTANCE.execute(new kj3(16, callable, wr9Var));
        return wr9Var.f67208a;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m6772c() {
        return zzh.INSTANCE;
    }
}
