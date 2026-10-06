package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqc {

    /* JADX INFO: renamed from: a */
    public static final nbh f15099a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurProcessingQueue");

    /* JADX INFO: renamed from: d */
    public final Executor f15102d;

    /* JADX INFO: renamed from: e */
    public final kbz f15103e;

    /* JADX INFO: renamed from: f */
    private final fxs f15104f = new fxs(1);

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f15100b = new AtomicInteger(-1);

    /* JADX INFO: renamed from: c */
    public final Map f15101c = new HashMap();

    /* JADX INFO: renamed from: g */
    private final Set f15105g = new HashSet();

    /* JADX INFO: renamed from: h */
    private final Set f15106h = new HashSet();

    public eqc(kbz kbzVar, Executor executor) {
        this.f15102d = executor;
        this.f15103e = kbzVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7676a(int i, boolean z, Runnable runnable) {
        ((nbe) ((nbe) f15099a.m17252c()).mo17276G(1779)).mo17291p("Aborting task %s", i);
        m7680e(i, runnable);
        if (z) {
            this.f15106h.add(Integer.valueOf(i));
        }
        m7677b(i, false);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7677b(int i, boolean z) {
        Map map = this.f15101c;
        Integer numValueOf = Integer.valueOf(i);
        eqb eqbVar = (eqb) map.remove(numValueOf);
        if (eqbVar != null) {
            eqbVar.m7673c(z);
            return;
        }
        if (!z) {
            ((nbe) ((nbe) f15099a.m17252c()).mo17276G(1780)).mo17291p("Aborting un-started stask %s", i);
            this.f15105g.add(numValueOf);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m7678c(int i, Runnable runnable) {
        Set set = this.f15105g;
        Integer numValueOf = Integer.valueOf(i);
        if (set.remove(numValueOf)) {
            ((nbe) ((nbe) f15099a.m17252c()).mo17276G(1787)).mo17291p("Cannot start task %s, already aborted", i);
            return false;
        }
        eqb eqbVar = new eqb(this, i, new RunnableC0904pi(this, i, runnable, 10));
        this.f15101c.put(numValueOf, eqbVar);
        this.f15104f.m8939a(eqbVar).mo2282d(new bbt(this, i, 17), not.INSTANCE);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m7679d(int i, String str, Runnable runnable, Runnable runnable2) {
        Map map = this.f15101c;
        Integer numValueOf = Integer.valueOf(i);
        eqb eqbVar = (eqb) map.get(numValueOf);
        if (eqbVar == null) {
            ((nbe) ((nbe) f15099a.m17252c()).mo17276G(1778)).mo17291p("Task not found: %s", i);
            runnable2.run();
            return this.f15106h.contains(numValueOf) ? 3 : 2;
        }
        if (!eqbVar.f15092a.isDone()) {
            eqbVar.m7674d(new eqa(this, str, i, runnable, 0), runnable2);
            return 1;
        }
        ((nbe) ((nbe) f15099a.m17252c()).mo17276G(1776)).mo17291p("Cannot execute, task already done: %s", i);
        runnable2.run();
        return 2;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7680e(int i, Runnable runnable) {
        m7679d(i, "abortRunnable", runnable, cik.f5803k);
    }

    /* JADX INFO: renamed from: f */
    public final void m7681f(Runnable runnable) {
        eqb eqbVar = new eqb(this, -1, new elu(runnable, 11));
        eqbVar.m7674d(new elu(eqbVar, 12), cik.f5804l);
        this.f15104f.m8939a(eqbVar).mo2282d(new cik(13), not.INSTANCE);
    }
}
