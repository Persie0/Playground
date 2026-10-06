package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyw implements kba {

    /* JADX INFO: renamed from: a */
    public final gyp f12937a;

    /* JADX INFO: renamed from: e */
    private Bitmap f12941e;

    /* JADX INFO: renamed from: f */
    private int f12942f;

    /* JADX INFO: renamed from: d */
    private boolean f12940d = false;

    /* JADX INFO: renamed from: b */
    private kbb f12938b = kbb.f35514c;

    /* JADX INFO: renamed from: c */
    private boolean f12939c = false;

    public dyw(gyp gypVar) {
        this.f12937a = gypVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m6944a() {
        return this.f12942f;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m6945b() {
        return this.f12941e;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized kbb m6946c() {
        return this.f12938b;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12940d) {
            return;
        }
        this.f12940d = true;
        this.f12941e = null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6947d(Bitmap bitmap, int i) {
        if (this.f12940d) {
            return;
        }
        this.f12941e = bitmap;
        this.f12942f = i;
        if (this.f12939c) {
            return;
        }
        this.f12939c = true;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6948e(kbb kbbVar) {
        if (this.f12938b == kbb.f35514c) {
            kbbVar.compareTo(kbb.f35513b);
        }
        if (!this.f12938b.equals(kbb.f35512a)) {
            kbbVar.equals(kbb.f35512a);
        }
        this.f12938b = kbbVar;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m6949f() {
        return this.f12939c;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized int m6950g() {
        return this.f12938b.m13900d() ? 2 : 1;
    }
}
