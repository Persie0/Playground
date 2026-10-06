package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtl implements gti {

    /* JADX INFO: renamed from: a */
    public final dvn f26369a;

    /* JADX INFO: renamed from: b */
    private final gth[] f26370b;

    /* JADX INFO: renamed from: c */
    private final Object f26371c;

    public gtl() {
        long jConvert = TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30;
        this.f26371c = new Object();
        int i = (int) jConvert;
        this.f26369a = new dvn(i);
        this.f26370b = new gth[i];
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: a */
    public final int mo9756a() {
        return this.f26370b.length;
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: b */
    public final dtp mo9757b() {
        return this.f26369a;
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: c */
    public final gth mo9758c(long j) {
        gth gthVar;
        synchronized (this.f26371c) {
            int iM6786g = this.f26369a.m6786g(j);
            gthVar = iM6786g >= 0 ? this.f26370b[iM6786g] : null;
        }
        return gthVar;
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: d */
    public final gth mo9759d(long j) {
        synchronized (this.f26371c) {
            if (this.f26369a.m6784e() <= 0) {
                return null;
            }
            dvn dvnVar = this.f26369a;
            int iM6785f = dvnVar.m6785f(dvnVar.m6782c(j));
            dvn dvnVar2 = this.f26369a;
            int iM6785f2 = dvnVar2.m6785f(dvnVar2.m6783d(j));
            gth gthVar = iM6785f >= 0 ? this.f26370b[iM6785f] : null;
            gth gthVar2 = iM6785f2 >= 0 ? this.f26370b[iM6785f2] : null;
            if (gthVar == null) {
                return gthVar2;
            }
            if (gthVar2 == null) {
                return gthVar;
            }
            if (j - gthVar.f26339a >= gthVar2.f26339a - j) {
                gthVar = gthVar2;
            }
            return gthVar;
        }
    }

    @Override // p000.gti
    /* JADX INFO: renamed from: e */
    public final void mo9760e() {
    }

    /* JADX INFO: renamed from: f */
    public final void m9762f(gth gthVar) {
        try {
            synchronized (this.f26371c) {
                this.f26370b[this.f26369a.m6781b(gthVar.f26339a)] = gthVar;
            }
        } catch (IllegalArgumentException e) {
        }
    }
}
