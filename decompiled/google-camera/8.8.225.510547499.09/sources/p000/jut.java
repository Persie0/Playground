package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jut implements kba {

    /* JADX INFO: renamed from: a */
    public final kba f34856a;

    /* JADX INFO: renamed from: b */
    public int f34857b;

    /* JADX INFO: renamed from: c */
    public final jvt f34858c;

    /* JADX INFO: renamed from: d */
    public final Object f34859d;

    /* JADX INFO: renamed from: e */
    public final Runnable f34860e;

    /* JADX INFO: renamed from: f */
    public boolean f34861f;

    public jut(kba kbaVar) {
        this(kbaVar, kxk.m15033z(), null);
    }

    /* JADX INFO: renamed from: a */
    public final kba m13527a() {
        synchronized (this.f34859d) {
            if (this.f34861f) {
                return null;
            }
            this.f34857b++;
            jvt jvtVar = this.f34858c;
            if (jvtVar != null) {
                jvtVar.m13586a();
            }
            return new jus(this, 0);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34859d) {
            if (this.f34861f) {
                return;
            }
            this.f34861f = true;
            jvt jvtVar = this.f34858c;
            if (jvtVar != null) {
                jvtVar.m13586a();
            }
            this.f34856a.close();
        }
    }

    public jut(kba kbaVar, Executor executor, jvt jvtVar) {
        this.f34861f = false;
        this.f34856a = kbaVar;
        this.f34858c = jvtVar;
        this.f34859d = new Object();
        this.f34857b = 0;
        this.f34860e = new bek(new juz(this, 1), executor, 5);
    }
}
