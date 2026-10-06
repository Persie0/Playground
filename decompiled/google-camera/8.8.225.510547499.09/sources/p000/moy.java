package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class moy {

    /* JADX INFO: renamed from: a */
    public boolean f41219a;

    /* JADX INFO: renamed from: b */
    public Object f41220b;

    /* JADX INFO: renamed from: c */
    final Object f41221c;

    public moy() {
        this.f41219a = false;
        this.f41220b = null;
        this.f41221c = null;
    }

    public moy(byte[] bArr) {
        this.f41221c = mws.m17090e();
        this.f41219a = false;
    }

    public moy(byte[] bArr, byte[] bArr2) {
        this.f41221c = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final lrn m16718a() {
        this.f41220b.getClass();
        return new lrn(((Boolean) this.f41220b).booleanValue(), this.f41219a, ((mwn) this.f41221c).m17081f());
    }

    /* JADX INFO: renamed from: b */
    public final void m16719b(lrp lrpVar) {
        this.f41220b.getClass();
        ((mwn) this.f41221c).m17082g(lrpVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m16720c() {
        lku.m15614I(this.f41220b == null, "A SourcePolicy can only set internal() or external() once.");
        this.f41220b = false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX INFO: renamed from: d */
    public final void m16721d(jpq jpqVar) {
        synchronized (this.f41221c) {
            if (this.f41220b == null) {
                this.f41220b = new ArrayDeque();
            }
            this.f41220b.add(jpqVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX INFO: renamed from: e */
    public final void m16722e(jpp jppVar) {
        jpq jpqVar;
        synchronized (this.f41221c) {
            if (this.f41220b != null && !this.f41219a) {
                this.f41219a = true;
                while (true) {
                    synchronized (this.f41221c) {
                        jpqVar = (jpq) this.f41220b.poll();
                        if (jpqVar == null) {
                            this.f41219a = false;
                            return;
                        }
                    }
                    jpqVar.mo13446a(jppVar);
                }
            }
        }
    }
}
