package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lnt {

    /* JADX INFO: renamed from: a */
    public static final nbh f38777a = nbh.m17259h("com/google/android/libraries/performance/primes/sampling/Sampler");

    /* JADX INFO: renamed from: e */
    private static final lns f38778e = lns.m15771a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public volatile lnx f38779b = lnw.f38787a;

    /* JADX INFO: renamed from: c */
    public volatile boolean f38780c = true;

    /* JADX INFO: renamed from: d */
    public volatile lns f38781d = f38778e;

    public lnt(Context context, Executor executor, lnw lnwVar, ohb ohbVar, boolean z, oju ojuVar) {
        kxk.m14968N(new efc(this, context, ohbVar, executor, lnwVar, ojuVar, 5), executor);
    }

    /* JADX INFO: renamed from: a */
    public final void m15772a(ohb ohbVar) {
        try {
            lic licVar = (lic) ohbVar.get();
            this.f38780c = licVar.mo15379b();
            this.f38781d = lns.m15771a(licVar.mo15378a());
        } catch (Throwable th) {
            ((nbe) ((nbe) ((nbe) f38777a.m17252c()).mo17283h(th)).mo17276G((char) 4571)).mo17290o("Couldn't get config");
            this.f38780c = false;
        }
    }
}
