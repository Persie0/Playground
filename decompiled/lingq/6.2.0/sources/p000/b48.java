package p000;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class b48 {

    /* JADX INFO: renamed from: a */
    public mq7 f7929a;

    /* JADX INFO: renamed from: b */
    public mkd f7930b;

    /* JADX INFO: renamed from: c */
    public wo3 f7931c;

    /* JADX INFO: renamed from: d */
    public Feature[] f7932d;

    /* JADX INFO: renamed from: e */
    public boolean f7933e;

    /* JADX INFO: renamed from: a */
    public final p33 m3287a() {
        int i = 0;
        lda.m16124j("Must set register function", this.f7929a != null);
        lda.m16124j("Must set unregister function", this.f7930b != null);
        lda.m16124j("Must set holder", this.f7931c != null);
        qg5 qg5Var = (qg5) this.f7931c.f67120b;
        lda.m16131q(qg5Var, "Key must not be null");
        return new p33(16, new nc0(this, this.f7931c, this.f7932d, this.f7933e), new cdb(i, this, qg5Var));
    }

    /* JADX INFO: renamed from: b */
    public final void m3288b(mq7 mq7Var) {
        this.f7929a = mq7Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m3289c() {
        this.f7933e = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m3290d(Feature... featureArr) {
        this.f7932d = featureArr;
    }

    /* JADX INFO: renamed from: e */
    public final void m3291e() {
        this.f7930b = mkd.f51461e;
    }

    /* JADX INFO: renamed from: f */
    public final void m3292f(wo3 wo3Var) {
        this.f7931c = wo3Var;
    }
}
