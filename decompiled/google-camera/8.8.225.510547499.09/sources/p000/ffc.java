package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffc implements kfb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f21600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f21601c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f21602d;

    public /* synthetic */ ffc(ffe ffeVar, fgx fgxVar, Executor executor, int i) {
        this.f21602d = i;
        this.f21599a = ffeVar;
        this.f21600b = fgxVar;
        this.f21601c = executor;
    }

    public /* synthetic */ ffc(AtomicInteger atomicInteger, kfc kfcVar, jwf jwfVar, int i) {
        this.f21602d = i;
        this.f21601c = atomicInteger;
        this.f21600b = kfcVar;
        this.f21599a = jwfVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kfc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        key keyVarM14357a;
        switch (this.f21602d) {
            case 0:
                Object obj = this.f21599a;
                ?? r2 = this.f21600b;
                ?? r3 = this.f21601c;
                ffb ffbVar = new ffb(kiqVar, (fgx) r2, 0);
                if (!((ffe) obj).f21607b.get() && (keyVarM14357a = kiqVar.m14357a()) != null) {
                    keyVarM14357a.mo7050k(new ffd(r3, ffbVar, keyVarM14357a));
                }
                break;
            default:
                Object obj2 = this.f21601c;
                ?? r0 = this.f21600b;
                Object obj3 = this.f21599a;
                AtomicInteger atomicInteger = (AtomicInteger) obj2;
                int i = atomicInteger.get();
                int iMo9402b = r0.mo9402b();
                if (iMo9402b <= 3 && iMo9402b != i) {
                    ((nbe) ((nbe) epk.f14980a.m17252c()).mo17276G(1713)).mo17296u("Not enough frames in ZSL ring: %s in %s", iMo9402b, r0.mo9417q().f36067c);
                } else if (iMo9402b > 3 && i <= 3) {
                    mxk mxkVar = r0.mo9417q().f36067c;
                }
                ((jwf) obj3).mo3415bf(Boolean.valueOf(iMo9402b > 3));
                atomicInteger.set(iMo9402b);
                break;
        }
    }
}
