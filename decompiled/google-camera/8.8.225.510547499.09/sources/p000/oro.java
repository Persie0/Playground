package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class oro extends orj implements oqy {

    /* JADX INFO: renamed from: e */
    public final opn f46462e = ook.m18796j(null);

    /* JADX INFO: renamed from: f */
    public final opn f46463f = ook.m18796j(null);

    /* JADX INFO: renamed from: c */
    private final opk f46461c = ook.m18793g(false);

    /* JADX INFO: renamed from: v */
    private final boolean m18965v(Runnable runnable) {
        opn opnVar = this.f46462e;
        while (true) {
            Object obj = opnVar.f46397a;
            if (m18967t()) {
                return false;
            }
            if (obj == null) {
                if (this.f46462e.m18856d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof oxr) {
                oxr oxrVar = (oxr) obj;
                switch (oxrVar.m19146a(runnable)) {
                    case 0:
                        return true;
                    case 1:
                        this.f46462e.m18856d(obj, oxrVar.m19148c());
                        break;
                    default:
                        return false;
                }
            } else {
                if (obj == orp.f46465b) {
                    return false;
                }
                oxr oxrVar2 = new oxr(8, true);
                oxrVar2.m19146a((Runnable) obj);
                oxrVar2.m19146a(runnable);
                if (this.f46462e.m18856d(obj, oxrVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // p000.oqy
    /* JADX INFO: renamed from: a */
    public final void mo18944a(opx opxVar) {
        long jNanoTime = System.nanoTime();
        ork orkVar = new ork(this, orp.m18969a(1000L) + jNanoTime, opxVar);
        m18966s(jNanoTime, orkVar);
        ook.m18772J(opxVar, orkVar);
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        mo18941g(runnable);
    }

    /* JADX INFO: renamed from: f */
    public orf mo18940f(long j, Runnable runnable, oly olyVar) {
        olyVar.getClass();
        return oqx.f46437a.mo18940f(j, runnable, olyVar);
    }

    /* JADX INFO: renamed from: g */
    public void mo18941g(Runnable runnable) {
        if (m18965v(runnable)) {
            m18959p();
        } else {
            oqw.f46435c.mo18941g(runnable);
        }
    }

    @Override // p000.orj
    /* JADX INFO: renamed from: i */
    public void mo18943i() {
        oyf oyfVarM19171d;
        ThreadLocal threadLocal = oss.f46499a;
        oss.f46499a.set(null);
        this.f46461c.m18844c();
        boolean z = oqu.f46432a;
        opn opnVar = this.f46462e;
        while (true) {
            Object obj = opnVar.f46397a;
            if (obj == null) {
                if (this.f46462e.m18856d(null, orp.f46465b)) {
                    break;
                }
            } else if (obj instanceof oxr) {
                ((oxr) obj).m19149d();
                break;
            } else {
                if (obj == orp.f46465b) {
                    break;
                }
                oxr oxrVar = new oxr(8, true);
                oxrVar.m19146a((Runnable) obj);
                if (this.f46462e.m18856d(obj, oxrVar)) {
                    break;
                }
            }
        }
        while (mo18953j() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            orn ornVar = (orn) this.f46463f.f46397a;
            if (ornVar == null) {
                return;
            }
            synchronized (ornVar) {
                oyfVarM19171d = ornVar.m19168a() > 0 ? ornVar.m19171d(0) : null;
            }
            orm ormVar = (orm) oyfVarM19171d;
            if (ormVar == null) {
                return;
            } else {
                mo18942h(jNanoTime, ormVar);
            }
        }
    }

    @Override // p000.orj
    /* JADX INFO: renamed from: j */
    public final long mo18953j() {
        orm ormVar;
        oyf oyfVarM19171d;
        if (m18958o()) {
            return 0L;
        }
        orn ornVar = (orn) this.f46463f.f46397a;
        Runnable runnable = null;
        if (ornVar != null && !ornVar.m19174g()) {
            long jNanoTime = System.nanoTime();
            do {
                synchronized (ornVar) {
                    oyf oyfVarM19169b = ornVar.m19169b();
                    if (oyfVarM19169b == null) {
                        oyfVarM19171d = null;
                    } else {
                        orm ormVar2 = (orm) oyfVarM19169b;
                        oyfVarM19171d = (jNanoTime - ormVar2.f46459b < 0 || !m18965v(ormVar2)) ? null : ornVar.m19171d(0);
                    }
                }
            } while (((orm) oyfVarM19171d) != null);
        }
        opn opnVar = this.f46462e;
        while (true) {
            Object obj = opnVar.f46397a;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof oxr)) {
                if (obj == orp.f46465b) {
                    break;
                }
                if (this.f46462e.m18856d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                oxr oxrVar = (oxr) obj;
                Object objM19147b = oxrVar.m19147b();
                if (objM19147b != oxr.f46787a) {
                    runnable = (Runnable) objM19147b;
                    break;
                }
                this.f46462e.m18856d(obj, oxrVar.m19148c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        oww owwVar = this.f46453d;
        long j = (owwVar == null || owwVar.m19115a()) ? Long.MAX_VALUE : 0L;
        if (j == 0) {
            return 0L;
        }
        Object obj2 = this.f46462e.f46397a;
        if (obj2 != null) {
            if (!(obj2 instanceof oxr)) {
                return obj2 == orp.f46465b ? Long.MAX_VALUE : 0L;
            }
            if (!((oxr) obj2).m19150e()) {
                return 0L;
            }
        }
        orn ornVar2 = (orn) this.f46463f.f46397a;
        if (ornVar2 != null && (ormVar = (orm) ornVar2.m19170c()) != null) {
            long jNanoTime2 = ormVar.f46459b - System.nanoTime();
            if (jNanoTime2 < 0) {
                return 0L;
            }
            return jNanoTime2;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: s */
    public final void m18966s(long j, orm ormVar) {
        if (!m18967t()) {
            orn ornVar = (orn) this.f46463f.f46397a;
            if (ornVar == null) {
                this.f46463f.m18856d(null, new orn(j));
                Object obj = this.f46463f.f46397a;
                obj.getClass();
                ornVar = (orn) obj;
            }
            switch (ormVar.m18961c(j, ornVar, this)) {
                case 0:
                    orn ornVar2 = (orn) this.f46463f.f46397a;
                    if ((ornVar2 != null ? (orm) ornVar2.m19170c() : null) == ormVar) {
                        m18959p();
                    }
                    break;
            }
            return;
        }
        mo18942h(j, ormVar);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18967t() {
        return this.f46461c.m18842a();
    }

    /* JADX INFO: renamed from: u */
    protected final boolean m18968u() {
        oww owwVar = this.f46453d;
        if (owwVar != null && !owwVar.m19115a()) {
            return false;
        }
        orn ornVar = (orn) this.f46463f.f46397a;
        if (ornVar != null && !ornVar.m19174g()) {
            return false;
        }
        Object obj = this.f46462e.f46397a;
        if (obj == null) {
            return true;
        }
        if (obj instanceof oxr) {
            return ((oxr) obj).m19150e();
        }
        return obj == orp.f46465b;
    }
}
