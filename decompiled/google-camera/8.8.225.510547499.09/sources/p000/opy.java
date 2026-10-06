package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opy extends orb implements opx, omg {

    /* JADX INFO: renamed from: a */
    public final ols f46406a;

    /* JADX INFO: renamed from: b */
    public final oly f46407b;

    /* JADX INFO: renamed from: c */
    public final opl f46408c;

    /* JADX INFO: renamed from: d */
    public final opn f46409d;

    /* JADX INFO: renamed from: e */
    public orf f46410e;

    public opy(ols olsVar, int i) {
        super(i);
        this.f46406a = olsVar;
        boolean z = oqu.f46432a;
        this.f46407b = olsVar.mo18639d();
        this.f46408c = ook.m18794h(0);
        this.f46409d = ook.m18796j(opq.f46401a);
    }

    /* JADX INFO: renamed from: C */
    private final orf m18878C() {
        ory oryVar = (ory) this.f46407b.get(ory.f46473c);
        if (oryVar == null) {
            return null;
        }
        orf orfVarMo18973cY = oryVar.mo18973cY(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (1 & 2) != 0, new oqb(this));
        this.f46410e = orfVarMo18973cY;
        return orfVarMo18973cY;
    }

    /* JADX INFO: renamed from: D */
    private final void m18879D(oni oniVar, Throwable th) {
        try {
            oniVar.mo1803a(th);
        } catch (Throwable th2) {
            oly olyVar = this.f46407b;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            oqv.m18928i(olyVar, new oqj("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m18881F() {
        oxz oxzVar;
        ols olsVar = this.f46406a;
        Throwable th = null;
        oxf oxfVar = olsVar instanceof oxf ? (oxf) olsVar : null;
        if (oxfVar != null) {
            opn opnVar = oxfVar.f46769e;
            do {
                Object obj = opnVar.f46397a;
                oxzVar = oxg.f46771b;
                if (obj != oxzVar) {
                    if (obj instanceof Throwable) {
                        if (!oxfVar.f46769e.m18856d(obj, null)) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        th = (Throwable) obj;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Inconsistent state ");
                        sb.append(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                }
            } while (!oxfVar.f46769e.m18856d(oxzVar, this));
            if (th == null) {
                return;
            }
            m18896v();
            mo18876k(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m18882G(Object obj, int i, oni oniVar) {
        Object obj2;
        opn opnVar = this.f46409d;
        do {
            obj2 = opnVar.f46397a;
            if (!(obj2 instanceof osm)) {
                if (obj2 instanceof oqa) {
                    oqa oqaVar = (oqa) obj2;
                    if (oqaVar.f46413a.m18843b()) {
                        if (oniVar != null) {
                            m18894t(oniVar, oqaVar.f46421b);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!this.f46409d.m18856d(obj2, m18884I((osm) obj2, obj, i, oniVar)));
        m18897w();
        m18880E(i);
    }

    /* JADX INFO: renamed from: H */
    private static final void m18883H(oni oniVar, Object obj) {
        throw new IllegalStateException("It's prohibited to register multiple handlers, tried to register " + oniVar + ", already has " + obj);
    }

    /* JADX INFO: renamed from: I */
    private static final Object m18884I(osm osmVar, Object obj, int i, oni oniVar) {
        if (obj instanceof oqg) {
            boolean z = oqu.f46432a;
            return obj;
        }
        if (!oqv.m18934o(i)) {
            return obj;
        }
        if (oniVar != null || ((osmVar instanceof opv) && !(osmVar instanceof opr))) {
            return new oqf(obj, osmVar instanceof opv ? (opv) osmVar : null, oniVar, null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: A */
    public final oxz m18886A(Object obj, oni oniVar) {
        Object obj2;
        opn opnVar = this.f46409d;
        do {
            obj2 = opnVar.f46397a;
            if (!(obj2 instanceof osm)) {
                boolean z = obj2 instanceof oqf;
                return null;
            }
        } while (!this.f46409d.m18856d(obj2, m18884I((osm) obj2, obj, this.f46444f, oniVar)));
        m18897w();
        return opz.f46411a;
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: a */
    public final void mo18870a(oni oniVar) {
        opv orwVar = oniVar instanceof opv ? (opv) oniVar : new orw(oniVar);
        opn opnVar = this.f46409d;
        while (true) {
            Object obj = opnVar.f46397a;
            if (obj instanceof opq) {
                if (this.f46409d.m18856d(obj, orwVar)) {
                    return;
                }
            } else if (obj instanceof opv) {
                m18883H(oniVar, obj);
            } else {
                if (obj instanceof oqg) {
                    oqg oqgVar = (oqg) obj;
                    if (!oqgVar.m18907a()) {
                        m18883H(oniVar, obj);
                    }
                    if (obj instanceof oqa) {
                        m18879D(oniVar, oqgVar != null ? oqgVar.f46421b : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof oqf) {
                    oqf oqfVar = (oqf) obj;
                    if (oqfVar.f46417b != null) {
                        m18883H(oniVar, obj);
                    }
                    if (orwVar instanceof opr) {
                        return;
                    }
                    if (oqfVar.m18906a()) {
                        m18879D(oniVar, oqfVar.f46420e);
                        return;
                    } else {
                        if (this.f46409d.m18856d(obj, oqf.m18905b(oqfVar, orwVar, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (orwVar instanceof opr) {
                        return;
                    }
                    if (this.f46409d.m18856d(obj, new oqf(obj, orwVar, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: b */
    public final void mo18871b(Object obj, oni oniVar) {
        m18882G(obj, this.f46444f, oniVar);
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: c */
    public final void mo18872c(oqo oqoVar, Object obj) {
        ols olsVar = this.f46406a;
        oxf oxfVar = olsVar instanceof oxf ? (oxf) olsVar : null;
        m18882G(obj, (oxfVar != null ? oxfVar.f46765a : null) == oqoVar ? 4 : this.f46444f, null);
    }

    @Override // p000.omg
    /* JADX INFO: renamed from: cM */
    public final StackTraceElement mo18652cM() {
        return null;
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: d */
    public final oly mo18639d() {
        return this.f46407b;
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: e */
    public final void mo18640e(Object obj) {
        Throwable thM18589a = okd.m18589a(obj);
        if (thM18589a != null) {
            if (oqu.f46433b) {
                thM18589a = oxy.m19156a(thM18589a, this);
            }
            obj = new oqg(thM18589a);
        }
        m18882G(obj, this.f46444f, null);
    }

    @Override // p000.omg
    /* JADX INFO: renamed from: g */
    public final omg mo18653g() {
        ols olsVar = this.f46406a;
        if (olsVar instanceof omg) {
            return (omg) olsVar;
        }
        return null;
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: h */
    public final boolean mo18873h() {
        return !(m18888n() instanceof osm);
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: i */
    public final Object mo18874i(Object obj) {
        return m18886A(obj, null);
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: j */
    public final Object mo18875j(Object obj, oni oniVar) {
        return m18886A(obj, oniVar);
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: k */
    public final void mo18876k(Throwable th) {
        Object obj;
        boolean z;
        opn opnVar = this.f46409d;
        do {
            obj = opnVar.f46397a;
            if (!(obj instanceof osm)) {
                return;
            } else {
                z = obj instanceof opv;
            }
        } while (!this.f46409d.m18856d(obj, new oqa(this, th, z)));
        opv opvVar = z ? (opv) obj : null;
        if (opvVar != null) {
            m18893s(opvVar, th);
        }
        m18897w();
        m18880E(this.f46444f);
    }

    @Override // p000.opx
    /* JADX INFO: renamed from: l */
    public final void mo18877l() {
        boolean z = oqu.f46432a;
        m18880E(this.f46444f);
    }

    /* JADX WARN: Switch 'out' block B:3:0x0006 for B:4:0x0008 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: m */
    public final Object m18887m() {
        ory oryVar;
        boolean zM18899y = m18899y();
        opl oplVar = this.f46408c;
        do {
            switch (oplVar.f46391b) {
                case 0:
                    break;
                case 1:
                default:
                    throw new IllegalStateException("Already suspended");
                case 2:
                    if (zM18899y) {
                        m18881F();
                    }
                    Object objM18888n = m18888n();
                    if (objM18888n instanceof oqg) {
                        Throwable th = ((oqg) objM18888n).f46421b;
                        if (oqu.f46433b) {
                            throw oxy.m19156a(th, this);
                        }
                        throw th;
                    }
                    if (!oqv.m18934o(this.f46444f) || (oryVar = (ory) this.f46407b.get(ory.f46473c)) == null || oryVar.mo18974cZ()) {
                        return mo18889o(objM18888n);
                    }
                    CancellationException cancellationExceptionMo18975o = oryVar.mo18975o();
                    mo18895u(objM18888n, cancellationExceptionMo18975o);
                    if (oqu.f46433b) {
                        throw oxy.m19156a(cancellationExceptionMo18975o, this);
                    }
                    throw cancellationExceptionMo18975o;
            }
        } while (!this.f46408c.m18847c(0, 1));
        if (this.f46410e == null) {
            m18878C();
        }
        if (zM18899y) {
            m18881F();
        }
        return oma.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: n */
    public final Object m18888n() {
        return this.f46409d.f46397a;
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: o */
    public final Object mo18889o(Object obj) {
        return obj instanceof oqf ? ((oqf) obj).f46416a : obj;
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: p */
    public final Object mo18890p() {
        return m18888n();
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: q */
    public final Throwable mo18891q(Object obj) {
        Throwable thMo18891q = super.mo18891q(obj);
        if (thMo18891q == null) {
            return null;
        }
        ols olsVar = this.f46406a;
        return (oqu.f46433b && (olsVar instanceof omg)) ? oxy.m19156a(thMo18891q, (omg) olsVar) : thMo18891q;
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: r */
    public final ols mo18892r() {
        return this.f46406a;
    }

    /* JADX INFO: renamed from: s */
    public final void m18893s(opv opvVar, Throwable th) {
        try {
            opvVar.mo18869b(th);
        } catch (Throwable th2) {
            oly olyVar = this.f46407b;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            oqv.m18928i(olyVar, new oqj("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m18894t(oni oniVar, Throwable th) {
        try {
            oniVar.mo1803a(th);
        } catch (Throwable th2) {
            oly olyVar = this.f46407b;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            oqv.m18928i(olyVar, new oqj("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final String toString() {
        String str;
        String strM18922c = oqv.m18922c(this.f46406a);
        Object objM18888n = m18888n();
        if (objM18888n instanceof osm) {
            str = "Active";
        } else {
            str = objM18888n instanceof oqa ? "Cancelled" : "Completed";
        }
        return "CancellableContinuation(" + strM18922c + "){" + str + "}@" + oqv.m18921b(this);
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: u */
    public final void mo18895u(Object obj, Throwable th) {
        opn opnVar = this.f46409d;
        while (true) {
            Object obj2 = opnVar.f46397a;
            if (obj2 instanceof osm) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof oqg) {
                return;
            }
            if (obj2 instanceof oqf) {
                oqf oqfVar = (oqf) obj2;
                if (oqfVar.m18906a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (this.f46409d.m18856d(obj2, oqf.m18905b(oqfVar, null, th, 15))) {
                    opv opvVar = oqfVar.f46417b;
                    if (opvVar != null) {
                        m18893s(opvVar, th);
                    }
                    oni oniVar = oqfVar.f46418c;
                    if (oniVar != null) {
                        m18894t(oniVar, th);
                        return;
                    }
                    return;
                }
            } else if (this.f46409d.m18856d(obj2, new oqf(obj2, null, null, th, 14))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m18896v() {
        orf orfVar = this.f46410e;
        if (orfVar == null) {
            return;
        }
        orfVar.mo18947cF();
        this.f46410e = osl.f46497a;
    }

    /* JADX INFO: renamed from: w */
    public final void m18897w() {
        if (m18899y()) {
            return;
        }
        m18896v();
    }

    /* JADX INFO: renamed from: x */
    public final void m18898x() {
        orf orfVarM18878C = m18878C();
        if (orfVarM18878C != null && mo18873h()) {
            orfVarM18878C.mo18947cF();
            this.f46410e = osl.f46497a;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m18899y() {
        return this.f46444f == 2 && ((oxf) this.f46406a).f46769e.f46397a != null;
    }

    /* JADX WARN: Switch 'out' block B:3:0x0002 for B:4:0x0005 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: E */
    private final void m18880E(int i) {
        opl oplVar = this.f46408c;
        do {
            switch (oplVar.f46391b) {
                case 0:
                    break;
                case 1:
                    boolean z = oqu.f46432a;
                    ols olsVar = this.f46406a;
                    boolean z2 = i == 4;
                    if (z2 || !(olsVar instanceof oxf) || oqv.m18934o(i) != oqv.m18934o(this.f46444f)) {
                        oqv.m18933n(this, olsVar, z2);
                        return;
                    }
                    oqo oqoVar = ((oxf) olsVar).f46765a;
                    oly olyVarMo18639d = olsVar.mo18639d();
                    if (oqoVar.mo18916e(olyVarMo18639d)) {
                        oqoVar.mo18915d(olyVarMo18639d, this);
                        return;
                    }
                    ThreadLocal threadLocal = oss.f46499a;
                    orj orjVarM19021a = oss.m19021a();
                    if (orjVarM19021a.m18957n()) {
                        orjVarM19021a.m18955l(this);
                        return;
                    }
                    orjVarM19021a.m18956m(true);
                    try {
                        oqv.m18933n(this, this.f46406a, true);
                        do {
                            break;
                        } while (orjVarM19021a.m18958o());
                    } catch (Throwable th) {
                        try {
                            m18946B(th, null);
                        } finally {
                            orjVarM19021a.m18954k(true);
                        }
                        break;
                    }
                    return;
                default:
                    throw new IllegalStateException("Already resumed");
            }
        } while (!this.f46408c.m18847c(0, 2));
    }
}
