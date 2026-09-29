package p000;

import com.google.android.gms.measurement.internal.C1045d;

/* JADX INFO: loaded from: classes.dex */
public abstract class h8d extends p7d {

    /* JADX INFO: renamed from: c */
    public boolean f42002c;

    public h8d(C1045d c1045d) {
        super(c1045d);
        this.f55716b.f12342M++;
    }

    /* JADX INFO: renamed from: E */
    public final void m13144E() {
        if (this.f42002c) {
            return;
        }
        C3386nv.m17633t("Not initialized");
    }

    /* JADX INFO: renamed from: F */
    public final void m13145F() {
        if (this.f42002c) {
            C3386nv.m17633t("Can't initialize twice");
            return;
        }
        mo4333G();
        this.f55716b.f12343N++;
        this.f42002c = true;
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo4333G();
}
