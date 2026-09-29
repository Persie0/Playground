package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p023b2.C1293b;
import p290o6.C7967l0;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3117h {

    /* JADX INFO: renamed from: k */
    public static final C7967l0 f15922k = new C7967l0("ExtractorLooper");

    /* JADX INFO: renamed from: a */
    public final C3118i f15923a;

    /* JADX INFO: renamed from: b */
    public final C3116g f15924b;

    /* JADX INFO: renamed from: c */
    public final C3126q f15925c;

    /* JADX INFO: renamed from: d */
    public final C3120k f15926d;

    /* JADX INFO: renamed from: e */
    public final C3121l f15927e;

    /* JADX INFO: renamed from: f */
    public final C3122m f15928f;

    /* JADX INFO: renamed from: g */
    public final C3123n f15929g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9268p f15930h;

    /* JADX INFO: renamed from: i */
    public final C3119j f15931i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f15932j = new AtomicBoolean(false);

    public C3117h(C3118i c3118i, InterfaceC9268p interfaceC9268p, C3116g c3116g, C3126q c3126q, C3120k c3120k, C3121l c3121l, C3122m c3122m, C3123n c3123n, C3119j c3119j) {
        this.f15923a = c3118i;
        this.f15930h = interfaceC9268p;
        this.f15924b = c3116g;
        this.f15925c = c3126q;
        this.f15926d = c3120k;
        this.f15927e = c3121l;
        this.f15928f = c3122m;
        this.f15929g = c3123n;
        this.f15931i = c3119j;
    }

    /* JADX INFO: renamed from: a */
    public final void m8986a(int i10, Exception exc) {
        C3118i c3118i = this.f15923a;
        try {
            ReentrantLock reentrantLock = c3118i.f15939f;
            try {
                reentrantLock.lock();
                c3118i.m8990c(i10).f46010c.f45995d = 5;
                reentrantLock.unlock();
                c3118i.m8991d(new C1293b(c3118i, i10));
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (zzck unused) {
            f15922k.m15812m("Error during error handling: %s", exc.getMessage());
        }
    }
}
