package p000;

import android.os.Handler;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elv implements elx, iuh, ibk, hze, fbp, fbg, fbl, fbj {

    /* JADX INFO: renamed from: a */
    public static final Object f14672a = new Object();

    /* JADX INFO: renamed from: b */
    public final jvd f14673b;

    /* JADX INFO: renamed from: c */
    public final fba f14674c;

    /* JADX INFO: renamed from: e */
    public kos f14676e;

    /* JADX INFO: renamed from: f */
    public msi f14677f;

    /* JADX INFO: renamed from: k */
    public hzj f14682k;

    /* JADX INFO: renamed from: l */
    public elw f14683l;

    /* JADX INFO: renamed from: m */
    public final kov f14684m;

    /* JADX INFO: renamed from: o */
    private final Handler f14686o;

    /* JADX INFO: renamed from: q */
    private Runnable f14688q;

    /* JADX INFO: renamed from: p */
    private final Set f14687p = new HashSet();

    /* JADX INFO: renamed from: d */
    public final PriorityQueue f14675d = new PriorityQueue(amx.f743g);

    /* JADX INFO: renamed from: r */
    private boolean f14689r = false;

    /* JADX INFO: renamed from: g */
    public boolean f14678g = false;

    /* JADX INFO: renamed from: h */
    public boolean f14679h = false;

    /* JADX INFO: renamed from: i */
    public boolean f14680i = false;

    /* JADX INFO: renamed from: n */
    public int f14685n = 1;

    /* JADX INFO: renamed from: j */
    public ilk f14681j = ilk.PORTRAIT;

    public elv(jvd jvdVar, Handler handler, fba fbaVar, kov kovVar) {
        this.f14673b = jvdVar;
        this.f14686o = handler;
        this.f14674c = fbaVar;
        this.f14684m = kovVar;
    }

    /* JADX INFO: renamed from: n */
    private final void m7479n() {
        synchronized (f14672a) {
            elw elwVar = this.f14683l;
            if (elwVar != null) {
                this.f14673b.execute(new efd(elwVar, 19));
                if (this.f14683l.mo7503l()) {
                    this.f14675d.remove(this.f14683l);
                }
            }
            this.f14683l = null;
            if (this.f14686o.hasCallbacks(this.f14688q)) {
                this.f14686o.removeCallbacks(this.f14688q);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m7480o(elw elwVar, Runnable runnable) {
        if (this.f14678g) {
            return;
        }
        ekr ekrVar = new ekr(this, runnable, 6);
        synchronized (f14672a) {
            this.f14673b.execute(new bmj(this, elwVar, ekrVar, 17));
            if (this.f14686o.hasCallbacks(this.f14688q)) {
                this.f14686o.removeCallbacks(this.f14688q);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private final boolean m7481p(elw elwVar) {
        synchronized (f14672a) {
            if (this.f14689r) {
                return false;
            }
            return !this.f14687p.contains(elwVar.mo7493b());
        }
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        this.f14684m.m14649c(this.f14676e);
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f14689r = true;
        synchronized (f14672a) {
            for (elw elwVar : (elw[]) this.f14675d.toArray(new elw[0])) {
                if (!elwVar.mo7505n()) {
                    mo7485g(elwVar);
                }
            }
        }
        m7479n();
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f14689r = false;
        mrm mrmVarM7484f = m7484f();
        if (mrmVarM7484f.mo16813g()) {
            m7490l((elw) mrmVarM7484f.mo16809c());
        }
    }

    @Override // p000.elx
    /* JADX INFO: renamed from: d */
    public final kba mo7482d(elw elwVar) {
        Object obj = f14672a;
        synchronized (obj) {
            elwVar.mo7500i(new Date());
            if (this.f14675d.contains(elwVar)) {
                int i = 4;
                if (elwVar.equals(this.f14683l)) {
                    synchronized (obj) {
                        elw elwVar2 = this.f14683l;
                        if (elwVar2 != null && !elwVar2.mo7504m()) {
                            this.f14686o.removeCallbacks(this.f14688q);
                            this.f14686o.postDelayed(this.f14688q, this.f14683l.mo7492a());
                            this.f14673b.execute(new ekr(this, this.f14683l, i));
                        }
                    }
                }
                return new eip(this, elwVar, i);
            }
            if (elwVar.mo7503l() && (!m7481p(elwVar) || (this.f14683l != null && (gmz.m9540h(elwVar.mo7507p()) <= gmz.m9540h(this.f14683l.mo7507p()) || this.f14683l.mo7502k())))) {
                return cgw.f5699l;
            }
            this.f14675d.add(elwVar);
            if (m7481p(elwVar)) {
                if (this.f14683l == null) {
                    m7490l(elwVar);
                } else if (elwVar.equals(this.f14675d.peek())) {
                    if (this.f14683l.mo7502k()) {
                        m7480o(this.f14683l, cik.f5802j);
                    } else {
                        m7479n();
                        m7490l(elwVar);
                    }
                }
            }
            return new eip(this, elwVar, 5);
        }
    }

    @Override // p000.elx
    /* JADX INFO: renamed from: e */
    public final kba mo7483e(ely elyVar) {
        mo7487i(elyVar);
        return new eip(this, elyVar, 3);
    }

    /* JADX INFO: renamed from: f */
    public final mrm m7484f() {
        synchronized (f14672a) {
            if (this.f14689r) {
                return mqu.f41450a;
            }
            PriorityQueue priorityQueue = new PriorityQueue(this.f14675d);
            for (elw elwVar = (elw) priorityQueue.peek(); elwVar != null; elwVar = (elw) priorityQueue.peek()) {
                if (m7481p(elwVar)) {
                    return mrm.m16829i(elwVar);
                }
                priorityQueue.poll();
            }
            return mqu.f41450a;
        }
    }

    @Override // p000.elx
    /* JADX INFO: renamed from: g */
    public final void mo7485g(elw elwVar) {
        synchronized (f14672a) {
            if (!elwVar.equals(this.f14683l)) {
                this.f14675d.remove(elwVar);
            } else if (this.f14683l.mo7502k()) {
                m7480o(this.f14683l, new ekr(this, elwVar, 5));
                this.f14678g = true;
            } else {
                m7479n();
                this.f14675d.remove(elwVar);
                mrm mrmVarM7484f = m7484f();
                if (mrmVarM7484f.mo16813g()) {
                    m7490l((elw) mrmVarM7484f.mo16809c());
                }
            }
        }
    }

    @Override // p000.elx
    /* JADX INFO: renamed from: h */
    public final void mo7486h(Object obj) {
        synchronized (f14672a) {
            for (elw elwVar : (elw[]) this.f14675d.toArray(new elw[0])) {
                if (obj.equals(elwVar.mo7494c())) {
                    mo7485g(elwVar);
                }
            }
        }
    }

    @Override // p000.elx
    /* JADX INFO: renamed from: i */
    public final void mo7487i(ely elyVar) {
        synchronized (f14672a) {
            this.f14687p.add(elyVar);
            elw elwVar = this.f14683l;
            if (elwVar != null && this.f14687p.contains(elwVar.mo7493b())) {
                m7479n();
                mrm mrmVarM7484f = m7484f();
                if (mrmVarM7484f.mo16813g()) {
                    m7490l((elw) mrmVarM7484f.mo16809c());
                }
            }
        }
    }

    @Override // p000.ibk
    /* JADX INFO: renamed from: j */
    public final void mo7488j(boolean z) {
        synchronized (f14672a) {
            this.f14679h = z;
            this.f14673b.execute(new elu(this, 0));
        }
    }

    @Override // p000.elx
    /* JADX INFO: renamed from: k */
    public final void mo7489k(ely elyVar) {
        synchronized (f14672a) {
            this.f14687p.remove(elyVar);
            mrm mrmVarM7484f = m7484f();
            if (mrmVarM7484f.mo16813g() && !((elw) mrmVarM7484f.mo16809c()).equals(this.f14683l)) {
                m7479n();
                m7490l((elw) mrmVarM7484f.mo16809c());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7490l(elw elwVar) {
        synchronized (f14672a) {
            this.f14673b.execute(new ekr(this, elwVar, 3));
            this.f14683l = elwVar;
            if (!elwVar.mo7504m()) {
                elu eluVar = new elu(this, 1);
                this.f14688q = eluVar;
                this.f14686o.postDelayed(eluVar, elwVar.mo7492a());
            }
        }
    }

    @Override // p000.iuh
    /* JADX INFO: renamed from: m */
    public final void mo7491m(int i) {
        synchronized (f14672a) {
            this.f14685n = i;
            this.f14673b.execute(new bbt(this, i, 14));
        }
    }

    @Override // p000.hze
    public final void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
        synchronized (f14672a) {
            this.f14680i = ((hzp) this.f14677f.mo6051a()).f30075b.f30055s;
            this.f14681j = ilkVar;
            this.f14682k = hzjVar;
            this.f14673b.execute(new bmj(this, ilkVar, hzjVar, 18));
        }
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(ilk ilkVar) {
    }
}
