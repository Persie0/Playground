package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class otn implements ouh {

    /* JADX INFO: renamed from: a */
    public final oxl f46534a = new oxl();

    /* JADX INFO: renamed from: b */
    private final opn f46535b = ook.m18796j(null);

    /* JADX INFO: renamed from: B */
    public static final void m19050B(otw otwVar) {
        Object objM19132a = null;
        while (true) {
            oxp oxpVarM19140m = otwVar.m19140m();
            ouc oucVar = oxpVarM19140m instanceof ouc ? (ouc) oxpVarM19140m : null;
            if (oucVar == null) {
                break;
            } else if (oucVar.mo19133cH()) {
                objM19132a = oxj.m19132a(objM19132a, oucVar);
            } else {
                oucVar.m19143p();
            }
        }
        if (objM19132a != null) {
            if (!(objM19132a instanceof ArrayList)) {
                ((ouc) objM19132a).mo19032c(otwVar);
                return;
            }
            ArrayList arrayList = (ArrayList) objM19132a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ouc) arrayList.get(size)).mo19032c(otwVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static final Throwable m19051a(otw otwVar) {
        m19050B(otwVar);
        return otwVar.m19070f();
    }

    /* JADX INFO: renamed from: cQ */
    private static final void m19052cQ(ols olsVar, otw otwVar) {
        m19050B(otwVar);
        olsVar.mo18640e(lkm.m15591r(otwVar.m19070f()));
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: A */
    public final boolean mo19053A() {
        return m19059u() != null;
    }

    /* JADX INFO: renamed from: d */
    protected oue mo19039d() {
        throw null;
    }

    /* JADX INFO: renamed from: o */
    protected Object mo19054o(oug ougVar) {
        oxp oxpVarM19140m;
        if (!mo19063y()) {
            oxp oxpVar = this.f46534a;
            otm otmVar = new otm(ougVar, this);
            while (true) {
                oxp oxpVarM19140m2 = oxpVar.m19140m();
                if (!(oxpVarM19140m2 instanceof oue)) {
                    switch (oxpVarM19140m2.m19137j(ougVar, oxpVar, otmVar)) {
                        case 1:
                            return null;
                        case 2:
                            return otl.f46531e;
                        default:
                            break;
                    }
                } else {
                    return oxpVarM19140m2;
                }
            }
        } else {
            oxp oxpVar2 = this.f46534a;
            do {
                oxpVarM19140m = oxpVar2.m19140m();
                if (oxpVarM19140m instanceof oue) {
                    return oxpVarM19140m;
                }
            } while (!oxpVarM19140m.m19145r(ougVar, oxpVar2));
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    protected Object mo19055p(Object obj) {
        oue oueVarMo19039d;
        do {
            oueVarMo19039d = mo19039d();
            if (oueVarMo19039d == null) {
                return otl.f46529c;
            }
        } while (oueVarMo19039d.mo19033d(obj) == null);
        boolean z = oqu.f46432a;
        oueVarMo19039d.mo19031b(obj);
        return oueVarMo19039d.mo19068cP();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[EDGE_INSN: B:29:0x0078->B:30:0x007d BREAK  A[LOOP:0: B:5:0x0010->B:46:?]] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:5:0x0010->B:46:?, LOOP_END, SYNTHETIC] */
    @Override // p000.ouh
    /* JADX INFO: renamed from: q */
    public final Object mo19056q(Object obj, ols olsVar) {
        Object objMo19055p;
        if (mo19055p(obj) == otl.f46528b) {
            return oki.f46196a;
        }
        opy opyVarM18771I = ook.m18771I(omn.m18701f(olsVar));
        while (true) {
            if ((this.f46534a.m19139l() instanceof oue) || !mo19064z()) {
                objMo19055p = mo19055p(obj);
                if (objMo19055p == otl.f46528b) {
                    opyVarM18771I.mo18640e(oki.f46196a);
                    break;
                }
                if (objMo19055p != otl.f46529c) {
                    if (objMo19055p instanceof otw) {
                        m19052cQ(opyVarM18771I, (otw) objMo19055p);
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("offerInternal returned ");
                    sb.append(objMo19055p);
                    throw new IllegalStateException("offerInternal returned ".concat(objMo19055p.toString()));
                }
            } else {
                oui ouiVar = new oui(obj, opyVarM18771I);
                Object objMo19054o = mo19054o(ouiVar);
                if (objMo19054o == null) {
                    opyVarM18771I.mo18870a(new oso(ouiVar));
                    break;
                }
                if (objMo19054o instanceof otw) {
                    m19052cQ(opyVarM18771I, (otw) objMo19054o);
                    break;
                }
                if (objMo19054o != otl.f46531e && !(objMo19054o instanceof ouc)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("enqueueSend returned ");
                    sb2.append(objMo19054o);
                    throw new IllegalStateException("enqueueSend returned ".concat(objMo19054o.toString()));
                }
                objMo19055p = mo19055p(obj);
                if (objMo19055p == otl.f46528b) {
                    opyVarM18771I.mo18640e(oki.f46196a);
                    break;
                }
                if (objMo19055p != otl.f46529c) {
                    if (objMo19055p instanceof otw) {
                        m19052cQ(opyVarM18771I, (otw) objMo19055p);
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("offerInternal returned ");
                    sb3.append(objMo19055p);
                    throw new IllegalStateException("offerInternal returned ".concat(objMo19055p.toString()));
                }
            }
        }
        Object objM18887m = opyVarM18771I.m18887m();
        oma omaVar = oma.COROUTINE_SUSPENDED;
        if (objM18887m != omaVar) {
            objM18887m = oki.f46196a;
        }
        return objM18887m == omaVar ? objM18887m : oki.f46196a;
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: s */
    public final Object mo19057s(Object obj) {
        Object objMo19055p = mo19055p(obj);
        if (objMo19055p == otl.f46528b) {
            return oki.f46196a;
        }
        if (objMo19055p == otl.f46529c) {
            otw otwVarM19059u = m19059u();
            return otwVarM19059u == null ? otu.f46545a : ooc.m18751q(m19051a(otwVarM19059u));
        }
        if (objMo19055p instanceof otw) {
            return ooc.m18751q(m19051a((otw) objMo19055p));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("trySend returned ");
        sb.append(objMo19055p);
        throw new IllegalStateException("trySend returned ".concat(objMo19055p.toString()));
    }

    /* JADX INFO: renamed from: t */
    protected String mo19058t() {
        return "";
    }

    public final String toString() {
        String strConcat;
        String str;
        String strM18920a = oqv.m18920a(this);
        String strM18921b = oqv.m18921b(this);
        oxp oxpVarM19139l = this.f46534a.m19139l();
        if (oxpVarM19139l == this.f46534a) {
            str = "EmptyQueue";
        } else {
            if (oxpVarM19139l instanceof otw) {
                strConcat = oxpVarM19139l.toString();
            } else if (oxpVarM19139l instanceof ouc) {
                strConcat = "ReceiveQueued";
            } else if (oxpVarM19139l instanceof oug) {
                strConcat = "SendQueued";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("UNEXPECTED:");
                sb.append(oxpVarM19139l);
                strConcat = "UNEXPECTED:".concat(oxpVarM19139l.toString());
            }
            oxp oxpVarM19140m = this.f46534a.m19140m();
            if (oxpVarM19140m != oxpVarM19139l) {
                oxl oxlVar = this.f46534a;
                Object objM19138k = oxlVar.m19138k();
                objM19138k.getClass();
                int i = 0;
                for (oxp oxpVarM19139l2 = (oxp) objM19138k; !ooc.m18737c(oxpVarM19139l2, oxlVar); oxpVarM19139l2 = oxpVarM19139l2.m19139l()) {
                    i++;
                }
                str = strConcat + ",queueSize=" + i;
                if (oxpVarM19140m instanceof otw) {
                    str = str + ",closedForSend=" + oxpVarM19140m;
                }
            } else {
                str = strConcat;
            }
        }
        return strM18920a + "@" + strM18921b + "{" + str + "}" + mo19058t();
    }

    /* JADX INFO: renamed from: u */
    protected final otw m19059u() {
        oxp oxpVarM19140m = this.f46534a.m19140m();
        otw otwVar = oxpVarM19140m instanceof otw ? (otw) oxpVarM19140m : null;
        if (otwVar == null) {
            return null;
        }
        m19050B(otwVar);
        return otwVar;
    }

    /* JADX INFO: renamed from: v */
    protected final oug m19060v() {
        oxp oxpVar;
        oxp oxpVarM19141n;
        oxl oxlVar = this.f46534a;
        while (true) {
            Object objM19138k = oxlVar.m19138k();
            objM19138k.getClass();
            oxpVar = (oxp) objM19138k;
            if (oxpVar != oxlVar) {
                if (!(oxpVar instanceof oug)) {
                    oxpVar = null;
                    break;
                }
                if (((((oug) oxpVar) instanceof otw) && !oxpVar.mo19134cI()) || (oxpVarM19141n = oxpVar.m19141n()) == null) {
                    break;
                }
                oxpVarM19141n.m19144q();
            } else {
                oxpVar = null;
                break;
            }
        }
        return (oug) oxpVar;
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: w */
    public final void mo19061w(oni oniVar) {
        if (this.f46535b.m18856d(null, oniVar)) {
            otw otwVarM19059u = m19059u();
            if (otwVarM19059u == null || !this.f46535b.m18856d(oniVar, otl.f46532f)) {
                return;
            }
            oniVar.mo1803a(otwVarM19059u.f46551a);
            return;
        }
        Object obj = this.f46535b.f46397a;
        if (obj == otl.f46532f) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Another handler was already registered: ");
        sb.append(obj);
        throw new IllegalStateException("Another handler was already registered: ".concat(String.valueOf(obj)));
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: x */
    public final boolean mo19062x(Throwable th) {
        boolean z;
        Object obj;
        oxz oxzVar;
        otw otwVar = new otw(th);
        oxp oxpVar = this.f46534a;
        while (true) {
            oxp oxpVarM19140m = oxpVar.m19140m();
            if (oxpVarM19140m instanceof otw) {
                z = false;
                break;
            }
            if (oxpVarM19140m.m19145r(otwVar, oxpVar)) {
                z = true;
                break;
            }
        }
        if (!z) {
            oxp oxpVarM19140m2 = this.f46534a.m19140m();
            oxpVarM19140m2.getClass();
            otwVar = (otw) oxpVarM19140m2;
        }
        m19050B(otwVar);
        if (z && (obj = this.f46535b.f46397a) != null && obj != (oxzVar = otl.f46532f) && this.f46535b.m18856d(obj, oxzVar)) {
            ook.m18788b(obj, 1);
            ((oni) obj).mo1803a(th);
        }
        return z;
    }

    /* JADX INFO: renamed from: y */
    protected abstract boolean mo19063y();

    /* JADX INFO: renamed from: z */
    protected abstract boolean mo19064z();
}
