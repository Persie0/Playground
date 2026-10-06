package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjr {

    /* JADX INFO: renamed from: a */
    public static final nbh f5937a = nbh.m17259h("com/google/android/apps/camera/async/OptionalFuture");

    /* JADX INFO: renamed from: b */
    public final nps f5938b;

    /* JADX INFO: renamed from: c */
    public final long f5939c;

    public cjr(nps npsVar, long j) {
        this.f5938b = npsVar;
        this.f5939c = j;
    }

    /* JADX INFO: renamed from: a */
    public static cjr m3828a() {
        return new cjr(kxk.m14965K(null), 0L);
    }

    /* JADX INFO: renamed from: b */
    public final mrm m3829b() {
        try {
            return mrm.m16828h(this.f5938b.get(this.f5939c, TimeUnit.MILLISECONDS));
        } catch (Exception e) {
            ((nbe) ((nbe) f5937a.m17252c()).mo17276G(202)).mo17293r("Failed to resolve %s, returning absent instead.", this.f5938b);
            return mqu.f41450a;
        }
    }
}
