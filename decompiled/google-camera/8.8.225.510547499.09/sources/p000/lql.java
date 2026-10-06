package p000;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lql {

    /* JADX INFO: renamed from: i */
    public static final lhz f38969i = new lhz((byte[]) null);

    /* JADX INFO: renamed from: a */
    public final lpj f38970a;

    /* JADX INFO: renamed from: b */
    public final String f38971b;

    /* JADX INFO: renamed from: f */
    public volatile String f38975f;

    /* JADX INFO: renamed from: g */
    public final lrd f38976g;

    /* JADX INFO: renamed from: c */
    public final String f38972c = "";

    /* JADX INFO: renamed from: e */
    public final boolean f38974e = false;

    /* JADX INFO: renamed from: d */
    final lqv f38973d = new lqv(new lpm(this, 2));

    /* JADX INFO: renamed from: h */
    final lhz f38977h = new lhz();

    public lql(lpj lpjVar, String str, boolean z) {
        this.f38970a = lpjVar;
        this.f38971b = str;
        this.f38976g = new lrd(lpjVar, str, "", z);
    }

    /* JADX INFO: renamed from: a */
    public final nps m15882a() {
        return this.f38975f.isEmpty() ? npp.f44031a : nnj.m17524j(this.f38970a.m15828e().m15479b(this.f38975f), lqa.class, new cnc(this, 12), this.f38970a.m15826b());
    }

    /* JADX INFO: renamed from: b */
    public final void m15883b() {
        nps npsVarM15910b = this.f38976g.m15910b(this.f38972c);
        lrd lrdVar = this.f38976g;
        lrdVar.getClass();
        nod.m17554j(npsVarM15910b, new cnc(lrdVar, 11), this.f38970a.m15826b()).mo2282d(new lll(this, npsVarM15910b, 6), this.f38970a.m15826b());
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m15884c(nps npsVar) {
        try {
            mwx mwxVarM15907a = lrd.m15907a((lre) kxk.m14973S(npsVar));
            lqv lqvVar = this.f38973d;
            synchronized (lqvVar.f39016a) {
                if (lqvVar.f39017b != null) {
                    boolean zEquals = lqvVar.f39017b.equals(mwxVarM15907a);
                    if (!zEquals) {
                        this.f38970a.m15827d();
                        this.f38970a.m15827d().m15888a();
                        return;
                    }
                } else {
                    lqvVar.f39017b = mwxVarM15907a;
                    lqvVar.f39018c = null;
                }
                ((AtomicInteger) this.f38977h.f38277a).incrementAndGet();
            }
        } catch (CancellationException | ExecutionException e) {
            Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + this.f38971b + ", may result in stale flags.", e);
        }
    }
}
