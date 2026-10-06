package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxx {

    /* JADX INFO: renamed from: b */
    private static final nbh f12858b = nbh.m17259h("com/google/android/apps/camera/framestore/MetadataFrameStore");

    /* JADX INFO: renamed from: a */
    public final ktz f12859a;

    /* JADX INFO: renamed from: c */
    private final Map f12860c;

    public dxx() {
        new kbx();
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public final gsr m6885a(long j) {
        return (gsr) this.f12859a.m14857j(dyv.m6940c(j));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, naf] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, naf] */
    /* JADX INFO: renamed from: b */
    public final gsr m6886b() {
        kba kbaVar;
        ktz ktzVar = this.f12859a;
        synchronized (ktzVar.f37199b) {
            if (ktzVar.f37200c.isEmpty()) {
                kbaVar = null;
            } else {
                List listD = ((mty) ktzVar.f37201d).mo16885b((Long) ktzVar.f37200c.mo16929k().mo17162b());
                kbaVar = (kba) listD.get(listD.size() - 1);
            }
        }
        return (gsr) kbaVar;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized kba m6887c(dxy dxyVar, Executor executor) {
        this.f12860c.put(dxyVar, executor);
        return new cic(this, dxyVar, 18);
    }

    /* JADX INFO: renamed from: d */
    public final List m6888d() {
        return this.f12859a.m14860m();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6889e(gsr gsrVar) {
        for (Map.Entry entry : this.f12860c.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new dgq(entry, gsrVar, 10));
            } catch (RejectedExecutionException e) {
                ((nbe) ((nbe) ((nbe) f12858b.m17251b()).mo17283h(e)).mo17276G((char) 1175)).mo17293r("RejectedExecutionException on %s", entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m6890f(dxy dxyVar) {
        if (this.f12860c.containsKey(dxyVar)) {
            this.f12860c.remove(dxyVar);
        }
    }

    public dxx(byte[] bArr) {
        this.f12859a = inr.m11546r(1048);
        this.f12860c = new HashMap();
    }
}
