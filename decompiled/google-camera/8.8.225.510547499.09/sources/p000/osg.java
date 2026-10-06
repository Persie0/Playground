package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class osg implements ory, oqe, osn {

    /* JADX INFO: renamed from: d */
    public final opn f46489d = ook.m18796j(osh.f46495f);

    /* JADX INFO: renamed from: a */
    private final opn f46488a = ook.m18796j(null);

    /* JADX INFO: renamed from: J */
    public static final oqd m18991J(oxp oxpVar) {
        while (oxpVar.mo19134cI()) {
            oxpVar = oxpVar.m19140m();
        }
        while (true) {
            oxpVar = oxpVar.m19139l();
            if (!oxpVar.mo19134cI()) {
                if (oxpVar instanceof oqd) {
                    return (oqd) oxpVar;
                }
                if (oxpVar instanceof osj) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ CancellationException m18992K(osg osgVar, Throwable th) {
        return osgVar.m19015z(th, null);
    }

    /* JADX INFO: renamed from: L */
    private final boolean m18993L(Object obj, osj osjVar, osc oscVar) {
        while (true) {
            switch (osjVar.m19140m().m19137j(oscVar, osjVar, new osf(oscVar, this, obj))) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private final boolean m18994M(Throwable th) {
        if (mo18866cN()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        oqc oqcVarM19012cX = m19012cX();
        if (oqcVarM19012cX == null || oqcVarM19012cX == osl.f46497a) {
            return z;
        }
        return oqcVarM19012cX.mo18903d(th) || z;
    }

    /* JADX INFO: renamed from: N */
    private static final String m18995N(Object obj) {
        if (!(obj instanceof ose)) {
            if (obj instanceof oru) {
                return ((oru) obj).mo18949cG() ? "Active" : "New";
            }
            return obj instanceof oqg ? "Cancelled" : "Completed";
        }
        ose oseVar = (ose) obj;
        if (oseVar.m18988g()) {
            return "Cancelling";
        }
        return oseVar.m18989h() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: O */
    private static final Throwable m18996O(Object obj) {
        return obj instanceof Throwable ? (Throwable) obj : ((osn) obj).mo19014y();
    }

    /* JADX INFO: renamed from: e */
    private final Object m18997e(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof oru)) {
            return osh.f46490a;
        }
        if (((obj instanceof ori) || (obj instanceof osc)) && !(obj instanceof oqd) && !(obj2 instanceof oqg)) {
            oru oruVar = (oru) obj;
            boolean z = oqu.f46432a;
            if (!this.f46489d.m18856d(oruVar, osh.m19016a(obj2))) {
                return osh.f46492c;
            }
            mo18865l(obj2);
            m18999j(oruVar, obj2);
            return obj2;
        }
        oru oruVar2 = (oru) obj;
        osj osjVarM18998h = m18998h(oruVar2);
        if (osjVarM18998h == null) {
            return osh.f46492c;
        }
        oqd oqdVarM18991J = null;
        ose oseVar = oruVar2 instanceof ose ? (ose) oruVar2 : null;
        if (oseVar == null) {
            oseVar = new ose(osjVarM18998h, null);
        }
        ooi ooiVar = new ooi();
        synchronized (oseVar) {
            if (oseVar.m18989h()) {
                return osh.f46490a;
            }
            oseVar.f46483b.m18844c();
            if (oseVar != oruVar2 && !this.f46489d.m18856d(oruVar2, oseVar)) {
                return osh.f46492c;
            }
            boolean z2 = oqu.f46432a;
            boolean zM18988g = oseVar.m18988g();
            oqg oqgVar = obj2 instanceof oqg ? (oqg) obj2 : null;
            if (oqgVar != null) {
                oseVar.m18986e(oqgVar.f46421b);
            }
            Throwable thM18985d = oseVar.m18985d();
            if (true != Boolean.valueOf(!zM18988g).booleanValue()) {
                thM18985d = null;
            }
            ooiVar.f46351a = thM18985d;
            Throwable th = (Throwable) ooiVar.f46351a;
            if (th != null) {
                m19000k(osjVarM18998h, th);
            }
            oqd oqdVar = oruVar2 instanceof oqd ? (oqd) oruVar2 : null;
            if (oqdVar == null) {
                osj osjVarMo18948cE = oruVar2.mo18948cE();
                if (osjVarMo18948cE != null) {
                    oqdVarM18991J = m18991J(osjVarMo18948cE);
                }
            } else {
                oqdVarM18991J = oqdVar;
            }
            return (oqdVarM18991J == null || !m19009I(oseVar, oqdVarM18991J, obj2)) ? m19013v(oseVar, obj2) : osh.f46491b;
        }
    }

    /* JADX INFO: renamed from: h */
    private final osj m18998h(oru oruVar) {
        osj osjVarMo18948cE = oruVar.mo18948cE();
        if (osjVarMo18948cE != null) {
            return osjVarMo18948cE;
        }
        if (oruVar instanceof ori) {
            return new osj();
        }
        if (oruVar instanceof osc) {
            m19001m((osc) oruVar);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(oruVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(oruVar)));
    }

    /* JADX INFO: renamed from: j */
    private final void m18999j(oru oruVar, Object obj) throws Throwable {
        oqc oqcVarM19012cX = m19012cX();
        if (oqcVarM19012cX != null) {
            oqcVarM19012cX.mo18947cF();
            m19004D(osl.f46497a);
        }
        oqj oqjVar = null;
        oqg oqgVar = obj instanceof oqg ? (oqg) obj : null;
        Throwable th = oqgVar != null ? oqgVar.f46421b : null;
        if (oruVar instanceof osc) {
            try {
                ((osc) oruVar).mo18901b(th);
                return;
            } catch (Throwable th2) {
                mo18863i(new oqj("Exception in completion handler " + oruVar + " for " + this, th2));
                return;
            }
        }
        osj osjVarMo18948cE = oruVar.mo18948cE();
        if (osjVarMo18948cE != null) {
            Object objM19138k = osjVarMo18948cE.m19138k();
            objM19138k.getClass();
            for (oxp oxpVarM19139l = (oxp) objM19138k; !ooc.m18737c(oxpVarM19139l, osjVarMo18948cE); oxpVarM19139l = oxpVarM19139l.m19139l()) {
                if (oxpVarM19139l instanceof osc) {
                    osc oscVar = (osc) oxpVarM19139l;
                    try {
                        oscVar.mo18901b(th);
                    } catch (Throwable th3) {
                        if (oqjVar != null) {
                            lkm.m15595v(oqjVar, th3);
                        } else {
                            oqjVar = new oqj("Exception in completion handler " + oscVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (oqjVar != null) {
                mo18863i(oqjVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m19000k(osj osjVar, Throwable th) throws Throwable {
        Object objM19138k = osjVar.m19138k();
        objM19138k.getClass();
        oqj oqjVar = null;
        for (oxp oxpVarM19139l = (oxp) objM19138k; !ooc.m18737c(oxpVarM19139l, osjVar); oxpVarM19139l = oxpVarM19139l.m19139l()) {
            if (oxpVarM19139l instanceof osa) {
                osc oscVar = (osc) oxpVarM19139l;
                try {
                    oscVar.mo18901b(th);
                } catch (Throwable th2) {
                    if (oqjVar != null) {
                        lkm.m15595v(oqjVar, th2);
                    } else {
                        oqjVar = new oqj("Exception in completion handler " + oscVar + " for " + this, th2);
                    }
                }
            }
        }
        if (oqjVar != null) {
            mo18863i(oqjVar);
        }
        m18994M(th);
    }

    /* JADX INFO: renamed from: m */
    private final void m19001m(osc oscVar) {
        osj osjVar = new osj();
        osjVar.f46785d.m18854b(oscVar);
        osjVar.f46784c.m18854b(oscVar);
        while (oscVar.m19138k() == oscVar) {
            if (oscVar.f46784c.m18856d(oscVar, osjVar)) {
                osjVar.m19142o(oscVar);
                break;
            }
        }
        this.f46489d.m18856d(oscVar, oscVar.m19139l());
    }

    /* JADX INFO: renamed from: B */
    public void mo19002B(Throwable th) throws Throwable {
        m19005E(th);
    }

    /* JADX INFO: renamed from: C */
    protected final void m19003C(ory oryVar) {
        boolean z = oqu.f46432a;
        if (oryVar == null) {
            m19004D(osl.f46497a);
            return;
        }
        oryVar.mo18979u();
        oqc oqcVarMo18976p = oryVar.mo18976p(this);
        m19004D(oqcVarMo18976p);
        if (m19008H()) {
            oqcVarMo18976p.mo18947cF();
            m19004D(osl.f46497a);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m19004D(oqc oqcVar) {
        this.f46488a.m18855c(oqcVar);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m19005E(Object obj) throws Throwable {
        boolean zMo18981cC = mo18981cC();
        Object obj2 = osh.f46490a;
        if (zMo18981cC) {
            while (true) {
                Object objM19010cV = m19010cV();
                if (!(objM19010cV instanceof oru) || ((objM19010cV instanceof ose) && ((ose) objM19010cV).m18989h())) {
                    obj2 = osh.f46490a;
                    break;
                }
                Object objM18997e = m18997e(objM19010cV, new oqg(m18996O(obj)));
                if (objM18997e != osh.f46492c) {
                    obj2 = objM18997e;
                    break;
                }
            }
            if (obj2 == osh.f46491b) {
                return true;
            }
        }
        if (obj2 == osh.f46490a) {
            Throwable thM18996O = null;
            while (true) {
                Object objM19010cV2 = m19010cV();
                if (!(objM19010cV2 instanceof ose)) {
                    if (!(objM19010cV2 instanceof oru)) {
                        obj2 = osh.f46493d;
                        break;
                    }
                    if (thM18996O == null) {
                        thM18996O = m18996O(obj);
                    }
                    oru oruVar = (oru) objM19010cV2;
                    if (oruVar.mo18949cG()) {
                        boolean z = oqu.f46432a;
                        osj osjVarM18998h = m18998h(oruVar);
                        if (osjVarM18998h != null) {
                            if (this.f46489d.m18856d(oruVar, new ose(osjVarM18998h, thM18996O))) {
                                m19000k(osjVarM18998h, thM18996O);
                                obj2 = osh.f46490a;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Object objM18997e2 = m18997e(objM19010cV2, new oqg(thM18996O));
                        if (objM18997e2 == osh.f46490a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot happen in ");
                            sb.append(objM19010cV2);
                            throw new IllegalStateException("Cannot happen in ".concat(String.valueOf(objM19010cV2)));
                        }
                        if (objM18997e2 != osh.f46492c) {
                            obj2 = objM18997e2;
                            break;
                        }
                    }
                } else {
                    synchronized (objM19010cV2) {
                        ose oseVar = (ose) objM19010cV2;
                        if (oseVar.m18984c() != osh.f46494e) {
                            boolean zM18988g = oseVar.m18988g();
                            if (thM18996O == null) {
                                thM18996O = m18996O(obj);
                            }
                            oseVar.m18986e(thM18996O);
                            Throwable thM18985d = true != zM18988g ? oseVar.m18985d() : null;
                            if (thM18985d != null) {
                                m19000k(((ose) objM19010cV2).f46482a, thM18985d);
                            }
                            obj2 = osh.f46490a;
                            break;
                        }
                        obj2 = osh.f46493d;
                        break;
                    }
                }
            }
        }
        if (obj2 == osh.f46490a || obj2 == osh.f46491b) {
            return true;
        }
        if (obj2 == osh.f46493d) {
            return false;
        }
        mo18867f(obj2);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean mo19006F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m19005E(th) && mo18980cB();
    }

    /* JADX INFO: renamed from: G */
    protected boolean mo19007G(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m19008H() {
        return !(m19010cV() instanceof oru);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m19009I(ose oseVar, oqd oqdVar, Object obj) {
        while (oqdVar.f46415a.mo18973cY(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (1 & 2) != 0, new osd(this, oseVar, oqdVar, obj)) == osl.f46497a) {
            oqdVar = m18991J(oqdVar);
            if (oqdVar == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected String mo18857a() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: cB */
    public boolean mo18980cB() {
        return true;
    }

    /* JADX INFO: renamed from: cC */
    public boolean mo18981cC() {
        return false;
    }

    /* JADX INFO: renamed from: cN */
    protected boolean mo18866cN() {
        return false;
    }

    /* JADX INFO: renamed from: cR */
    public String mo18858cR() {
        return oqv.m18920a(this);
    }

    /* JADX INFO: renamed from: cV */
    public final Object m19010cV() {
        opn opnVar = this.f46489d;
        while (true) {
            Object obj = opnVar.f46397a;
            if (!(obj instanceof oxt)) {
                return obj;
            }
            ((oxt) obj).m19151c(this);
        }
    }

    /* JADX INFO: renamed from: cW */
    public final Object m19011cW(Object obj) {
        Object objM18997e;
        do {
            objM18997e = m18997e(m19010cV(), obj);
            if (objM18997e == osh.f46490a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                oqg oqgVar = obj instanceof oqg ? (oqg) obj : null;
                throw new IllegalStateException(str, oqgVar != null ? oqgVar.f46421b : null);
            }
        } while (objM18997e == osh.f46492c);
        return objM18997e;
    }

    /* JADX INFO: renamed from: cX */
    public final oqc m19012cX() {
        return (oqc) this.f46488a.f46397a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:54:0x0086  */
    /* JADX WARN: Code duplicated, block: B:78:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x001c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, orf] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [orx] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [opn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [osl] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.ory
    /* JADX INFO: renamed from: cY */
    public final orf mo18973cY(boolean z, boolean z2, oni oniVar) {
        ?? orxVar;
        Throwable thM18985d;
        osa osaVar;
        if (z) {
            if (oniVar instanceof osa) {
                osaVar = (osa) oniVar;
            } else {
                orxVar = 0;
            }
            if (orxVar == 0) {
                orxVar = osaVar;
                orxVar = new orx(oniVar);
            }
        } else {
            boolean z3 = oqu.f46432a;
            orxVar = oniVar;
        }
        orxVar = osaVar;
        osc oscVar = (osc) orxVar;
        oscVar.f46477b = this;
        while (true) {
            Object objM19010cV = m19010cV();
            if (objM19010cV instanceof ori) {
                boolean z4 = ((ori) objM19010cV).f46451a;
                if (this.f46489d.m18856d(objM19010cV, orxVar)) {
                    return orxVar;
                }
            } else {
                if (!(objM19010cV instanceof oru)) {
                    if (z2) {
                        oqg oqgVar = objM19010cV instanceof oqg ? (oqg) objM19010cV : null;
                        oniVar.mo1803a(oqgVar != null ? oqgVar.f46421b : null);
                    }
                    return osl.f46497a;
                }
                osj osjVarMo18948cE = ((oru) objM19010cV).mo18948cE();
                if (osjVarMo18948cE == null) {
                    objM19010cV.getClass();
                    m19001m((osc) objM19010cV);
                } else {
                    ?? r5 = osl.f46497a;
                    if (z && (objM19010cV instanceof ose)) {
                        synchronized (objM19010cV) {
                            ose oseVar = (ose) objM19010cV;
                            thM18985d = oseVar.m18985d();
                            if (thM18985d != null && (!(oniVar instanceof oqd) || oseVar.m18989h())) {
                                r5 = r5;
                            } else if (m18993L(objM19010cV, osjVarMo18948cE, (osc) orxVar)) {
                                if (thM18985d == null) {
                                    return orxVar;
                                }
                                r5 = orxVar;
                            }
                        }
                        if (thM18985d != null) {
                            if (z2) {
                                oniVar.mo1803a(thM18985d);
                            }
                            return (orf) r5;
                        }
                        if (m18993L(objM19010cV, osjVarMo18948cE, oscVar)) {
                            return orxVar;
                        }
                    } else {
                        thM18985d = null;
                        if (thM18985d != null) {
                            if (z2) {
                                oniVar.mo1803a(thM18985d);
                            }
                            return (orf) r5;
                        }
                        if (m18993L(objM19010cV, osjVarMo18948cE, oscVar)) {
                            return orxVar;
                        }
                    }
                }
            }
        }
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: cZ */
    public final boolean mo18974cZ() {
        Object objM19010cV = m19010cV();
        return (objM19010cV instanceof oru) && ((oru) objM19010cV).mo18949cG();
    }

    /* JADX INFO: renamed from: f */
    protected void mo18867f(Object obj) {
    }

    @Override // p000.oly
    public final Object fold(Object obj, onm onmVar) {
        return omn.m18702g(this, obj, onmVar);
    }

    @Override // p000.olv, p000.oly
    public final olv get(olw olwVar) {
        olwVar.getClass();
        return omn.m18703h(this, olwVar);
    }

    @Override // p000.olv
    public final olw getKey() {
        return ory.f46473c;
    }

    /* JADX INFO: renamed from: i */
    public void mo18863i(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: l */
    protected void mo18865l(Object obj) {
    }

    @Override // p000.oly
    public final oly minusKey(olw olwVar) {
        olwVar.getClass();
        return omn.m18704i(this, olwVar);
    }

    @Override // p000.oqe
    /* JADX INFO: renamed from: n */
    public final void mo18904n(osn osnVar) throws Throwable {
        osnVar.getClass();
        m19005E(osnVar);
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: o */
    public final CancellationException mo18975o() {
        Object objM19010cV = m19010cV();
        if (!(objM19010cV instanceof ose)) {
            if (!(objM19010cV instanceof oru)) {
                return objM19010cV instanceof oqg ? m18992K(this, ((oqg) objM19010cV).f46421b) : new orz(String.valueOf(oqv.m18920a(this)).concat(" has completed normally"), null, this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Job is still new or active: ");
            sb.append(this);
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thM18985d = ((ose) objM19010cV).m18985d();
        if (thM18985d != null) {
            return m19015z(thM18985d, String.valueOf(oqv.m18920a(this)).concat(" is cancelling"));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Job is still new or active: ");
        sb2.append(this);
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: p */
    public final oqc mo18976p(oqe oqeVar) {
        return (oqc) mo18973cY(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (1 & 2) != 0, new oqd(oqeVar));
    }

    @Override // p000.oly
    public final oly plus(oly olyVar) {
        olyVar.getClass();
        return omn.m18705j(this, olyVar);
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: r */
    public void mo18977r(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new orz(mo18857a(), null, this);
        }
        mo19002B(cancellationException);
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: t */
    public final boolean mo18978t() {
        Object objM19010cV = m19010cV();
        if (objM19010cV instanceof oqg) {
            return true;
        }
        return (objM19010cV instanceof ose) && ((ose) objM19010cV).m18988g();
    }

    public final String toString() {
        return (mo18858cR() + "{" + m18995N(m19010cV()) + "}") + "@" + oqv.m18921b(this);
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: u */
    public final void mo18979u() {
        while (true) {
            Object objM19010cV = m19010cV();
            byte b = 0;
            if (objM19010cV instanceof ori) {
                boolean z = ((ori) objM19010cV).f46451a;
            } else if (objM19010cV instanceof ort) {
                b = !this.f46489d.m18856d(objM19010cV, ((ort) objM19010cV).f46468a) ? (byte) -1 : (byte) 1;
            }
            switch (b) {
                case 0:
                case 1:
                    return;
                default:
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19013v(ose oseVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayListM18983i;
        Object next;
        Throwable orzVar;
        boolean z = oqu.f46432a;
        Object obj2 = null;
        Throwable th = null;
        oqg oqgVar = obj instanceof oqg ? (oqg) obj : null;
        Throwable th2 = oqgVar != null ? oqgVar.f46421b : null;
        synchronized (oseVar) {
            oseVar.m18988g();
            Object objM18984c = oseVar.m18984c();
            if (objM18984c == null) {
                arrayListM18983i = ose.m18983i();
            } else if (objM18984c instanceof Throwable) {
                ArrayList arrayListM18983i2 = ose.m18983i();
                arrayListM18983i2.add(objM18984c);
                arrayListM18983i = arrayListM18983i2;
            } else {
                if (!(objM18984c instanceof ArrayList)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(objM18984c);
                    throw new IllegalStateException("State is ".concat(objM18984c.toString()));
                }
                arrayListM18983i = (ArrayList) objM18984c;
            }
            Throwable thM18985d = oseVar.m18985d();
            if (thM18985d != null) {
                arrayListM18983i.add(0, thM18985d);
            }
            if (th2 != null && !ooc.m18737c(th2, thM18985d)) {
                arrayListM18983i.add(th2);
            }
            oseVar.m18987f(osh.f46494e);
            if (!arrayListM18983i.isEmpty()) {
                Iterator it = arrayListM18983i.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(!(((Throwable) next) instanceof CancellationException)));
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    orzVar = (Throwable) arrayListM18983i.get(0);
                    if (orzVar instanceof ost) {
                        for (Object obj3 : arrayListM18983i) {
                            Throwable th4 = (Throwable) obj3;
                            if (th4 != orzVar && (th4 instanceof ost)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        th = (Throwable) obj2;
                    }
                    th = orzVar;
                } else {
                    th = th3;
                }
            } else if (oseVar.m18988g()) {
                orzVar = new orz(mo18857a(), null, this);
                th = orzVar;
            }
            if (th != null && arrayListM18983i.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM18983i.size()));
                Throwable thM19158c = !oqu.f46433b ? th : oxy.m19158c(th);
                for (Throwable thM19158c2 : arrayListM18983i) {
                    if (oqu.f46433b) {
                        thM19158c2 = oxy.m19158c(thM19158c2);
                    }
                    if (thM19158c2 != th && thM19158c2 != thM19158c && !(thM19158c2 instanceof CancellationException) && setNewSetFromMap.add(thM19158c2)) {
                        lkm.m15595v(th, thM19158c2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new oqg(th);
        }
        if (th != null && (m18994M(th) || mo19007G(th))) {
            obj.getClass();
            ((oqg) obj).m18907a();
        }
        mo18865l(obj);
        this.f46489d.m18856d(oseVar, osh.m19016a(obj));
        m18999j(oseVar, obj);
        return obj;
    }

    @Override // p000.osn
    /* JADX INFO: renamed from: y */
    public final CancellationException mo19014y() {
        Throwable thM18985d;
        Object objM19010cV = m19010cV();
        if (objM19010cV instanceof ose) {
            thM18985d = ((ose) objM19010cV).m18985d();
        } else if (objM19010cV instanceof oqg) {
            thM18985d = ((oqg) objM19010cV).f46421b;
        } else {
            if (objM19010cV instanceof oru) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot be cancelling child in this state: ");
                sb.append(objM19010cV);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objM19010cV)));
            }
            thM18985d = null;
        }
        CancellationException cancellationException = thM18985d instanceof CancellationException ? (CancellationException) thM18985d : null;
        return cancellationException == null ? new orz("Parent job is ".concat(m18995N(objM19010cV)), thM18985d, this) : cancellationException;
    }

    /* JADX INFO: renamed from: z */
    protected final CancellationException m19015z(Throwable th, String str) {
        CancellationException orzVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (orzVar == null) {
            if (str == null) {
                str = mo18857a();
            }
            orzVar = new orz(str, th, this);
        }
        return orzVar;
    }
}
