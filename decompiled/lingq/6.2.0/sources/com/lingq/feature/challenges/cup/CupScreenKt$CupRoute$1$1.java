package com.lingq.feature.challenges.cup;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.av1;
import p000.bv1;
import p000.cv1;
import p000.dv1;
import p000.ev1;
import p000.fa4;
import p000.gm5;
import p000.gu1;
import p000.lda;
import p000.su1;
import p000.tu1;
import p000.uu1;
import p000.vi3;
import p000.vu1;
import p000.vv1;
import p000.wfb;
import p000.wu1;
import p000.wv1;
import p000.xfa;
import p000.xu1;
import p000.yu1;
import p000.zu1;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CupScreenKt$CupRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        vv1 vv1Var;
        Object value2;
        vv1 vv1VarM23553a;
        Object next;
        Object value3;
        vv1 vv1Var2;
        Object value4;
        vv1 vv1Var3;
        Object next2;
        Object value5;
        Object value6;
        vv1 vv1Var4;
        Object value7;
        Object value8;
        Object value9;
        ev1 ev1Var = (ev1) obj;
        ev1Var.getClass();
        C1980g c1980g = (C1980g) this.f47704b;
        C3244l c3244l = c1980g.f24717m;
        C3244l c3244l2 = c1980g.f24714j;
        if (ev1Var.equals(wu1.f67293a)) {
            c1980g.m8845Y2(true);
        } else if (ev1Var.equals(tu1.f62878a)) {
            wfb.m23926u(lda.m16103C(c1980g), null, null, new CupViewModel$claim$1(c1980g, null), 3);
        } else if (ev1Var.equals(su1.f61407a)) {
            C3244l c3244l3 = c1980g.f24716l;
            do {
                value9 = c3244l3.getValue();
                ((Boolean) value9).getClass();
            } while (!c3244l3.m15570h(value9, Boolean.FALSE));
        } else if (ev1Var.equals(vu1.f65911a)) {
            do {
                value8 = c3244l.getValue();
            } while (!c3244l.m15570h(value8, null));
        } else if (ev1Var.equals(uu1.f64360a)) {
            c1980g.m8844X2();
        } else if (ev1Var.equals(av1.f7551a)) {
            do {
                value7 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value7, null));
        } else if (ev1Var.equals(yu1.f70469a)) {
            do {
                value6 = c3244l2.getValue();
                vv1Var4 = (vv1) value6;
            } while (!c3244l2.m15570h(value6, vv1Var4 != null ? vv1.m23553a(vv1Var4, null, 0, false, false, true, false, 959) : null));
        } else if (ev1Var.equals(bv1.f9045a)) {
            vv1 vv1Var5 = (vv1) c3244l2.getValue();
            if (vv1Var5 != null) {
                String str = vv1Var5.f65962a;
                Iterator it = vv1Var5.f65969h.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!fa4.m11650l(((wv1) next2).f67329a, str));
                if (((wv1) next2) == null) {
                    do {
                        value5 = c3244l.getValue();
                    } while (!c3244l.m15570h(value5, gu1.f41321a));
                } else {
                    wfb.m23926u(lda.m16103C(c1980g), null, null, new CupViewModel$confirmJoin$2(c1980g, str, vv1Var5.f65964c, null), 3);
                }
            }
        } else if (ev1Var.equals(zu1.f72170a)) {
            do {
                value4 = c3244l2.getValue();
                vv1Var3 = (vv1) value4;
            } while (!c3244l2.m15570h(value4, vv1Var3 != null ? vv1.m23553a(vv1Var3, null, 0, false, false, false, false, 959) : null));
        } else if (ev1Var.equals(xu1.f68784a)) {
            do {
                value3 = c3244l2.getValue();
                vv1Var2 = (vv1) value3;
            } while (!c3244l2.m15570h(value3, vv1Var2 != null ? vv1.m23553a(vv1Var2, null, 0, false, !vv1Var2.f65965d, false, false, 1015) : null));
        } else if (ev1Var instanceof dv1) {
            do {
                value2 = c3244l2.getValue();
                vv1 vv1Var6 = (vv1) value2;
                if (vv1Var6 != null) {
                    dv1 dv1Var = (dv1) ev1Var;
                    String str2 = dv1Var.f36258a;
                    Iterator it2 = vv1Var6.f65969h.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!fa4.m11650l(((wv1) next).f67329a, dv1Var.f36258a));
                    wv1 wv1Var = (wv1) next;
                    vv1VarM23553a = vv1.m23553a(vv1Var6, str2, wv1Var != null ? wv1Var.f67330b : 0, false, false, false, false, 1012);
                } else {
                    vv1VarM23553a = null;
                }
            } while (!c3244l2.m15570h(value2, vv1VarM23553a));
        } else {
            if (!(ev1Var instanceof cv1)) {
                gm5.m12750e();
                return null;
            }
            do {
                value = c3244l2.getValue();
                vv1Var = (vv1) value;
            } while (!c3244l2.m15570h(value, vv1Var != null ? vv1.m23553a(vv1Var, null, 0, ((cv1) ev1Var).f34601a, false, false, false, 1019) : null));
        }
        return xfa.f68157a;
    }
}
