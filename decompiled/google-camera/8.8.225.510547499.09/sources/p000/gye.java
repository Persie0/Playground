package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gye {

    /* JADX INFO: renamed from: a */
    public static final nbh f26821a = nbh.m17259h("com/google/android/apps/camera/session/SessionNotifier");

    /* JADX INFO: renamed from: c */
    public final gxa f26823c;

    /* JADX INFO: renamed from: e */
    private final ohb f26825e;

    /* JADX INFO: renamed from: f */
    private final jvd f26826f;

    /* JADX INFO: renamed from: b */
    public final List f26822b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map f26824d = new ConcurrentHashMap();

    public gye(jvd jvdVar, gxa gxaVar, ohb ohbVar) {
        this.f26826f = jvdVar;
        this.f26823c = gxaVar;
        this.f26825e = ohbVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9966a(gyi gyiVar) {
        synchronized (this.f26822b) {
            this.f26822b.add(gyiVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9967b(Consumer consumer, gyu gyuVar) {
        this.f26826f.m13541c(new gxn(this, consumer, gyuVar, 4));
    }

    /* JADX INFO: renamed from: c */
    public final void m9968c(Consumer consumer) {
        Iterator it = ((Set) this.f26825e.get()).iterator();
        while (it.hasNext()) {
            consumer.accept((gyi) it.next());
        }
        Iterator it2 = this.f26822b.iterator();
        while (it2.hasNext()) {
            consumer.accept((gyi) it2.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9969d(Consumer consumer) {
        this.f26826f.m13541c(new gqn(this, consumer, 11));
    }

    /* JADX INFO: renamed from: e */
    public final void m9970e(gyu gyuVar, Runnable runnable, String str) {
        nps npsVar = (nps) this.f26824d.get(gyuVar);
        if (npsVar == null) {
            ((nbe) ((nbe) f26821a.m17251b()).mo17276G(3373)).mo17301z("%s: No queued future found, maybe shot already finalized?: %s", gyuVar, str);
        } else {
            kxk.m14975U(npsVar, new cwx(str, runnable, gyuVar, 3), not.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9971f(gyu gyuVar) {
        nps npsVar = (nps) this.f26824d.get(gyuVar);
        if (npsVar == null) {
            ((nbe) ((nbe) f26821a.m17251b()).mo17276G((char) 3379)).mo17293r("%s: No queued future found, maybe shot already finalized?: notifyTaskDone", gyuVar);
        } else {
            npsVar.mo2282d(new gqn(this, gyuVar, 10), not.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9972g(gyu gyuVar, nps npsVar, gyx gyxVar) {
        this.f26824d.put(gyuVar, nod.m17553i(npsVar, new fye(this, gyuVar, gyxVar, 3), not.INSTANCE));
    }

    /* JADX INFO: renamed from: h */
    public final void m9973h(gyi gyiVar) {
        synchronized (this.f26822b) {
            this.f26822b.remove(gyiVar);
        }
    }
}
