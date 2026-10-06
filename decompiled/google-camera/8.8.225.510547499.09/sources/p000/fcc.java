package p000;

import android.content.Context;
import android.location.Location;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcc implements fca, fbp, fas, fat {

    /* JADX INFO: renamed from: f */
    private static final nbh f21226f = nbh.m17259h("com/google/android/apps/camera/location/LocationProviderImpl");

    /* JADX INFO: renamed from: a */
    public final Context f21227a;

    /* JADX INFO: renamed from: b */
    public final hah f21228b;

    /* JADX INFO: renamed from: c */
    public final oju f21229c;

    /* JADX INFO: renamed from: d */
    public final kbz f21230d;

    /* JADX INFO: renamed from: e */
    public final Executor f21231e;

    /* JADX INFO: renamed from: g */
    private final jvd f21232g;

    /* JADX INFO: renamed from: h */
    private final Executor f21233h;

    /* JADX INFO: renamed from: i */
    private nps f21234i;

    public fcc(Context context, hah hahVar, oju ojuVar, jvd jvdVar, kbz kbzVar, Executor executor, Executor executor2) {
        this.f21227a = context;
        this.f21228b = hahVar;
        this.f21229c = ojuVar;
        this.f21232g = jvdVar;
        this.f21230d = kbzVar;
        this.f21233h = executor;
        this.f21231e = executor2;
    }

    /* JADX INFO: renamed from: f */
    private final nps m8119f(nps npsVar) {
        return nod.m17554j(npsVar, etv.f19878c, this.f21231e);
    }

    @Override // p000.fas
    /* JADX INFO: renamed from: a */
    public final void mo8085a() {
        this.f21234i = kxk.m14970P(new cnm(this, 2), this.f21233h);
    }

    @Override // p000.fca
    /* JADX INFO: renamed from: b */
    public final cjr mo8116b() {
        nps npsVar = this.f21234i;
        return npsVar == null ? cjr.m3828a() : new cjr(m8119f(npsVar), 1000L);
    }

    @Override // p000.fca
    /* JADX INFO: renamed from: c */
    public final mrm mo8117c() {
        try {
            if (this.f21234i == null) {
                return mqu.f41450a;
            }
            try {
                this.f21230d.mo13961e("Location#getCurrent");
                return mrm.m16828h((Location) m8119f(this.f21234i).get(1000L, TimeUnit.MILLISECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((nbe) ((nbe) ((nbe) f21226f.m17252c()).mo17283h(e)).mo17276G(2102)).mo17290o("Failed to get current location.");
                this.f21230d.mo13962f();
                return mqu.f41450a;
            }
        } finally {
            this.f21230d.mo13962f();
        }
    }

    @Override // p000.fat
    /* JADX INFO: renamed from: d */
    public final void mo8086d() {
        nps npsVar = this.f21234i;
        if (npsVar != null) {
            jvh.m13562j(npsVar, new kao() { // from class: fcb
                @Override // p000.kao
                /* JADX INFO: renamed from: a */
                public final void mo3483a(Object obj) {
                    fbz fbzVar = (fbz) obj;
                    if (fbzVar != null) {
                        fbzVar.mo8113c(false);
                    }
                }
            }, this.f21232g);
        }
    }

    @Override // p000.fca
    /* JADX INFO: renamed from: e */
    public final mrm mo8118e() {
        nps npsVar = this.f21234i;
        if (npsVar != null && npsVar.isDone()) {
            return mo8117c();
        }
        ((nbe) ((nbe) f21226f.m17252c()).mo17276G((char) 2103)).mo17290o("Location provider not ready, skipping.");
        return mqu.f41450a;
    }
}
