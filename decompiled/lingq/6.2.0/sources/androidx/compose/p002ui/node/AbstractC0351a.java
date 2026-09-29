package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.AbstractC0334a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3608te;
import p000.InterfaceC3682ve;
import p000.iv3;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.node.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0351a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3682ve f4289a;

    /* JADX INFO: renamed from: c */
    public boolean f4291c;

    /* JADX INFO: renamed from: d */
    public boolean f4292d;

    /* JADX INFO: renamed from: e */
    public boolean f4293e;

    /* JADX INFO: renamed from: f */
    public boolean f4294f;

    /* JADX INFO: renamed from: g */
    public boolean f4295g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3682ve f4296h;

    /* JADX INFO: renamed from: b */
    public boolean f4290b = true;

    /* JADX INFO: renamed from: i */
    public final HashMap f4297i = new HashMap();

    public AbstractC0351a(InterfaceC3682ve interfaceC3682ve) {
        this.f4289a = interfaceC3682ve;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1532a(AbstractC0351a abstractC0351a, AbstractC3608te abstractC3608te, int i, AbstractC0362l abstractC0362l) {
        long jMo1533b;
        HashMap map = abstractC0351a.f4297i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jMo1533b = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo1533b = abstractC0351a.mo1533b(abstractC0362l, jMo1533b);
                abstractC0362l = abstractC0362l.f4434L;
                abstractC0362l.getClass();
                if (abstractC0362l.equals(abstractC0351a.f4289a.mo1643e())) {
                    break loop0;
                }
            } while (!abstractC0351a.mo1534c(abstractC0362l).containsKey(abstractC3608te));
            float fMo1535d = abstractC0351a.mo1535d(abstractC0362l, abstractC3608te);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMo1535d);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo1535d);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(abstractC3608te instanceof iv3 ? Float.intBitsToFloat((int) (jMo1533b & 4294967295L)) : Float.intBitsToFloat((int) (jMo1533b >> 32)));
        if (map.containsKey(abstractC3608te)) {
            int iIntValue = ((Number) AbstractC3194a.m15361N(abstractC3608te, map)).intValue();
            iv3 iv3Var = AbstractC0334a.f4179a;
            iRound = ((Number) abstractC3608te.f62174a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(abstractC3608te, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo1533b(AbstractC0362l abstractC0362l, long j);

    /* JADX INFO: renamed from: c */
    public abstract Map mo1534c(AbstractC0362l abstractC0362l);

    /* JADX INFO: renamed from: d */
    public abstract int mo1535d(AbstractC0362l abstractC0362l, AbstractC3608te abstractC3608te);

    /* JADX INFO: renamed from: e */
    public final boolean m1536e() {
        return this.f4291c || this.f4293e || this.f4294f || this.f4295g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1537f() {
        m1540i();
        return this.f4296h != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m1538g() {
        this.f4290b = true;
        InterfaceC3682ve interfaceC3682ve = this.f4289a;
        InterfaceC3682ve interfaceC3682veMo1644f = interfaceC3682ve.mo1644f();
        if (interfaceC3682veMo1644f == null) {
            return;
        }
        if (this.f4291c) {
            interfaceC3682veMo1644f.mo1639S();
        } else if (this.f4293e || this.f4292d) {
            interfaceC3682veMo1644f.requestLayout();
        }
        if (this.f4294f) {
            interfaceC3682ve.mo1639S();
        }
        if (this.f4295g) {
            interfaceC3682ve.requestLayout();
        }
        interfaceC3682veMo1644f.mo1641b().m1538g();
    }

    /* JADX INFO: renamed from: h */
    public final void m1539h() {
        HashMap map = this.f4297i;
        map.clear();
        vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0351a abstractC0351a;
                InterfaceC3682ve interfaceC3682ve = (InterfaceC3682ve) obj;
                if (interfaceC3682ve.mo1645m() != Integer.MAX_VALUE) {
                    if (interfaceC3682ve.mo1641b().f4290b) {
                        interfaceC3682ve.mo1636I();
                    }
                    Iterator it = interfaceC3682ve.mo1641b().f4297i.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        abstractC0351a = this.f4223b;
                        if (!zHasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        AbstractC0351a.m1532a(abstractC0351a, (AbstractC3608te) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC3682ve.mo1643e());
                    }
                    AbstractC0362l abstractC0362l = interfaceC3682ve.mo1643e().f4434L;
                    abstractC0362l.getClass();
                    while (!abstractC0362l.equals(abstractC0351a.f4289a.mo1643e())) {
                        for (AbstractC3608te abstractC3608te : abstractC0351a.mo1534c(abstractC0362l).keySet()) {
                            AbstractC0351a.m1532a(abstractC0351a, abstractC3608te, abstractC0351a.mo1535d(abstractC0362l, abstractC3608te), abstractC0362l);
                        }
                        abstractC0362l = abstractC0362l.f4434L;
                        abstractC0362l.getClass();
                    }
                }
                return xfa.f68157a;
            }
        };
        InterfaceC3682ve interfaceC3682ve = this.f4289a;
        interfaceC3682ve.mo1648s(vi3Var);
        map.putAll(mo1534c(interfaceC3682ve.mo1643e()));
        this.f4290b = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1540i() {
        AbstractC0351a abstractC0351aMo1641b;
        AbstractC0351a abstractC0351aMo1641b2;
        boolean zM1536e = m1536e();
        InterfaceC3682ve interfaceC3682ve = this.f4289a;
        if (!zM1536e) {
            InterfaceC3682ve interfaceC3682veMo1644f = interfaceC3682ve.mo1644f();
            if (interfaceC3682veMo1644f == null) {
                return;
            }
            interfaceC3682ve = interfaceC3682veMo1644f.mo1641b().f4296h;
            if (interfaceC3682ve == null || !interfaceC3682ve.mo1641b().m1536e()) {
                InterfaceC3682ve interfaceC3682ve2 = this.f4296h;
                if (interfaceC3682ve2 == null || interfaceC3682ve2.mo1641b().m1536e()) {
                    return;
                }
                InterfaceC3682ve interfaceC3682veMo1644f2 = interfaceC3682ve2.mo1644f();
                if (interfaceC3682veMo1644f2 != null && (abstractC0351aMo1641b2 = interfaceC3682veMo1644f2.mo1641b()) != null) {
                    abstractC0351aMo1641b2.m1540i();
                }
                InterfaceC3682ve interfaceC3682veMo1644f3 = interfaceC3682ve2.mo1644f();
                interfaceC3682ve = (interfaceC3682veMo1644f3 == null || (abstractC0351aMo1641b = interfaceC3682veMo1644f3.mo1641b()) == null) ? null : abstractC0351aMo1641b.f4296h;
            }
        }
        this.f4296h = interfaceC3682ve;
    }
}
