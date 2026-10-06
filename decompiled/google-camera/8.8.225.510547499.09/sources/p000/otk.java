package p000;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class otk extends otn implements otq {
    /* JADX INFO: renamed from: C */
    private final Object m19034C(int i, ols olsVar) {
        opy opyVarM18771I = ook.m18771I(omn.m18701f(olsVar));
        otf otfVar = new otf(opyVarM18771I, i);
        while (!m19041f(otfVar)) {
            Object objMo19036a = mo19036a();
            if (objMo19036a instanceof otw) {
                otfVar.mo19032c((otw) objMo19036a);
            } else if (objMo19036a != otl.f46530d) {
                opyVarM18771I.mo18871b(otfVar.m19030a(objMo19036a), null);
            }
            Object objM18887m = opyVarM18771I.m18887m();
            oma omaVar = oma.COROUTINE_SUSPENDED;
            return objM18887m;
        }
        m19035n(opyVarM18771I, otfVar);
        Object objM18887m2 = opyVarM18771I.m18887m();
        oma omaVar2 = oma.COROUTINE_SUSPENDED;
        return objM18887m2;
    }

    /* JADX INFO: renamed from: n */
    public static final void m19035n(opx opxVar, ouc oucVar) {
        opxVar.mo18870a(new oth(oucVar));
    }

    /* JADX INFO: renamed from: a */
    protected Object mo19036a() {
        oug ougVarM19060v;
        do {
            ougVarM19060v = m19060v();
            if (ougVarM19060v == null) {
                return otl.f46530d;
            }
        } while (ougVarM19060v.mo19073i() == null);
        boolean z = oqu.f46432a;
        ougVarM19060v.mo19071g();
        return ougVarM19060v.mo19067c();
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: b */
    public final Object mo19037b(ols olsVar) {
        Object objMo19036a = mo19036a();
        return (objMo19036a == otl.f46530d || (objMo19036a instanceof otw)) ? m19034C(0, olsVar) : objMo19036a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.oud
    /* JADX INFO: renamed from: c */
    public final Object mo19038c(ols olsVar) {
        otj otjVar;
        if (olsVar instanceof otj) {
            otjVar = (otj) olsVar;
            int i = otjVar.f46526c;
            if ((i & Integer.MIN_VALUE) != 0) {
                otjVar.f46526c = i - Integer.MIN_VALUE;
            } else {
                otjVar = new otj(this, olsVar);
            }
        } else {
            otjVar = new otj(this, olsVar);
        }
        Object objM19034C = otjVar.f46524a;
        Object obj = oma.COROUTINE_SUSPENDED;
        switch (otjVar.f46526c) {
            case 0:
                lkm.m15592s(objM19034C);
                Object objMo19036a = mo19036a();
                if (objMo19036a != otl.f46530d) {
                    return objMo19036a instanceof otw ? ooc.m18751q(((otw) objMo19036a).f46551a) : objMo19036a;
                }
                otjVar.f46526c = 1;
                objM19034C = m19034C(1, otjVar);
                if (objM19034C == obj) {
                    return obj;
                }
                break;
            case 1:
                lkm.m15592s(objM19034C);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((otu) objM19034C).f46546b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [oxp] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // p000.otn
    /* JADX INFO: renamed from: d */
    protected final oue mo19039d() {
        ?? r1;
        oxp oxpVarM19141n;
        oxl oxlVar = this.f46534a;
        while (true) {
            Object objM19138k = oxlVar.m19138k();
            objM19138k.getClass();
            r1 = (oxp) objM19138k;
            if (r1 != oxlVar) {
                if (!(r1 instanceof oue)) {
                    r1 = 0;
                    break;
                }
                if (((((oue) r1) instanceof otw) && !r1.mo19134cI()) || (oxpVarM19141n = r1.m19141n()) == null) {
                    break;
                }
                oxpVarM19141n.m19144q();
            } else {
                r1 = 0;
                break;
            }
        }
        oue oueVar = (oue) r1;
        if (oueVar != null) {
            boolean z = oueVar instanceof otw;
        }
        return oueVar;
    }

    /* JADX INFO: renamed from: e */
    protected void mo19040e(boolean z) {
        otw otwVarM19059u = m19059u();
        if (otwVarM19059u == null) {
            throw new IllegalStateException("Cannot happen");
        }
        Object objM19132a = null;
        while (true) {
            oxp oxpVarM19140m = otwVarM19059u.m19140m();
            if (oxpVarM19140m instanceof oxl) {
                break;
            }
            boolean z2 = oqu.f46432a;
            if (oxpVarM19140m.mo19133cH()) {
                oxpVarM19140m.getClass();
                objM19132a = oxj.m19132a(objM19132a, (oug) oxpVarM19140m);
            } else {
                oxpVarM19140m.m19143p();
            }
        }
        if (objM19132a != null) {
            if (!(objM19132a instanceof ArrayList)) {
                ((oug) objM19132a).mo19072h(otwVarM19059u);
                return;
            }
            ArrayList arrayList = (ArrayList) objM19132a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((oug) arrayList.get(size)).mo19072h(otwVarM19059u);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19041f(ouc oucVar) {
        return mo19042g(oucVar);
    }

    /* JADX INFO: renamed from: h */
    protected abstract boolean mo19043h();

    /* JADX INFO: renamed from: i */
    protected abstract boolean mo19044i();

    /* JADX INFO: renamed from: j */
    public boolean mo19045j() {
        oxp oxpVarM19139l = this.f46534a.m19139l();
        otw otwVar = null;
        otw otwVar2 = oxpVarM19139l instanceof otw ? (otw) oxpVarM19139l : null;
        if (otwVar2 != null) {
            otn.m19050B(otwVar2);
            otwVar = otwVar2;
        }
        return otwVar != null && mo19044i();
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: k */
    public boolean mo19046k() {
        return m19047l();
    }

    /* JADX INFO: renamed from: l */
    protected final boolean m19047l() {
        return !(this.f46534a.m19139l() instanceof oug) && mo19044i();
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: m */
    public final ote mo19048m() {
        return new ote(this);
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: r */
    public final void mo19049r(CancellationException cancellationException) {
        if (mo19045j()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(String.valueOf(oqv.m18920a(this)).concat(" was cancelled"));
        }
        mo19040e(mo19062x(cancellationException));
    }

    /* JADX INFO: renamed from: g */
    protected boolean mo19042g(ouc oucVar) {
        oxp oxpVarM19140m;
        if (mo19043h()) {
            oxp oxpVar = this.f46534a;
            do {
                oxpVarM19140m = oxpVar.m19140m();
                if (oxpVarM19140m instanceof oug) {
                    return false;
                }
            } while (!oxpVarM19140m.m19145r(oucVar, oxpVar));
            return true;
        }
        oxp oxpVar2 = this.f46534a;
        oti otiVar = new oti(oucVar, this);
        while (true) {
            oxp oxpVarM19140m2 = oxpVar2.m19140m();
            if (!(oxpVarM19140m2 instanceof oug)) {
                switch (oxpVarM19140m2.m19137j(oucVar, oxpVar2, otiVar)) {
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        break;
                }
            } else {
                return false;
            }
        }
    }
}
